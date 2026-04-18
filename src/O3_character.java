public class O3_character {
    public static void main(String[] args) {


        //使用Character的构造方法创建一个Character类对象，次构造方法过时了
        //官方建议的是：Character ch = Character.valueOf('a');
        Character ch = new Character('a');

        //转义字符
        //  \n回车  \"双引号

        //character类的方法

        //toUpperCase()和toLowerCase()
        System.out.println("字符a的大写形式为\n"+Character.toUpperCase(ch));

    }
}
