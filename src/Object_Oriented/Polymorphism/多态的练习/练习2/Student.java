package Object_Oriented.Polymorphism.多态的练习.练习2;

public class Student {
    private String name;
    private int age;

    public Student() {

    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void mianji(Tuxing t) {
        if (t instanceof Cfx) {
            Cfx c = (Cfx)t;
            c.s();
        } else if (t instanceof Circle) {
            Circle y = (Circle)t;
            y.s();

        }

    }
}
