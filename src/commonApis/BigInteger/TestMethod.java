package commonApis.BigInteger;

import java.math.BigInteger;

public class TestMethod {
    public static void main(String[] args) {
//        常见的成员方法：
//        public BigInteger add(BigInteger val) 加法
//        public BigInteger subtract(BigInteger val) 滅法
//        public BigInteger multiply(BigInteger val) 乘法
//        public BigInteger divide(BigInteger val) 除法，获取商
//        public BigInteger[] divideAndRemainder(BigInteger val) 除法，获取商余数，返回数组
//        public boolean equals(Object x) 比较
//        public BigInteger pow(int exponent) 次方
//        public BigInteger max/min(BigInteger val) 最大值/最小值

        //获取对象
        BigInteger b1 = BigInteger.valueOf(100);
        BigInteger b2 = BigInteger.valueOf(3);

        //加法
        BigInteger b3 = b1.add(b2);
        System.out.println(b3);

        //减法
        BigInteger b4 = b1.subtract(b2);
        System.out.println(b4);

        //乘法
        BigInteger b5 = b1.multiply(b2);
        System.out.println(b5);

        //除法，获取商
        BigInteger b6 = b1.divide(b2);
        System.out.println(b6);

        //除法，获取商和余数。返回数组
        BigInteger[] bigIntegers = b1.divideAndRemainder(b2);
        System.out.println(bigIntegers[0]);
        System.out.println(bigIntegers[1]);

        //次方
        BigInteger pow = b1.pow(2);
        System.out.println(pow);

        //比较
        //返回的是较大数的内存地址，不新建对象
        boolean equals = b1.equals(b2);
        System.out.println(equals);

        /*
        ①如果BigInteger表示的数字没有超出long的范围，可以用静态方法获取。
        ②如果BigInteger表示的超出long的范围，可以用构造方法获取。
        ③对象一旦创建，BigInteger内部记录的值不能发生改变。
        ④只要进行计算都会产生一个新的BigInteger对象*/

    }
}
