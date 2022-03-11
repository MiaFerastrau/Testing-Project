import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EP_CourseOptions extends PageObject{
    @FindBy(xpath = "/html/body/div/div/section/div/form/div[3]/h3")
    private WebElement findTextOnCourseOptionsPage;

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[3]/div[3]/label")
    private WebElement clickAutomation_ManualAutomation;

    @FindBy (xpath = "/html/body/div/div/section/div/form/div[3]/button[2]")
    private WebElement NextButton;

    public EP_CourseOptions (WebDriver driver){
        super(driver);
    }

    public String getCourseOptionsHeader(){
        return this.findTextOnCourseOptionsPage.getText();
    }

     public void selectThirdCourse (){
        clickAutomation_ManualAutomation.click();
     }

     public void clickNext (){
        NextButton.click();
     }

}
