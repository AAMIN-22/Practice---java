import java.util.Scanner;
public class Character{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your Choice :> ");
        int rows = sc.nextInt();

        for(int i = 1; i <= rows; i++){
            for(char ch = 'A'; ch < 'A' + i; ch++){
                System.out.print(ch);
            }
            System.out.println();       
        }
    }
}