package commonApis.Object;

public class EqualsTest {
    public static void main(String[] args) {

        //public boolean equals(Object obj)
        //比较两个对象是否相等

        //如果想要比较两个对象是否相等，需要重写对象所属类的equals方法

        Student s = new Student("zhangsan",18);
        Student s2 = new Student("zhangsan",18);

        boolean equals = s.equals(s2);

        System.out.println(equals);

    }
}
