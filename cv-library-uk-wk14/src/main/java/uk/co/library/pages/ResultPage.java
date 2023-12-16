package uk.co.library.pages;

import org.openqa.selenium.By;
import uk.co.library.utility.Utility;

public class ResultPage extends Utility {
    By resulttext = By.xpath("//div[@class='search-header']/div[1]/h1");

    public String verifyTheResults(){
        return getTextFromElement(resulttext);
    }




}
