package institution;

import person.Student;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class University implements Serializable {
    private String name;
    private List<Student> students = new ArrayList<>();

    public University(String name) {
        this.name = name;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudent(int studentIndex, Student student) {
        students.set(studentIndex, student);
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    //Вираховуємо середній бал по універу
    public int getSerBal() {
        int sum = 0;
        for (Student u : students) {
            sum += u.getKnowledge().getLevel();
        }
        return sum / students.size();
    }
}
