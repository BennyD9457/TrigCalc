import java.util.Scanner;

public class SineToFraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your input: ");
        double x = scanner.nextDouble();
        System.out.println(cosine(x));
    }

    public static String cosine(double x) {
        while (x > 360) {
            x = x - 360;
        }

        double referenceAngle = 0;

        if (x < 90) {
            referenceAngle = x;
        } else if (x < 180 && x > 90) {
            referenceAngle = 180 - x;
        } else if (x >= 180 && x < 270) {
            referenceAngle = x - 180;
        } else if (x >= 270 && x < 360) {
            referenceAngle = x - 270;
        }

        if (Math.abs(referenceAngle - 60) < 1e-9) {
            double numerator = 3;
            double denominator = 2;
            return "√" + numerator + " / " + denominator;
        
        
        } else if (Math.abs(referenceAngle - 30) < 1e-9 || Math.abs(referenceAngle - 45) < 1e-9) {
            double numerator = 1;
            double denominator = 2;
            return "1 / 2";
        } else {
            return String.valueOf(referenceAngle);
        }
    }
}
