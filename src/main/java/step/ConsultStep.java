package step;

import conf.BaseClass;
import enums.MASSAGER;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.datatable.DataTable;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;
import pages.ConsultationFormPage;
import pages.MainPageFactory;

import java.util.List;

public class ConsultStep extends BaseClass {
    static final String mainUrl = "https://dnipro.ithillel.ua/";
    MainPageFactory mainPageFactory = PageFactory.initElements(driver, MainPageFactory.class);
    ConsultationFormPage consultationFormPage = PageFactory.initElements(driver, ConsultationFormPage.class);

    static {
        if (driver == null) {
            BaseClass.BeforParent();
        }
    }

    @Before()
    public void start() {
        if (!driver.getCurrentUrl().equals(mainUrl)) {
            driver.navigate().to(mainUrl);
        }
    }

    @When("I click consultation button")
    public void iClickConsultationButton() {
        mainPageFactory.consultButton.click();
    }

    @And("fill in the form")
    public void fillInTheForm(DataTable dataTable) {
        List<List<String>> data = dataTable.asLists(String.class);
        int line = 1;
        List<String> list = data.get(line);
        consultationFormPage.fillInForm(list.get(0), list.get(1), list.get(3), MASSAGER.TELEGRAM, list.get(5));

    }

    @Then("Check confirm button")
    public void checkConfirmButton() {
        Assert.assertFalse(consultationFormPage.isCunsultClickable());
    }
}
