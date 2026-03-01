package homeWork3;

public class Methods {
    public static void main(String[] args) {
        int[] numbers = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        int target = 20;

        int result = findElement(numbers, target);

        if (result != -1) {
            System.out.println("Елемент: " + result);
        } else {
            System.out.println("Елемент не знайдено.");
        }
    }
    public static int findElement(int[] array, int target) {
        for (int a = 0; a < array.length; a++) {
            if (array[a] == target) {
                return a;
            }
        }
        return -1;
    }
}
