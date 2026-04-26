package Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo1_Exception {
    public static void main(String[] args) {

        //异常有两种：1.运行时的异常    2.编译时的异常

        //异常的两种处理方法：1.throws抛出异常    2.catch然后打印异常

        //目标：认识异常的体系，异常的作用
        //show();
        try {
            //监视代码，出现异常，会被catch
            show2();

            //如果方法用Exception抛出所有异常，那么只需要catch一次就行了
        } catch (ParseException e) {
            e.printStackTrace();    //打印异常信息
            //这里打印异常信息，后调用的却在上面，这是为什么？
            //异常栈信息，先进的后出，后进的先出
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    //定义一个方法，认识编译时异常
    public static void show2() throws ParseException, FileNotFoundException {   //这里可以只写Exception，直接可以抛出所有异常
        System.out.println("_______程序开始_______");
        String str2 = "2023-08-29 23:23:40";    //字符串时间是不能直接转成事件对象处理
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = sdf.parse(str2);    //parse下面红色波浪线：编译时异常，提醒程序员这里容易出现问题。需要异常处理
        System.out.println(date);

        //还一种编译时异常
        InputStream is = new FileInputStream("D:/meinv.png");   //这里也会有异常，程序担心没有D盘或者没这个文件
        //可以抛出异常

    }



    public static void show() {
        //运行时异常的特点：编译的时候不报错，运行的时候报错，继承自RuntimeException
        int[] arr = {1,2,3};    //ArrayIndexOutOfBoundsException，可以看到继承自RuntimeException
        //System.out.println(arr[3]);   运行时出现异常，程序会死掉

        //System.out.println(10/0);  //ArithmeticException（算数异常）

        //空指针异常
        String str = null;
        System.out.println(str);
        System.out.println(str.length());

        System.out.println("程序结束——————————————");
    }

}
