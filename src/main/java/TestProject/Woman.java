package TestProject;

public class Woman extends Person {
    private String maidenName;


    public Woman(String firstName, String lastName, int age, boolean partner, String gender) {
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


    public void setMaidenName(Man m) {
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
        setLastName(this.getLastName());
        setPartner(false);

    }
}