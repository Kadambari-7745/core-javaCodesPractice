package seleniumcode;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch {
    public static void main(String[] args) {
        
        System.setProperty("webdriver.chrome.driver",
                "/Users/kadambaridharkar/Downloads/chromedriver-mac-arm64/chromedriver");
        
        // --- ADD THESE TWO LINES TO SILENCE THE WARNINGS ---
        System.setProperty("webdriver.chrome.silentOutput", "true");
        java.util.logging.Logger.getLogger("org.openqa.selenium").setLevel(java.util.logging.Level.OFF);
//        // --------------------------------------------------
        
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://google.com");
//        
//        // Good practice to close the browser session when done
//        driver.quit(); 
    }
}
