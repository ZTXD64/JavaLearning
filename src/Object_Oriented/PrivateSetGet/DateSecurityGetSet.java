package Object_Oriented.PrivateSetGet;

public class DateSecurityGetSet {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.setAge(1);
        System.out.println(d.getAge());

        d.setName("yz00");
        System.out.println(d.getName());
    }


    //定义一个新类：public claa 类名。定义方法才能用void，int
    public static class Dog {

        //private关键字是权限修饰符，修饰成员变量和方法。只能在本类中访问，外界无法访问
        private int age = 0;
        private  String name = "null";

        public void setAge(int num) {
                //在这里写判断方法
            if (num >=0 && num <=15) {
                age = num;
            } else {
                System.out.println("error");
            }
        }

        public int getAge() {
            return age;
        }


        //只赋值不返回数据，void
        public void setName(String n) {
            name = n;
        }


        //需要返回String类数据，String
        public String getName() {
            return name;
        }
    }
}
