import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW2FireFoxBrowserassignment {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        try {
            Thread.sleep(2000);
            driver.manage().window().maximize();
            driver.get("https://www.syntaxprojects.com/");
            System.out.println("The title is:" + " " + driver.getTitle());
            Thread.sleep(2000);
            driver.getCurrentUrl();
            System.out.println("The current URL is:" + " " + driver.getCurrentUrl());
            Thread.sleep(3000);

        } catch (InterruptedException e) {


        } finally {

            driver.quit();
        }
    }

}

    //*Acceptance Criteria:
//1. The user should be able to launch a web browser and navigate to the URL `https://www.syntaxprojects.com/`.
//2. The user should be able to maximize the browser window
//2. The current URL should be printed on the console and match `https://www.syntaxprojects.com/`.
//3. The page title retrieved should be printed on the console and match `Syntax - Website to practice Syntax Automation Platform`.
//4. The browser should close automatically after retrieving both the URL and title.
