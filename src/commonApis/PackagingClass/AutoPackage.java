package commonApis.PackagingClass;

public class AutoPackage {
    public static void main(String[] args) {
        //自动装箱拆箱
        /*
        箱：对象
        自动装箱：JVM会自动的把基本数据类型装到一个对象当中，底层调用valuOf()方法

        Integer i1 = 100; // Integer i1 = Integer.valueOf(100);

        自动拆箱：JVM会自动的把对象中的基本数据类型拿出来，底层intValue方法
                Integer和int等价的
         */

        Integer i1 = 100; //Integer i1 = new Integer(100);

        Integer i2 = 200;//Integer i1 = new Integer(100);

        Integer i3 = i1+i2;  //// 等价于:i1.intValue()+i2.intValue()=300
        //Integer i3 = Integer.valueOf(300);    // Integer i3 = Integer.valueOf(i1.intValue() + i2.intValue());

        System.out.println(i3);
    }
}
