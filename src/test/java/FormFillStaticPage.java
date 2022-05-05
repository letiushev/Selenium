import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

class FormFillStaticPage extends FormBase {
    private By nameInputBox = By.xpath("//*[@id='search_query_top']");
    private By formConfirm = By.xpath("/html/body/div/div[2]/div/div[3]/div[2]/h1");

    public FormFillStaticPage(WebDriver driver) {
        super(driver);
    }

    public FormFillStaticPage fill(String data) {
        this.waitAndReturnElement(nameInputBox).sendKeys(data+"\n");
        return new FormFillStaticPage(this.driver);
    }

    public String getFormConfirm() {
        return this.waitAndReturnElement(formConfirm).getText();
    }
}
