import java.util.regex.Pattern;
import java.util.regex.*;

public class O8_zhengze {
    public static void main(String[] args) {
        //java.util.regex 包

        //以下实例中使用了正则表达式 .*runoob.* 用于查找字符串中是否包了 runoob 子串：




        String newString = new String("This order was placed for QT3000! OK?");

        String content = "I am noob " +
                "from runoob.com.";

        String pattern = ".*runoob.*";

        boolean isMatch = Pattern.matches(pattern, content);
        System.out.println("字符串中是否包含了 'runoob' 子字符串? " + isMatch);
    }
}
