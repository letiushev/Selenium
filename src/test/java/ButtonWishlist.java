import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

class ButtonWishlist extends ButtonBase {
    private By buttonPath = By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div[2]/ul/li/a/span");

    public ButtonWishlist (WebDriver driver) {
        super(driver);
    }

    public ButtonWishlist press() {
        this.waitAndReturnElement(buttonPath).click();
        return new ButtonWishlist(this.driver);
    }

    public String getButtonConfirm() {
        return this.waitAndReturnElement(buttonPath).getText();
    }
}    
