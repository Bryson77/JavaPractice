import java.util.Scanner;

public class temperature{
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        //Variables
        double userIn;
        double finalAns;
        String option;
        boolean run = true;
        double ans;

        //program
        System.out.println("HI, enter the temperature number you want to convert: ");
        userIn = userInput.nextDouble();

        System.out.println("Which unit of measurement is your temperature? C for Celsius, F for farenheit: ");
        option = userInput.next();

        if(option.equalsIgnoreCase("F") || option.equalsIgnoreCase("C")){
            if(option.equalsIgnoreCase("F")){
                ans = userIn - 32;
                finalAns = ans * 5/9;
                System.out.println("Your converted temp (F TO C) is: " + finalAns);
            }else {
                ans = userIn * 9/5;
                finalAns = ans + 32;
                System.out.println("Your converted temp (C TO F) is: " + finalAns);
            }

        }else{
            System.out.println("Invalid option");
        }
        
        
       
        
    }
}