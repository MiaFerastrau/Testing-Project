import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LearnSelenium extends PageObject {
    @FindBy (xpath = "/html/body/h1")
    private WebElement seleniumPage;

    public LearnSelenium (WebDriver driver) {super(driver);}

    public String readSeleniumPage() {
        return this.seleniumPage.getText();
    }
}

