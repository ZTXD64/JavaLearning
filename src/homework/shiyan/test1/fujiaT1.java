package homework.shiyan.test1;

import java.util.Scanner;

public class fujiaT1 {
    public static void main(String[] args) {
        double sum=0;




        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数字，输入非数字字符串结束输入：");
        while (sc.hasNextDouble()) {
            double a = sc.nextDouble();
            sum=sum+a;
        }





        System.out.println("输入的数字的和为"+sum);
    }
}
