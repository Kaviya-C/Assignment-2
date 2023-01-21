import java.util.Scanner;
public class Addition_5_Number {
	public static void main(String[] args) 
	{
		int length=5;
		int start,add=0,result=0;
		{
		System.out.println("enter 5 numbers one by one: ");
		}
		for(start=0;start<length;start++) {
			Scanner input=new Scanner(System.in);
			add=input.nextInt();
			
			result+=add;
			
			 input.close();
		}
		System.out.println("Sum of five numbers is: "+result);
		
	}

}
