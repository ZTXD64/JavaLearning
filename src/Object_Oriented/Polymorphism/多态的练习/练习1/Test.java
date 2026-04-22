package Object_Oriented.Polymorphism.多态的练习.练习1;

public class Test {
    public static void main(String[] args) {

        //创建Person对象
        Person p = new Person("小明",18,"男");

        //创建自行车对象
        Bike b = new Bike("java",180);

        System.out.println(p.getName()+p.getAge()+p.getGender());
        p.drive(b);

        //创建汽车对象
        Car c = new Car("宾利",180);

        p.drive(c);


    }
}
