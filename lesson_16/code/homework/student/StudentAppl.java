package homework.student;


import homework.student.model.Student;

public class StudentAppl {
    public static void main(String[] args) {
        Student student1=new Student(1,"Anatoliy","Shapol",2002,"it");
        Student student2=new Student(2,"Nina","Polin",2000,"lawyer");
        student1.display();
        Student.split();
        student2.display();
        Student.split();

        student1.skipClasses();
        student1.learning();
        student1.passTheExam();
        Student.split();
        student2.skipClasses();
        student2.learning();
        student2.didNotPass();
    }
}
