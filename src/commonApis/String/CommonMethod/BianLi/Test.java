package commonApis.String.CommonMethod.BianLi;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //需求：键盘录入一个字符串，使用程序实现在控制台遍历该字符串、

//        public char charAt(int index)
//        public int length()返回字符串的长度
        //数组的长度：数组名.length：这里的length是数组的属性
        //字符串里面的length是方法

        //ctrl+alt+v 快速补齐变量名

        String s = "你好你好123";

        //charAt
        char c = s.charAt(0);
        System.out.println(c);

        //.length
        int i = s.length();
        System.out.println(i);

        //遍历字符串

            //首先输入一个字符串
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");

        String s2 = sc.nextLine();

        //s2.length().fori    快速生成
        for (int i1 = 0; i1 < s2.length(); i1++) {
            char c1 = s2.charAt(i1);

            System.out.println(c1);
        }
    }
}
