import java.util.Scanner;

public class Problem7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Length of the rectangle: ");
        double length = scanner.nextDouble();
        System.out.print("Enter the Width of the rectangle: ");
        double width = scanner.nextDouble();
        double perimeter = 2 * (length + width);
        System.out.println("The Perimeter of the rectangle is: " + perimeter);
        scanner.close();
    }
}