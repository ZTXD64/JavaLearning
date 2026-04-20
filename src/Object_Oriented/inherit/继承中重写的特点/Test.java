package Object_Oriented.inherit.继承中重写的特点;

public class Test {
    public static void main(String[] args) {



        //创建三个对象
        Phone phone = new Phone();
        phone.name = "小米";
        phone.price = 4999;

        double phoneprice = phone.payment();
        System.out.println(phoneprice);


        Pad pad = new Pad();
        pad.name = "OPPO";
        pad.price = 10000;

        double padprice = pad.payment();
        System.out.println(padprice);

        //方法重写的注意事项：
        //1.方法重写时，子类方法名，形参必须和父类方法名相同，方法体按照实际需求书写
        //2.子类方法返回值类型必须和父类方法返回值类型相同或者子类返回值类型必须 broader 父类返回值类型
        //3.final 修饰的类不能被重写，为最终类，修饰的方法不能被重写
        //4.private私有方法，static静态方法，final最终方法 不能被重写
    }
}
