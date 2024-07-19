package TestProject;

import org.testng.annotations.DataProvider;

public class BaseTest {
    @DataProvider(name = "check age")
    public static Object[][] generateTestDataAge() {
        return new Object[][]{{67}, {15}, {46}};
    }

    @DataProvider(name = "check last name")
    public static Object[][] generateTestDataLastName() {
        return new Object[][]{{"Stanford"}, {"Getsby"}, {"Schwarzenegger"}};
    }

    @DataProvider(name = "check status")
    public static Object[][] generateTestDataStatus() {
        return new Object[][]{{true}, {false}, {true}};
    }

    @DataProvider(name = "check retirement age")
    public static Object[][] generateTestDataRetirementAge() {

        return new Object[][]{{new Person("John", "Doe", 64, true, "male"), true},
                {new Person("Mary", "Lord", 59, false, "female"), true},
                {new Person("Larry", "David", 71, true, "male"), true},
                {new Person("Nora", "Day", 61, false, "female"), true}};
    }

    @DataProvider(name = "check marital status register")
    public static Object[][] generateTestDataMaritalStatuRegister() {
        return new Object[][]{{new Man("John", "Doe", 45, true, "male"), true},
                {new Man("Keith", "Lord", 27, false, "male"), true},
                {new Man("Larry", "David", 33, true, "male"), true},
                {new Man("Mick", "Day", 53, false, "male"), true}};
    }

    @DataProvider(name = "check marital status deregister")
    public static Object[][] generateTestDataMaritalStatus() {
        return new Object[][]{{new Man("John", "Doe", 45, true, "male"), false},
                {new Man("Keith", "Lord", 27, false, "male"), false},
                {new Man("Larry", "David", 33, true, "male"), false},
                {new Man("Mick", "Day", 53, false, "male"), false}};

    }

    @DataProvider(name = "register")
    public static Object[][] generateTestDataRegister() {
        return new Object[][]{{new Woman("Linda", "Doe", 45, false, "female"),
                new Man("John", "Doe", 50, false, "male"), "Doe", true},
                {new Woman("Nora", "Lord", 27, false, "female"),
                        new Man("Larry", "Tyler", 36, false, "male"), "Tyler", true},
        };

    }

    @DataProvider(name = "deregister")
    public static Object[][] generateTestDataDeregister() {
        return new Object[][]{{new Woman("Linda", "Klein", 45, true, "female"),
                new Man("John", "Doe", 50, true, "male"), "Klein", false},
                {new Woman("Nora", "Lord", 27, true, "female"),
                        new Man("Larry", "Tyler", 36, true, "male"), "Lord", false},
        };
    }
}
