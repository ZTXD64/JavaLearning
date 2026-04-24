package commonApis.String;

public class Test {
    public static void main(String[] args) {
        /*第一种：直接赋值
        第二种：new关键字
                    public String()
        空白字符串，不含任何内容
                    public String(String original)
        根据传入的字符串，创建新的字符串对象
                    public String(char[] chs)
        根据字符数组，创建字符串对象
                    public String(byte[] chs)
        根据字节数组，创建字符串对象*/

        //1.直接赋值
        String a = "abcde";
        System.out.println(a);

        //2.new + 构造方法创建字符串对象
        //new 空参构造
        String b = new String();
        System.out.println(b);

        //3.new + 构造方法创建字符串对象
        //new 有参构造
        String c = new String("abc");
        System.out.println(c);

        //4.new + 有参构造（字符数组）
        char[] chs = {'a','b','c','d','e'};
        String d = new String(chs);
        System.out.println(d);

        //new + 有参构造（字节数组）
        //ASCII码表
        byte[] ch = {97,98,99,100};
        String e = new String(ch);
        System.out.println(e);


        //直接赋值和new方法的区别：
        //直接赋值：代码简单，串池复用。节约内存资源
        //new：每次都会创建一个新的字符串对象。资源浪费


    }
}
