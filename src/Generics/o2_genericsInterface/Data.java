package Generics.o2_genericsInterface;

public interface Data<T> {

    //增删改查功能（抽象方法，全部需要重写）
    void add(T t);
    void delete(T t);
    void updata(T t);
    T query(int id);
}
