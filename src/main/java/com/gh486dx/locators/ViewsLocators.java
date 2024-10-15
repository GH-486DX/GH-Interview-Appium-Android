package com.gh486dx.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ViewsLocators {

    @FindBy(xpath = "//android.widget.TextView[@content-desc=\"Views\"]")
    public WebElement viewsCTA;

    @FindBy(xpath = "//android.widget.TextView[@content-desc=\"Gallery\"]")
    public WebElement galleryCTA;

    @FindBy(xpath = "//android.widget.TextView[@content-desc=\"1. Photos\"]")
    public WebElement photosCTA;

    @FindBy(xpath = "//android.widget.TextView[@text=\"Views/Gallery/1. Photos\"]")
    public WebElement photosPageTitle;

    @FindBy(xpath = "//android.widget.Gallery[@resource-id=\"io.appium.android.apis:id/gallery\"]/android.widget.ImageView[1]")
    public WebElement galleyPhoto;

}