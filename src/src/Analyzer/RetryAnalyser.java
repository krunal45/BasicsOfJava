package Analyzer;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyser implements IRetryAnalyzer {

    int count=0,retryAttempts=2;


    @Override
    public boolean retry(ITestResult iTestResult) {
        while (count<retryAttempts){
            count++;
            return true;
        }
        return false;
    }
}
