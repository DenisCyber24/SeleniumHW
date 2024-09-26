package SeleniumHW1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.print.Book;

public class HW5AdvanceXpathAssignment {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.syntaxprojects.com/advanceXpath-homework.php");
    Thread.sleep(3000);

        WebElement leastFavoriteBook= driver.findElement(By.xpath("//input[@class='form-control']"));
leastFavoriteBook.sendKeys("Mathematics");

WebElement middleFavoriteBook= driver.findElement(By.xpath("//*[@id='frm']/div/div/input[2]"));
middleFavoriteBook.sendKeys("Antidote to chaos");

WebElement favoriteBook= driver.findElement(By.xpath("//*[@id='least-favorite']"));
favoriteBook.sendKeys("Culinary Artistry");




WebElement favoriteBook1= driver.findElement(By.xpath("//*[@id='favouriteBook']"));
favoriteBook1.sendKeys("Culinary Artistry");

WebElement favoriteBook2= driver.findElement(By.xpath("//input[@id='favouriteBook']/following-sibling::input[1]"));
favoriteBook2.sendKeys("Kitchen Confidential");
//*[@id="frm"]/div/div/input[2]

WebElement favoriteBook3= driver.findElement(By.xpath("//input[@id='favouriteBook']/following-sibling::input[2]"));
favoriteBook3.sendKeys("Ma Cuisine Française");




WebElement grandparent= driver.findElement(By.xpath("//*[@id='familyTree']/input[1]"));
grandparent.sendKeys("This is Grand parent");

WebElement parent= driver.findElement(By.xpath("//*[@id='familyTree']/input[2]"));
parent.sendKeys("This is Parent");

WebElement child= driver.findElement(By.xpath("//*[@id='familyTree']/input[3]"));
child.sendKeys("This is Child");


        //driver.quit();




    }
}
   // Acceptance Criteria
//1.The user should enter the names of books in reverse order from least favorite to favorite using advanced Xpath (such as `parent`, `following-sibling`, or `preceding-sibling`).
        //2. The user should enter the name of their favorite book using advanced Xpath.
        //3. The user should enter the names of grandparent, parent, and child fields using advanced Xpath.
       // 4. The form should submit successfully only if all fields are filled out correctly using the appropriate advanced Xpath expressions.(to be removed)