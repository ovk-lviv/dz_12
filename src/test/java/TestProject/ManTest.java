package TestProject;


import org.testng.Assert;
import org.testng.annotations.*;


public class ManTest {


    @Test(testName = "Getter for age", dataProvider = "check age", dataProviderClass = BaseTest.class)
    public void getAgeTest(int age) {
        Man m = new Man("John", "Doe", age, false, "male");
        Assert.assertEquals(m.getAge(), age, "Wrong age");
    }


    @Test(testName = "Getter for Last Name", dataProvider = "check last name", dataProviderClass = BaseTest.class)
    public void getLastNameTest(String lname) {
        Man m = new Man("John", lname, 54, false, "male");
        Assert.assertEquals(m.getLastName(), lname, "Last Name does not correspond");
    }


    @Test(testName = "Getter for status", dataProvider = "check status", dataProviderClass = BaseTest.class)
    public void getStatus(boolean status) {
        Man m = new Man("John", "Doe", 54, status, "male");
        Assert.assertEquals(m.isPartner(), status, "Wrong status");
    }

    // it would be more correct probably if I had PersonTest class....
    @Test(testName = "Correct retirement status", dataProvider = "check retirement age", dataProviderClass = BaseTest.class)
    public void isRetiredTest(Person p, boolean retired) {

        Assert.assertEquals(p.isRetired(), retired, "Wrong calculation");
    }

    //тут трохи некоректний тест, оскільки перевіряє статус.  а не сам факт зміни статусу. Тільки  для засвоєння метріалу уроку.
    @Test(testName = "Register marriage", dataProvider = "check marital status register", dataProviderClass = BaseTest.class)
    public void isMarriedTest(Man m, boolean married) {
        m.registerPartnership();
        Assert.assertEquals(m.isPartner(), married, "Marital status was not updated");
    }

    //checks if marital status is updated (person divorced)
    @Test(testName = "Deregister marriage", dataProvider = "check marital status deregister", dataProviderClass = BaseTest.class)
    public void isDivorcedTest(Man m, boolean status) {
        m.deregisterPartnership();
        Assert.assertEquals(m.isPartner(), status, "Marital status was not updated");
    }
}
