package Object_Oriented.Static;

public class ArrayUtil {
    //static修饰成员方法——常用在工具类中
    /*
     工具类：1.类名见名知意
            2.私有化构造方法，不让创建对象
            3.方法定义为静态的

      静态只能调用静态，非静态可以调用所有，静态方法没有this
     */

    //私有化构造方法
    private  ArrayUtil(){
        //不允许创建对象
    }


    static void printArray(int[] array) {

        System.out.print("[");
        for (int i = 0; i < array.length; i++) {

            if (i < array.length-1) {
                System.out.print(array[i] + ",");
            } else {
                System.out.print(array[i]);
            }
        }
        System.out.println("]");

    }
}
