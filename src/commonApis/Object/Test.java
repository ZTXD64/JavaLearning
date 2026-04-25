package commonApis.Object;

public class Test {
    public static void main(String[] args) {
        //*
        //public String to String()
            //返回对象的字符串表示形式
        //public boolean equals(Object obj)
            //比较两个对象是否相等
        // 1.创建对象
        Student s = new Student("zhangsan",23);
        String str = s.toString();


        //Object类中的toString方法，默认会返回对象的内存地址
        //但是内存地址我们看上去是没有任何意义，我想要把一个对象变成字符串，真正想看到的是对象中的属性值
        //所以，父类中的方法不能满足子类的需求了，所以我们就要在子类当中进行重写


        System.out.println(str);    // com.itheima.a03objecttest.Student@f6f4d33
        /*
        Object类中的源代码：
        返回对象的内存地址
        public String toStringI){
        //getClass()：调用者的字节码文件
        // getName()：这个字节码文件的名字
        //@：间隔符号
        //hashCode()：理解获取对象的内存地址
        //toHexString（)：把内存地址变成16进制的表现形式

        */

        //return getClass().getName() + "@" + Integer.toHexString(hashCode());


        /*额外多说一句：
            如果想要把一个对象变成字符串并打印，其实不需要手动调用toString方法，直接打印这个对象就可以了
        解释输出语句真正的含义：
        System:Java中已经写好的一个工具类，表示系统
        out：是System里面的一个静态变量，默认初始化值为nul1
            程序启动之后，会进行赋值，记录控制台的对象，所以在打印的时候会把数据打印在控制台上
            println：方法
        s：其实就是调用方法的时候传递的实参
            输出语句的运行过程：
            在打印的时候，println方法的内部调用了对象的toString方法
            如果Student中没有重写这个方法，就会调用object中的toString方法，打印对象的内存地址
                I
        习惯：
            般来讲都会重写toString方法，打印对象的时候显示对象的属性值*/
        System.out.println(s);
    }
}
