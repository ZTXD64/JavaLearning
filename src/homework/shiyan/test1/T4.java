package homework.shiyan.test1;

import java.util.Scanner;

public class T4 {
    public static void main(String[] args) {
        int a,b,temp;

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入两个整数a和b:");
        a = sc.nextInt();
        b = sc.nextInt();


        temp = a;
        a = b;
        b = temp;

        System.out.println("交换后a="+a+",b="+b);
    }
}
