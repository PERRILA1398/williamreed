package org.example;

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class DriverManager extends Utils
{

    public void OpenBrowser ()
        {
            driver = new ChromeDriver();
            driver.get("https://www.william-reed.com/?redir=true");
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        }

        public void CloseBrowser ()
        {
               driver.close();
        }

}
