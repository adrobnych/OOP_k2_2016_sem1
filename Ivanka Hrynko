import java.util.Calendar;
import java.util.TimeZone;
import java.util.Scanner; 

public class Time {

  private static Scanner scan;

public static void main(String[] args) {
	
	  scan = new Scanner(System.in); 
	  System.out.println("Enter Time Zone:"); 
	  String t = scan.nextLine(); 
	 
	
	  Calendar Z = Calendar.getInstance();
	  Z.setTimeZone(TimeZone.getTimeZone("GMT" + t));
	  
	  System.out.println("Time in this Time Zone: " + Z.get(Calendar.HOUR_OF_DAY) + ":"
        + Z.get(Calendar.MINUTE));

  }
}
