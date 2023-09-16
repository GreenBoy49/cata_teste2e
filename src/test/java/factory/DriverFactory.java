package factory;


import org.openqa.selenium.*;

import org.openqa.selenium.chrome.*;


public class DriverFactory {
    public static WebDriver driver;
    public DriverFactory() {
    }
    public  void initialize(){
        if( driver==null){
            driver = new ChromeDriver();
            driver.manage().window().maximize();
        }
    }

    public void destroyDriver(){
         driver.quit();
         driver=null;
    }

}
