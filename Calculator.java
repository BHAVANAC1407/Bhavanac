package basics;

import java.util.Scanner;

public class Calculator {
	    double a;
	    double b;
	    String operation;

	    // Method to perform calculation
	    void calculate() {
	        switch (operation.toLowerCase()) {

	            case "add":
	            case "+":
	                System.out.println("Addition: " + (a + b));
	                break;

	            case "subtract":
	            case "-":
	                System.out.println("Subtraction: " + (a - b));
	                break;

	            case "multiply":
	            case "*":
	                System.out.println("Multiplication: " + (a * b));
	                break;

	            case "divide":
	            case "/":
	                if (b != 0) {
	                    System.out.println("Division: " + (a / b));
	                } else {
	                    System.out.println("Error: Division by zero is not allowed");
	                }
	                break;

	            default:
	                System.out.println("Invalid operation");
	        }
	    }

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);
	        Calculator calc = new Calculator();

	        // Taking inputs
	        System.out.print("Enter value of a: ");
	        calc.a = sc.nextDouble();

	        System.out.print("Enter value of b: ");
	        calc.b = sc.nextDouble();

	        System.out.print("Enter operation (add, subtract, multiply, divide): ");
	        calc.operation = sc.next();

	        // Perform calculation
	        calc.calculate();

	        sc.close();
	    }
	}

	


