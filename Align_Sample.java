
/*public class Align_Sample {
	public static void main(String[] args) {
		System.out.println("hello\n         welcome to\n   edubridge     online     classes");
	} 

}*/
import java.util.*;
import java.util.Date;
import java.text.Format;
import java.text.SimpleDateFormat;
public class Align_Sample {
	public static void main(String[] args) {
		
		Calendar cal=Calendar.getInstance();
		//LocalDate date =LocalDate.now();
		
		SimpleDateFormat formatter=new SimpleDateFormat("dd/MM/yy");
		System.out.println("Todays date is: "+formatter.format(cal.getTime()));
		Format f =new SimpleDateFormat ("EEEE");
		String date= f.format(new Date());
		//System.out.println("Day of the week is: "+d.getDate());
		System.out.println("Date: "+date);
		
		
	}
		/*
		DateFormat formatter=new SimpleDateFormat("dd/MM/yy");
		Calendar cal=Calendar.getInstance();
		String str=formatter.format(cal.getTime());
		System.out.println("Current date: "+str);*/
	}



