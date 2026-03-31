package homeWork7_8;

public class DiscounterProduct extends Product {
    double discount;

    public DiscounterProduct(String name, double price, boolean availability, double discount) {
        super(name, price, availability);
        this.discount = discount;
    }

    public double calculateDiscountedPrice() {

        return price - (price * discount / 100);
    }

    public static void main(String[] args) {
        DiscounterProduct laptop = new DiscounterProduct("HP", 20000.0, true, 20);
        laptop.calculateDiscountedPrice();
        double finalPrice = laptop.calculateDiscountedPrice();
        System.out.println("Вартість ноутбуку " + laptop.getName() + " зі знижкою: " + finalPrice + " грн");
    }

}
