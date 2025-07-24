import java.util.Scanner;
import java.text.DecimalFormat;

 public class bankingAppTerminal{
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        Float currentBal = 0f;
        Float depositedAmnt = 0f, withdrawalAmnt = 0f;
        Boolean isRunning = true;

        while(isRunning){
        printMenu();
        int option = userInput.nextInt();
        switch(option){
            case 1:
            currentBal = currentBalance(currentBal);
            break;
            case 2: 
            System.out.println("How much do you want to deposit?");
            depositedAmnt = userInput.nextFloat();
            currentBal = cashDeposit(depositedAmnt, currentBal);
            break;
            case 3:
            System.out.println("How much would you like to withdraw?");
            withdrawalAmnt = userInput.nextFloat();
            currentBal = cashWithdrawal(withdrawalAmnt, currentBal);
            break;
            case 4:
            System.out.println("Thank you. Goodbye");
            isRunning = false;
            break;
            default:
            System.out.println("Invalid input");
        }
        }

    
    }
    static void printMenu(){
        System.out.println("****************************");
        System.out.println("Welcome to the Banking App");
        System.out.println("Please select an option:");
        System.out.println("1. Check current balance");
        System.out.println("2. Deposit cash");
        System.out.println("3. Withdraw cash");
        System.out.println("4. Exit");
        System.out.println("****************************");
    }

 static float currentBalance(float currentBal){
    System.out.println("Current balance: R" + currentBal);
    return currentBal;
    
 }
 static float cashDeposit(float depositedAmnt, float currentBal){
    if(depositedAmnt <= 0){
        System.out.println("You cannot deposit a negative amount or zero. Please enter a valid amount.");
        return currentBal;
    }   else{currentBal = depositedAmnt + currentBal;
    System.out.println("You have successfully deposited R" +  depositedAmnt + "." + "Your current balance is: R" + currentBal);
    return currentBal;}
    
 }
 static float cashWithdrawal(float withdrawalAmount, float currentBal){
   if(withdrawalAmount > currentBal){
        System.out.println("Insufficient funds. You cannot withdraw more than your current balance.");
   }
        else if (withdrawalAmount <= 0){
            System.out.println("You cannot withdraw a negative amount or zero. Please enter a valid amount.");
        } else if (withdrawalAmount > currentBal) {
            System.out.println("Insufficient funds. You cannot withdraw more than your current balance.");
        } else
        {
            currentBal = currentBal - withdrawalAmount;
            System.out.println("Your withdrawal of R" + withdrawalAmount + " was successful." + "Your current balance is: R" + currentBal);
           
        }
        return currentBal;
 }
} 