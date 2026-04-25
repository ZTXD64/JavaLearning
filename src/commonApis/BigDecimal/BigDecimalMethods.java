package commonApis.BigDecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalMethods {
    public static void main(String[] args) {
        /*
        常见的成员方法：
        public BigDecimal add(BigDecimal val)                   加法
        public BigDecimal subtract(BigDecimal val)              滅法
        public BigDecimal multiply(BigDecimal val)              乘法
        public BigDecimal divide(BigDecimal val)                除法，获取商
        public BigDecimal[] divideAndRemainder(BigDecimal val)  除法，获取商和余数
        public boolean  equals(Object x)                        比较
        public BigDecimal pow(int exponent)                     次方
        public BigDecimal ax/min(BigDecimal val)                最大值/最小值

         */
        BigDecimal bd1 = new BigDecimal("100.0");
        BigDecimal bd2 = new BigDecimal("3.0");


        //加
        BigDecimal bd3 = bd1.add(bd2);
        System.out.println(bd3);

        //减
        BigDecimal bd4 = bd1.subtract(bd2);
        System.out.println(bd4);

        //乘
        BigDecimal bd5 = bd1.multiply(bd2);
        System.out.println(bd5);

        //除法获取商
//        BigDecimal bd6 = bd1.divide(bd2);
//        System.out.println(bd6);
        //会发现报错，这是因为divide需要精确结果，除不尽的时候，会报错

        //获取商和余数
        BigDecimal[] bigDecimals = bd1.divideAndRemainder(bd2);
        System.out.println(bigDecimals[0]);
        System.out.println(bigDecimals[1]);

        //如果我想要33.33呢？
        BigDecimal bd7 = bd1.divide(bd2, RoundingMode.HALF_UP);//四舍五入
        //这种方法只有两个参数默认保留一位小数
        System.out.println(bd7);
        //第一个参数：除数
        //第二个参数：小数点后保留几位
        //第三个参数：舍入模式
        BigDecimal bd8 = bd1.divide(bd2, 2, RoundingMode.HALF_UP);
        System.out.println(bd8);
    }
}
