package commonApis.String.CommonMethod;

public class Test2 {
    public static void main(String[] args) {
        /*public String substring(int beginIndex, int endIndex):
                                截取指定范围
            public String substring(int beginIndex):
                                截取到末尾
                需求：只保留用户名的第一个字符，后面用三个***替代*/

        //定义一个字符串
        String str = "abcdefg";

        //截取
        //第一个参数：截取的开始索引
        //第二个参数：截取的末尾索引
        //包头不包尾，包左不包右---->包含1 索引，但是不包含5 索引： 1 2 3 4
        //字符串本身一旦创建之后，是无法发现改变的，截取的时候不会影响调用者的字符串，切记：只有返回值才是截取之后的结果

        String substring = str.substring(1, 5);
        System.out.println(substring);

        //第一个参数：截取的开始索引。默认是截取到字符串的末尾
        String substring1 = str.substring(1);
        System.out.println(substring1);

        //数据脱敏：保留用户名的第一个字符，其他的输出***。

        String username = "张三";

        //先输出第一个字符
        String substring2 = username.substring(0, 1);
        System.out.println(substring2+"***");
    }
}
