//mother and father name, age, salary, phonenumber, address like city state country
import java.util.Scanner;
import java.lang.Long;

public class Sample1 {
	public static void main(String[] args) {
		int salary=80000;
		String phone="9876543210";
		long phoneNumber=Long.parseLong(phone);
		String address="67,Ranganathan Street,Asv city,TamilNadu"; 
		
		Scanner name=new Scanner(System.in);
		System.out.println("Enter your father name: ");
		String father=name.nextLine();
		
		//mother =next().Scanner
	
		System.out.println("Enter your mother name: ");
		String mother=name.nextLine();
		System.out.println("Father name: "+father+"\n"+"Mother name:"+mother);
		System.out.println("Salary of my Parents: "+salary);
		System.out.println("Father Phone-Number: "+ phoneNumber);
		System.out.println("Address: "+address);
		
		
			
	}

}
