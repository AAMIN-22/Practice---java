import java.util.Scanner;
public class LoginSystem{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);


        System.out.println("=== SIGN UP === ");
        System.out.print("=== Username === ");
        String newUsername = sc.nextLine();

        System.out.print("=== Password ===");
        String newPassword = sc.nextLine();

        System.out.println("\n Your Account Has Been Created , Login Now.....");
        int attempts = 3;
        
        while(attempts > 0){
            System.out.print("Enter Username :> ");
            String username = sc.nextLine();
            System.out.print("Enter Password :> ");
            String password = sc.nextLine();

        if(username.equals(newUsername) && password.equals(newPassword)){
            System.out.println("Login Successful . Welcome , " +username);
            break;
        }else{
            attempts--;
            System.out.println("Wrong Username or Password . Remaining Attempts  " +attempts);
            if(attempts == 0){
                System.out.println("Too Many Failed Attempts . Access Blocked ");
            }
        }
        }
    }
}