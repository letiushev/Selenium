import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

public class PageDashboard extends PageBase {
    private By cardBy = By.xpath("/html/body/div/div[2]/div/div[3]/div/h1");
    public PageDashboard(WebDriver driver) {
        super(driver);
    }
    
    public String getMainPageTitle() {
        return this.waitAndReturnElement(cardBy).getText();
    }
    
}
