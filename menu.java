import java.util.Scanner;
import java.text.DecimalFormat;

public class menu {
    public static void main(String[] args){
    //declarationsss
    Scanner userInput = new Scanner(System.in);
    DecimalFormat myFormatter = new DecimalFormat("#,##0.00");
    boolean run = true;
    double subtotal = 0;
    double total = 0;
    double tax = 0.15;
    int brekkieCount = 0;

    //food
    double breakfast = 100;
    double burger  = 100;
    double mCheese  = 100;

    //drinks
    double coffee = 10;
    double juice  = 10;
    double tea  = 10;
    //desert
    double cake = 100;
    double malva  = 100;
    double tart  = 100;


    do {
        printMenu();

        int option = userInput.nextInt();
        switch (option) {
            case 1:
                printFood(run);
                option = userInput.nextInt();
                foodChoice(breakfast, burger, mCheese, option, subtotal, option, option, option);
                break;
            case 2:
                printDrinks();
                break;
            case 3:
                printDesert();
                break;
            case 4: System.out.println("Okay, your total is " + subtotal + "you ordered this amount of eng break" + brekkieCount );
            run = false;
            break;
            case 5: System.out.println("Okay, goodbye!");
            run = false;
            break;
            default: 
            System.out.println("invalid option");
                break;
        }
    }while(run);
    
    }
    static void printMenu(){
        System.out.println("*****************");
        System.out.println("Welcome to my restaurant!");
        System.out.println("*****************");
        System.out.println("Choose an option");
        System.out.println("1. Food Menu");
        System.out.println("2. Drinks Menu");
        System.out.println("3. Desert Menu");
        System.out.println("4. total");
        System.out.println("4. exit");
        System.out.println("*****************");
        
    }
    static void printFood( boolean foodm){
        
        System.out.println("*****************");
        System.out.println("Food Menu");
        System.out.println("*****************");
        System.out.println("1. English Breakfast");
        System.out.println("2. Burger Combo");
        System.out.println("3. Mac and Cheese");
        System.out.println("4. Exit");
        System.out.println("*****************");
        
    }
    static void printDrinks(){
        System.out.println("*****************");
        System.out.println("Drinks");
        System.out.println("*****************");
        System.out.println("1. Juice");
        System.out.println("2. Coffee");
        System.out.println("3. Tea");
        System.out.println("4. Exit");
        System.out.println("*****************");

    }
    static void printDesert(){
        System.out.println("*****************");
        System.out.println("Desert Menu");
        System.out.println("*****************");
        System.out.println("1. cake");
        System.out.println("2. malva");
        System.out.println("3. tart");
        System.out.println("4. Exit");
        System.out.println("*****************");
    }
    static double foodChoice(double breakfast, double burger, double mCheese, int option, double subtotal, int brekkieCount, int burgerCount,  int cheeseCount){
            boolean food = true;
                switch (option) {
                    case 1:
                        System.out.println("breakfast");
                        subtotal = breakfast + subtotal;
                        brekkieCount = 0;
                        brekkieCount++;
                        break;
                    case 2:
                        System.out.println("burger combo chosen");
                        System.out.println("breakfast");
                        subtotal = burger + subtotal;
                        burgerCount = 0;
                        burgerCount++;
                        break;
                    case 3:
                        System.out.println("mac and cheese chosen");
                        System.out.println("breakfast");
                        subtotal = mCheese + subtotal;
                        cheeseCount = 0;
                        cheeseCount++;
                        break;
                    case 4: food = false;
                    default:
                        System.out.println("Invalid option");
                        break;
            }
        return subtotal;

    }
    Scanner close;
}