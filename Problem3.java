package basics;

import java.util.Scanner;

public class Oddseries {
	
	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter value of a: ");
	        int a = sc.nextInt();

	        int number = 1;

	        for (int i = 1; i <= a; i++) {
	            System.out.print(number);

	            if (i < a) {
	                System.out.print(", ");
	            }

	            number = number + 2; // next odd number
	        }

	        sc.close();
	    }
	}



