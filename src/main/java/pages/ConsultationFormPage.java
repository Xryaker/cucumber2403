package pages;

import enums.MASSAGER;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ConsultationFormPage {
    @FindBy(id = "input-name-consultation")
    WebElement name;
    @FindBy(id = "input-email-consultation")
    WebElement email;
    @FindBy(id = "input-tel-consultation")
    WebElement phone;
    @FindBy(xpath = "//button[@data-name=\"vb\"]")
    WebElement viber;
    @FindBy(xpath = "//button[@data-name=\"tg\"]")
    WebElement telega;
    @FindBy(id = "listbox-btn-input-course-consultation")
    WebElement select;
    @FindBy(xpath = "//input[@class=\"listbox_search-input\"]")
    WebElement search;
@FindBy(xpath = "//*[@id=\"form-consultation\"]/div[1]/footer/div[2]/button")
WebElement button;

    public void fillInForm(String name, String email, String phone, MASSAGER massager, String search){
        this.name.sendKeys(name);
        this.email.sendKeys(email);
        this.phone.sendKeys(phone);
        switch (massager){
            case VIBER -> viber.click();
            case TELEGRAM -> telega.click();
        }

        this.select.click();
        this.search.sendKeys(search);
        this.search.sendKeys(Keys.DOWN);
        this.search.sendKeys(Keys.ENTER);
        this.select.click();
    }

    public boolean isCunsultClickable() {
        return  button.isEnabled();
    }
}
