package Object_Oriented.inherit.带有继承结构的标准javabean;

public class Test {
    public static void main(String[] args) {

        //构造本科同学对象
        BechlorStudent b = new BechlorStudent("ztxd",18,"一年级");
        b.eat();
        b.sleep();
        b.study();

        System.out.println("_____________________");

        //构造研究生同学
        MasterStudent m = new MasterStudent("yz00",18,"一年级");
        m.eat();
        m.sleep();
        m.study();

        System.out.println("_____________________");

        //构造专业课老师
        SubjectTeacher s = new SubjectTeacher("naodan",30,"math");
        s.eat();
        s.sleep();
        s.teach();
    }
}
