package homeWork4;

import java.util.InputMismatchException;
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
        try {
            do {
                double a, b;
                Operations selectOp;
                try {
                    System.out.println("Enter first number: ");
                    a = scanner.nextDouble();
                } catch (InputMismatchException e) {
                    System.out.println("It isn't a number!");
                    scanner.next();
                    continue;
                }
                System.out.println("Enter operator: ");
                char inputSymbol = scanner.next().charAt(0);
                selectOp = Operations.fromChar(inputSymbol);
                try {
                    System.out.println("Enter second number: ");
                    b = scanner.nextDouble();
                } catch (InputMismatchException e) {
                    System.out.println("It isn't number!");
                    scanner.next();
                    continue;
                }catch (IllegalArgumentException e){
                    System.out.println("Unknown operator!");
                    scanner.next();
                    continue;
                }
                switch (selectOp) {
                    case ADD -> System.out.println("Result: " + myCalc.add(a, b));
                    case SUBTRACT -> System.out.println("Result: " + myCalc.subtract(a, b));
                    case MULTIPLY -> System.out.println("Result: " + myCalc.multiply(a, b));
                    case DIVIDE -> System.out.println("Result: " + myCalc.divide(a, b));
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
        } finally {
            System.out.println("Сlosed safely!");
        }
        scanner.close();
    }


}


