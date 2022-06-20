package classes.salary_calculator;

public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    Employee(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;

    }

    double tax() {
        if (this.salary <= 1000) {
            return 0;

        } else {
            return this.salary * 0.03;

        }
    }

    double bonus(){
        if(this.workHours>40){
            return (this.workHours-40)*30;
        }
        else
            return 0;
    }

    double raiseSalary(){
        int çalışmaSuresi=2021-this.hireYear;
        if(çalışmaSuresi<10){
            return this.salary*0.05;
        }
        if(çalışmaSuresi>9&&çalışmaSuresi<20){
            return this.salary*0.1;
        }
        if(çalışmaSuresi>19){
            return this.salary*0.15;
        }
        else
            return 0;

    }

    void printEmployee(){
        System.out.println("Adı : "+this.name);
        System.out.println("Maaşı : "+this.salary);
        System.out.println("Haftalık Çalışma Saati : "+this.workHours);
        System.out.println("Başlanguç Yılı : "+this.hireYear);
        System.out.println("Vergi : "+tax());
        System.out.println("Bonus : "+bonus());
        System.out.println("Maaş Artışı : "+raiseSalary());
        System.out.println("Vergi ve Bonuslarla Birlikte Maaş : "+(this.salary+bonus()-tax()));
        System.out.println("Toplam Maaş : "+((raiseSalary()+this.salary+bonus())-tax()));
    }
}
