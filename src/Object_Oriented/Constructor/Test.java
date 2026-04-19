package Object_Oriented.Constructor;

public class Test {
    public static void main(String[] args) {
        Student yz00 = new Student();


        Student yz01 = new Student("yz00",19,"女",178);

        System.out.println(yz01.getName());
        System.out.println(yz01.getAge());
        System.out.println(yz01.getGender());
        System.out.println(yz01.getHeight());


    }
}
