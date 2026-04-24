package commonApis.String.CommonMethod;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        /*Stringreplace(旧值，新值)
                替换
        注意点：只有返回值才是替换之后的结果
                需求:
                过滤玩游戏中骂人的脏话
        */

        //首先定义铭敏感词数组
        String[] str = {"NMD","CNM","LJ","RZ"};

        String s;
        Scanner sc = new Scanner(System.in);
        s = sc.nextLine();

        //循环替换
        for (int i = 0; i < str.length; i++) {
            s = s.replace(str[i],"***");

        }

        //打印处理好的字符串
        System.out.println(s);
    }
}
