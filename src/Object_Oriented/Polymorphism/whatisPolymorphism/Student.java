package Object_Oriented.Polymorphism.whatisPolymorphism;

public class Student extends Person{

    public Student() {
    }

    public Student(String name, String account, String password) {
        super(name, account, password);
    }

    @Override
    public void work() {
        System.out.println("学生的工作是学习");
    }
}
