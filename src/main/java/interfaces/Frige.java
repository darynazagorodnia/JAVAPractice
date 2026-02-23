package interfaces;

public class Frige extends Electronics {

    public Frige(String make, String model, int quantity, int price){

    }

    @Override
    public int calcOrderPrice() {

    }

    @Override
    public void calcDeliveryPrice() {
        if (getPrice()>=300) {
            return 0;
        }else {
            return 25;
        }


    }

}
