package TestProject;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private boolean partner;
    private String gender;

    public Person(String firstName, String lastName, int age, boolean partner, String gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.partner = partner;
        this.gender = gender;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
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

    public boolean isRetired() {
        if (this.gender.equals("male") && this.age > 65) {
            return true;
        } else if (this.gender.equals("female") && this.age > 60) {
            return true;
        }
        return false;

    }

}