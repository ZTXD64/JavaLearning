public class O91_constructor {
    public static void main(String[] args) {
        //在 Java 中，构造方法（Constructor）是用于创建类的对象的特殊方法。

        //当使用 new 关键字创建对象时，构造方法会自动调用，用来初始化对象的属性。

        Person newPerson = new Person("ZTXD",21);
    }



    public static class Person {
        String name;
        int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }
}
