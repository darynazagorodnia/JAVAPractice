package exceptions;

import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandlingMain {
    public static void main(String[] args) {
        try {
            doEverything();
        } catch (InvalidInputParamException e) {
            System.out.println("InvalidInputParamException");
            e.printStackTrace();
        }

    }

    private static void doEverything() {
        Scanner scanner = new Scanner(System.in);
        boolean continueLoop = true;
        PrintWriter writer = null;
        do {
            try (PrintWriter writer1 = new PrintWriter(new FileWriter("out.txt"));
                 BufferedReader reader = new BufferedReader(new FileReader("123"))) {
                System.out.println("Please enter numerator");
                int numerator = scanner.nextInt();
                System.out.println("Please enter denomirator");
                int denominator = scanner.nextInt();
                //   System.out.println(divide(numerator, denominator));
                //      int[] intArray = new int[1];
                //    int i = intArray[2];
                //   if (continueLoop) {
                //       throw new RuntimeException("Runtime exception");
                //   }
                writer = new PrintWriter(new FileWriter("out.txt"));
                writer.println("Result = " + divide(numerator, denominator));
                //  writer.close();
                continueLoop = false;
            } catch (ArithmeticException | InputMismatchException e) {
                System.out.println("Exception : " + e);
                scanner.nextLine();
                System.out.println("Only integer non-zero parameters allowed");
            } catch (IOException e) {
                System.out.println("Unable to open file");
                e.printStackTrace();
            } catch (IndexOutOfBoundsException e) {
                System.out.println("All Exeption here");
                throw new InvalidInputParamException("Index out of bound. thrown in doEverything " + e);
            } finally {
                System.out.println("Finally block called");
                if (writer != null) {
                    writer.close();
                }
            }
            System.out.println("Try catch blockfile");
        } while (continueLoop);
    }

    private static int divide(int numerator, int denominator) throws ArithmeticException, NullPointerException {
        return numerator / denominator;
    }

}

