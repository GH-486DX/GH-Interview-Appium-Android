package com.gh486dx.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContentLocators {

    @FindBy(xpath = "//android.widget.TextView[@content-desc=\"Content\"]")
    public WebElement contentCTA;

    @FindBy(xpath = "//android.widget.TextView[@content-desc=\"Assets\"]")
    public WebElement assetsCTA;

    @FindBy(xpath = "//android.widget.TextView[@content-desc=\"Read Asset\"]")
    public WebElement readAssetCTA;

    @FindBy(xpath = "//android.widget.TextView[@text=\"Content/Assets/Read Asset\"]")
    public WebElement readAssetPageTitle;

    @FindBy(xpath = "//android.widget.TextView[@resource-id=\"io.appium.android.apis:id/text\"]")
    public WebElement rawTextAsset;

    @FindBy(xpath = "//android.widget.TextView[@content-desc=\"Resources\"]")
    public WebElement resourcesCTA;

    @FindBy(xpath = "//android.widget.TextView[@content-desc=\"Styled Text\"]")
    public WebElement styledTextCTA;

    @FindBy(xpath = "//android.widget.TextView[@text=\"Content/Resources/Styled Text\"]")
    public WebElement styledTextPageTitle;

    @FindBy(xpath = "//android.widget.TextView[@resource-id=\"io.appium.android.apis:id/text\"]")
    public WebElement styledText;

}