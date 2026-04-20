package Object_Oriented.Final;

public class Test {
    public static void main(String[] args) {
//        final修饰变量，此时叫做常量
//        特点1：只能被赋值一次，一旦赋值，无法再次修改。
//        特点2：常量名大写，多个单词之间用下划线隔开
//        细节：
//              基本数据类型：
//                      byte short int long float double char boolean
//                      变量里面记录的是真实的数据!!!!!!!!!!!!!!!!!!
//                    final  int a = 10;/I    此时数据不能改变
//        引用数据类型：
//                   除了上面四类八种，其他所有的数据类型都是引用类型
//              int[] Student Teacher...

//        final Student stu1 = new Student();
        //      引用数据类型记录的不是真实数据而是内存地址，可以改变数据，但是不能改变内存地址

        //定义一个引用数据类型变量
        final Student stu1 = new Student("yz00",19);

        stu1.setName("ztxd");
        stu1.setAge(20);

        System.out.println(stu1.getName()+stu1.getAge());

        //可以看到，即使final了引用变量stu1，但是我们仍旧改变了stu1对象

        //stu1 = new Student("ztxd",20);  此时却不行了，这是因为改变了stu1引用数据类型的内存地址


    }
}
