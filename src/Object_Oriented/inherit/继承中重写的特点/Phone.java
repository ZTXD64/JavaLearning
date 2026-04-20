package Object_Oriented.inherit.继承中重写的特点;

public class Phone extends SmartDevice{



    //alt+insert重写


    @Override
    public double payment() {
        //如果父类中的代码，我一点也不想写，直接super调用
        double payment = super.payment();
        payment = payment * 0.9;
        return payment;

    }
}
