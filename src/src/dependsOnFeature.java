import org.testng.annotations.Test;

public class dependsOnFeature {

    @Test(groups = "sanity",expectedExceptions = ArithmeticException.class)
    public void login() {
        System.out.println("Login Page");
        int i = 9 / 0;
    }

    @Test(dependsOnGroups = "sanity")
    public void accountsPage() {
        System.out.println("accounts Page");
    }

    @Test(groups = {"sanity"},dependsOnMethods = "login")
    public void homePage() {
        System.out.println("Home Page");
    }
}
