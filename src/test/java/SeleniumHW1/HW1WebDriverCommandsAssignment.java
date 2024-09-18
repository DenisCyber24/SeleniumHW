package SeleniumHW1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW1WebDriverCommandsAssignment {
    public static void main(String[] args) throws InterruptedException {



        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
        Thread.sleep(3000);
        System.out.println("Google Page Title: " + driver.getTitle());

        driver.get("https://www.syntaxprojects.com/");
        Thread.sleep(3000);
        System.out.println("The title of the webpage is: " + driver.getTitle());

        driver.navigate().back();
        Thread.sleep(3000);
        driver.navigate().refresh();
        Thread.sleep(3000);
        driver.quit();
    }
}
