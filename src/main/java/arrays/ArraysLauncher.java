package arrays;

import java.util.Scanner;

public class ArraysLauncher {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myArray = new int[8];
        System.out.println("Please enter 8 int elements");
        for (int j = 0; j < myArray.length; j++) {
            System.out.println("Next element");
            myArray[j] = scanner.nextInt();
        }

        for (int i = 0; i < myArray.length; i++) {
            System.out.println("Element N " + i + " = " + myArray[i]);
        }
    }

    private static int[] sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j + 1];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }
}
// 10, 5, 16, 4
// 5, 10, 4, 16
// 5, 4, 10, 16
// 4, 5, 10, 16
