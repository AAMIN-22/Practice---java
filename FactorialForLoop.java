import java.util.Scanner;
public class FactorialForLoop{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Any Number :> ");
        int num = sc.nextInt();

        long fact = 1;

        for(int i = 1; i <= num; i++){
            fact = fact * i;
        }
        System.out.print("Factorial of " + num + " is " + fact);
    }
}