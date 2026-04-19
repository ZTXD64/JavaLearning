package homework.shiyan.test1;

import java.util.Scanner;

public class T3 {
    public static void main(String[] args) {
        double pi=3.14;
        double r,h,v;

        Scanner sc=new Scanner(System.in);

        System.out.println("请输入圆柱体的底面半径和高：");
        r=sc.nextDouble();
        h=sc.nextDouble();

        v=pi*r*r*h;

        System.out.println("该圆柱体的体积为："+v);
    }
}
