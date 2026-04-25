package commonApis.BigDecimal;

import java.math.BigDecimal;

public class BigDecimalTest {
    public static void main(String[] args) {
        //BigDecimal
        //作用：1.用来表示很大的小数。   2.用于小数的精确计算

        //获取对象的两种方式：
        //构造方法
        //静态方法



        //结论：
                //如果当前的小数，是在double的取值范围之内的，使用静态方法获取对象
                //如果超出了double的取值范围，使用构造方法获取对象（参数必须要以字符串的形式进行体现）

        //构造方法1：
        char[] chars = {'0','.','1','5'};
        BigDecimal bd = new BigDecimal(chars);
        System.out.println(bd);

        //构造方法2
        BigDecimal bd1 = new BigDecimal("1.5");
        System.out.println(bd1);

        //用构造方法给BigDecimal传递一个double类型的小数（错误的）
        //传递过来的数据本来就是不精确的，所以输出的也是不精确的
        BigDecimal bd2 = new BigDecimal(0.226);
        System.out.println(bd2);


        //利用静态方法获取对象
        //优化机制：
              //  0-10提前创建好的，放入到数组当中
        BigDecimal bigDecimal = BigDecimal.valueOf(1.736);
        System.out.println(bigDecimal);
    }
}
