import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ButtonLogout extends ButtonBase {
    private By buttonPath = By.xpath("/html/body/div/div[1]/header/div[2]/div/div/nav/div[2]/a");

    public ButtonLogout (WebDriver driver) {
        super(driver);
    }

    public ButtonLogout press() {
        this.waitAndReturnElement(buttonPath).click();
        return new ButtonLogout(this.driver);
    }

    public String getButtonConfirm() {
        return this.waitAndReturnElement(buttonPath).getText();
    }
}
