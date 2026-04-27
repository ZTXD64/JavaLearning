package Exception;

import Exception.ClassNeeded.DiyException;

public class Demo3_DIYException {
    public static void main(String[] args) {
        /*自定义异常
                Java无法为这个世界上全部的问题都提供异常类来代表
        如果企业自己的某种问题，
        想通过异常来表示，以便用异常来管理该问题，那就需要自己来定义异常类了。*/
        /*自定义编译时异常
        定义一个异常类继承Exception.
.       重写构造器。
        通过thrownew异常类(xxx)创建异常对象并抛出。
        特点：编译阶段就报错，提醒比较激进*/
        try {
            saveAge(-10);
            System.out.println("程序成功");
        } catch (DiyException e) {
            e.printStackTrace();
            System.out.println("程序失败");
        }
    }

    public static void saveAge(int age) throws DiyException {
        if (age < 0 || age > 150) {
            throw new DiyException("年龄不合法: " + age);
        }
    }
}
