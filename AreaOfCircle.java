import java.util.Scanner;
public class AreaOfCircle
{
    public static void main(String args [])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Radius Of Circle => ");
        double radius = sc.nextDouble();

        double ar = 3.14*radius*radius;

        System.out.println("Area Of Circle => " + ar);
    }
}