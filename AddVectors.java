import java.util.Scanner;

public class AddVectors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the x-coordinate of the first vector: ");
        double x1 = scanner.nextDouble();

        System.out.println("Enter the y-coordinate of the first vector: ");
        double y1 = scanner.nextDouble();

        System.out.println("Enter the x-coordinate of the second vector: ");
        double x2 = scanner.nextDouble();

        System.out.println("Enter the y-coordinate of the second vector: ");
        double y2 = scanner.nextDouble();

        double resultX = x1 + x2;
        double resultY = y1 + y2;

        System.out.println("Resultant vector: (" + resultX + ", " + resultY + ")");

        scanner.close();
    }
}
