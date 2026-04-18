public class O5_stringbuilder {
    public static void main(String[] args){
        //在使用 StringBuffer 类时，每次都会对 StringBuffer 对象本身进行操作，而不是生成新的对象，所以如果需要对字符串进行修改推荐使用 StringBuffer。
        //
        //StringBuilder 类在 Java 5 中被提出，它和 StringBuffer 之间的最大不同在于 StringBuilder 的方法不是线程安全的（不能同步访问）。
        //
        //由于 StringBuilder 相较于 StringBuffer 有速度优势，所以多数情况下建议使用 StringBuilder 类。

        //StringBuilder类

        StringBuilder newString = new StringBuilder(10);
        newString.append("Runoob.."); //添加字符串
        System.out.println(newString);
        newString.append("!");
        System.out.println(newString);


        //插入字符串，从第a位开始。.insert(a,"内容")
        newString.insert(9,"java");
        System.out.println(newString);

        //删除字符串，从a到b。.delet(a,b)
        newString.delete(5,8);
        System.out.println(newString);
    }
}
