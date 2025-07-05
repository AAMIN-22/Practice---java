import java.util.Scanner;
public class Table{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Any Number :> ");
        int num = sc.nextInt();
        System.out.println("Multiplication of Table :> ");

        for(int i = 1; i <= 10; i++){
            System.out.println(num + " x " + i + " = " + num * i);
        }
    }
}