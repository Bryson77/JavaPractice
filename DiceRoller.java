//Dice rolling program
import java.util.Random;
import java.util.Scanner;
public class DiceRoller {
    public static void Main(String[] args){
        Scanner userInput = new Scanner(System.in);
        //Variables
        int numOfDice;
        //Random Num Generator
        Random random = new Random();
        //Asking the user how many dice they want to roll
        System.out.println("How many dice would you like to roll?");
        numOfDice = userInput.nextInt();
        if (numOfDice > 0){
            System.out.println("Well done");
        }
        else{
            System.out.println("You cannot roll a negative number of dice or zero. Please enter a valid amount.");
        }
    }
}