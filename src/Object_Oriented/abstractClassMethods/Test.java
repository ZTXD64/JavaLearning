package Object_Oriented.abstractClassMethods;

public class Test {
    public static void main(String[] args) {
        /*
        抽象类和抽象方法：
            抽象方法：将共性的行为（方法）抽取到父类之后。因为每一个子类的方法体是不一样的，所以
                    在父类中不能确定具体的方法体。该方法就可以定义为抽象方法。

                    //public abstract 返回值类型 方法名（参数列表）；


            抽象类：如果一个类中存在抽象方法，那么该类就必须声明为抽象类
                    //public abstract class 类名{ }

            抽象方法所在的类必须抽象类
         */

//        抽象类和抽象方法的注意事项：
//        注意点1：抽象类不能实例化（就是不能创建抽象类的对象）
                                     //如果可以创建抽象类的对象的话，用对象调用一个没有方法体的抽象方法，没有任何意义。


//        注意点2：抽象类中不一定有抽象方法，
                                //作用：不让外界创建抽象类的对象
//                  有抽象方法的类一定是抽象类（正常的内容）


//        注意点3：抽象类中可以有构造方法
                        //构造方法的作用：给成员变量进行赋值


//        注意点4：抽象类的子类
                //要么重写抽象类中的所有抽象方法（正常的使用方法）
//                要么子类也是抽象类
//                          这种方式意义不大，还要写一个孙子类继承子类，并且重写所有的抽象方法。
//                          在外界才可以创建孙子类的对象，调用里面的方法


        //抽象类和抽象方法的意义？——强制子类必须按照这种格式重写，方便统一调用

        //Cat对象
        Cat mimi = new Cat("咪咪","白色");
        System.out.println(mimi.getName()+mimi.getColor());
        mimi.eat();
        mimi.catchMouse();
        mimi.drink();

        //Dog对象
        Dog wangcai = new Dog("旺财","黄色");
        System.out.println(wangcai.getName()+wangcai.getColor());
        wangcai.eat();
        wangcai.lookHouse();
        wangcai.drink();

        //注意点1：抽象类不能实例化
        //Animal a = new Animal();



//        1．什么是抽象类和抽象方法？
//        多个子类抽取共性时，无法确定方法体，就把父类中的方法定义为抽象
//        强制让子类按照某种格式重写。
//        抽象方法所在的类，必须是抽象类。
//        2.抽象类和抽象方法的格式？
//        publicabstract返回值类型方法名（参数列表）；
//public abstract class类名{...}
//        3.继承抽象类有哪些要注意？
//        抽象类不能实例化
//        继承抽象类时，要么重写抽象类中的所有抽象方法，
        //要么子类也是一个抽象类
//
    }
}