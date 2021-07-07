
import java.util.Scanner;
public class ArithmaticCalc {
 public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	float a,b,ans;
	int choice;
	System.out.println("Enter the First Number");
	a=sc.nextFloat();
	System.out.println("Enter the Second Number");
	b=sc.nextFloat();
	System.out.println("Enter your choice!!!\n"+"1. Addition\n"+"2. Subtraction\n"+
	"3. Multiplication\n"+ "4. Division\n");
	choice=sc.nextInt();
	switch(choice)
	{
	  case 1: 
		  ans= a+b;
		  System.out.println("The Addition of two numbers is "+ans);
		  break;
	  case 2: 
		  ans= a-b;
		  System.out.println("The Subtraction of two numbers is "+ans);
		  break;
	  case 3: 
		  ans= a*b;
		  System.out.println("The Multiplication of two numbers is "+ans);
		  break;
	  case 4: 
		  if(b==0)
			  System.out.println("Division by zero error!!!");
		  else
		   {
			  ans= a/b;
			  System.out.println("The division of two numbers is "+ans);
		   }
		  
		  break;
	  default: System.out.println("Wrong Choice!!!!");
	}
	sc.close();
}
}
