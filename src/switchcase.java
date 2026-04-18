import java.util.Scanner;

public class switchcase {
    public static void main(String[] args) {
//        60分以下为不及格，60-89为良好，90-100为优秀。使用switchcase

        //Step1:定义变量存储学生成绩
        int score;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生成绩：");
        score = sc.nextInt();


        //处理和判断
        switch (score/10){
            case 10 :
                System.out.println("优秀");
                break;
            case 9 :
                System.out.println("优秀");
                break;
            case 8 :
                System.out.println("良好");
                break;
            case 7 :
                System.out.println("良好");
                break;
            case 6 :
                System.out.println("良好");
                break;
            default:
                System.out.println("不及格");
        }
    }
}
