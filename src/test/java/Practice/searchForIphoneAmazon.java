package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class searchForIphoneAmazon
{
    @Test
    public void test()
    {
        WebDriver driver =new ChromeDriver();
        driver.get("https://www.google.com");
        String googleTitle = driver.getTitle();
        System.out.println(googleTitle);
        driver.close();



    }

}
