package homework.student_stream;

import java.time.LocalDate;

public class Student {
    private long id;
    private String firstName;
    private String lastName;
    private LocalDate birtDay;
    private String course;
    private int groupNum;
    private String country;
    private boolean gender;

    LocalDate now=LocalDate.now();

    public Student(long id, String firstName, String lastName, LocalDate birtDay, String course, int groupNum, String country, boolean gender) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birtDay = birtDay;
        this.course = course;
        this.groupNum = groupNum;
        this.country = country;
        this.gender = gender;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getBirtDay() {
        return birtDay;
    }

    public void setBirtDay(LocalDate birtDay) {
        this.birtDay = birtDay;
    }

    public String getCourse() {
        return course;
    }

    public int getAge(){
        return now.compareTo(getBirtDay());
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public int getGroupNum() {
        return groupNum;
    }

    public void setGroupNum(int groupNum) {
        this.groupNum = groupNum;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }
    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birtDay=" + birtDay +
                ", course='" + course + '\'' +
                ", groupNum=" + groupNum +
                ", country='" + country + '\'' +
                ", gender=" + gender +
                '}';
    }
}
