package interfaces;

public interface Pricable extends Deliverable, Orderrable {

    default int calcPrice(){

        return calcOrderPrice() + calcDeliveryPrice();
    }

    static void doSmth(){

    }
}

