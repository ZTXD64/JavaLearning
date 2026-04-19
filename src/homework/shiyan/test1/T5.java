package homework.shiyan.test1;

import java.util.Scanner;

public class T5 {
    public static void main(String[] args) {
        int a;
        int ge,shi,bai,qian,sum;

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入四位整数a: ");
        a=sc.nextInt();


        ge=a%10;
        shi=((a-ge)/10)%10;
        bai=((a-ge-shi*10)/100)%10;
        qian=(a-ge-shi*10-bai*100)/1000;
        sum=ge+shi+bai+qian;

        System.out.println("个位是"+ge);
        System.out.println("十位是"+shi);
        System.out.println("百位是"+bai);
        System.out.println("千位是"+qian);
        System.out.println("各位数字的和是"+sum);
    }
}
