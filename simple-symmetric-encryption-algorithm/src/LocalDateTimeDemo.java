import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class LocalDateTimeDemo {

    public static void main(String[] args) {

        LocalDate today = LocalDate.now();
        System.out.println(today);

        LocalTime now = LocalTime.now();
        System.out.println(now);

        // 2021-May-25
        String formattedDate = today.format(DateTimeFormatter.ofPattern("yyyy-LLLL-dd"));
        System.out.println(formattedDate);

        LocalDate today2 = LocalDate.of(2021, 05, 25);
        System.out.println(today2);

//        while(true){
//            Scanner scanner = new Scanner(System.in);
//            System.out.print("Enter the date [YYYY-MM-DD]: ");
//            String input = scanner.nextLine();
//
//            try {
//                LocalDate parsedDate = LocalDate.parse(input);
//                System.out.println(parsedDate);
//                break;
//            }catch (DateTimeParseException ex){
//                System.out.println("Invalid Date");
//            }
//        }

        System.out.println(today.plusDays(10));
        Date today3 = new Date();
        Date newDate = new Date(today3.getTime() + (10 * 24 * 60 * 60 * 1000));
        System.out.println(newDate);

        // 2021-05-20 -> 2021-04-02
        Calendar c = Calendar.getInstance();
        c.set(2021, 4, 20);
        long t1 = c.getTimeInMillis();
        c.set(2021,3,2);
        long t2 = c.getTimeInMillis();
        System.out.println((t1 -t2)/ 1000 / 60 / 60 / 24);

        // java.util.date < - > java.time.LocalDate
        LocalDate localDate = new Date().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        System.out.println(localDate.toEpochDay());
//        Date.from()

        /* UTF-16 (charset) = Character encoding system */
        /* ASCII - American Standard Code Information Interchange 7 bits (2^7) = 128
         * Extended ASCII - 8bits (2^8) = 256
         * Unicode Charset (32 bits) 4 bytes
         * UTF-8 (1-4), UTF-16 (2-4), UTF-32 (4)
         * */

        /* A - 65 0x41 */
        System.out.println("ස");
        System.out.println("\u0041");

        int \u0041 = 10;
        System.out.println(A);
    }
}
