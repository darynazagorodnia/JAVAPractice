package innerclasses;

public class CellPhone {

    private String make;
    private String model;
    private Display display;
    private RadioModul gsm;
    private AbstractPhoneButon button;

    public interface AbstractPhoneButon{
        void click();
    }

    public CellPhone(String make, String model) {
        this.make = make;
        this.model = model;
    }


    public void turnOn(){
        initDisplay();
        gsm = new RadioModul();
        initButton();

    }

    public void initButton() {
        button = new AbstractPhoneButon() {
            @Override
            public void click() {
                System.out.println("Button clicked");

            }
        };
    }
    public void call(String number){
    button.click();
     gsm.call(number);
    }

    private void initDisplay(){
        display = new Display();
    }

    public Display getDisplay() {
        return display;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }
}
