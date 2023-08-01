package org.example;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.io.IOException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Utils extends BasePage

{

    public static String GetText (By by)
    {
       return driver.findElement(by).getText();
    }

    public void TypeText (By by, String text)
    {
        driver.findElement(by).sendKeys(text);
    }

    public void ClickonElement (By by)
    {
        driver.findElement(by).click();
    }

    public long timestamp()
    {

        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        return timestamp.getTime();
    }



    public static void selectbyValue(By by, String value)
    {
        Select select  =new Select(driver.findElement(by));
        select.selectByValue(value);

    }
    public static void selectBytext (By by,String text){
        Select select =new Select ( driver.findElement(by));
        select.selectByVisibleText(text);


    }
    public static void selectbyindex(By by,int index)
    {
        Select select= new Select(driver.findElement(by));
        select.selectByIndex(index);
    }

    public static String currentTimeStamp()
    {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyhhmmss");
        return sdf.format(date);
    }

    public static void Windowhandle ()

    {
        Alert alert = driver.switchTo().alert();
        String Mainwindow = driver.getWindowHandle();

    }



    public static void captureScreenshot(String fileName)
    {


        //Convert web driver object to TakeScreenshot
        TakesScreenshot scrShot = ((TakesScreenshot) driver);
        //Call getScreenshotAs method to create image file
        File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
        //Move image file to new destination
        File destFile = new File("src\\test\\Screenshots\\" + fileName + "" + currentTimeStamp() + ".png");

        //Copy file at destination
        try {
            FileUtils.copyFile(SrcFile, destFile );
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



}
