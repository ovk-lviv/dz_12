package TestProject;

public class Woman extends Person {
    private String maidenName;


    public Woman(String firstName, String lastName, int age, boolean partner) {
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
        if (this.getAge() > 60) {
            return true;
        }
        return false;
    }

    public void setMaidenName() {
        if (!this.isPartner())
            this.maidenName = this.getLastName();
    }


    public String getMaidenName() {
        return maidenName;
    }

    public void registerPartnership(Man m) {
        setLastName(m.getLastName());
        setPartner(true);

    }


    public void deregisterPartnership(Man m) {
        m.setPartner(false);
        setLastName(this.maidenName);
        setPartner(false);

    }
}