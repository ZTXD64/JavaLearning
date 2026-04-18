import java.util.Scanner;

public class O9_class {
    public static void main(String[] args) {
        //方法的定义
//        修饰符 返回值类型 方法名(参数类型 参数名){
//    ...
//            方法体
//    ...
//            return 返回值;
//        }


        //求最大值
        int a=10;
        int b=20;
        int max = max(a,b);

        System.out.println("a和b中的最大值为："+max);


        //成绩等级计算打印方法
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入成绩");
        int grade = sc.nextInt();
        printGrade(grade);
    }


    //求最大值方法
    public static int max(int num1,int num2) {
        int result;

        if(num1>num2){
            result=num1;
        } else {
            result=num2;
        }

        return result;
    }

    //void 无返回值的方法

    public static void printGrade(int score){
        if (score >= 90.0) {
            System.out.println('A');
        }
        else if (score >= 80.0) {
            System.out.println('B');
        }
        else if (score >= 70.0) {
            System.out.println('C');
        }
        else if (score >= 60.0) {
            System.out.println('D');
        }
        else {
            System.out.println('F');
        }
    }
}
