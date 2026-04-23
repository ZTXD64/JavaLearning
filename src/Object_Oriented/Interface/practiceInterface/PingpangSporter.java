package Object_Oriented.Interface.practiceInterface;

public class PingpangSporter extends Sporter implements English{
    public PingpangSporter() {
    }

    public PingpangSporter(String name, int age) {
        super(name, age);
    }

    @Override
    public void learn() {
        System.out.println("乒乓球正在学习打乒乓球");
    }

    @Override
    public void speakEnglish() {
        System.out.println("乒乓球运动员正在说英语");
    }
}
