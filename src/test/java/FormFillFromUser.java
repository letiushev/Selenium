import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

class FormFillFromUser extends FormBase {
    private By nameInputBox = By.xpath("//*[@id='name']");
    private By formConfirm = By.xpath("/html/body/div/div[2]/div/div[3]/div[2]/div/div[1]/table/thead/tr/th[4]");

    public FormFillFromUser(WebDriver driver) {
        super(driver);
    }

    public FormFillFromUser fillFromUser(String data) {
        this.waitAndReturnElement(nameInputBox).sendKeys(data+"\n");
        return new FormFillFromUser(this.driver);
    }

    public String getFormConfirmFromUser() {
        return this.waitAndReturnElement(formConfirm).getText();
    }
}
