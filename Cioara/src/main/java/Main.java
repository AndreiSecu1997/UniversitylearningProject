public class Main {

    public static void main(String[] args) {
        System.out.println("---Start---");
        Student Ionel = new Student(1,"Ionel");

        Ionel.adaugaRestanta("Matematica");
        Ionel.adaugaRestanta("Romana");
        Ionel.adaugaRestanta("Chimia");

//       Creem o Specializare in cadrul institutiei
        Specializare informaticaEconomica = new Specializare();
        informaticaEconomica.setNume("Informatica Economica");

//       Atribuim grupe academice pentru specializarea creata
        GrupaAcademica iE34 = new GrupaAcademica(3,informaticaEconomica);
        GrupaAcademica iE33 = new GrupaAcademica(3,informaticaEconomica);

        //Adaugam profesori in cadrul institutiei
        Profesor iordacheCristian = new Profesor(1,"Iordache Cristian",6000);
        Profesor apostolBogdan = new Profesor(2,"Apostol Bogdan",8000);
        Profesor dospinescuIoana = new Profesor(3,"Dospinescu Ioana",9000);

        //Adaugam studenti in cadrul institutiei
        Student student1 = new Student(1,"Vasilescu Marin");
        Student student2 = new Student(2,"Paunescu Ion");
        Student student3 = new Student(3,"Vladimirescu Gheorghe");
        Student student4 = new Student(4,"Cuza Maria");
        Student student5 = new Student(5,"Popa Iana");
        Student student6 = new Student(6,"Cezar Ana-Maria");
        Student student7 = new Student(7,"Alistrat Pompei");
        Student student8 = new Student(8,"Alecsandri Tudor");
        Student student9 = new Student(9,"Calistrat Marin");

        //Adaugam Obiectele din cadrul institutiei
        Disciplina reteleDeCalculatoare = new Disciplina("Retele de calculatoare");
        Disciplina informaticaDisctractiva = new Disciplina("Informatica Disctractiva");


        //Ducem evidenta orelor (lectiilor)
        Lectie lectia1 = new Lectie(1,reteleDeCalculatoare,iE33);

        lectia1.setProfesor(iordacheCristian);

        lectia1.addStudent(student1);
        lectia1.addStudent(student3);
        lectia1.addStudent(student4);
        lectia1.addStudent(student5);


        lectia1.stabilesteNota(student1,8);
        lectia1.stabilesteNota(student3,6);
        lectia1.stabilesteNota(student4,2);
        lectia1.stabilesteNota(student5,10);

        lectia1.arataNotele();
        lectia1.getStudentiPromovati();













//        System.out.println(Ionel.getRestante());
        System.out.println(Ionel.sortRestante());


    }
}



//Produs
//Comanda
//ArticolComanda
//Promotie

//Grupa_Academica
//OM
//Profesor
//Student
//Disciplina

