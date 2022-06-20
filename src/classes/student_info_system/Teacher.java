package classes.student_info_system;

public class Teacher {
    String name;
    String branch;
    String mpno;
    Teacher (String name,String branch,String mpno){
        this.name=name;
        this.branch=branch;
        this.mpno=mpno;
    }

    void printTeacher(){
        System.out.print("Hocanın adı: "+this.name+"\n");
        System.out.print("Hocanın dalı: "+this.branch+"\n");
        System.out.println("Hocanın numarası: "+this.mpno+"\n");
    }
}
