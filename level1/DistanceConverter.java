import java.util.Scanner;

public class DistanceConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input distance in feet
        System.out.print("Enter the distance in feet: ");
        double distanceInFeet = sc.nextDouble();

        // Convert to yards and miles
        double distanceInYards = distanceInFeet / 3.0;
        double distanceInMiles = distanceInYards / 1760.0;

        // Print result
        System.out.println("\nDistance Conversion:");
        System.out.println("In Feet: " + distanceInFeet);
        System.out.println("In Yards: " + distanceInYards);
        System.out.println("In Miles: " + distanceInMiles);

        sc.close();
    }
}

}
