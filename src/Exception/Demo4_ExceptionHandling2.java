package Exception;

import java.util.Scanner;

public class Demo4_ExceptionHandling2 {
    static void main() {
        //异常处理方案2：最外层捕获异常后，尝试重新修复

        //ctrl+alt+T   包围方式!!!!
        System.out.println("程序开始————————");
        while (true) {
            try {
                double price = setPrice();
                System.out.println("您设置的价格为：" + price);
                break;
            } catch (Exception e) {
                System.out.println("您设置的数据异常，请重新输入！！");
            }
        }


    }

    public static double setPrice() throws Exception{
        System.out.println("请输入商品价格：");
        Scanner sc = new Scanner(System.in);
        double price = sc.nextDouble();
        return price;
    }
}
