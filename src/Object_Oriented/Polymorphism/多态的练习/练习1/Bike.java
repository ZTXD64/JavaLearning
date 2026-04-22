package Object_Oriented.Polymorphism.多态的练习.练习1;

public class Bike extends Vehicles{
    //空参构造
    public Bike() {
        super();
    }

    //带参构造
    public Bike(String band, int speed) {
        super(band, speed);
    }

    @Override
    public void move() {
        System.out.println(getBand()+"的自行车正在以"+getSpeed()+"km/h的速度运行");
    }

    public void ringBell() {
        System.out.println("自行车正在响铃~~~~");
    }


}
