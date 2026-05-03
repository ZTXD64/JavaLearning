package Collection.Set;

import java.util.HashSet;
import java.util.Set;

public class Set_Collection_hashSet_Deduplication {
    static void main() {

        Student s1 = new Student("张三",19,"北京");
        Student s2 = new Student("张三",19,"北京");
        Student s3 = new Student("李四",19,"北京");
        Student s4 = new Student("李四",19,"北京");

        Set<Student> set = new HashSet<>();
        set.add(s1);
        set.add(s2);
        set.add(s3);
        set.add(s4);

        System.out.println(set);
    }
}
