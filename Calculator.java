import java.util.Scanner;
public class Calculator
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		double a,b,c;
		int ch;
		
		do{
			System.out.println("Enter 1 for Addition");
			System.out.println("Enter 2 for subtraction ");
			System.out.println("Enter 3 for multiplication");
			System.out.println("Enter 4 for division");
			System.out.println("Enter 5 for exit");
			System.out.println("Enter your choice => ");
			ch=s.nextInt();
			
			switch(ch)
			{
				case 1:
					System.out.println("Enter Any Two Number => ");
					a=s.nextDouble();
					b=s.nextDouble();
					c=a+b;
					System.out.println("Sum of two number is : "+c);
					break;
					
				case 2:
					System.out.println("Enter Any Two Number => ");
					a=s.nextDouble();
					b=s.nextDouble();
					c=a-b;
					System.out.println("Sum of two number is : "+c);
					break;
				
				case 3:
					System.out.println("Enter Any Two Number => ");
					a=s.nextDouble();
					b=s.nextDouble();
					c=a*b;
					System.out.println("Sum of two number is : "+c);
					break;
				
				case 4:
					System.out.println("Enter Any Two Number => ");
					a=s.nextDouble();
					b=s.nextDouble();
					c=a/b;
					System.out.println("Sum of two number is : "+c);
					break;
					
				case 5:
					System.exit(0);
					
					default:
						System.out.println("Enter Correct Choice");
			} 
		}while(true);
	}

}