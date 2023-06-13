package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class MainPageFactory {
    @FindBy(xpath = "//button[contains(@class,\"btn-consultation\") and contains(@class,\"contacts-item_btn\")]")
    public WebElement consultationButton;

    @FindBy(id = "form-consultation")
    WebElement formConsult;
    static final String li = "//li[@class=\"socials-list_item\"]";
    @FindBy(xpath = li)
    List<WebElement> socialsList;
    @FindBy(id = "btn-consultation-hero")
    public WebElement consultButton;

    public boolean isEnabledFormConsultayion() {
        return formConsult.isEnabled();
    }

    public List<String> getSocialsLinks() {
        List<String> stringList = new ArrayList<>();
        for (WebElement element : socialsList) {
            stringList.add(element.findElement(By.tagName("a")).getAttribute("href"));
        }
        return stringList;
    }
}
