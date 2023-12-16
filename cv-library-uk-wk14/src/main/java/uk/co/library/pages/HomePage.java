package uk.co.library.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import uk.co.library.utility.Utility;

public class HomePage extends Utility {

    By jobTitle=By.id("keywords");
    By location =By.id("location");
    By distance = By.id("distance");
    By moreOptions = By.id("toggle-hp-search");
    By salarymin = By.id("salarymin");
    By salarymax = By.id("salarymax");
    By salarytype = By.id("salarytype");
    By jobtype = By.id("tempperm");
    By findjob= By.id("hp-search-btn");
   public void enterjobtital (String text){
       driver.findElement(jobTitle).sendKeys(text);
   }
   public void enterlocation(String text){
       driver.findElement(location).sendKeys(text);
   }
   public void selectdistance(String text){
       WebElement dropdown =driver.findElement(distance);
       Select select = new Select(dropdown);
       select.selectByVisibleText(text);
   }
   public void clickonmoreoption(){
       clickOnElement(moreOptions);
   }
   public void  entersalarymin(String text){
       driver.findElement(salarymin).sendKeys(text);

   }
   public void entersalarymax(String text){driver.findElement(salarymax).sendKeys(text);}
    public void selectsalarytype(String text){
       WebElement dropdown2 = driver.findElement(salarytype);
       Select select1 = new Select(dropdown2);
       select1.selectByVisibleText(text);
   }
   public void selectjobtype (String text){
       WebElement jobdropdown = driver.findElement(jobtype);
       Select select2 = new Select(jobdropdown);
       select2.selectByVisibleText(text);
   }
   public void clickonfindjob(){
       clickOnElement(findjob);
   }




}
