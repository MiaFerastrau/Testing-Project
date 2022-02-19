import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Homepage extends PageObject {
    // Clasa nou creata Homepage mosteneste prop clasei parinte (Page object)
    //am deschis o clasa (Homepage)unde trebuie sa cream calea si metoda
    //cautam calea catre elementul pe care vreau sa il testez (cazul de fata Enrollment):


    @FindBy (xpath = "/html/body/section[1]/div/div/div/a")
    private WebElement startEnrollment;                    // ce element/tab vrem sa verificam

    public Homepage (WebDriver driver) {           //constructorul..care poarta numele clasei:
        super(driver);
    }

    public void ClickOnStartTheEnrollmentButton () {    //metoda (actiunea)
        this.startEnrollment.click();
    }

    @FindBy(xpath ="/html/body/section[3]/div/div/div[2]/div/div/a")
    private WebElement readMoreHybridButton;

    public void clickReadMoreHybridButton() {
        Utils.scrollToElement(driver, hybridText);
        this.readMoreHybridButton.click();
    }

    @FindBy(xpath= "/html/body/section[3]/div/div/div[2]/div/div/h3")
    private WebElement hybridText;



    @FindBy(xpath = "/html/body/section[3]/div/div/div[1]/div/div/a")
    private WebElement readMoreVirtualButton;

    public void clickReadMoreVirtualButton (){
        Utils.scrollToElement(driver,hybridText);
        this.readMoreVirtualButton.click();
    }

    @FindBy(xpath = "/html/body/section[3]/div/div/div[3]/div/div/a")
    private WebElement readMoreInPersonButton;

    public void clickReadMoreInPersonButton ()   {
        Utils.scrollToElement(driver,hybridText);
        this.readMoreInPersonButton.click();
    }

    @FindBy(xpath ="//*[@id=\"learn-fundamentals\"]/div/div/div[2]/h2")
    private WebElement learnFundamentalsText;

    @FindBy(xpath = "//*[@id=\"learn-fundamentals\"]/div/div/div[2]/a")
    private WebElement readMoreLearnTheFundamentalsButton;

    public void clickReadMoreLearnTheFudamentalsButton() {
        Utils.scrollToElement(driver,learnFundamentalsText);
        this.readMoreLearnTheFundamentalsButton.click();
    }

    @FindBy(xpath = "//*[@id=\"learn-selenium\"]/div/div/div[1]/a")
    private WebElement readMoreLearnSeleniumButton;

    @FindBy(xpath = "//*[@id=\"learn-selenium\"]/div/div/div[1]/h2")
    private WebElement learnSeleniumText;

    public void clickReadMoreLearnSeleniumButton (){
        Utils.scrollToElement(driver,learnSeleniumText);
        this.readMoreLearnSeleniumButton.click();
    }



}
