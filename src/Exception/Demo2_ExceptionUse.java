package Exception;

public class Demo2_ExceptionUse {
    public static void main(String[] args) {
        //异常的作用：
//            作用1：用来定位程序bug的关键信息
//            作用2：可以作为方法内部的一种特殊返回值，以便通知上层调用者，方法的执行问题
        System.out.println("程序开始————");
        try {
            divide(10,0);
            System.out.println("底层方法执行成功了！");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("底层方法执行失败了！");
        }

        System.out.println("程序结束——————");
    }

    public static void divide(int a,int b) throws Exception {
        if(b == 0) {
            System.out.println("您的参数有错误");
            throw new Exception("除数不能为0");  //相当于把异常信息返回
        }
        System.out.println(a/b);
    }
}
