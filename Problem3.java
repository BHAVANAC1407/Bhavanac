package basics;

import java.util.Scanner;

public class Orderseries {
	// for a is odd it prints  all the odd number 
//	a-even it prints a-1;
	
	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter value of a: ");
	        int a = sc.nextInt();

	        for (int i = 1; i <= a; i++) {
	            if (i % 2 != 0) {   // check for odd number
	                System.out.print(i);

	                if (i + 2 <= a) {
	                    System.out.print(", ");
	                }
	            }
	        }

	        sc.close();
	    }
	}



