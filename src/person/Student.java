package person;

import java.io.Serializable;

public class Student implements Serializable {
    private String name;
    private Knowledge knowledge;

    public Student(String name, Knowledge knowledge) {
        this.name = name;
        this.knowledge = knowledge;
    }

    public void setKnowledge(Knowledge knowledge) {
        this.knowledge = knowledge;
    }

    public Knowledge getKnowledge() {
        return knowledge;
    }

    @Override
    public String toString() {
        return "Student{" + "name='" + name + '\'' + ", knowledge=" + knowledge + '}';
    }
}

