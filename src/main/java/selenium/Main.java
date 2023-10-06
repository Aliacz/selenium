package selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

    public static void main(String[] args) {
       ChromeDriver driver =  new ChromeDriver();
       driver.get("www.google.com");
    }

}
