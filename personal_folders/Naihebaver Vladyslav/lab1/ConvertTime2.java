import java.text.SimpleDateFormat; 
import java.util.Date; 
import java.util.TimeZone; 
import java.util.Scanner; 


public class ConvertTime2 { 

public static void main(String[] args) { 
Scanner scanner = new Scanner(System.in); 

System.out.println("Enter TimeZone in format:'GMT+/-Z'"); 
String s = scanner.nextLine(); 

//System.out.println("Time in Ukraine:"); 

SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm K:m a (dd/MM/yyyy) \n"); 

System.out.println("Time in Ukraine: " + dateFormat.format( new Date() ) ); 
SimpleDateFormat dateFormat1 = new SimpleDateFormat("HH:mm K:m a (dd/MM/yyyy) "); 

dateFormat1.setTimeZone(TimeZone.getTimeZone(s)); 
System.out.println("Time in Timezone "+ s+": " + dateFormat1.format( new Date() ) ); 

scanner.close();
} 
}