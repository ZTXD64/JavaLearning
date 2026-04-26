package Object_Oriented.InnerClass.Test4AnonymousInnerClass.Practice2;



import java.util.Arrays;
import java.util.Comparator;

public class Test {
    public static void main(String[] args) {
        Student[] students = new Student[3];
        students[0] = new Student("张三", 18, 1.75, '男');
        students[1] = new Student("李四", 19, 1.65, '女');
        students[2] = new Student("王五", 20, 1.80, '男');


        /*
        * 这里调用了Arrays工具类里面的sort方法。
        * 需要传入两个参数，一个是需要比较的数组，另一个是比较器对象。
        * 比较器对象我们可以ctrl+左键看到它是一个接口，我们不能创建接口的对象，但是可以创建接口的实现类对象
        * 所以这里运用匿名内部类的方式，创建了比较器接口的实现类对象，传入了sort方法里面
        * 然后sort方法将会两个两个的传入数组里面的对象，于是根据比较器实现了排序
        * */

        //将数组按照年龄大小进行排序
        Arrays.sort(students, new Comparator<Student>() { //这里新建了一个比较器，用到了匿名内部类的知识
            @Override
            public int compare(Student o1, Student o2) {
                //这里的排序规则：
                        //如果你认为o1>o2 返回正整数
                        //如果你认为o1<o2 返回负整数
                        //如果你认为二者相等，则返回0
               /* if (o1.getAge() > o2.getAge()) {
                    return 1;
                } else if (o1.getAge() < o2.getAge()) {
                    return -1;
                }

                return 0;*/
                //以上或者下面更优雅的表达方法
                return o1.getAge() - o2.getAge();
            }
        });










        //遍历数组
        //为什么会直接输入对象的内容了？对象是引用数据类型，不是应该返回内存地址吗？
        //因为@Data注解，已经自动帮我们重写好了Student类的toString方法，所以可以直接返回对象的属性值
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }
    }
}
