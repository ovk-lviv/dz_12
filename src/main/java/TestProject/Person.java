package TestProject;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private boolean partner;

    public Person(String firstName, String lastName, int age, boolean partner) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.partner = partner;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public boolean isPartner() {
        return partner;
    }

    public void setPartner(boolean partner) {
        this.partner = partner;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}