package org.example;

import org.openqa.selenium.By;

public class WhatWeDoPage extends Utils
{
    By _Contactus = By.xpath("(//a[@class= 'button']) [1]");
    By _AddFirstname = By.xpath("//input[@name='input_6']");
    By _AddLastname = By.xpath("//input[@name='input_7']");
    By _Email = By.xpath("//input[@name='input_1']");
    By _Brandname = By.xpath("//input[@name='input_11']");
    By  _Message = By.xpath("//textarea[@name='input_4']");
    By _Consent = By.xpath("//input[@name='input_8.1']");
    public void ContactusDetails ()
    {
        ClickonElement(_Contactus);
        TypeText(_AddFirstname, "Tester");
        TypeText(_AddLastname, "Practice");
        TypeText(_Email, "tester" + timestamp()+ "@gmail.com");
        TypeText(_Brandname, "Interview");
        TypeText(_Message, "Interview Practice");
        ClickonElement(_Consent);
    }
}
