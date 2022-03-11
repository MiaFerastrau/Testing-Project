import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class HomePageTests {
    protected static final WebDriver driver = new ChromeDriver();

    @BeforeSuite
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", Utils.CHROME_DRIVER_LOCATION);
    }


    @Test(testName = "Read Hybrid details")
    public void readHybridLearningDetails(){
        driver.get(Utils.BASE_URL);
        Homepage webForm = new Homepage(driver);
        webForm.clickReadMoreHybridButton();
        Hybrid form = new Hybrid(driver);
        Assert.assertEquals(form.readHybridHeader(),Constants.HYBRID_HEADER);
    }


    @Test(testName = "Read Virtual details")
    public void readVirtualLearningDetails(){
        driver.get(Utils.BASE_URL);
        Homepage webForm = new Homepage(driver);
        webForm.clickReadMoreVirtualButton();
        Virtual form = new Virtual(driver);
        Assert.assertEquals(form.readVirtualHeader(),Constants.VIRTUAL_HEADER);
    }

    @Test(testName = "Read InPerson details")
    public void readInPersonLearningDetails (){
        driver.get(Utils.BASE_URL);
        Homepage webForm = new Homepage(driver);
        webForm.clickReadMoreInPersonButton();
        InPerson form = new InPerson(driver);
        Assert.assertEquals(form.readInPersonHeader(), Constants.IN_PERSON_HEADER);
    }

    @Test(testName = "Read Learn The Fundamentals")
    public void readLearnTheFudamentalsDetails () {
        driver.get(Utils.BASE_URL);
        Homepage webForm = new Homepage(driver);
        Utils.waitForElementToLoad(3);
        webForm.clickReadMoreLearnTheFudamentalsButton();
        LearnTheFundamentals form = new LearnTheFundamentals(driver);
        Assert.assertEquals(form.readFundamentalPage(),Constants.FUNDAMENTALS_PAGE);
    }

    @Test(testName = "Read Learn Selenium")  //!! Learn Selenium duce la Fundamentals !!site bug!
    public void readLearnSeleniumDetails (){
        driver.get(Utils.BASE_URL);
        Homepage webForm  = new Homepage(driver);
        webForm.clickReadMoreLearnSeleniumButton();
        LearnSelenium form = new LearnSelenium(driver);
        Assert.assertEquals(form.readSeleniumPage (),Constants.LEARN_SELENIUM);
    }

    @Test (testName = "Verify functionality for Up Arrow Button")
    public void clickUpArrowButton (){
        driver.get(Utils.BASE_URL);
        Homepage webForm  = new Homepage(driver);
        webForm.clickUpArrowButton();
        Assert.assertEquals(webForm.findBecomeCertifiedText(),"Become a Certified Software Tester");
    }

    @AfterSuite
    public static void cleanUp() {
        driver.manage().deleteAllCookies();
        driver.quit();
    }
}
