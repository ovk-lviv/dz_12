package TestProject;

import org.testng.Assert;
import org.testng.annotations.Test;

public class WomanTest {
    @Test(testName = "Getter for age")
    public void getAgeTest() {
        Woman w = new Woman("Mary", "Reilly", 26, false);
        Assert.assertEquals(w.getAge(), 26, "Wrong age");
    }

    @Test(testName = "Getter for Last Name")
    public void getLastNameTest() {
        Woman w = new Woman("Mary", "Reilly", 26, false);
        Assert.assertEquals(w.getLastName(), "Reilly", "Last Name does not correspond");
    }

    @Test(testName = "Getter for status")
    public void getStatus() {
        Woman w = new Woman("Mary", "Reilly", 26, false);
        Assert.assertEquals(w.isPartner(), false, "Wrong status");
    }

    @Test(testName = "Correct retirement status")
    public void isRetiredTest() {
        Woman w = new Woman("Mary", "Reilly", 26, false);
        Assert.assertFalse(w.isRetired(), "Wrong calculation");
    }

    @Test(testName = "Set maiden name")
    public void setMaidenNameTest() {
        Woman w = new Woman("Mary", "Reilly", 26, false);
        w.setMaidenName();
        Assert.assertEquals(w.getLastName(), w.getMaidenName(), "Maiden name was not updated");

    }

    @Test(testName = "Register marriage")
    public void registerPartnershipTest() {
        Woman w = new Woman("Mary", "Reilly", 26, false);
        Man m = new Man("Leland", "Palmer", 30, false);
        w.registerPartnership(m);
        Assert.assertEquals(w.getLastName(), m.getLastName(), "Marriage was not registered");
        Assert.assertTrue(w.isPartner(), "Woman's marital status was not updated");

    }

    @Test(testName = "Deregister marriage")
    public void deregisterPartnershipTest() {
        Woman w = new Woman("Mary", "Reilly", 26, false);
        Man m = new Man("Leland", "Palmer", 30, false);
        w.registerPartnership(m);
        w.deregisterPartnership(m);
        Assert.assertEquals(w.getLastName(), w.getMaidenName(), "Marriage was not deregistered");
        Assert.assertFalse(w.isPartner(), "Woman's marital status was not updated");
    }
}
