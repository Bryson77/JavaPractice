import java.util.Scanner;
import java.text.DecimalFormat;

 public class bankingAppTerminal{
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        int currentBal = 0;
        int depositedAmnt = 0, withdrawalAmnt = 0;

        System.out.println("Good day. Please choose an option below:");
        System.out.println("****************************************");
        System.out.println("1. Check Balance");
        System.out.println("2. Cash Deposit");
        System.out.println("3. Cash Withdrawal");
        System.out.println("4. End");
        System.out.println("****************************************");

        int option = userInput.nextInt();
        switch(option){
            case 1:
            System.out.println("Your Current balance is R" + currentBal);
            break;
            case 2: 
            System.out.println("How much do you want to deposit?");
            depositedAmnt = userInput.nextInt();
            currentBal = depositedAmnt + currentBal;
            System.out.println("You have successfully deposited R" +  depositedAmnt + "." + "Your current balance is: R" + currentBal);
            break;
            case 3:
            System.out.println("How much would you like to withdraw?");
            withdrawalAmnt = userInput.nextInt();
            currentBal = currentBal - withdrawalAmnt;
            System.out.println("Your withdrawal of R" + withdrawalAmnt + "was successful" + "Your current balance is: R" + currentBal);
            break;
            case 4:
            System.out.println("Thank you. Goodbye");
            break;
            default:
            System.out.println("Invalid input");
        }

    }
 } 