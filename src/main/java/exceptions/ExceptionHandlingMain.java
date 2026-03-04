package exceptions;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandlingMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueLoop = true;
        do {
            try {
                System.out.println("Please enter numerator");
                int numerator = scanner.nextInt();
                System.out.println("Please enter denomirator");
                int denominator = scanner.nextInt();
                //   System.out.println(divide(numerator, denominator));
                PrintWriter writer = new PrintWriter(new FileWriter("out.txt"));
                writer.println("Result = " + res);
                writer.close();
                continueLoop = false;
            } catch (ArithmeticException | InputMismatchException e) {
                System.out.println("Exception : " + e);
                scanner.nextLine();
                System.out.println("Only integer non-zero parameters allowed");
            } catch (IOException e) {
                System.out.println("Unable to open file");
                e.printStackTrace();
            } finally {
                writer.close();

            }

            System.out.println("Try catch blockfile");
        } while (continueLoop);
    }

    private static int divide(int numerator, int denominator) throws ArithmeticException, NullPointerException {
        return numerator / denominator;
    }


}

