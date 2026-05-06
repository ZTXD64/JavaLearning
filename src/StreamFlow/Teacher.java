package StreamFlow;

import lombok.Data;

@Data
public class Teacher {
    private String name;
    private Integer age;

    public Teacher(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public Teacher() {
    }
}
