package Object_Oriented.Interface.practiceInterface;

public class BasketBallSporter extends Sporter{
    public BasketBallSporter() {
    }

    public BasketBallSporter(String name, int age) {
        super(name, age);
    }

    @Override
    public void learn() {
        System.out.println("篮球运动员学打篮球");
    }
}
