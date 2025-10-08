import java.util.Scanner;

public class LibraryMemberChecker{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        boolean isRunning =  true;
        System.out.println("Welcome to the Nokeng Public Library System");
        String memberName;
        String membership;

        do {
            System.out.println("What is your name?");
            
            while((memberName = input.nextLine()).length() < 3 ){
                System.out.println("Name must be at least 3 characters. Enter again:");
            }
            System.out.println("Enter your Membership type: S for Standard, P for Premium");
            membership = input.nextLine();
            while(!membership.equalsIgnoreCase("S") && !membership.equalsIgnoreCase("P")){
                System.out.println("Invalid membership type. Enter S or P:");
                System.out.println("Enter your Membership type: S for Standard, P for Premium");
                membership = input.nextLine();
            }
            if (membership.equalsIgnoreCase("S")) {
                System.out.println("Hello " + memberName + " as a standard member, you may borrow up to 3 books.");
                
            }else{
                    System.out.println("Hello " + memberName + " as a Premium member, you may borrow up to 7 books.");
            }
            System.out.println("Do you want to check another member? Y OR N?");
            String checkAgain = input.nextLine();
            if(!checkAgain.equalsIgnoreCase("Y") && !checkAgain.equalsIgnoreCase("N")){
                System.out.println("Invalid option");
            }
            if(checkAgain.equalsIgnoreCase("Y")){
                System.out.println("Okay.");
            }else{
                isRunning = false;
            }

        } while (isRunning);
        
    }
}