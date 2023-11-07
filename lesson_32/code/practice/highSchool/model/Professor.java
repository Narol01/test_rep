package practice.highSchool.model;

public class Professor extends Member{

    String science;
    int salary;

    public Professor(int id, String firstName, String lastName, String science, int salary) {
        super(id, firstName, lastName);
        this.science = science;
        this.salary = salary;
    }

    public String getScience() {
        return science;
    }

    public void setScience(String science) {
        this.science = science;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "\n science='" + science +
                "\n salary=" + salary +
                "\n " + super.toString();
    }
}
