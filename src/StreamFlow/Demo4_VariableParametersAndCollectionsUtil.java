package StreamFlow;

public class Demo4_VariableParametersAndCollectionsUtil {
    static void main(String[] args) {
//        方法中可变参数
//               就是一种特殊形参，定义在方法、构造器的形参列表里，格式是：数据类型..参数名称；
//        可变参数的特点和好处
//                特点：可以不传数据给它；可以传一个或者同时传多个数据给它；也可以传一个数组给它。
//                好处：常常用来灵活接收数据。
//        可变参数的注意事项：
//            可变参数在方法内部就是一个数组。
//            一个形参列表中可变参数只能有一个
//            可变参数必须放在形参列表的最后面
        int sum = sum(10, 20, 30);
        System.out.println(sum);


//        Collections提供的常用静态方法
//        public static <T> boolean addAll(collection<? super T> c,T...elements)      给集合批量添加元素
//        public static void shuffle(List<?> list)                                    打乱List集合中的元素顺序
//        public static <T> void sort(List<T> list)                                   对List集合中的元素进行升序排序
//        public static <T> void sort(List<T> list, Comparator<? super T> c)          对List集合中元素，按照比较器对象指定的规则进行排序
    }

    public static int sum(int...nums) {
        int sum = 0;
        for (int num : nums) {
            sum+=num;
        }

        return sum;
    }
}
