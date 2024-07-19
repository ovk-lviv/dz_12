package TestProject;

public class Man extends Person {

    public Man(String firstName, String lastName, int age, boolean partner, String gender) {
        super(firstName, lastName, age, partner, gender);

    }

    public String getLastName() {
        return super.getLastName();

    }

    public int getAge() {
        return super.getAge();

    }

    public boolean isPartner() {
        return super.isPartner();
    }

    public String getGender() {
        return super.getGender();
    }


    public void registerPartnership() {
        if (!this.isPartner()) {
            setPartner(true);
        }
    }


    public void deregisterPartnership() {
        setPartner(false);
    }

}