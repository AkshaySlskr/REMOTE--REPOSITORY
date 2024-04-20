package main;

import java.util.Scanner;

public class calculator {

public static int add (int num1, int num2) {
	return num1 + num2;
}

public static int sub (int num1, int num2) {
	return num1 - num2;
}

public static int mul (int num1, int num2) {
	return num1 * num2;
}

public static double div(double num1, double num2) {
	if (num2 ==0 ) {
		throw new IllegalArgumentException("Cannot divide by zero");
	    }
	return num1/num2;
}

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter first number: ");
    int num1 = scanner.nextInt();
    
    System.out.print("Enter second number: ");
    int num2 = scanner.nextInt();

    System.out.println("Sum: " + calculator.add(num1, num2));
    System.out.println("Difference: " + calculator.sub(num1, num2));
    System.out.println("Product: " + calculator.mul(num1, num2));
    System.out.println("Quotient: " + calculator.div(num1, num2));
    }
}