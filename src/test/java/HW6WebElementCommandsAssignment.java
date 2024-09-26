import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW6WebElementCommandsAssignment {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://syntaxprojects.com/selenium_commands_selector-homework.php");

        WebElement element = driver.findElement(By.xpath("//*[@id='textattr']"));
        String text = element.getText();
        System.out.println(text);
        WebElement radioButton= driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div[2]/form/div/label[1]"));
       boolean stateOfRadioB=radioButton.isEnabled();
       boolean stateofRB=radioButton.isSelected();
       if(radioButton.isEnabled())
        System.out.println("The radio button Music Festival is enabled");
       else
           System.out.println("The radio button Music Festival is disabled");
        radioButton.click();
       stateofRB=radioButton.isSelected();

       WebElement radioButton2= driver.findElement(By.xpath("//input[@value='tech_talk']"));
       boolean stateOfradioButton2=radioButton.isEnabled();
        if(radioButton2.isEnabled())
        System.out.println("radio Button Tech Talk is enabled");
        else
        System.out.println("Radio button Tech Talk is disabled");


        WebElement ShowMoreB= driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div[2]/form/div/button"));
        Thread.sleep(4000);
        ShowMoreB.isDisplayed();
        ShowMoreB.click();

        WebElement artExhibitionButton= driver.findElement(By.xpath("//input[@value='art_exhibition']"));
        artExhibitionButton.click();

        WebElement mysteryMsg= driver.findElement(By.xpath("//*[@id='hidden_message']"));
        mysteryMsg.getAttribute("title");
        System.out.println(mysteryMsg.getAttribute("title"));

        WebElement checkBox1= driver.findElement(By.xpath("//input[@value='CheckboxFirst']"));
        boolean stateOfcheckBox1=checkBox1.isEnabled();
        if(checkBox1.isEnabled())
            System.out.println("Check Box 1 is enabled");
        else
            System.out.println("Check Box 1 is disabled");
        Thread.sleep(3000);
        checkBox1.click();


        WebElement checkBox2= driver.findElement(By.xpath("//input[@value='disabledCheckbox']"));
        boolean stateOfcheckBox2=checkBox1.isEnabled();
        if(checkBox2.isEnabled())

            System.out.println("Check Box 2 is enabled");
        else
            System.out.println("Check Box 2 is disabled");
        Thread.sleep(3000);

       WebElement inputField=driver.findElement(By.xpath("//input[@id='inputField']"));
       inputField.clear();
        Thread.sleep(3000);
       inputField.sendKeys("here is the custom text entered");
        Thread.sleep(5000);

driver.quit();






    }
}
