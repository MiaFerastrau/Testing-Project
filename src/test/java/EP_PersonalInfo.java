import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EP_PersonalInfo extends PageObject {
    @FindBy(xpath = "/html/body/div/div/section/div/form/div[1]/h3")
    private WebElement findTextOnPersonalInfoPage;

    @FindBy(xpath = "//*[@id=\"firstName\"]")
    private WebElement textInFirstNameFiled;

    @FindBy(xpath = "//*[@id=\"lastName\"]")
    private WebElement textInLastNameField;

    @FindBy(xpath = "//*[@id=\"username\"]")
    private WebElement textInUserNameFiled;

    @FindBy(xpath = "//*[@id=\"password\"]")
    private WebElement textInPasswordFiled;

    @FindBy(xpath = "//*[@id=\"cpassword\"]")
    private WebElement textInConfirmPasswordFiled;

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[1]/button")
    private WebElement nextButtonPersonalInfo;

    public EP_PersonalInfo(WebDriver driver) {
        super(driver);
    }
    public void InsertTextInFirstNameFiled (){
        this.textInFirstNameFiled.sendKeys("Mia");
    }
    public void InsertTextInLastNameField (){
        this.textInLastNameField.sendKeys("Ferastrau");

    }

    public void InstertTextInUserNameFiled (){
        this.textInUserNameFiled.sendKeys("Miaaaa");
    }

    public void InsertTextInPasswordFiled (){
        this.textInPasswordFiled.sendKeys ("123");
    }

    public void InsertTextInConfirmPassword (){
        this.textInConfirmPasswordFiled.sendKeys("123");
    }

    public void clickNextButtonPI () {
        this.nextButtonPersonalInfo.click();
    }

    public String getPersonalInfoHeader(){
        return this.findTextOnPersonalInfoPage.getText();
    }

    public void CompleteFieldInPersonalInfo() {
        InsertTextInFirstNameFiled();
        InsertTextInLastNameField();
        InstertTextInUserNameFiled();
        InsertTextInPasswordFiled();
        InsertTextInConfirmPassword();
    }
}
