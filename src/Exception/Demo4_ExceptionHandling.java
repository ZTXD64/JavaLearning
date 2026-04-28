package Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo4_ExceptionHandling {
    public static void main(String[] args) {
        //异常处理方案1：底层异常层层往上抛出，最外层捕获异常，记录下异常信息，并相应适合用户观看的信息进行提示
        //异常处理方案2：最外层捕获异常后，尝试重新修复
        try {
            show2();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void show2() throws Exception {   //这里可以只写Exception，直接可以抛出所有异常
        System.out.println("_______程序开始_______");
        String str2 = "2023-08-29 23:23:40";    //字符串时间是不能直接转成事件对象处理
        SimpleDateFormat sdf = new SimpleDateFormat("yyadayy-MM-dd HH:mm:ss");
        Date date = sdf.parse(str2);    //parse下面红色波浪线：编译时异常，提醒程序员这里容易出现问题。需要异常处理
        System.out.println(date);

    }
}

