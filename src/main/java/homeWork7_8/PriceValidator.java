package homeWork7_8;

public class PriceValidator {
    public void checkPrice(double price){
        if (price<=0){throw new PriceExceptionEx5HW8("Ціна не правильна!");
        }
    }
    public static void main (String[] args){
        PriceValidator validator = new PriceValidator();
        validator.checkPrice(8.8);
        validator.checkPrice(-10);
    }

}
