package homeWork7_8;

public class ExceptionHW8Ex4 {

    public int divideNumber(int a, int b) {
        try {
                return a / b;
        } catch (ArithmeticException e) {
            System.out.println("Ти помилився!");
            return 0;
        } finally {
            System.out.println("Операція завершена");
        }
    }
    public static void main(String[] args){
        ExceptionHW8Ex4 calc = new ExceptionHW8Ex4();
        calc.divideNumber(8, 0);
    }
}
