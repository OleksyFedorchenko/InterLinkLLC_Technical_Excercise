package institution;

import person.Student;

import java.util.List;
import java.util.stream.Collectors;

public class Internship {
    private String name;
    private University link;
    private List<Student> interns;

    public Internship(String name, University link) {
        this.name = name;
        this.link = link;

        /*інкапсулюємо логіку вибірки студентів які попадуть в інтернатуру.
        Тобто зроблено так, що коли створюєм об'єкт Інтернатури, його ліст заповнюється студентами в яких вищий сер.бал по університету*/
        this.interns = link.getStudents().stream()
                .filter(s -> s.getKnowledge().getLevel() > this.link.getSerBal())
                .collect(Collectors.toList());
    }

    public void setStudent(int studentIndex, Student student) {
        interns.set(studentIndex, student);
    }

    public void getStudents() {
        for (Student a : interns) {
            System.out.println(a);
        }
    }
}