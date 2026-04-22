package Object_Oriented.Polymorphism.多态的练习.练习2;

public class Circle extends Tuxing{
    private double pi = 3.14;

    private double r;

    public Circle() {

    }
    public Circle(double pi, double r) {
        this.pi = pi;
        this.r = r;
    }

    public double getPi() {
        return pi;
    }

    public void setPi(double pi) {
        this.pi = pi;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public void s() {
        System.out.println("圆形的面积是："+pi*r*r);
    }
}
