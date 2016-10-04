import java.util.Scanner;

public class Lab_1 {
	public static void main(String[] args){
		Scanner read = new Scanner(System.in);
		
		System.out.println("Enter your time");
		String time = read.nextLine();
		System.out.println("Enter timezone");
		String tZone = read.nextLine();
		
		int doubleDots = time.lastIndexOf(":");
		String hour = time.substring(0,doubleDots);
		int hourInt = Integer.parseInt(hour);
		int tZoneInt = Integer.parseInt(tZone);
		String minutes = time.substring(doubleDots,time.length());
		
		hourInt += tZoneInt;
		
		if( (time.contains("p.m")) || (time.contains("a.m")) ){
			if( (hourInt >= 12 ) && (hourInt < 24)){
				hourInt %= 12;
				if(time.contains("p.m")){
				minutes = minutes.replace("p","a");

				} else{
					minutes = minutes.replace("a","p");
				}
			} else if(hourInt >= 24){
				hourInt %= 24;
			} 
		} else if(hourInt >= 24){
			hourInt %= 24;
		} 
		
		hour = Integer.toString(hourInt);
		time = hour + minutes;
		time = time.toLowerCase();
		System.out.println(time);
	}
	
}




