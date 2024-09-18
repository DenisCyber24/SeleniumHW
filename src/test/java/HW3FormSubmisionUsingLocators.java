import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class HW3FormSubmisionUsingLocators {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.syntaxprojects.com/locator-homework.php");

        WebElement fullNameField = driver.findElement(By.id("fullName"));
        fullNameField.sendKeys("Denis Kuc");

        WebElement emailField = driver.findElement(By.name("yourEmail"));
        emailField.sendKeys("deniskgmail.com");

        WebElement clientNameField = driver.findElement(By.id("clientNameId"));
        clientNameField.sendKeys("US ServAn");

        WebElement clientIdField = driver.findElement(By.id("ClientId"));
        clientIdField.sendKeys("44444");

        WebElement clientFeedBackField = driver.findElement(By.id("ClientfeedbackId"));
        clientFeedBackField.sendKeys("Good job buddy");

        WebElement projectNameField = driver.findElement(By.id("ProjectNameId"));
        projectNameField.sendKeys("GSH");

        WebElement projectDeadlineTimeField = driver.findElement(By.id("ProjectTimeId"));
        projectDeadlineTimeField.sendKeys("09/18/2024");

        WebElement currentAddressField = driver.findElement(By.id("CurrentAddressId"));
        currentAddressField.sendKeys("E14 Street/Kings Hwy,Brooklyn,NY");

        WebElement permanentAddressField = driver.findElement(By.id("PermanentAddressId"));
        permanentAddressField.sendKeys("Tampa,Florida");

        String email = emailField.getAttribute("value");
        if (!email.contains("@")) {

            System.out.println("Error: Invalid email format. The form cannot be submitted.Please enter valid e-mail");
        } else {

            WebElement submitButton = driver.findElement(By.id("btn-submit"));
            submitButton.click();
        }

        WebElement clickHereLink = driver.findElement(By.linkText("Click Here"));
        clickHereLink.click();

        String originalWindow = driver.getWindowHandle();
        for (String windowHandle : driver.getWindowHandles()) {
            if (!originalWindow.contentEquals(windowHandle)) {
                driver.switchTo().window(windowHandle);
                break;

            }
            }
        }
    }