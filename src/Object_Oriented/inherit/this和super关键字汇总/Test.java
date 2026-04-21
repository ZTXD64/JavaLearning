package Object_Oriented.inherit.this和super关键字汇总;

public class Test {
    public static void main(String[] args) {
//        this和super关键字
//        this内存的角度：表示当前方法调用者的地址值
//        this代码的角度：利用this可以直接调用本类成员（比如：成员变量，成员方法，构造方法等）
//        super关键字：代表使用父类中的内容




        //this()：调用本类的其他构造方法
        //细节：
        //1.如果子类中有多个构造方法的时候，不能用this（）互动调用，一定要预留一个调用父类的构造
        //2.如果构造方法当中写上了this()，就不能再写super()，JVM也不会自动添加super()；I
        //3.在老版本当中this()只能写在构造方法的第一行，但是在新版本当中去掉了这一限制
        Student stu = new Student();
        System.out.println(stu.name);
    }
}
