package FunctionalProgramming.o5_ConstructorMethodReference;

public class Test {
    public static void main(String[] args) {
        //●如果某个Lambda表达式里只是在创建对象，并且“→”前后参数情况一致，就可以使用构造器引用。
        //写作：类名::new

//        CarFactory cf = new CarFactory() {
//            @Override
//            public Car getCar(String name) {
//                return  new Car(name);
//            }
//        };
//        CarFactory cf = (name) -> new Car(name);  //lambda表达式
        CarFactory cf = Car::new;

        Car c1 = cf.getCar("BMW");

        System.out.println(c1.getName());

    }

}
@FunctionalInterface
interface CarFactory {
    //不需要写方法体的方法：
//    1. 接口中的抽象方法（你的代码就是这种）
//    2. 抽象类中的抽象方法
//    3. 接口中的默认方法（Java 8+）
//    4. 接口中的静态方法（Java 8+）
    public Car getCar(String name); //接口中的方法默认为抽象方法，抽象方法不需要写方法体
}

class Car{
    private String name;

    public Car() {

    }
    public Car(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
