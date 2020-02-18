package spring.learning.demo;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Student {
    @Size(min = 3,message = "Э бля, имя введи, черт.")
    @NotNull(message = "Э бля, поле заполни, черт.")
    private String name;
    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
