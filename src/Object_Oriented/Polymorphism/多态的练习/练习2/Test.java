package Object_Oriented.Polymorphism.多态的练习.练习2;

public class Test {
    public static void main(String[] args) {

        //创建长方形对象
        Cfx c = new Cfx(2,4);
        //创建圆形对象
        Circle y = new Circle(3.14,2);

        Student s = new Student("ztxd",18);

        s.mianji(c);
        s.mianji(y);
    }
}
