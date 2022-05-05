import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

class PageLogin extends PageBase {
    private By nameInputBox = By.name("email");
    private By passwordInputBox = By.name("passwd");

    public PageLogin(WebDriver driver) {
        super(driver);
    }

    public PageDashboard login(String username, String password) {
        this.waitAndReturnElement(nameInputBox).sendKeys(username);
        this.waitAndReturnElement(passwordInputBox).sendKeys(password+"\n");
        return new PageDashboard(this.driver);
    }
}