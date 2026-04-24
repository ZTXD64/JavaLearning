package commonApis.String.CommonMethod.StringBuilder;

public class Test {
    public static void main(String[] args) {
        /*
        StringBuilder的构造方法：
                public StringBuilder()
                空参构造
                public StringBuilder(String str)
                带参构造
StringBuilder的常见成员方法：
                    append（任意类型）
                        添加数据
                    reverse()
                        反转
                    int length()
                        获取长度
                    toString
                        变回字符串
         */

        //空参构造StringBuilder
        StringBuilder sb = new StringBuilder();
        sb.append("aaa");
        int i = sb.length();
        System.out.println(sb);
        System.out.println(i);

        //带参构造

        StringBuilder sb2 = new StringBuilder("abc");
        sb2.reverse();
        String string = sb2.toString();
        System.out.println(string);

    }
}
