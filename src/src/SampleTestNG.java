import org.testng.annotations.*;

public class SampleTestNG {

    @BeforeSuite
    public void beforeSuite() {
        System.out.print("Before Suite");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("Before Test");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("Before Class");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("Before Method");
    }

    @BeforeGroups(groups = {"group1"})
    public void beforeGroups() {
        System.out.println("Before Groups");
    }

    @Test(groups = {"group1", "group2"})
    public void method() {
        System.out.println("Test Method");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("After Test");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("After Class");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("After Method");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("After Suite");
    }

    @AfterGroups
    public void afterGroups() {
        System.out.println("AfterGroups");
    }
}
