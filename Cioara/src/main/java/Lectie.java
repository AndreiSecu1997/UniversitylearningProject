import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class Lectie {
    public Lectie(int lectie_id, Disciplina denumireObiect, GrupaAcademica grupaAcademica) {
        this.lectie_id = lectie_id;
        this.disciplina = denumireObiect;
        this.grupaAcademica = grupaAcademica;
    }

    int lectie_id;
    Disciplina disciplina;
    GrupaAcademica grupaAcademica;
    Profesor profesor;

    void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    List<Student> listStudenti = new ArrayList<>();

    void addStudent(Student student) {
        listStudenti.add(student);
    }

    Map<Student, Integer> noteleAtribuite = new HashMap<>();

    void stabilesteNota(Student student, Integer nota) {
        noteleAtribuite.put(student, nota);
    }

    void arataNotele() {
        System.out.println(Arrays.asList(noteleAtribuite));
        AtomicInteger sumaNotelor = new AtomicInteger();
        noteleAtribuite.forEach((k, v) -> sumaNotelor.addAndGet(noteleAtribuite.get(k)));
        System.out.println("Nota medie a lectiei:" + sumaNotelor.floatValue()/noteleAtribuite.size());
    }

    void getStudentiPromovati() {
        System.out.println("Studenti Promovati: ");
        for (Map.Entry<Student, Integer> entry : noteleAtribuite.entrySet()) {
            if (entry.getValue() > 5) {
                System.out.println("Student : " + entry.getKey().getNume() + " Nota : " + entry.getValue());
            }
        }
    }
}
