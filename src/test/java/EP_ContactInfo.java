import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EP_ContactInfo extends PageObject{
    @FindBy(xpath = "/html/body/div/div/section/div/form/div[2]/h3")
    private WebElement findTextOnContactInfoPage;

    @FindBy(xpath = "//*[@id=\"email\"]")
    private WebElement emailInEmailField;

    @FindBy (xpath = "//*[@id=\"phone\"]")
    private WebElement phoneNumberInPhoneNumber;

    @FindBy(xpath = "//*[@id=\"country\"]")
    private WebElement countryNameInCountryField;

    @FindBy(xpath = "//*[@id=\"city\"]")
    private WebElement cityNameInCityField;

    @FindBy(xpath = "//*[@id=\"postCode\"]")
    private WebElement postalCodeInPostCodeField;

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[2]/button[2]")
    private WebElement nextButton;

    public EP_ContactInfo(WebDriver driver) {
        super(driver);
    }

    public void InsertEmailInEmailField(){
        this.emailInEmailField.sendKeys("mia@gmail.com");
    }

    public void InsertPhoneNumber(){
        this.phoneNumberInPhoneNumber.sendKeys("0721010101");
    }

    public void InsertCountryName () {
        this.countryNameInCountryField.sendKeys("Romania");
    }

    public void InsertCityName () {
        this.cityNameInCityField.sendKeys("Brasov");
    }

    public void InsertPostalCode (){
        this.postalCodeInPostCodeField.sendKeys("500030");
    }

    public void ClickNextButton (){
        nextButton.click();
    }
    public String getContactInformationHeader(){
        return this.findTextOnContactInfoPage.getText();
    }

    public void CompleteFieldsInContactInfo (){
        InsertEmailInEmailField();
        InsertPhoneNumber();
        InsertCountryName();
        InsertCityName();
        InsertPostalCode();
    }
}
