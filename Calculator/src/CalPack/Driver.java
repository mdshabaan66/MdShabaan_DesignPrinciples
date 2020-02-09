package CalPack;
import java.util.*;
public class Driver {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		int a,b,choice;
		System.out.println("Enter the two Numbers");
		a=s.nextInt();
		b=s.nextInt();
		System.out.println("Enter the Choice");
		System.out.println("1.Addition");
		System.out.println("2.Subtraction");
		System.out.println("3.Multiplication");
		System.out.println("4.Division");
		System.out.println("5.Exit");
		choice=s.nextInt();
		Calculator Cal =new Calculator();
		while( true )
		{
			if(choice==5)
			{
				break;
			}
		switch(choice)
			{
				case 1:
				{
					System.out.println("Answer="+Cal.add(a, b));
					break;
				}
				case 2:
				{
					System.out.println("Answer="+Cal.sub(a, b));
					break;
				}
				case 3:
				{
					System.out.println("Answer="+Cal.mul(a, b));
					break;
				}
				case 4:
				{
					System.out.println("Answer="+Cal.dev(a, b));
					break;
				}
				default :
				{
					System.out.print("Wrong Input");
					break;
				}
			}
		System.out.println("Enter the Choice");
		System.out.println("1.Addition");
		System.out.println("2.Subtraction");
		System.out.println("3.Multiplication");
		System.out.println("4.Division");
		System.out.println("5.Exit");
		choice=s.nextInt();
		System.out.println("Enter the two Numbers");
		a=s.nextInt();
		b=s.nextInt();
	}
}
}
