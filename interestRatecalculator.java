import java.util.Scanner;
import java.util.Random;
import java.text.DecimalFormat;
public class interestRateCalculator{
    ///////Interest rate calculator
    public static void main(String args[]){
        Scanner userInput = new Scanner(System.in);
        Double interestRate = 7.05/100d;
        DecimalFormat formatter = new DecimalFormat("0.00");
        
        System.out.println("Please enter the amount you wish to invest: R");
        int investmentAMNT = userInput.nextInt();
        System.out.println("How many years do you wish to invest it for?: ");
        int years = userInput.nextInt();

        System.out.println("-----------------------------------------------");
        System.out.println("Option \\t\\t\\t\\t |Future Value");

        Double simpleInterest = (investmentAMNT * interestRate * years) + investmentAMNT;
        Double compoundyearly = (investmentAMNT * (Math.pow((1 + interestRate), years)));
        Double compoundedquaterly = ((investmentAMNT) * Math.pow((1 + (interestRate/4)), (4 * years)));
        Double bestPerforming = Math.max(simpleInterest, (Math.max(compoundedquaterly, compoundyearly)));

        System.out.println("-----------------------------------------------");
        System.out.println("Simple Interest /t/t/t/t | R" + formatter.format(simpleInterest) );
        System.out.println("Compound Interest (Yearly) \t\t\t\t | R" + formatter.format(compoundyearly) );
        System.out.println("Compound Interest (Quaterly) \t\t\t\t | R" + formatter.format(compoundedquaterly) ); 
        System.out.println("-----------------------------------------------");
        System.out.println(">>>The best performing option yields: R" + formatter.format(bestPerforming)); 

        

    }
}
