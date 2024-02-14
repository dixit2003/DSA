package ObjectOrientedProgramming;

class Student {
    int rno;
    String name;
    float percentage;

    //Different ways of creating a constructor.
    Student () {
        this.rno = 100;
        this.name = "Dixit";
        this.percentage = 80;
    }

    Student(int rno, String name, float percentage) {
        this.rno = rno;
        this.name = name;
        this.percentage = percentage;
    }
    
    Student(Student student) {
        this.rno = student.rno;
        this.name = student.name;
        this.percentage = student.percentage;
    }
    void printDetails() {
        System.out.println(name + " with roll number " + rno + " has got " + percentage + "%");
    }
}
public class CLassesAndObjects {
    public static void main(String[] args) {
        //1st way
        Student s1 = new Student(128, "Drax", 88.24f);
        s1.printDetails();
        //2nd Way
        Student s2 = new Student();
        s2.printDetails();
        //3rd way
        Student s3 = new Student(s1);
        s3.printDetails();
    }
}

