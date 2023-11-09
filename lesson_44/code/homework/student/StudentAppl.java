package homework.student;

import java.util.Arrays;
import java.util.Random;

public class StudentAppl {
    public static void main(String[] args) {
        Random random=new Random();

        Student[] students = new Student[16];
        students[0]=new Student("Student1","lastStudent1",20);
        students[1]=new Student("Student2","lastStudent2",21);
        students[2]=new Student("Student3","lastStudent3",20);
        students[3]=new Student("Student4","lastStudent4",20);
        students[4]=new Student("Student5","lastStudent5",22);
        students[5]=new Student("Student6","lastStudent6",23);
        students[6]=new Student("Student7","lastStudent7",21);
        students[7]=new Student("Student8","lastStudent8",21);
        students[8]=new Student("Student9","lastStudent9",23);
        students[9]=new Student("Student10","lastStudent10",20);
        students[10]=new Student("Student11","lastStudent10",20);
        students[11]=new Student("Student12","lastStudent10",20);
        students[12]=new Student("Student13","lastStudent10",20);
        students[13]=new Student("Student14","lastStudent10",20);
        students[14]=new Student("Student15","lastStudent10",20);
        students[15]=new Student("Student16","lastStudent10",20);


        for (int i = 0; i <students.length; i++) {//мешаем обькты масива в рандомном порядке
            int index= random.nextInt(i+1);
            Student a= students[index];
            students[index]=students[i];
            students[i]=a;
        }//На выходе получаем масив Студентов в произвольном порядке
        System.out.println(Arrays.toString(students)+"\n");
        Student[] students1=Arrays.copyOfRange(students,0,students.length/2);//Первая половина студентов в одну групу (создаём новый масив только из первой половины студентов)
        System.out.println(Arrays.toString(students1));
        Student[] students2=Arrays.copyOfRange(students,students.length/2,students.length);//Вторая половина студентов в одну групу (создаём новый масивиз второй половины студентов)
        System.out.println(Arrays.toString(students2));
    }
}
