public class javaRecursion{
    public static void main(String[] args){
    int result = recursion(10);
    System.out.println(result);
    }
    static int recursion(int b){
        if(b > 0){
            return b + recursion(b - 1);
        }
        else{
            return 0;
        }//yebo
    }
}