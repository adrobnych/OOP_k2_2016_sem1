package lab1;
import java.util.Scanner;
public class opyatchasi {
	public static void main(String[] args) 
	{ 
	Scanner in = new Scanner(System.in); 

	System.out.println("������ ��� ��� � ��:�� ��� ��:�� a/p.m. ������:");
	String time = in.nextLine(); 
	System.out.println("������ ��� ������� ����:"); 
	int zone = in.nextInt(); 
	int chas = Integer.parseInt(time.substring(0,2)); 
	chas += zone; 
    if (time.length()==5) { 
	if (chas>= 24)
		chas %= 24; 
	} 
	else { 
	if (chas>= 12 && chas<=24) { 
	    chas%= 12; 
	if(time.charAt(6)=='a') time = time.replace('a','p'); 
	if(time.charAt(6)=='p') time = time.replace('p','a'); 
	} 
	if(chas >= 24) chas%=24;
	} 
    if(chas>9){
    	System.out.println("��� � �������� ���� - "+chas+time.substring(2));
	}
    else
    	System.out.println("��� � �������� ���� - "+"0"+chas+time.substring(2));
}
}
