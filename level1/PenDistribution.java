package level1;
 public class PenDistribution {
    public static void main(String[] args) {
        int totalPens = 14;
        int students = 3;

        int pensEach = totalPens / students;   // Quotient
        int remainingPens = totalPens % students; // Remainder

        System.out.println("Each student will get " + pensEach + " pens.");
        System.out.println("Remaining non-distributed pens: " + remainingPens);
    }
}

