package Object_Oriented.abstractClassMethods;

public class Dog extends Animal{
    public Dog() {

    }

    public Dog(String name, String coloe) {
        super(name, coloe);
    }

    @Override
    public void eat() {
        System.out.println("狗吃骨头");
    }

    //都有方法
    public void lookHouse() {
        System.out.println("小狗看家");
    }
}
