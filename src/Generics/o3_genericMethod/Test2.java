package Generics.o3_genericMethod;

import java.util.ArrayList;

public class Test2 {
    static void main() {
        //通配符与上下限
//        通配符
//        就是“?”，可以在“使用泛型”的时候代表一切类型；E T K V是在定义的时候用的
//        泛型的上下限：
//        泛型上限：?extends Car——？能接收的必须是Car或者其子类。
//        泛型下限：？super Car—— ？ 能接收的必须是Car或者其父类。
        ArrayList<Xiaomi> xiaomis = new ArrayList<>();
        xiaomis.add(new Xiaomi());
        xiaomis.add(new Xiaomi());
        xiaomis.add(new Xiaomi());
        go(xiaomis);

        ArrayList<BYD> byds = new ArrayList<>();
        byds.add(new BYD());
        byds.add(new BYD());
        byds.add(new BYD());
        go(byds);

        ArrayList<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog());
        dogs.add(new Dog());
        dogs.add(new Dog());
        //go(dogs);
        //可以看到，卧槽Dog怎么跑进来了？
        //？可以代表一切类型，太逆天了，所以java引入了上下限
        //加入了上下限，可以看到dog被踢出去了

    }
    //没有上下限，啥都能进来太不合理了！！！！
//    public static void go(ArrayList<?> c) {
//
//    }
    public static  void go(ArrayList<? extends Car> car) {

    }
}
