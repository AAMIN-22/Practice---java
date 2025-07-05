import java.util.Scanner;
public class Grade{
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Marks (0-100) :> ");
        float marks = sc.nextFloat();

        if(marks < 0 || marks > 100){
            System.out.print("Invalid Marks ! Please Enter Marks Between 0 and 100");
        }else if(marks >= 90)
        {
            System.out.print("Grade A");
        }else if(marks >= 75)
        {
            System.out.print("Grade B");
        }else if(marks >= 50)
        {
            System.out.print("Grade C");
        }else if(marks >= 35)
        {
            System.out.print("Grade D");
        }else
        {
            System.out.print("Fail");
        }

    }
}