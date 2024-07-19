package TestProject;

import org.testng.Assert;
import org.testng.annotations.Test;

public class WomanTest {
    @Test(testName = "Getter for age", dataProvider = "check age", dataProviderClass = BaseTest.class)
    public void getAgeTest(int age) {
        Woman w = new Woman("Mary", "Reilly", age, false, "female");
        Assert.assertEquals(w.getAge(), age, "Wrong age");
    }

    @Test(testName = "Getter for Last Name", dataProvider = "check last name", dataProviderClass = BaseTest.class)
    public void getLastNameTest(String lname) {
        Woman w = new Woman("Mary", lname, 26, false, "female");
        Assert.assertEquals(w.getLastName(), lname, "Last Name does not correspond");
    }

    @Test(testName = "Getter for status", dataProvider = "check status", dataProviderClass = BaseTest.class)
    public void getStatus(boolean status) {
        Woman w = new Woman("Mary", "Reilly", 26, status, "female");
        Assert.assertEquals(w.isPartner(), status, "Wrong status");
    }

    @Test(testName = "Correct retirement status", dataProvider = "check retirement age", dataProviderClass = BaseTest.class)
    public void isRetiredTest(Person p, boolean retired) {

        Assert.assertEquals(p.isRetired(), retired, "Wrong calculation");
    }


    @Test(testName = "Register marriage", dataProvider = "register", dataProviderClass = BaseTest.class)
    public void registerPartnershipTest(Woman w, Man m, String lname, boolean married) {
        w.registerPartnership(m);
        Assert.assertEquals(w.getLastName(), lname, "Marriage was not registered");
        Assert.assertEquals(w.isPartner(), married, "Woman's marital status was not updated");

    }

    @Test(testName = "Deregister marriage", dataProvider = "deregister", dataProviderClass = BaseTest.class)
    public void deregisterPartnershipTest(Woman w, Man m, String lname, boolean status) {
//        w.registerPartnership(m);
        w.deregisterPartnership(m);
        
        Assert.assertEquals(w.getLastName(), lname, "Marriage was not deregistered");
        Assert.assertEquals(w.isPartner(), status,"Woman's marital status was not updated");
    }
}
