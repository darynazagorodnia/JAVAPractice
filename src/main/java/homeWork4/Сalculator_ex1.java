package homeWork4;

import java.util.Scanner;

public class Сalculator_ex1 {

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
            System.out.println("На нуль ділити не мжна!");
            return 0;
        }
        return a / b;
    }

    public static void main(String[] args) {
        Сalculator_ex1 myCalc = new Сalculator_ex1();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть перше значення: ");
        double a = scanner.nextDouble();

        System.out.println("Введіть оператор (+, -, /, *): ");
        char symbol = scanner.next().charAt(0);

        System.out.println("Введіть друге значення: ");
        double b = scanner.nextDouble();
        switch (symbol) {
            case '+' -> System.out.println("Результат: " + myCalc.add (a, b));
            case '-' -> System.out.println("Результат: " + myCalc.subtract(a, b));
            case '/' -> System.out.println("Результат: " + myCalc.divide(a, b));
            case '*' -> System.out.println("Результат: " + myCalc.multiply(a, b));
        }
    }
}
