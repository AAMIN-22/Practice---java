import java.util.Scanner;
public class Leap{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a year :> ");
        int year = sc.nextInt();

        if((year % 4 == 0 && year % 100 != 0 ) || (year % 400 == 0)){
            System.out.print(year + " , Is Leap Year.");
        }else{
            System.out.print(year + " , It Is Not Leap year.");
        }
    }
}