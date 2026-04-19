import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String name="";
        int age;
        int jobtime;
        int projects;
        String expert="";
        String like="";


        Scanner sc=new Scanner(System.in);
        System.out.println("您的姓名：");
        name=sc.nextLine();
        System.out.println("您的年龄：");
        age=sc.nextInt();
        System.out.println("您的工作时间：");
        jobtime=sc.nextInt();
        System.out.println("您做过几个项目：");
        projects=sc.nextInt();
        System.out.println("您的技术方向：");
        expert=sc.next();
        System.out.println("您的兴趣爱好：");
        like=sc.next();


        System.out.println("这个同学的姓名是"+name);
        System.out.println("年龄是"+age);
        System.out.println("工作"+jobtime+"年了");
        System.out.println("做过"+projects+"个项目");
        System.out.println("技术方向是"+expert);
        System.out.println("兴趣爱好是"+like);
    }


}