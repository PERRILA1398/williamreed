package org.example;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Testsuite extends BaseTest
{
   HomePage homePage = new HomePage();
   WhatWeDoPage whatWeDoPage = new WhatWeDoPage ();

   @Test
   public void UserShouldBeAbleToGoOnWhatWeDoPage ()
   {

       homePage.ClickonWhatwedo();
   }

   public void UserShouldBeAbleToGoOnWhoarewePage()
   {

      homePage.Clickonwhoarewe();
   }

   @Test

   public void Usershouldbeabletoaddtheirdetails()
   {
      homePage.ClickonWhatwedo();
      whatWeDoPage.ContactusDetails();
   }
}
