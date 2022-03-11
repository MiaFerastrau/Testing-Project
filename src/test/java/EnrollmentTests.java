import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class EnrollmentTests {
    protected static final WebDriver driver = new ChromeDriver();

    @BeforeSuite
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", Utils.CHROME_DRIVER_LOCATION);
    }

    @Test(testName = "Verify functionality for Start the Enrollment Button")
    public void ClickOnStartTheEnrollmentButton () {
        driver.get(Utils.BASE_URL);
        Homepage webForm = new Homepage(driver);
        webForm.ClickOnStartTheEnrollmentButton();
        EP_PersonalInfo personalInfo = new EP_PersonalInfo(driver);
        Assert.assertEquals(personalInfo.getPersonalInfoHeader(), "Personal information");
    }

    @Test(testName = "Verify Personal Info Field ")
    public void PositivePersonalInfoCompletion () {
        driver.get(Utils.BASE_URL);
        Homepage webForm = new Homepage(driver);
        webForm.ClickOnStartTheEnrollmentButton();
        EP_PersonalInfo personalInfo = new EP_PersonalInfo(driver);
        personalInfo.CompleteFieldInPersonalInfo();
        Utils.waitForElementToLoad(1);
        personalInfo.clickNextButtonPI();
        Utils.waitForElementToLoad(1);
        EP_ContactInfo contactInfo = new EP_ContactInfo(driver);
        Assert.assertEquals(contactInfo.getContactInformationHeader() , "Contact information");
    }

    @Test (testName = "Verify Contact Info Field")
    public void PositiveContactInfoCompletion () {
        driver.get(Utils.BASE_URL);
        Homepage webForm = new Homepage(driver);
        webForm.ClickOnStartTheEnrollmentButton();
        EP_PersonalInfo personalInfo = new EP_PersonalInfo(driver);
        personalInfo.CompleteFieldInPersonalInfo();
        Utils.waitForElementToLoad(1);
        personalInfo.clickNextButtonPI();
        Utils.waitForElementToLoad(1);

        EP_ContactInfo contactInfo = new EP_ContactInfo(driver);
        contactInfo.CompleteFieldsInContactInfo();
        contactInfo.ClickNextButton();

        EP_CourseOptions courseOptions = new EP_CourseOptions(driver);
        Assert.assertEquals(courseOptions.getCourseOptionsHeader(),"Course options");
    }

    @Test(testName = "Select Desired Course")
    public void SelectDesiredCourse () {
        driver.get(Utils.BASE_URL);
        Homepage webForm = new Homepage(driver);
        webForm.ClickOnStartTheEnrollmentButton();
        EP_PersonalInfo personalInfo = new EP_PersonalInfo(driver);
        personalInfo.CompleteFieldInPersonalInfo();
        Utils.waitForElementToLoad(1);
        personalInfo.clickNextButtonPI();
        Utils.waitForElementToLoad(1);

        EP_ContactInfo contactInfo = new EP_ContactInfo(driver);
        contactInfo.CompleteFieldsInContactInfo();
        contactInfo.ClickNextButton();

        EP_CourseOptions courseOptions = new EP_CourseOptions(driver);
        courseOptions.selectThirdCourse();
        courseOptions.clickNext();
        Utils.waitForElementToLoad(1);

        EP_PaymentInformation paymentInformation = new EP_PaymentInformation(driver);
        Assert.assertEquals(paymentInformation.getPaymentInformationHeader(), "Payment information");
    }

    @Test(testName = "Verify Payment information")
    public void CardDetailsCompletion (){
        driver.get(Utils.BASE_URL);
        Homepage webForm = new Homepage(driver);
        webForm.ClickOnStartTheEnrollmentButton();

        EP_PersonalInfo personalInfo = new EP_PersonalInfo(driver);
        personalInfo.CompleteFieldInPersonalInfo();
        Utils.waitForElementToLoad(1);
        personalInfo.clickNextButtonPI();
        Utils.waitForElementToLoad(1);

        EP_ContactInfo contactInfo = new EP_ContactInfo(driver);
        contactInfo.CompleteFieldsInContactInfo();
        contactInfo.ClickNextButton();

        EP_CourseOptions courseOptions = new EP_CourseOptions(driver);
        courseOptions.selectThirdCourse();
        courseOptions.clickNext();
        Utils.waitForElementToLoad(1);

        EP_PaymentInformation paymentInformation = new EP_PaymentInformation(driver);
        paymentInformation.CompleteCardDetails();
        Utils.waitForElementToLoad(1);
        EP_RegistrationConfirmation registrationConfirmation = new EP_RegistrationConfirmation(driver);
        Assert.assertEquals(registrationConfirmation.getSuccessHeader(),"Success!");

    }



    @AfterSuite
    public static void cleanUp() {
        driver.manage().deleteAllCookies();
        driver.quit();
    }
}
