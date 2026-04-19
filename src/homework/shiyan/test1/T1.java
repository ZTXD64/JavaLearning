package homework.shiyan.test1;

import java.util.Scanner;

public class T1 {
    public static void main(String[] args) {
        double a;

        Scanner sc = new Scanner(System.in);
        System.out.println("输入一个浮点数: ");
        a=sc.nextDouble();


        System.out.println("该浮点数的整数部分是："+(int)a);
    }
}
