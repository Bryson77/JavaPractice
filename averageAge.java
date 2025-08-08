public class averageAge{
    public static void main(String[] args){
        int[] ages = {25, 30, 22, 28, 35};

        float avg, sum = 0;

        int length = ages.length;

        for(int age : ages){
            sum += age;
        }

        avg = sum / length;

        System.out.println( avg );



 
    }
}