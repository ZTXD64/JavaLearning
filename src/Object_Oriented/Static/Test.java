package Object_Oriented.Static;

public class Test {
    public static void main(String[] args) {


        //stu1
        Student stu1 = new Student();
        stu1.name = "yz00";
        stu1.age = 19;
        stu1.teacherName = "老师一";


        Student stu2 = new Student();
        stu2.name = "ztxd";
        stu2.age = 20;
        stu1.teacherName = "老师二";


        System.out.println(stu1.teacherName+"\n"+stu2.teacherName);

        int[] array = {1,3,5,7,9,11};

        ArrayUtil.printArray(array);



    }
}
