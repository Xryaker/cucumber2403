package runers;

import conf.BaseClass;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/main/java/features",//path to feature files
        glue = "step",//package path
        tags = "@Positive",//list feature files for run
        publish = true
)
public class FirstRuner {
    @BeforeClass
    public static void starT() {
        System.setProperty("CUCUMBER_PUBLISH_TOKEN", "20f2f8a8-9ad6-4421-82a2-7258663c1472");
        BaseClass.BeforParent();
    }

    @AfterClass
    public static void enD() throws InterruptedException {
        BaseClass.afterParent();
    }

}
