import java.util.Scanner;
public class SimpleInte{
    public static void main(String args []){
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter Principal Amount => ");
        float principal = obj.nextFloat();

        System.out.println("Enter Rate of Interest => ");
        float rate = obj.nextFloat();

        System.out.println("Enter Time in Years => ");
        float time = obj.nextFloat();

        float interest = (principal * rate * time) / 100 ;

        System.out.println("Simple Interest is => " + interest);
    }
}