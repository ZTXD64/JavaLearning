package homework.shiyan.test1;

import java.util.Scanner;

public class T2 {
    public static void main(String[] args) {
        int a, b;
        double c;

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入a和b: ");
        a=sc.nextInt();
        b=sc.nextInt();
        c=(double)a/b;

        System.out.println("这两个数相除的结果为："+c);
    }
}
