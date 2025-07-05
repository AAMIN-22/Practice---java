import java.util.Scanner;
public class Product {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Input Any Number => ");
        int num1 = sc.nextInt();

        System.out.println("Input Second Number => ");
        int num2 = sc.nextInt();

        System.out.println("Addition of num1 and num2 is => " + (num1 + num2));
        System.out.println("Subtraction of num1 and num2 is => " + (num1 - num2));
        System.out.println("Product of num1 and num2 is => " + (num1 * num2));
        System.out.println("Division of num1 and num2 is => " + (num1 / num2));
        System.out.println("Remainder of num1 and num2 is => " + (num1 % num2));
    }
}