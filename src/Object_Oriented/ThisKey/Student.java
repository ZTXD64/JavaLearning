package Object_Oriented.ThisKey;

public class Student {


    private int age;  //成员变量

    public void setAge(int age) {
        //int age为局部变量


        this.age = age; //如果直接age=age，根据就近原则会调用局部变量age，通过this关键字调用成员变量age

    }

    public int getAge() {

        return age;
    }
}
