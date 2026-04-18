package javabasic;

public class O2_NumMath {
    public static void main(String[] args) {
        //包装类学习,number类
//        Byte	byte	字节型包装类
//        Short	short	短整型包装类
//        Integer	int	整型包装类
//        Long	long	长整型包装类
//        Float	float	单精度浮点型包装类
//        Double	double	双精度浮点型包装类
//        BigInteger	-	不可变任意精度整数
//        BigDecimal	-	不可变任意精度有符号十进制数



        //基本类型转换
        Number num = 1234.56;  //实际是Double类型

        System.out.println(num.intValue()); //转换为整型=1234
        System.out.println(num.longValue());
        System.out.println(num.floatValue());
        System.out.println(num.doubleValue());



        //正确比较方式：转化为同一个类型后比较
        Integer a = 10;
        Double b = 10.0;
        System.out.println(a.doubleValue()==b.doubleValue());


        //Math类
        //随机数生成
        double random = Math.random(); //生成[0.0，1.0)之间的随机数
        //生成[1,100]的随机整数
        int rand = (int)(Math.random()*100)+1; //生成的随机数为double类型，需要转为int类型
        System.out.println("生成的随机数为"+rand);

        //四舍五入round方法
        double x = 11.45;
        System.out.println("x=11.45四舍五入后为："+Math.round(x));

        //min和max
        System.out.println("11和9中的较大数为："+Math.max(11,9));

        //求次方，pow（a,b） 求a的b次方
        System.out.println("2的10次方为："+Math.pow(2,10));

        //求参数的算术平方根sqrt()
        System.out.println("4的算术平方根为："+Math.sqrt(4));

        //floor,round和celi
        //flor():返回小于等于（<=）给定参数的最大整数 。1.9——>1
        //round,四舍五入 1.4——> 1       1.9——> 2
        //celi:向上取整      1.2——> 2

        double y=1.2;
        System.out.println("y=1.2经过floor后为"+Math.floor(y)+"，round后为："+Math.round(y)+"，celi后为："+Math.ceil(y));


    }
}
