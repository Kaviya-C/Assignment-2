
public class First_word_First_LastName {
	public static void main(String[] args) {
	String father="Kaviya Aasaithambi";
	String[] nameSeperate=father.split(" ");
	String initiate=nameSeperate[0]+"."+nameSeperate[1].charAt(0)+" Daughter of "+nameSeperate[1];
	System.out.println("Name: " +initiate);
	}

}
