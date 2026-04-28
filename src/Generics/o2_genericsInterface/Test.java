package Generics.o2_genericsInterface;

public class Test {
    static void main() {
        StudenData studenData = new StudenData();
        studenData.add(new Student());
        studenData.delete(new Student());

        Student s = studenData.query(1);

    }
}
