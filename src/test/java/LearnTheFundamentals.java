import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LearnTheFundamentals extends PageObject {
    @FindBy(xpath = "/html/body/h1")
    private WebElement fundamentalPage;

    public LearnTheFundamentals(WebDriver driver) {
        super(driver);
    }

    public String readFundamentalPage() {
        return this.fundamentalPage.getText();
    }
}