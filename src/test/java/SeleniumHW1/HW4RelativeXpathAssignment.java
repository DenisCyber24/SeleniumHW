package SeleniumHW1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.time.Instant;

public class HW4RelativeXpathAssignment {
    public static void main(String[] args) throws InterruptedException {

            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();

            driver.get("https://www.syntaxprojects.com/Xpath-homework.php");
            WebElement Hobbies=driver.findElement(By.xpath("//input[@id='yourHobbiesId']"));
            Hobbies.sendKeys("Boxing");

            WebElement clickHereButton = driver.findElement(By.xpath("//*[@id='display_text']"));
            clickHereButton.click();

            // 02 Validate the message "Button clicked:" is displayed on the screen
            WebElement buttonClickedMessage = driver.findElement(By.xpath("//p[normalize-space()='Button Clicked']"));
            if (buttonClickedMessage.isDisplayed()) {
                    System.out.println("Button clicked message is displayed.");
            } else {
                    System.out.println("Button clicked message is not displayed.");
            }

            // 04. Use contains() method in XPath to locate a specific text element and print it to the console
            WebElement specificText = driver.findElement(By.xpath("//label[contains(text(),'Lorem ipsum dolor sit amet consectetur adipisicing')]"));
            System.out.println("Found text: " + specificText.getText());

        Thread.sleep(4000);

        WebElement favoriteMovies=driver.findElement(By.xpath("//input[@id='favoriteMoviesId']"));
        favoriteMovies.sendKeys("Forest Gump");

        WebElement paragraph=driver.findElement(By.xpath(" //label[contains(text(),'Lorem ')]"));
        String textOfString=paragraph.getText();
        System.out.println(textOfString);

        WebElement yourCity=driver.findElement(By.xpath("//input[@id='yourCity']"));
        yourCity.sendKeys("Tarpon Springs");////input[@id="yourCity"]

        WebElement pEmail=driver.findElement(By.xpath("(//input[@id='PersonalEmailID'])[1]"));
        pEmail.sendKeys("dkucfccs@gmail.com");

        WebElement oEmail=driver.findElement(By.xpath(" (//input[@name='OfficeEmail'])[1]"));
        oEmail.sendKeys("dkucfssc@gmail.com");

        WebElement proEmail=driver.findElement(By.xpath("(//input[@id='ProfessionalEmailID'])[1]"));
        proEmail.sendKeys("pro@gmail.com");

        WebElement clientName=driver.findElement(By.xpath("//input[@data-detail='one' and @class='form-control']"));
        clientName.sendKeys("JoeSmith");

        WebElement clientId=driver.findElement(By.xpath("//input[@name='clientId' and @id='clientId']"));
        clientId.sendKeys("JohnSmith123");

        WebElement streetNumber=driver.findElement(By.xpath("//input[@name='StreetNo']"));
        streetNumber.sendKeys(" Bowery");

        WebElement houseNumber=driver.findElement(By.xpath("//input[@name='HouseNo']"));
        houseNumber.sendKeys("241");


    }
}












   // Acceptance Criteria:
      //  1. The user is able to enter their hobbies using XPath.
       // 2. When the user clicks the "Click Here" button using XPath.,
       // Then the message `"Button clicked:"` should be displayed on the screen.
       // 3. The user successfully enters their favorite movie using XPath to find the text boxes.
       // 4. The user uses the `contains()` method of XPath to locate a specific text element on the page and prints it to the console.
        //5. The user is able to enter the city in the designated field.
        //6. The user must use the **indexing technique** learned in class to enter  email addresses.
        //7. The user must use the **operators technique** (e.g., `and`, `or`) to enter both the client name and client ID.
        //8. The user can use **any XPath technique** to enter the street number and house number.



