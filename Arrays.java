import java.util.Scanner;
public class Arrays{
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        
        String[] details = new String[3];
        System.out.println("Enter your name: ");
        details[0] = userInput.nextLine();
        System.out.println("Enter your surname: ");
        details[0] = userInput.nextLine();
        System.out.println("Enter your password: ");
        details[1] = userInput.nextLine();

       for(int i = 0; i <= 2; i++){
        System.out.println(details[i]);
       }
       }
    }
