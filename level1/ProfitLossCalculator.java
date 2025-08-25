package level1;
public class ProfitLossCalculator {
    public static void main(String[] args) {
        double costPrice = 129.0;
        double sellingPrice = 191.0;

        if (sellingPrice > costPrice) {
            double profit = sellingPrice - costPrice;
            double profitPercent = (profit / costPrice) * 100;

            System.out.println("Profit: ₹" + profit);
            System.out.printf("Profit Percentage: %.2f%%\n", profitPercent);

        } else if (costPrice > sellingPrice) {
            double loss = costPrice - sellingPrice;
            double lossPercent = (loss / costPrice) * 100;

            System.out.println("Loss: ₹" + loss);
            System.out.printf("Loss Percentage: %.2f%%\n", lossPercent);

        } else {
            System.out.println("No Profit, No Loss.");
        }
    }
}
 
    

