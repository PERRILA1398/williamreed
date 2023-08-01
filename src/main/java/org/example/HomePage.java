package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.function.Function;

public class HomePage extends Utils
{
    By _Whatwedo = By.xpath("(//a [@href='https://www.william-reed.com/what-we-do/']) [1]");
    By _Whoarewe = By.xpath("(//a [@href='https://www.william-reed.com/who-we-are/'] ) [1]");
    public void ClickonWhatwedo ()
    {
       WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
       wait.until(ExpectedConditions.elementToBeClickable(_Whatwedo));
        ClickonElement(_Whatwedo);
    }

    public void Clickonwhoarewe ()
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(_Whoarewe));
        ClickonElement(_Whoarewe);
    }
}
