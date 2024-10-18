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

    @FindBy(xpath = "//android.widget.TextView[@content-desc=\"Search View\"]")
    public WebElement searchViewCTA;

    @FindBy(xpath = "//android.widget.TextView[@content-desc=\"Filter\"]")
    public WebElement filterCTA;

    @FindBy(xpath = "//android.widget.TextView[@resource-id=\"android:id/action_bar_title\"]")
    public WebElement filterPageTitle;

    @FindBy(xpath = "//android.widget.AutoCompleteTextView[@resource-id=\"android:id/search_src_text\"]")
    public WebElement filterTextInput;

    @FindBy(xpath = "//android.widget.TextView[@resource-id=\"android:id/text1\" and @text=\"Ackawi\"]")
    public WebElement filterListItemAckawi;

    @FindBy(xpath = "//android.widget.TextView[@resource-id=\"android:id/text1\" and @text=\"Acorn\"]")
    public WebElement filterListItemAcorn;

}
