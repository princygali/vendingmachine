package vendingmachine;

import java.util.Scanner;

public class derivedclass extends subclass{
	int i;
	void Snackes() {
		System.out.println("SELECT 1 FOR BINGO");
		System.out.println("SELECT 2 FOR GOOD DAY");
		System.out.println("SELECT 3 FOR PEANUT BUTTER CUPS");
		System.out.println("SELECT 4 FOR INSTANT NOODLES");
		Scanner s;
		s=new Scanner(System.in);
		i=s.nextInt();
		switch(i) {

		case 1:
			System.out.println("***BINGO***");
			itemname="BINGO";
			Select();
			bill();
			break;
		case 2:
			System.out.println("***GOOD DAY***");
			itemname="GOOD DAY";
			Select();
			bill();
			break;
		case 3:
			System.out.println("***PEANUT BUTTER CUPS***");
			itemname="PEANUT BUTTER CUPS";
			Select();
			bill();
			break;	
		case 4:
			System.out.println("***INSTANT NOODLES***");
			itemname="INSTANT NOODLES";
			Select();
			bill();
			break;
			default:
				System.out.println("PLEASE SELECT COORRECT ONE");
				break;
				}
	
		}




	}





