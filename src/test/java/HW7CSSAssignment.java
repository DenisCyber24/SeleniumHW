import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW7CSSAssignment {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://syntaxprojects.com/cssSelector-homework.php");
WebElement userId=driver.findElement(By.cssSelector("input[Id='UserID']"));
userId.sendKeys("denis24");

WebElement UserName= driver.findElement(By.cssSelector("input[id='UserName']"));
UserName.sendKeys("DenisK");

 WebElement lectureIntro=  driver.findElement(By.cssSelector("input[name='LectureIntro']"));
lectureIntro.sendKeys("Selenium");

WebElement feedbackRay=  driver.findElement(By.cssSelector("input[id='FeedbackFromRay']"));
        feedbackRay.sendKeys("Very useful");

WebElement feedbackDucky=  driver.findElement(By.cssSelector("input#FeedbackfromDucky"));
feedbackDucky.sendKeys("Great lecture");

WebElement clientId=  driver.findElement(By.cssSelector("input[name=ClientID]"));
clientId.sendKeys("RayID");

WebElement email=  driver.findElement(By.cssSelector("input[name='email']"));
email.sendKeys("dkuc@fssc");

WebElement courseTopic=  driver.findElement(By.cssSelector("input[name='CourseTopic']"));
courseTopic.sendKeys("Selenium 101");

driver.quit();

    }
}
