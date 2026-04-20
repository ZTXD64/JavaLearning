package Object_Oriented.inherit;

public class Test {
    public static void main(String[] args) {
        Student yz00 = new Student();
        yz00.name="yz00";
        yz00.age=20;
        yz00.grade="一年级";

        System.out.println(yz00.name+",年龄"+yz00.age);

        yz00.eat();
        yz00.study();

        System.out.println("___________________________________________");

        Teacher ztxd = new Teacher();
        ztxd.name="ztxd";
        ztxd.age=21;
        ztxd.subject="计算机";

        System.out.println(ztxd.name+",年龄"+ztxd.age+",主教科目："+ztxd.subject);
        ztxd.teaching();


        //继承的特点，只能单继承，不能多继承，但是可以多层继承。孙->爷：间接父类
        //顶级父类Object，所有类直接或者间接继承父类
    }
}
