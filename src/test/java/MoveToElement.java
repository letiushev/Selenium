import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MoveToElement extends ButtonBase {
    protected WebDriver driver;
    protected WebDriverWait wait;
    private By hoverElement = By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[1]/ul/li[1]/a");
    private By bodyLocator = By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[1]/a");
    WebElement elementLink = this.waitAndReturnElement(bodyLocator);

    
    public MoveToElement (WebDriver driver) {
        super(driver);
    }

    public String hover(){
        Actions actionProvider = new Actions(this.driver);
        actionProvider.moveToElement(elementLink).build().perform();
        return this.waitAndReturnElement(hoverElement).getText();
    }
}
