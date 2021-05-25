import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class StringDemo {

    public static void main(String[] args) {
//        String s = "This is a text";
//        char c = s.charAt(1);
//        String substring = s.substring(5, 7);
//        System.out.println(c);
//        System.out.println(substring);

        String name = "Dinusha";
        String address = "Nittambuwa";
//        System.out.println("My name is ${name} and I am living in ${address}");
//        System.out.println("My name is " + name + " and I am living in " + address);
        System.out.printf("My name is %s and I am living in %s\n", name, address);
        int age = 20;
        String formattedText = String.format("My name is %2$s and I am living in %1$s. My age is %3$s", name, address, age);
        System.out.println(formattedText);

        // "S0001", "S0010", "S0001" + 1 = "S00011"

        /* Syntax:
         * % [parameter] [flags] [width].[precision] conversion
         *
         * [parameter]: 1$
         * */

        int studentId = 25;
        //System.out.printf("Student Id: S%04d", studentId);
        System.out.println(String.format("Student Id: S%04d", studentId));

        // 125.00, 458.00, 1,500.20
        double price = 1500.2;
        System.out.println(String.format("Rs. %,.2f", price));

        /* Date Time
         *-------------------------------------------
         * Date, Time => java.util.Date()
         * Calendar
         * Date => java.time.LocalDate
         * Time => java.timeLocalTime
         * Date, Time => java.time.LocalDateTime
         * Date => java.sql.Date
         * Time => java.sql.Time
         * */

        /* 2021-05-25 */
        System.out.println(new Date());
        System.out.println(String.format("%1$tY-%1$tm-%1$td", new Date()));
        /* HH:MM:SS */
        System.out.println(String.format("%1$tH:%1$tM:%1$tS", new Date()));

        Calendar c = Calendar.getInstance();
        c.set(2021,4,25);
        //Date date = c.getTime();
        Date date = new Date(c.getTimeInMillis());
        System.out.println(String.format("%1$tY-%1$tm-%1$td",date));

        // 2021-05-25
        Scanner scanner = new Scanner(System.in);
        boolean condition = true;

//        while (condition) {
//            System.out.print("Enter the date [YYYY-MM-DD]: ");
//            String inputDate = scanner.nextLine();
//            // 2021-05-25 => splitter (-) => 2021, 05, 25
//            // This is something => splitter ( ) => This, is, something
//            String[] splits = inputDate.split("-");
//            if (splits.length != 3) {
//                System.out.println("Invalid date");
//            }else{
//                condition = false;
//                c.set(Integer.parseInt(splits[0]), Integer.parseInt(splits[1]) - 1, Integer.parseInt(splits[2]));
//                Date newDate = c.getTime();
//                System.out.println(newDate);
//            }
//        }

//        while (true) {
//            System.out.print("Enter the date [YYYY-MM-DD]: "); // 2021-21-05
//            String inputDate = scanner.nextLine();
//
//            try {
//                Date parsedDate = new SimpleDateFormat("yyyy-MM-dd").parse(inputDate);
//                System.out.println(parsedDate);
//                break;
//            } catch (ParseException e) {
//                System.out.println("Invalid Date");
//            }
//        }

        /* Date <=> Formatted Date (String) */
        Date today = new Date();
        String formattedDate = new SimpleDateFormat("yyyy-MM-dd").format(today);
        System.out.println(formattedDate);
    }
}
