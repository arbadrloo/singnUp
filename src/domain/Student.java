package domain;

import java.util.Date;

public class Student extends Person {
    private String enteringYear;
    private String major;

    public Student(Long aLong, String firstName, String lastName, Date dob, String enteringYear, String major) {
        super(aLong, firstName, lastName, dob);
        this.enteringYear = enteringYear;
        this.major = major;
    }

    public Student(String firstName, String lastName, Date dob, String enteringYear, String major) {
        super(firstName, lastName, dob);
        this.enteringYear = enteringYear;
        this.major = major;
    }

    public Student(String enteringYear, String major) {
        this.enteringYear = enteringYear;
        this.major = major;
    }

    public String getEnteringYear() {
        return enteringYear;
    }

    public void setEnteringYear(String enteringYear) {
        this.enteringYear = enteringYear;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

}
