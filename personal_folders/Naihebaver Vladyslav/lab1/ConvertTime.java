
import java.util.Scanner;

public class ConvertTime {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the time in the format HH:mm:ss or HH:mm:ss am/pm :");
		String time = scanner.nextLine();
		
		
		String h = time.substring(0,2);
		int hour = Integer.parseInt(h);
		
		String m = time.substring(3,5);
		int minutes = Integer.parseInt(m);
		
		String s = time.substring(6,8);
		int seconds = Integer.parseInt(s);
		
	 
		if(hour>24 | minutes>60 | seconds > 60)
		{
			System.out.println("Error! Enter the time in the correct format!");
			return;
			
		}
		else 
			if(hour>12 & time.startsWith("am", 9) | time.startsWith("pm", 9))
					{
						System.out.println("Error! Enter the time in the correct format!");
						return;
					}
			else 
			{
					System.out.println("Enter the time zone in which you want to know the time (-11 to 12) :");
							
					int timezone = scanner.nextInt();
				  	hour = Math.abs(hour + timezone - 3);
				  	
				  	
				  	if (hour<=12 & (time.startsWith("am", 9) | time.startsWith("pm", 9)))
				    	System.out.println(hour+":"+minutes+":"+seconds+" "+"am");
				    else 
				     
				     if (hour>=12  & (time.startsWith("am", 9) | time.startsWith("pm", 9)))
				    	{hour = hour - 12;
				    	System.out.println(hour+":"+minutes+":"+seconds+" "+"pm");}
				    
				    else 
					 System.out.println(hour+":"+minutes+":"+seconds);
			}
		
	
		scanner.close();
	   
	}
}