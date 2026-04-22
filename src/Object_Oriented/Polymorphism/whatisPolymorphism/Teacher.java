package Object_Oriented.Polymorphism.whatisPolymorphism;

public class Teacher extends Person{
    public Teacher() {
    }

    public Teacher(String name, String account, String password) {
        super(name, account, password);
    }

    @Override
    public void work() {
        System.out.println("老师的工作是教书");
    }
}
