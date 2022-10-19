package Login;

import jdk.jfr.Name;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPages {
    private WebDriver driver;
    private By txt_name = By.name("typeAheadInputField");
    private By btn_click = By.linkText("button class");

    private By btn_submit = By.id("submit");

    public LoginPages(WebDriver driver) {
        this.driver = driver;

    }

    public void enterName(String name) {
        driver.findElement(txt_name).sendKeys("Apperley Bridge Station");
    }

    public void btn_click(String click){
        driver.findElement(btn_click).click();
    }


    public void btn_submit (String submit) {
        driver.findElement(btn_submit).click();
    }

    }

