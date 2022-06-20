package classes.student_info_system;

public class Student {
    String name;
    String stuNo;
    String classes;
    Course c1;
    Course c2;
    Course c3;
    double average;
    boolean isPass = false;

    Student(String name, String stuNo, String classes, Course c1, Course c2, Course c3) {
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.average = 0.0;

    }

    void addBulkExamNote(double note1, double note2, double note3) {
        if (note1 <= 100 && note1 >= 0) {
            this.c1.note = note1;
        }
        if (note2 <= 100 && note2 >= 0) {
            this.c2.note = note2;
        }
        if (note3 <= 100 && note3 >= 0) {
            this.c3.note = note3;
        }


    }

    void printNote() {
        System.out.println(this.c1.name + "Notu\t:" + this.c1.note);
        System.out.println(this.c2.name + "Notu\t:" + this.c2.note);
        System.out.println(this.c3.name + "Notu\t:" + this.c3.note);
        System.out.println("Ortalamanız:\t"+this.average);

    }

    void isPass() {
        this.average = (this.c1.note + this.c2.note + this.c3.note) / 3.0;
        System.out.println("============================");
        if (this.average >= 55.0) {
            System.out.println("Geçtiniz !");
            printNote();
            this.isPass = true;
        }
        else {
            System.out.println("Sınıfta Kaldınız ! ");
            printNote();
        }

    }
}
