package practice.highSchool.model;

public class Student extends Member {

    Double averageEva;
    boolean degree;

    public Student(int id, String firstName, String lastName, Double averageEva, boolean degree) {
        super(id, firstName, lastName);
        this.averageEva = averageEva;
        this.degree = degree;
    }

    public Double getAverageEva() {
        return averageEva;
    }

    public void setAverageEva(Double averageEva) {
        this.averageEva = averageEva;
    }

    public boolean isDegree() {
        return degree;
    }

    public void setDegree(boolean degree) {
        this.degree = degree;
    }

    @Override
    public String toString() {
        return "Student{" +
                "\n averageEva=" + averageEva +
                "\n degree=" + degree +
                "\n" + super.toString();
    }
}
