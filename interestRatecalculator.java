import java.util.Scanner;
import java.text.DecimalFormat;

public class interestRatecalculator{
    public static void main(String args[]){
        Scanner userInput = new Scanner(System.in);
        Double interestRate = 7.05/100d;
        DecimalFormat formatter = new DecimalFormat("R #,##0.00");
        
        System.out.print("Please enter the amount you wish to invest: R");
        int investmentAMNT = userInput.nextInt();
        System.out.print("How many years do you wish to invest it for?: ");
        int years = userInput.nextInt();

        System.out.println("-----------------------------------------------");
        System.out.println("Option                          |Future Value");

        // Fixed simple interest formula
        Double simpleInterest = investmentAMNT * (1 + interestRate * years);
        Double compoundyearly = investmentAMNT * Math.pow((1 + interestRate), years);
        Double compoundedquaterly = investmentAMNT * Math.pow((1 + (interestRate/4)), (4 * years));
        Double bestPerforming = Math.max(simpleInterest, Math.max(compoundedquaterly, compoundyearly));

        System.out.println("-----------------------------------------------");
        System.out.println("Simple Interest                  | " + formatter.format(simpleInterest));
        System.out.println("Compound Interest (Yearly)       | " + formatter.format(compoundyearly));
        System.out.println("Compound Interest (Quarterly)    | " + formatter.format(compoundedquaterly)); 
        System.out.println("-----------------------------------------------");
        System.out.println(">>>The best performing option yields: " + formatter.format(bestPerforming));

        userInput.close();
    }
}
