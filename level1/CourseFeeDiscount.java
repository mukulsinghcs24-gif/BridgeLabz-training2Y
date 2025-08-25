package level1;
public class CourseFeeDiscount {
    public static void main(String[] args) {
        double courseFee = 125000.0;
        double discountRate = 10.0; // in percentage

        double discountAmount = (discountRate / 100) * courseFee;
        double discountedPrice = courseFee - discountAmount;

        System.out.println("Original Course Fee: ₹" + courseFee);
        System.out.println("Discount Amount: ₹" + discountAmount);
        System.out.println("Discounted Price to Pay: ₹" + discountedPrice);
    }
}
