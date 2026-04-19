package homework.shiyan.test1;

import java.util.Random;
import java.util.Scanner;

public class fujiaT2 {
    public static void main(String[] args) {
        //生成随机的1-100的数字
        Random random = new Random();
        int realNumber = random.nextInt(100)+1;


        //用户猜测的数字
        int a;
        //处理
        for (int i = 1; i < 4; i++) {
            if (i>3) {
                System.out.println("机会用完了,随机数是："+realNumber);
            }
            System.out.println("请猜测,输入1-100的整数：");
            //输入
            Scanner sc = new Scanner(System.in);
            a = sc.nextInt();

            if (a>realNumber) {
                System.out.println("猜大了");
            } else if (a<realNumber) {
                System.out.println("猜小了");
            } else {
                System.out.println("猜对了！");
                return;
            }
        }
    }
}
