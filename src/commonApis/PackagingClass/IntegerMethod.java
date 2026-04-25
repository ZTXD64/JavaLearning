package commonApis.PackagingClass;

public class IntegerMethod {
    public static void main(String[] args) {
        /*
        Integer里面的常见方法：
        public static int valueOf(int i)                            把基本数据类型变成包装类
        public int intValue()                                       把包装类变回基本数据类型int(非静态方法，需要对象调用)
        public static int parseInt(String s)                        把字符串形式的整数变成int类型
        public static String toBinaryString(int i)                  获取二进制
        public static String toOctalString(int i)                   获取八进制
        public static String toHexString(int i)                     获取十六进制
        */


        //1.把基本数据类型转化成包装类
        Integer i = Integer.valueOf("123");
        System.out.println(i);

        //把包装类变回基本数据类型int
        Integer i2 = 123;
        int i3 = i2.intValue();
        System.out.println(i3);

        //把字符串形式的整数变成int类型
        //如果传入的字符串有其他字符，则报错
        int i4 = Integer.parseInt("1234");
        System.out.println(i4);

        //获取二进制
        String binaryString = Integer.toBinaryString(1234);
        System.out.println(binaryString);
    }
}
