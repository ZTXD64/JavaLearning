package Object_Oriented.enumTest;

public enum newTeacher {
    teacher1("ztxd"),
    teacher2("yz00"),
    teacher3("naodan"),
    teacher4("mazebank");


    //枚举类的结构必须严格按照以下顺序：
    //第一必须是枚举常量列表（如 STUDENT1("xxx"), STUDENT2("yyy");）
    //然后才能是字段、构造方法、普通方法等

    //为什么要加private？
    //private只有同类才可以访问，有更好的封装性，使用getName获取数据
    final private String name;

    //构造器java默认会是private，不写也行，这样防止外部再次创建意外的对象
    private newTeacher(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
    //不加this也可以：
//    当你在实例方法中使用一个变量名时，Java 会按以下顺序查找：
//    先在局部变量中找（方法参数、方法内定义的变量）
//    如果没找到，就在实例变量中找（类的字段）
//    如果还没找到，就在静态变量中找

    
}
