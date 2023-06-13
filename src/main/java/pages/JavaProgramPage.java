package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import util.Util;

import java.util.ArrayList;
import java.util.List;

public class JavaProgramPage {

    By coachesShowAllButton= By.id("coachesShowAllButton");
    By coachListItem=By.className("coach-list_item");
    By coachName=By.className("coach-card_name");

    WebDriver driver;

    public JavaProgramPage(WebDriver driver) {
        this.driver = driver;
    }
    public List<String> getCoachNamesList(){
        Util.scrollToElementVisibilityOf(driver,coachesShowAllButton);
        driver.findElement(coachesShowAllButton).click();
        List<String> namesList = new ArrayList<>();
        for (WebElement element : driver.findElements(coachListItem)) {
            namesList.add(element.findElement(coachName).getText());
        }
        return namesList;
    }
}
