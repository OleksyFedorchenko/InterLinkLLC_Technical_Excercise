package main;

import institution.ImportExport;
import institution.Internship;
import institution.University;
import person.Knowledge;
import person.Student;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        University university = new University("CH.U.I.");
        ImportExport ie = new ImportExport(university); //класс для серіалізації,десеріалізації
        System.out.println("Change please how dou you want to add students?");
        System.out.println("1-From code;");
        System.out.println("2-From file;");
        switch (sc.nextInt()) {
            case 1:
                university.addStudent(new Student("Igor Pogirkin", new Knowledge(48)));
                university.addStudent(new Student("Anastasia Lipkina", new Knowledge(63)));
                university.addStudent(new Student("Inna Lopatina", new Knowledge(22)));
                university.addStudent(new Student("John Valko", new Knowledge(38)));
                university.addStudent(new Student("Andrew Ivaneyko", new Knowledge(76)));

                Internship internship = new Internship("Interlink", university);
                System.out.println("Middle level of university is " + university.getSerBal());
                System.out.println("List of internship's students:");
                internship.getStudents();
                ie.exportStudents(); //експорт студентів у файл
                break;
            case 2:
                university = ie.importStudents(); //імпорт студентів з файлу
                internship = new Internship("Interlink", university);
                System.out.println("Middle level of university is " + university.getSerBal());
                System.out.println("List of internship's students:");
                internship.getStudents();
                break;
        }
    }
}


