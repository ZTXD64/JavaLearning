package Generics.o2_genericsInterface;

public class StudenData implements Data<Student>{
    @Override
    public void add(Student student) {

    }

    @Override
    public void delete(Student student) {

    }

    @Override
    public void updata(Student student) {

    }

    @Override
    public Student query(int id) {

        return new Student();
    }
}
