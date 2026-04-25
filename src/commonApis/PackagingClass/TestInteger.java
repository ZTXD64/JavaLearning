package commonApis.PackagingClass;

public class TestInteger {
    public static void main(String[] args) {
        //获取Integer对象的方式：
        //1．构造方法
        //2．静态方法
        //3．直接赋值


        //1.构造方法
        //每次都创建一个新的对象
        Integer i = new Integer(100);
        Integer i2 = new Integer("100");
        System.out.println(i);
        System.out.println(i2);

        //2.静态方法
        //当Integer类被加载到内存中的时候，会提前创建-128~127之间所有数据的对象，共计256个，放入到一个数组（Integer常量池）当中
        //当我们利用valueof方法获取对象的时候，判断是否在这个范围当中
        //如果在，就不会创建新的对象，而是从数组当中获取
        //如果不在，此时就会利用构造方法的方式去创建对象
        Integer i3 = Integer.valueOf("200");
        System.out.println(i3);

        //3.直接赋值
        //第二种方法的简化版写法
        Integer i4 = 5;
        System.out.println(i4);
    }
}
