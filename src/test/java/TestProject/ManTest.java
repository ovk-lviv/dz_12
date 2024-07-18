package TestProject;


import org.testng.Assert;
import org.testng.annotations.*;



public class ManTest {
//checks if age can be retrieved and the age is correct
    @Test(testName = "Getter for age")
    public void getAgeTest() {
        Man m = new Man("John", "Doe", 54, false);
        Assert.assertEquals(m.getAge(), 54, "Wrong age");
    }
//checks if last name can be retrieved and it is correct
    @Test(testName = "Getter for Last Name")
    public void getLastNameTest () {
        Man m = new Man ("John", "Doe", 54, false);
        Assert.assertEquals(m.getLastName(), "Doe", "Last Name does not correspond");
    }

// checks if status is retrieved and it is correct
    @Test(testName = "Getter for status")
    public void getStatus () {
        Man m = new Man ("John", "Doe", 54, false);
        Assert.assertEquals(m.isPartner(), false, "Wrong status");
    }

// checks if calculation for retirement status is correct
    @Test(testName = "Correct retirement status")
    public void isRetiredTest () {
        Man m = new Man ("John", "Doe", 54, false);
        Assert.assertFalse(m.isRetired(), "Wrong calculation");
    }

//checks if marital status updated (person married)
    @Test(testName = "Register marriage")
    public void isMarriedTest () {
        Man m = new Man ("John", "Doe", 54, false);
        m.registerPartnership();
        Assert.assertTrue(m.isPartner(), "Marital status was not updated");
    }

//checks if marital status is updated (person divorced)
    @Test(testName = "Deregister marriage")
    public void isDivorcedTest () {
        Man m = new Man ("John", "Doe", 54, true);
        m.deregisterPartnership();
        Assert.assertFalse(m.isPartner(), "Marital status was not updated");
    }
}
