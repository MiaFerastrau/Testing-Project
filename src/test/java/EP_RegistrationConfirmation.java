import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EP_RegistrationConfirmation extends PageObject{
    @FindBy (xpath = "/html/body/div/div/section/div/form/div[5]/h3")
    private WebElement findTextOnConfirmationPage;

    public EP_RegistrationConfirmation (WebDriver driver) {super(driver);}


    public String getSuccessHeader (){return this.findTextOnConfirmationPage.getText();}
}
