package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPageObject {

   private WebDriver driver;

    private By consultationButton=By.id("btn-consultation-hero");
    private By formConsultation=By.id("form-consultation");
    private By contactsButton=By.xpath("//li[@class=\"site-nav-menu_item\"]");

    public MainPageObject(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getConsultationButton() {
        return driver.findElement(consultationButton);
    }
    public boolean isEnabledFormConsultayion(){
        return driver.findElement(formConsultation).isEnabled();
    }

    public WebElement getContactsButton() {
        return driver.findElement(contactsButton);
    }

}
