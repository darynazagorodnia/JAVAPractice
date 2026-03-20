package homeWork4;
import java.util.Arrays;
//2. Створи масив з п'яти імен студентів. Пройдися по ньому циклом і виведи кожне ім'я в консоль.
public class Array_ex2 {
    public static void main(String[] args) {
        String[] names = {"Mary", "Kate", "Helen", "John", "Nike"};
        Arrays.sort(names, (s1, s2) ->s1.length() - s2.length());
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
        System.out.println(Arrays.toString(names));

        System.out.println();

// вивела імена з кінця масиву.
        for (int i = names.length - 1; i >= 0; i--) {
            System.out.println(names[i]);
        }
        System.out.println();

// вивела імена через for-each

        for (String studentName : names) {
            System.out.println(studentName);
            if (studentName.equals("Helen")) {
                System.out.println("Helen is here!");
                break;
            }


        }

    }
}

