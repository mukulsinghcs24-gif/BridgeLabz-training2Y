import java.util.Scanner;

public class TriangleAreaConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input base and height in inches
        System.out.print("Enter the base of the triangle (in inches): ");
        double base = sc.nextDouble();

        System.out.print("Enter the height of the triangle (in inches): ");
        double height = sc.nextDouble();

        // Calculate area in square inches
        double areaInInches = 0.5 * base * height;

        // Convert to square centimeters
        double areaInCm = areaInInches * 6.4516;

        // Print result
        System.out.println("\nArea of the Triangle:");
        System.out.println("In Square Inches: " + areaInInches);
        System.out.println("In Square Centimeters: " + areaInCm);

        sc.close();
    }
}

}
