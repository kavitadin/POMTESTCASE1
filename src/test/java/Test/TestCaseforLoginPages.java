package Test;

import Login.LoginPages;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCaseforLoginPages {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        //driver.manage().window().maximize();
        driver.get("https://www.rightmove.co.uk/");
        LoginPages lp  = new LoginPages(driver);

        lp.enterName("Apperley Bridge Station");

        lp.btn_click("To Sale");
        lp.btn_submit("Find Properties");
        }
             }


