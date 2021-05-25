import java.math.BigDecimal;

public class FloatingPointNumbersDemo {

    public static void main(String[] args) {

        // Double, Float -> BigDecimal
        // IEEE-754
        double d1 = 500.2;
        double d2 = 100;
        double d3 = d1 - d2;
        System.out.println(d3);

        BigDecimal b1 = BigDecimal.valueOf(d1);
        BigDecimal b2 = BigDecimal.valueOf(d2);
        BigDecimal b3 = b1.subtract(b2);
        BigDecimal b4 = b3.setScale(2);
        System.out.println("Rs. " + b4);

        System.out.printf("Rs. %.2f", b3);

    }
}
