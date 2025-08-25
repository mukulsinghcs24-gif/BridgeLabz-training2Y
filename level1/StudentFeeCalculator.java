import java.util.Scanner;

public class StudentFeeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter the Student Fee: ");
        double fee = sc.nextDouble();

        System.out.print("Enter the University Discount Percentage: ");
        double discountPercent = sc.nextDouble();

        // Compute discount
        double discount = (fee * discountPercent) / 100.0;

        // Compute final fee
        double finalFee = fee - discount;

        // Print results
        System.out.println("\nOriginal Fee: " + fee);
        System.out.println("Discount: " + discount);
        System.out.println("Fee to Pay after Discount: " + finalFee);

        sc.close();
    }
}
