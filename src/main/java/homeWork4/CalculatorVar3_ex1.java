package homeWork4;

import java.util.Scanner;

public class CalculatorVar3_ex1 {

    public double add(double a, double b) {
        return a + b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Stop!");
            return 0;
        } else {
            return a / b;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueCalc = true;
        CalculatorVar3_ex1 myCalc = new CalculatorVar3_ex1();
        do {
            System.out.println("Enter first number: ");
            double a = scanner.nextDouble();
            System.out.println("Enter operator: ");
            char operator = scanner.next().charAt(0);
            System.out.println("Enter second number: ");
            double b = scanner.nextDouble();

            switch (operator) {
                case '+' -> System.out.println("Result: " + myCalc.add(a, b));
                case '-' -> System.out.println("Result: " + myCalc.subtract(a, b));
                case '*' -> System.out.println("Result: " + myCalc.multiply(a, b));
                case '/' -> System.out.println("Result: " + myCalc.divide(a, b));
                default -> System.out.println("Ups!");

            }
            System.out.println("Continue? (Yes/No)");
            char choice = scanner.next().charAt(0);
            if (choice == 'n') {
                continueCalc = false;
                System.out.println("Good buy!");

            } else if (choice == 'y') {
                continueCalc = true;
                System.out.println("oK!");
            }
        } while (continueCalc);
        scanner.close();
    }

}


