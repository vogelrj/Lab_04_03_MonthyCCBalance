import java.text.DecimalFormat;

public class Lab_04_03_MonthyCCBalance {
    public static void main(String[] args) {
        int startBal = 5000;
        double INTEREST_RATE = .17;
        double firstInterest = startBal * INTEREST_RATE;
        double secondInterest = (startBal + firstInterest) * INTEREST_RATE;
        DecimalFormat df = new DecimalFormat("#.00");
        System.out.println("Your first months interest is $" + df.format(firstInterest));
        System.out.println("The second months interest is $" + df.format(secondInterest));
    }
}
