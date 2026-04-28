package Generics.o3_genericMethod;

import Generics.o2_genericsInterface.StudenData;

public class Test {
    static void main() {
        //学会定义泛型方法，搞清楚作用

        String[] names = {"a","b","c","d","e","f","g","h"};
        printArray(names);

        StudenData[] stu = new StudenData[2];
        printArray(stu);

        StudenData max = getMax(stu);
        String max2 = getMax(names);


    }
    public static <T> void printArray(T t) {

    }
    public static <T> T getMax(T[] t) {
        return null;
    }
}
