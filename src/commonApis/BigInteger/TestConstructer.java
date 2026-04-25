package commonApis.BigInteger;

import java.math.BigInteger;

public class TestConstructer {
    public static void main(String[] args) {
        //BigInteger java中的大整数

        /*
        获取对象的两种方式：
                构造方法
                静态方法

        */

        //1.构造方法获取对象
        //每一次都是创建了新的对象
        BigInteger i1 = new BigInteger("9999999999999999999");

        //2.静态方法获取对象
        //传入的是long类型的变量，如果数据过大，请用字符串
        BigInteger bigInteger = BigInteger.valueOf(18888888888L);

        //3.直接赋值？没有这种方法
        //包装类 String可以直接赋值
    }
}
