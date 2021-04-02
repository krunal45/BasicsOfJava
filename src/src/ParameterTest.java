import Analyzer.RetryAnalyser;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest {

    @Test()
    @Parameters({"username", "password"})
    public void printValues(String username, String pwd) {
        System.out.println("username :" + username);
        System.out.println("password :" + pwd);
        Assert.assertEquals(1, 2);
    }
}
