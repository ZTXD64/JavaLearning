package Object_Oriented.inherit.继承中重写的特点;

public class SmartDevice {
    String name;
    double price;


    public double payment() {
        if (price >= 0 && price <100) {
            return price;
        } else if (price >= 1000 && price <5000) {
            return price*0.9;
        } else if (price >= 5000 && price <10000) {
            return price*0.8;
        } else if (price >= 10000){
            return price*0.7;
        } else {
            return 0;
        }
    }
}
