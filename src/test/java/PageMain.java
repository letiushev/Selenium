import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

class PageMain extends PageBase {

    private By loginMenuButton = By.className("login");

    public PageMain(WebDriver driver) {
        super(driver);
        this.driver.get("http://automationpractice.com");
    }

    public PageLogin openLogin() {
        this.waitAndReturnElement(loginMenuButton).click();
        return new PageLogin(this.driver);
    }
}
