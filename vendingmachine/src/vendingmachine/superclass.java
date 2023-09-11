
package vendingmachine;

import java.util.Scanner;

public class superclass {
	int i;
	int i1;
	int Quantity;
	int total;
	int money;
	int change;
	int cost;
	String itemname;
	void Select() {
		Scanner s;
		s=new Scanner(System.in);
		System.out.println("Available Items 25");
		System.out.println("SELECT 0 FOR 25$");
		System.out.println("SELECT 1 FOR 50$");
		System.out.println("SELECT 2 FOR 100$");
		cost=s.nextInt();
		switch(cost) {
		case 0:
		System.out.println("cost:25");
		cost=25;
		break;
		case 1:
		System.out.println("cost:50");
		cost=50;
		break;
		case 2:
		System.out.println("cost:100");
		cost=100;
		break;
		default:
			System.out.println("PLEASE SELECT COORRECT ONE");
			break;
		}
		System.out.println("Available items:25");
		System.out.println("Enter Quantity");
		Quantity=s.nextInt();
		if(Quantity>25) {
			System.out.println("Items are not Available");
		}
		else {
			total=Quantity*cost;
			System.out.println("TOTAL AMOUNT:"+total);
			System.out.println("Insert your money");
			money=s.nextInt();
		}
		if(money>total) {
			System.out.println("Money is Sufficient");
			change=money-total;
			System.out.println("change:"+change);
		}
	}
	void bill() {
		if(money<total) {
			System.out.println("Money is not Sufficient");
			System.out.println("Insert correct amount");
		}
		if(Quantity>25){
			System.out.println("Items are not Available");
		}
		else if(money>total) {
			System.out.println("*****BILL DETAILS*****");
            System.out.println("ITEM NAME:"+itemname);
			System.out.println("ITEM COST:"+cost);
			System.out.println("ITEM QUANTITY:"+Quantity);
			System.out.println("Total Amount:"+total);
			System.out.println("*****THANK YOU*****");
		}
	}
		void chocolates() {
			System.out.println("SELECT 1 FOR 5STAR");
			System.out.println("SELECT 2 FOR DAILYMILK");
			System.out.println("SELECT 3 FOR MUNCH");
			System.out.println("SELECT 4 FOR KITKAT");
			Scanner s;
			s=new Scanner(System.in);
			i=s.nextInt();
			switch(i) {

			case 1:
				System.out.println("***5STAR***");
				itemname="5STAR";
				Select();
				bill();
				break;
			case 2:
				System.out.println("***DAILYMILK***");
				itemname="DAILYMILK";
				Select();
				bill();
				break;
			case 3:
				System.out.println("***MUNCH***");
				itemname="MUNCH";
				Select();
				bill();
				break;	
			case 4:
				System.out.println("***KITKAT***");
				itemname="KITKAT";
				Select();
				bill();
				break;
				default:
					System.out.println("PLEASE SELECT COORRECT ONE");
					break;
					}
		
			}
	

}
