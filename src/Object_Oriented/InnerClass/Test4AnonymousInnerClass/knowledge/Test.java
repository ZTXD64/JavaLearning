package Object_Oriented.InnerClass.Test4AnonymousInnerClass.knowledge;

public class Test {
    public static void main(String[] args) {
        //匿名内部类——————————————最重要的内部类

        //什么时候使用匿名内部类？如果实现类只需要使用一次，就可以使用匿名内部类简化代码或者lambda表达式
        /*
        匿名内部类：就是一个没有名字的内部类
        作用：在继承一个类或者实现一个接口的时候少写一个文件，也是lambda的前置知识点
        定义格式：
                new 类名/接口名(）{
                        重写方法;
                }；
         */


        /*传统方法调用goSwim方法：
            1.新建java文件，在文件当中新建Student类（实现，重写方法）
            2.创建学生对象
            3.调用方法

          问题：
          如果Student类我只要用到一次，那么这个java文件单独新建有点浪费
            我是否可以不新建这个java文件，只要里面的代码呢？
            匿名内部类的作用：少定义一个java文件

          匿名内部类的定义格式：
                new类名/接口名(）{
                        重写类/接口里面的方法；
                    }
                重写类/接口里面的方法；
                匿名内部类的定义格式= 没有名字的java类+继承/实现+重写方法+创建对象
                最终格式可以理解为：是一个没有名字的java类的对象


                没有名字的java类：大括号
                Swim：就是这个没有名字的java类实现了swim接口：所有抽象方法都要重写

         */

        //匿名内部类两种调用方法：
        //第一种
        goSwim(new Swim() {

            @Override
            public void swim() {
                System.out.println("学生正在游泳");
            }
        });

        //第二种

        //Swim ss = new Student();

        //多态
        Swim s = new Swim() {

            @Override
            public void swim() {
                System.out.println("学生正在游泳");
            }
        };
        goSwim(s);

        //匿名内部类
        //goSwim方法需要一个Swim接口的实现类对象，所以我要new一个对象，但是Swim是一个接口，所以需要Swim的实现类对象
        //由于Swim接口中有一个抽象方法，所以我需要重写swim抽象方法
        goSwim(
                new Swim() {
                    @Override
                    public void swim() {
                        System.out.println("学生在游泳");
                    }
                }
        );



        //传统方法调用goSwim
        Student a = new Student();
        goSwim(a);
    }


    //调用这个方法的时候，需要传递Swim这个接口的实现类对象
    public static void goSwim(Swim s) {
        s.swim();

    }
}
