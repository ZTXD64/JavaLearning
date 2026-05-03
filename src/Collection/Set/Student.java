package Collection.Set;

import java.util.Objects;

public class Student {
    String name;
    int age;
    String address;

    public Student() {
    }

    public Student(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }

    //s3.equals(s1)
    @Override
    public boolean equals(Object o) {

        //如果自己跟自己比较，返回true
        if (this == o) return true;
        //当s1为空，或者两个对象不属于同一类时，返回false
        if (o == null || getClass() != o.getClass()) return false;

        //将o强转为Student类对象，然后二者开始比较成员变量
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name) && Objects.equals(address, student.address);
    }

    @Override
    public int hashCode() {
        //重写hashcode方法，计算三个成员变量的hash值
        return Objects.hash(name, age, address);
    }
}
