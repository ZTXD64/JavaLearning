package Object_Oriented.Polymorphism.多态的练习.练习1;

public class Car extends Vehicles{
    //空参构造
    public Car() {
        super();
    }

    //带参构造
    public Car(String band, int speed) {
        super(band, speed);
    }

    @Override
    public void move() {
        System.out.println(getBand()+"的汽车正在以"+getSpeed()+"km/h的速度运行");
    }

    public void honk() {
        System.out.println("汽车正在响铃~~~~");
    }
}
