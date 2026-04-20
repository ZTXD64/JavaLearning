package Object_Oriented.inherit.成员方法成员变量的特点;

public class Test {
    public static void main(String[] args) {
        Student yz00 = new Student();
        yz00.name="yz00";
        yz00.age=20;
        yz00.grade="一年级";

        System.out.println(yz00.name+",年龄"+yz00.age);

        yz00.eat();
        yz00.study();

        System.out.println("___________________________________________");

        Teacher ztxd = new Teacher();
        ztxd.name="ztxd";
        ztxd.age=21;
        ztxd.subject="计算机";

        System.out.println(ztxd.name+",年龄"+ztxd.age+",主教科目："+ztxd.subject);
        ztxd.teaching();


        //继承的特点，只能单继承，不能多继承，但是可以多层继承。孙->爷：间接父类
        //顶级父类Object，所有类直接或者间接继承父类





        System.out.println("____________________________________________");
        //！！！！！！！继承中成员变量的特点
        //继承中成员变量的查找顺序根据“就近原则”，首先查找方法中的局部变量，在查找本类中的成员变量，最后再找父类的成员变量

        Zi zi = new Zi("zi");
        zi.show();

        //观察可以看到，当引用了Zi类中的静态方法（静态方法可以直接“类名.方法名”使用），首先找到了局部变量name，于是打印了“a”
        //如果，我想打印Zi类中的成员变量name呢？
        //注意看Zi类中的方法，注意showClassName方法中的this关键字，这就可以直接调用同类中的成员变量name
        zi.show();


        //但是，如果我想要调用父类中的name呢？？？
        //注意Zi类中的showFuName方法中的super关键字，super关键字最多只能到父类，不能到爷爷类，不允许“super.super”
        zi.show();



        System.out.println("____________________________________________");
        //！！！！！！！继承中成员方法的特点

        //根据就近原则，本类中没有eat，drink方法，于是向父类寻找方法。（后面我给子类写了eta，就直接调用子类的eat了）
        zi.eat();
        zi.drink();

        //当然子类在创建方法的时候，也可以直接向父类调用方法,使用super方法
        //比如我创建了一个吃午饭的方法
        zi.launch();


        System.out.println("____________________________________________");
        //！！！继承中方法的重写
        //Fu类也有eat方法，但是只能吃饭吃菜，Zi类想吃肉怎么办哪？重写eat方法就行了
        zi.eat();

        System.out.println("____________________________________________");

    }
}

