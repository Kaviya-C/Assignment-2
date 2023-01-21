import java.util.Scanner;
public class Name_Friends {
	public static void main(String[] args) {
		
		
		Scanner input=new Scanner(System.in);//creating object of the scanner class
		System.out.println("Enter how many number of friends you have:");
		String[] counts=new String[input.nextInt()];
		System.out.println("Enter the name of the friends..!");
		input.nextLine();		
		for(int start=0;start<counts.length;start++) {
			counts[start]=input.nextLine();
		}
		System.out.println("Your friends List: ");
		for(String str:counts) {
			System.out.println(str);
			
		}
		 input.close();
		
	}	

}
