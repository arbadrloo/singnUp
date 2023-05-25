package domain;

import java.util.Date;

public class Teacher extends Person {
    private String degree;
    private ProfLevel profLevel;
    private double salary;

    public Teacher(Long aLong, String firstName, String lastName, Date dob, String degree, ProfLevel profLevel, double salary) {
        super(aLong, firstName, lastName, dob);
        this.degree = degree;
        this.profLevel = profLevel;
        this.salary = salary;
    }

    public Teacher(String firstName, String lastName, Date dob, String degree, ProfLevel profLevel, double salary) {
        super(firstName, lastName, dob);
        this.degree = degree;
        this.profLevel = profLevel;
        this.salary = salary;
    }

    public Teacher(String degree, ProfLevel profLevel, double salary) {
        this.degree = degree;
        this.profLevel = profLevel;
        this.salary = salary;
    }
    public Teacher (){

    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public ProfLevel getProfLevel() {
        return profLevel;
    }

    public void setProfLevel(ProfLevel profLevel) {
        this.profLevel = profLevel;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
