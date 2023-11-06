package homework.student.model;

public class Student {
    public int id;
    private String firstName;
    private String lastName;
    private int year;
    private String specialty;


    public Student(int id, String firstName, String lastName, int year, String specialty) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.year = year;
        this.specialty = specialty;
    }

    private int getId() {
        return id;
    }

    private void setId(int id) {
        this.id = id;
    }

    private String getFirstName() {
        return firstName;
    }

    private void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    private String getLastName() {
        return lastName;
    }

    private void setLastName(String lastName) {
        this.lastName = lastName;
    }

    private int getYear() {
        return year;
    }

    private void setYear(int year) {
        this.year = year;
    }

    private String getSpecialty() {
        return specialty;
    }

    private void setSpecialty(String specialty) {
        this.specialty = specialty;
    }


    public void display() {
        System.out.println("ID: " + id + "\nFirst name: " + firstName + "\nLast name: "
                + lastName +"\nYear of birth: "+ year + "\nSpecialty: " + specialty);
    }
    public static void split(){
        System.out.println("-------------------------------");
    }

    public void learning() {
        System.out.println(firstName+" exam preparation");
    }

    public void takeAVacation() {
        System.out.println(firstName+" take a vacation");
    }

    public void passTheExam() {
        System.out.println(firstName+ " pass the exam");
    }
    public void didNotPass() {
        System.out.println(firstName+ " did not pass the exam");
    }

    public void skipClasses() {
        System.out.println(firstName+" Skip classes");
    }
}
