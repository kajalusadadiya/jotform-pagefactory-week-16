package com.jotform.form.customlisteners;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.testng.ITestContext;
import org.testng.ITestResult;

import static com.jotform.form.utility.Utility.takeScreenShot;

public class CustomListeners {

    public ExtentSparkReporter reporter;
    public ExtentReports reports;
    public static ExtentTest test;


    public void onTestStart(ITestResult iTestResult) {
        test = reports.createTest(iTestResult.getName());
    }


    public void onTestSuccess(ITestResult iTestResult) {
        test.log(Status.PASS, "TEST CASE PASSED IS " + iTestResult.getName());
    }


    public void onTestFailure(ITestResult iTestResult) {
        test.log(Status.FAIL, "TEST FAILED IS " + iTestResult.getName());
        test.log(Status.FAIL, "TEST FAILED IS " + iTestResult.getThrowable());
        String screenshotPath = takeScreenShot(iTestResult.getName());
        test.addScreenCaptureFromPath(screenshotPath);
    }


    public void onTestSkipped(ITestResult iTestResult) {
        test.log(Status.SKIP, "TEST SKIPPED IS " + iTestResult.getName());
    }


    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }


    public void onStart(ITestContext iTestContext) {
        reporter = new ExtentSparkReporter(System.getProperty("user.dir") + "/test-output/extent.html");
        reporter.config().setDocumentTitle("Automation Report");
        reporter.config().setReportName("jotform");
        reporter.config().setTheme(Theme.DARK);
        reports = new ExtentReports();
        reports.attachReporter(reporter);

        reports.setSystemInfo("User Name", System.getProperty("user.name"));
        reports.setSystemInfo("Time Zone", System.getProperty("user.timezone"));
        reports.setSystemInfo("Machine", "Windows 10" + "64 Bit");
        reports.setSystemInfo("Selenium", "3.141.59");
        reports.setSystemInfo("Maven", "3.5.9");
        reports.setSystemInfo("Java Version", "1.8.0_151");

    }


    public void onFinish(ITestContext iTestContext) {
        reports.flush();
    }
}
