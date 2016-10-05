package nachalo;
import java.util.Scanner;
import java.util.Random;
public class chasovwik {
	public static void main(String args[]){
Scanner scn = new Scanner(System.in);
char[][] pole = {
		{'+','+','+'},
		{'+','+','+'},
		{'+','+','+'}};
char winner = ' ';
for(int hod=0;hod<5;hod++){
System.out.print("Введіть рядок:");
int i = scn.nextInt();
System.out.print("Введіть стовбець:");
int j = scn.nextInt();
if(pole[i][j] == '+'){
	pole[i][j]='O';}
for(int y=0;y<3;y++){
	for(int x=0;x<3;x++){
		System.out.print(pole[y][x]+" ") ;	
	}
System.out.println();
}
System.out.println("Хід компютера:");
int x1 = (int) (Math.random() * 3), y1 = (int) (Math.random() * 3);
while(pole[x1][y1]=='O'||pole[x1][y1]=='X'){
	x1 = (int) (Math.random()*3);
	y1 = (int) (Math.random()*3);
}
pole[x1][y1]='X';
for(int y=0;y<3;y++){
	for(int x=0;x<3;x++){
		System.out.print(pole[y][x]+" ") ;	
	}
System.out.println();
}
for (int y = 0; y < 3; y++) {
    if (pole[y][0] == pole[y][1] && pole[y][1] == pole[y][2]
            && pole[y][0] != '+') {
        winner = pole[y][0];
        System.out.println("Переможець - "+winner);
        break;
    }
}
if (winner == ' '){
	for(int y=0;y<3;y++){
		if(pole[0][y]==pole[1][y]&&pole[1][y]==pole[2][y]&&pole[0][y]!='+'){
			winner = pole[0][y];
			System.out.println("Переможець - "+winner);
			break;
		}
	}

}
if(winner==' '){
	if(pole[0][2]==pole[1][1]&&pole[1][1]==pole[2][0]&&pole[0][2]!='+'){
		winner = pole [0][2];
		System.out.println("Переможець - "+winner);
	}
}
if(winner==' '){
	if(pole[0][0]==pole[1][1]&&pole[1][1]==pole[2][2]&&pole[0][0]!='+'){
		winner=pole[0][0];
		System.out.println("Переможець - "+winner);
	}
}
if(winner!=' '){
break;
}
}
	}
}
