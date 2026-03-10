package homeWork4;

import java.util.Scanner;

public class CalculatorVar2_ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        char symbol = sc.next().charAt(0);
        int b = sc.nextInt();

        if (symbol == '+') {
            int result = a + b;
            System.out.println(result);
        } else if (symbol == '-') {
            int result = a - b;
            System.out.println(result);
        } else if (symbol == '*') {
            int result = a * b;
            System.out.println(result);
        } else if (symbol == '/') {
            int result = a / b;
            System.out.println(result);
        }
    }
}
