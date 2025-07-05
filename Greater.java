import java.util.Scanner;
public class Greater
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Number :> ");
        int a = sc.nextInt();
        System.out.print("Enter Second NUmber :> ");
        int b = sc.nextInt();
        System.out.print("Enter Third Number :> ");
        int c = sc.nextInt();

        if(a >= b && a >= c)
        {
            System.out.println(a + " Is Greater Number.");
        }else if(b >= a && b >= c){
            System.out.println(b + " Is Greater Number.");
        }else{
            System.out.println(c + " Is Greater Number.");
        }
    }
}