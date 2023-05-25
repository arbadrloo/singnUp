package domain;

import java.util.Date;

public class Person extends BaseEntity <Long> {

    private String firstName;
    private String LastName;
    private Date dob;

    public Person(Long aLong, String firstName, String lastName, Date dob) {
        super(aLong);
        this.firstName = firstName;
        LastName = lastName;
        this.dob = dob;
    }

    public Person(String firstName, String lastName, Date dob) {
        this.firstName = firstName;
        LastName = lastName;
        this.dob = dob;
    }

    public Person() {
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public Date getDob() {
        return dob;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", dob=" + dob +
                '}';
    }
}
