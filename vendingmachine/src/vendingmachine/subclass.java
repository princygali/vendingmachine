package vendingmachine;

import java.util.Scanner;

public class subclass extends superclass {  
	int i;
	void Beverges() {
		System.out.println("SELECT 1 FOR COLD COFFEE");
		System.out.println("SELECT 2 FOR COCOCOLA");
		System.out.println("SELECT 3 FOR WATER");
		System.out.println("SELECT 4 FOR COKE");
		Scanner s;
		s=new Scanner(System.in);
		i=s.nextInt();
		switch(i) {

		case 1:
			System.out.println("***COLD COFFEE***");
			itemname="COLD COFFEE";
			Select();
			bill();
			break;
		case 2:
			System.out.println("***COCOCOLA***");
			itemname="COCOCOLA";
			Select();
			bill();
			break;
		case 3:
			System.out.println("***WATER***");
			itemname="WATER";
			Select();
			bill();
			break;	
		case 4:
			System.out.println("***COKE***");
			itemname="COKE";
			Select();
			bill();
			break;
			default:
				System.out.println("PLEASE SELECT COORRECT ONE");
				break;
				}
	
		}




	}


