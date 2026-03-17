package homeWork3;

public class ConditionNew {
    public static void main(String[] args) {
        int mark = 60;
        if (mark >= 90) {
            System.out.println("Відмінно");
        } else if (mark <= 89 && mark >= 75 ) {
            System.out.println("Добре");
        } else if (mark <= 74 && mark >= 60) {
            System.out.println("Задовільно");
        } else if (mark <= 59) {
            System.out.println("Погано");
        }
    }
}


