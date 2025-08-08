//testing loops
import java.util.Scanner;
public class loopTest{
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter a number to multiply by 1-10");
        int num = userInput.nextInt();
        for (int i = 0; i <= 10; i++){
            System.out.println(num + "x" + i + "=" + (num *i ));
            System.out.println("Bye nigga");
        }
    }
       
    }
