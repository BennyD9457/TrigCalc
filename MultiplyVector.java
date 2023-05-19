import java.util.Scanner;

public class MultiplyVector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the x-coordinate: ");
        double x1 = scanner.nextDouble();

        System.out.println("Enter the y-coordinate: ");
        double y1 = scanner.nextDouble();

        System.out.println("Enter the multiplier: ");
        double multiplier = scanner.nextDouble();
        scanner.close();

        double[] result = acutalymultiplu(x1, y1, multiplier);
        double resultX = result[0];
        double resultY = result[1];

        System.out.println("Result: (" + resultX + ", " + resultY + ")");
    }

    public static double[] acutalymultiplu(double x1, double y1, double multiplier) {
        double resultX = x1 * multiplier;
        double resultY = y1 * multiplier;

        return new double[] { resultX, resultY };
    }
}
