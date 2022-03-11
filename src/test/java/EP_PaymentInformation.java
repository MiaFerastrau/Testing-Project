import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EP_PaymentInformation extends PageObject{
    @FindBy (xpath = "/html/body/div/div/section/div/form/div[4]/h3")
    private WebElement findTextOnPaymentInformationPage;

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[4]/div[2]/input")
    private WebElement nameInputInCardholderName;

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[4]/div[3]/div/div[1]/input" )
    private WebElement cardNumberInput;

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[4]/div[3]/div/div[2]/input")
    private WebElement CVCNumberInput;

    @FindBy(xpath = "//*[@id=\"month\"]/option[6]")
    private WebElement selectMay;

    @FindBy(xpath = "//*[@id=\"year\"]/option[7]")
    private WebElement select2026;

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[4]/div[4]/button[2]")
    private WebElement nextButton;


    public EP_PaymentInformation (WebDriver driver){
        super(driver);
    }

    public String getPaymentInformationHeader(){
        return this.findTextOnPaymentInformationPage.getText();
    }
    public void InputNameInCardholderName (){
        this.nameInputInCardholderName.sendKeys("Mia F");
    }

    public void InputCardNumber (){
        this.cardNumberInput.sendKeys("1234");
    }

    public void InputCVC (){
        this.CVCNumberInput.sendKeys("123");
    }

    public void SelectMonth (){
        this.selectMay.click();
    }

    public void SelectYear (){
        this.select2026.click();
    }

    public void ClickNextButton (){
        nextButton.click();
    }

    public void CompleteCardDetails (){
        InputNameInCardholderName();
        InputCardNumber();
        InputCVC();
        SelectMonth();
        SelectYear();
        ClickNextButton();
    }
}
