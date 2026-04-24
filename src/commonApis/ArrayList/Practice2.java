package commonApis.ArrayList;

import java.util.ArrayList;

public class Practice2 {
    public static void main(String[] args) {
        /*
        需求：定义一个集合，添加一些学生对象
                        学生类的属性为：id，姓名，年龄。
        要求：
        1．遍历集合，将所有学生的属性打印在控制台上，每个学生一行
        2．定义一个方法，根据id查找学生的信息。
                        存在：返回索引
                        不存在：返回-1
        */
        Student s1 = new Student("001","张三",18);
        Student s2 = new Student("002","李四",18);
        Student s3 = new Student("003","王五",18);

        //alt+左键——竖向选择
        //将对象添加到集合
        //shift+f6  选中所有相同字符替换
        ArrayList<Student> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        for (int i = 0; i < list.size(); i++) {

            System.out.println(list.get(i).getId()+list.get(i).getName()+list.get(i).getAge());

        }

        int student = findStudent("001", list);

        System.out.println(student);
    }

    public static int findStudent(String id,ArrayList<Student> list) {
        for (int i = 0; i < list.size(); i++) {

            if (list.get(i).getId().equals(id)) {
                return i;
            }

       }

        return -1;

    }
}
