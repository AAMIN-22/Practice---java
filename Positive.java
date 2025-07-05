import java.util.Scanner;
public class Positive{
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter Any Number :> ");
        int number = sc.nextInt();

        if(number > 0){
            System.out.print(number + " is Positive .");
        }else if(number < 0){
            System.out.print(number + " is Negative .");
        }else{
            System.out.print(number + " is Zero .");
        }


    }
}