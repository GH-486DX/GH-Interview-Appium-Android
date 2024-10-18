package com.gh486dx.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AnimationLocators {

    @FindBy(xpath = "//android.widget.TextView[@content-desc=\"Animation\"]")
    public WebElement animationCTA;

    @FindBy(xpath = "//android.widget.TextView[@content-desc=\"Default Layout Animations\"]")
    public WebElement defaultLayoutAnimationsCTA;

    @FindBy(xpath = "//android.widget.TextView[@text=\"Animation/Default Layout Animations\"]")
    public WebElement defaultLayoutAnimationsPageTitle;

    @FindBy(xpath = "//android.widget.Button[@content-desc=\"Add Button\"]")
    public WebElement addButtonCTA;

    @FindBy(xpath = "//android.widget.Button[@text=\"4\"]")
    public WebElement fourthAddedButton;

}
