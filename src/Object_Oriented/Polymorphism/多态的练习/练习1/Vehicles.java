package Object_Oriented.Polymorphism.多态的练习.练习1;

public class Vehicles {
    //私有化成员变量
    private String band;
    private int speed;

    //空参构造
    public Vehicles() {

    }

    //带参构造
    public Vehicles(String band, int speed) {
        this.band = band;
        this.speed = speed;
    }

    //getter和setter方法
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getBand() {
        return band;
    }

    public void setBand(String band) {
        this.band = band;
    }

    //成员方法
    public void move() {
        System.out.println("车辆正在运行");
    }
}
