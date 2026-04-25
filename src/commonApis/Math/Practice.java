package commonApis.Math;

public class Practice {
    public static void main(String[] args) {
        //判断一个数是不是质数
        //只需要判断小于该数平方根的数是不是该数的因子就行了:因为因子总是成对出现
        int a = 998;
        isPrime(a);
    }

    public static void isPrime(int a) {
        for (int i = 2; i < Math.sqrt(a); i++) {
            if (a%i == 0) {
                System.out.println("不是质数");
                return;
            }
        }

        System.out.println("是质数");
    }
}
