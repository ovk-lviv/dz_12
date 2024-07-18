package TestProject;

public class Man extends Person {

    public Man(String firstName, String lastName, int age, boolean partner) {
        super(firstName, lastName, age, partner);

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

    public boolean isRetired() {
        if (this.getAge() > 65) {
            return true;
        }
        return false;
    }

    public void registerPartnership() {
        setPartner(true);
    }


    public void deregisterPartnership() {
        setPartner(false);
    }

}