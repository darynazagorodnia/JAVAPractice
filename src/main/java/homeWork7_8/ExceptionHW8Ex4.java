package homeWork7_8;

class InvalidPriceException extends Exception {
    public InvalidPriceException(String message) {
        super(message);
    }
}

public class ExceptionHW8Ex4 {

    public int divideNumber(int a, int b) throws InvalidPriceException {
        if (b == 0) {
            throw new InvalidPriceException("На нуль ділити не можна!");
        }
        return a / b;
    }

    public static void main(String[] args) {
        ExceptionHW8Ex4 calc = new ExceptionHW8Ex4();

        try {
            System.out.println("Результат: " + calc.divideNumber(8, 0));
        } catch (InvalidPriceException e) {
            System.out.println("Сталася помилка: " + e.getMessage());
        } finally {
            System.out.println("Операція завершена!");
        }
    }
}
