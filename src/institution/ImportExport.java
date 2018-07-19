package institution;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ImportExport {
    private University link;

    public ImportExport(institution.University link) {
        this.link = link;
    }

    public University importStudents() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("students.dat"))) {
            link = (University) ois.readObject();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return link;
    }

    public void exportStudents() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("students.dat"))) {
            oos.writeObject(link);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
