package Object_Oriented.InnerClass.Test4AnonymousInnerClass.PracticeAnonymousInnerClass;

public class Test {
    public static void main(String[] args) {
        //匿名内部类联系
        //接口：吃（）
        //实现：小狗吃**小兔子吃**小鸡吃***
        //只需要使用一次


        eat(new Eat() {
            @Override
            public void eat() {
                System.out.println("小狗吃骨头");
            }
        });

        eat(new Eat() {
            @Override
            public void eat() {
                System.out.println("小兔子吃胡萝卜");
            }
        });

        eat(new Eat() {
            @Override
            public void eat() {
                System.out.println("小鸡吃米");
            }
        });
    }



    public static void eat(Eat a) {

        a.eat();

    }
}
