package commonApis.Math;

import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        /*自幂数，一个n位自然数等于自身各个数位上数字的n次幂之和
        举例1：三位数
        1^3+ 5^3+ 3^3=153
        举例2：四位数
        1^4+6^4+3^4+4^3=1634
        键盘录入一个正整数，判断是否为自幂数？*/


        //先输入一个数字
        int a;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        //存储a的值，以免后续处理的时候丢失
        int temp = a;


        //判断他是几位数？
        //转成字符串，看字符串的长
        String str = a+"";
        int leng = str.length();

        //获取这个数的各个位的数字eg:2763
        int sum = 0;
        for (int i = 0; i < leng; i++) {
            int lastnumber = a%10;
            sum =sum+ (int)(Math.pow(lastnumber,leng));
            a = a/10;
        }
        if (sum == temp) {
            System.out.println("a是自幂数");
        } else {
            System.out.println("a不是自幂数");
        }
    }
}
