package homeWork4;

import java.util.Scanner;

public class MethodDivideEx4 {

    public void divide(int a, int b) {
        try {
            int result = a / b;
            System.out.println("Результат: " + result);
        } catch (ArithmeticException e) {
            System.out.println("На нуль ділити не можна!!!");
        } finally {
            System.out.println("Розрахунок завршено!");
        }
    }

        public static void main (String[]args){
            Scanner scanner = new Scanner(System.in);
            MethodDivideEx4 calk = new MethodDivideEx4();

            System.out.println("Введіть перше число: ");
            int a = scanner.nextInt();
            System.out.println("Введіть друге число");
            int b = scanner.nextInt();
            calk.divide(a, b);
            scanner.close();
        }

    }





