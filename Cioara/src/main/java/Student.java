import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Student extends Persoana {

    Student(int student_id, String student_name) {
        super(student_id, student_name);
    }


    List<String> restante = new ArrayList<>();


    void adaugaRestanta(String Restanta) {
        restante.add(Restanta);
        System.out.println("Restanta " + Restanta + " a fost adaugata cu Succes!");
    }

    public List<String> getRestante() {
        return this.restante;
    }

    List<Object> sortRestante() {
        return restante.stream().sorted().collect(Collectors.toList());
    }


}
