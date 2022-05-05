import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageMultiple extends PageBase {
    private String pages[] = {"/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[1]/a",
                      "/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[2]/a",
                      "/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[3]/a"};
    
    public PageMultiple (WebDriver driver) {
        super(driver);
    }

    public PageMultiple pressMultiple(){

        for (int i = 0; i<pages.length; i++)
        {
            By pagePress = By.xpath(pages[i]);
            this.waitAndReturnElement(pagePress).click();
            System.out.println("The "+ (i+1) + " page in array of multiple pages");
        }
        return new PageMultiple(this.driver);
    }  
}
