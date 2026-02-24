package interfaces;

public class InterfaceRunner {

    public static void main(String[] args) {
        Deliverable pizza = new Pizza("Neapolitana", 1, 20, Size.L);
        Deliverable phone = new CellPhone("Motorola", "XT1575", 1, 250);
        Deliverable fridge = new Fridge("LG", "E9090", 1, 300);

        printDeliveryPrice(pizza);
        printDeliveryPrice(phone);
        printDeliveryPrice(fridge);


    }

    private static void printDeliveryPrice(Deliverable del) {
        System.out.println("Delivery price " + del.calcDeliveryPrice());
    }

}

