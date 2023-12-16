package uk.co.library.testsuite;

import org.testng.Assert;
import org.testng.annotations.Test;
import uk.co.library.pages.HomePage;
import uk.co.library.pages.ResultPage;
import uk.co.library.testbase.TestBase;

public class JobSearchTest extends TestBase {
    HomePage homePage = new HomePage();
    ResultPage resultPage = new ResultPage();

    @Test
    public void verifyJobSearchResultUsingDifferentDataSet () throws InterruptedException {
        homePage.enterjobtital("Tester");
        homePage.enterlocation("Harrow");
        homePage.selectdistance("5 miles");
        homePage.clickonmoreoption();
        homePage.entersalarymin("30000");
        homePage.entersalarymax("500000");
        homePage.selectsalarytype("Per annum");
        homePage.selectjobtype("Permanent");
        homePage.clickonfindjob();
        Thread.sleep(3000);
        String actualtest1 = resultPage.verifyTheResults();
        String expectedtest1 = "Permanent Tester jobs in Harrow";
        Assert.assertEquals(actualtest1,expectedtest1);
    }
    @Test
    public void verifyJobSearchResultUsingDifferentDataSet2 () throws InterruptedException {
        homePage.enterjobtital("QA Test Analyst");
        homePage.enterlocation("London");
        homePage.selectdistance("50 miles");
        homePage.clickonmoreoption();
        homePage.entersalarymin("3000");
        homePage.entersalarymax("1000000");
        homePage.selectsalarytype("Per month");
        homePage.selectjobtype("Contract");
        homePage.clickonfindjob();
        Thread.sleep(3000);
        String actualtest1 = resultPage.verifyTheResults();
        String expectedtest1 = "Contract Qa Test Analyst jobs in London";
        Assert.assertEquals(actualtest1,expectedtest1);
    }
    @Test
    public void verifyJobSearchResultUsingDifferentDataSet3 () throws InterruptedException {
        homePage.enterjobtital("Test Analyst");
        homePage.enterlocation("London");
        homePage.selectdistance("250 miles");
        homePage.clickonmoreoption();
        homePage.entersalarymin("5000");
        homePage.entersalarymax("500000");
        homePage.selectsalarytype("Per annum");
        homePage.selectjobtype("Permanent");
        homePage.clickonfindjob();
        Thread.sleep(3000);
        String actualtest1 = resultPage.verifyTheResults();
        String expectedtest1 = "Permanent Test Analyst jobs in London";
        Assert.assertEquals(actualtest1,expectedtest1);
    }
    @Test
    public void verifyJobSearchResultUsingDifferentDataSet4 () throws InterruptedException {
        homePage.enterjobtital("Qa Tester");
        homePage.enterlocation("London");
        homePage.selectdistance("250 miles");
        homePage.clickonmoreoption();
        homePage.entersalarymin("7000");
        homePage.entersalarymax("700000");
        homePage.selectsalarytype("Per annum");
        homePage.selectjobtype("Permanent");
        homePage.clickonfindjob();
        Thread.sleep(1000);
        String actualtest1 = resultPage.verifyTheResults();
        String expectedtest1 = "Permanent Qa Tester jobs in London";
        Assert.assertEquals(actualtest1,expectedtest1);
    }
    @Test
    public void verifyJobSearchResultUsingDifferentDataSet5 () throws InterruptedException {
        homePage.enterjobtital("Test Analyst");
        homePage.enterlocation("Scotland");
        homePage.selectdistance("25 miles");
        homePage.clickonmoreoption();
        homePage.entersalarymin("7000");
        homePage.entersalarymax("700000");
        homePage.selectsalarytype("Per annum");
        homePage.selectjobtype("Permanent");
        homePage.clickonfindjob();
        Thread.sleep(1000);
        String actualtest1 = resultPage.verifyTheResults();
        String expectedtest1 = "Permanent Test Analyst jobs in Scotland";
        Assert.assertEquals(actualtest1,expectedtest1);
    }

    @Test
    public void verifyJobSearchResultUsingDifferentDataSet6 () throws InterruptedException {
        homePage.enterjobtital("Software Tester");
        homePage.enterlocation("London");
        homePage.selectdistance("25 miles");
        homePage.clickonmoreoption();
        homePage.entersalarymin("8000");
        homePage.entersalarymax("800000");
        homePage.selectsalarytype("Per annum");
        homePage.selectjobtype("Permanent");
        homePage.clickonfindjob();
        Thread.sleep(1000);
        String actualtest1 = resultPage.verifyTheResults();
        String expectedtest1 = "Permanent Software Tester jobs in London";
        Assert.assertEquals(actualtest1,expectedtest1);
    }

    @Test
    public void verifyJobSearchResultUsingDifferentDataSet7 () throws InterruptedException {
        homePage.enterjobtital("Software Tester");
        homePage.enterlocation("Gerrards Cross, Buckinghamshire");
        homePage.selectdistance("25 miles");
        homePage.clickonmoreoption();
        homePage.entersalarymin("9000");
        homePage.entersalarymax("900000");
        homePage.selectsalarytype("Per annum");
        homePage.selectjobtype("Permanent");
        homePage.clickonfindjob();
        Thread.sleep(1000);
        String actualtest1 = resultPage.verifyTheResults();
        String expectedtest1 = "Permanent Software Tester jobs in Gerrards Cross";
        Assert.assertEquals(actualtest1,expectedtest1);
    }
}
