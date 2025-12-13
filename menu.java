import java.util.Scanner;
import java.text.DecimalFormat;

public class menu {
    public static void main(String[] args){
    //declarationsss
    Scanner userInput = new Scanner(System.in);
    DecimalFormat myFormatter = new DecimalFormat("#,##0.00");
    boolean run = true;
    
    //variables
    double subtotal, total;
    double vatTax = 0.15;
    double serviceTip = 0.10;

    //menu (drinks)
    double coffee = 25;
    double tea = 25;
    double fruitJuice = 30;
    double coldDrink = 20;

    //food
    double burger = 90;
    double sandwich = 50;
    double pizza = 100;
    double macNcheese = 100;
    double pasta = 100;

    // desert
    double malva = 50;
    double tart = 40;
    double cake = 50;
    double iceCream = 60;
    double pudding = 60;
    
    do{
        printMenu();
        int option = userInput.nextInt();
        switch(option){
        case 1: 
        boolean drinks = true;
        printDrinks();
        break;
        case 2: 
        boolean food = true;
        printFood();
        break;
        case 3:
            boolean desert = true;
            printDesert();
            break;
        case 4:
            boolean ttotal = true;
            printTotal();
        case 5: 
        System.out.println("Thank you, goodbye!");
        run = false;
        break;
        default: 
        System.out.println("Invalid option!");

        }
        

    } while (run);
    


    }
    static void printMenu(){
        System.out.println("********************************");
        System.out.println("Welcome to Cafe Kremino");
        System.out.println("********************************");
        System.out.println("What would you like to get?");
        System.out.println("1. Drinks");
        System.out.println("2. Food");
        System.out.println("3. Desert");
        System.out.println("4. Bill");
        System.out.println ("5. End");
        System.out.println("********************************");

    }
    static double printDrinks(double coffee, double coldDrink, double tea, double fruitJuice, int input){
        System.out.println("********************************");
        System.out.println("Here is the drinks menu!");
        System.out.println("********************************");
        System.out.println("What would you like to get?");
        System.out.println("1. Coffee");
        System.out.println("2. Tea");
        System.out.println("3. Fruit Juice");
        System.out.println("4. Cold Drink");
        System.out.println ("5. Switch to food");
        System.out.println("********************************");
        input = userInput.nextInt();
        switch (key) {
            case value:
                
                break;
        
            default:
                break;
        }
    }
    
}
