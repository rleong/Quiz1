package MainPack;//Russell Leong Quiz 1

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args){
		
		Scanner reader = new Scanner(System.in);
		int COMP;
		int ATT;
		int YDS;
		int TD;
		int INT;
		double a;
		double b;
		double c;
		double d;
		double e;
		
		System.out.println("Enter touchdowns:");
		TD = reader.nextInt();
		System.out.println("Enter yards:");
		YDS = reader.nextInt();
		System.out.println("Enter completions:");
		COMP = reader.nextInt();
		System.out.println("Enter interceptions:");
		INT = reader.nextInt();
		System.out.println("Enter passed attempts:");
		ATT = reader.nextInt();
		a = (COMP/ATT - .3)*5;
		b = (YDS/ATT - 3)*.25;
		c = (TD/ATT)*20;
		d = 2.375 - ((INT/ATT)*25);
		e = ((a+b+c+d)/6)*100;
		System.out.println(e);
		
		
	}

}
