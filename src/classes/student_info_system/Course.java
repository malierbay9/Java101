package classes.student_info_system;

public class Course {
    String name;
    String code;
    String prefix;
    double note;
    Teacher teacher;
    Course(String name,String code,String prefix){
        this.name=name;
        this.code=code;
        this.prefix=prefix;
        this.note=0;

    }
    void addTeacher(Teacher teacher){
        if(teacher.branch.equals(this.prefix)){
            teacher.printTeacher();
        }else{
            System.out.println("Hoca uygun degil.");
        }

    }
}
