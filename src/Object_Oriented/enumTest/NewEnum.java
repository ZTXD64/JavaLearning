package Object_Oriented.enumTest;

public enum NewEnum {
    //枚举不好写的话先写普通类再修改

    //枚举的第一行把全部对象罗列出来，！！！！！！！
    // 以逗号分割，分号结尾！！！！！！！！！！！！
    //枚举类的构造方法必须为private！！！！！！！

    //编译器会给枚举项两个默认的方法values（）
    //和valueOf()
    Student1("ztxd"),
    Student2("yz00"),
    Student3("naodan"),
    Student4("mazebank");




    private String name;


    //全参构造，枚举不让外界构造新对象，所以私有化
    //枚举类的构造方法默认修饰符为private，其实也可以不写

    private NewEnum(String name) {

        this.name = name;
    }

    //所有对象都罗列出来了，不需要修改属性值，所以注释掉

//    public void setName(String name) {
//        this.name = name;
//    }

    public String getName() {
        return name;
    }
}
