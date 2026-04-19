package Object_Oriented.enumTest;

public class Test {
    public static void main(String[] args) {


        //获取枚举类的对象
        //所有枚举类，默认使用public static final修饰

        NewEnum a = NewEnum.Student2;
        System.out.println(a.getName());


        switch (a){
            case Student1 -> System.out.println(NewEnum.Student1.getName());
            case Student2 -> System.out.println(NewEnum.Student2.getName());
            case Student3 -> System.out.println(NewEnum.Student3.getName());
            case Student4 -> System.out.println(NewEnum.Student4.getName());
        }


        //枚举类会默认两个方法
        //values()：表示获取本类所有的枚举项
        //valueOf()：表示获取一个指定的枚举项

        NewEnum[] all = NewEnum.values();
        //遍历枚举项
        for (NewEnum newEnum : all) {

            System.out.println(newEnum);

        }

        System.out.println("_________________________________________");
        NewEnum s1name = NewEnum.valueOf("Student2");
        System.out.println(s1name.getName());

    }
}
