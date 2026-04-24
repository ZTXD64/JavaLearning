package commonApis.Random;

import java.util.Random;

public class Test {
    public static void main(String[] args) {
        Random a = new Random();


        //[0-10)的随机整数
        int b = a.nextInt(10);

        //[1-10)的随机整数
        int c = a.nextInt(1,10);

        System.out.println(b);
        System.out.println(c);
    }
}
