package classes.student_info_system;

public class Main {
    public static void main(String[] args) {
        Teacher t1=new Teacher("Mahmut Hoca","TRH","555");
        Teacher t2=new Teacher("Graham Bell","FZK","666");
        Teacher t3=new Teacher("Külyutmaz","BIO","777");

        Course tarih=new Course("Tarih","101","TRH");
        Course fizik=new Course("Fizik","102","FZK");
        Course bio=new Course("Biyoloji","103","BIO");

        Student s1=new Student("İnek Şaban","1111","4",tarih,fizik,bio);
        s1.addBulkExamNote(50,200,70);
        s1.isPass();
    }
}
