package Exception.ClassNeeded;

public class DiyException extends Exception{
    public DiyException() {

    }
    public DiyException(String message) {
        //调用了父类的构造方法
        super(message);
    }
}
