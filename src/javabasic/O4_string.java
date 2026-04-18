package javabasic;

public class O4_string {
    public static void main(String[] args){
        //String类

        //用构造函数构造字符串
        String str = new String("haha");


        //字符串长度
        String site = "www.runoob.com";
        int len = site.length();
        System.out.println( "菜鸟教程网址长度 : " + len );
        //注意静态方法和实例方法！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！
        //.length()为实例方法，所以可以直接——变量名.length()
        //而.max,Math中的方法多为静态方法，不需要变量名，可以直接——Math.max(9,100)


        //连接字符串，可以用“+”，也可以用下面的方法
        String str1 = "hello";
        String str2 = "world\n";
        System.out.print(str1.concat(str2));

        //	int hashCode()返回字符串的哈希码
        String code = "ztxd1234";
        System.out.println("密码的hash码为："+code.hashCode());
    }
}
