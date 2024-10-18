package com.gh486dx.actions;

import com.gh486dx.locators.AnimationLocators;
import com.gh486dx.utils.HelperClass;
import org.openqa.selenium.support.PageFactory;

public class AnimationActions {

    final AnimationLocators animationLocators;

    public AnimationActions() {
        this.animationLocators = new AnimationLocators();
        PageFactory.initElements(HelperClass.getAndroidDriver(), animationLocators);
    }

    // Click Animation CTA
    public void clickAnimationCTA() {
        animationLocators.animationCTA.click();
    }

    // Click Default Layout Animations CTA
    public void clickDefaultLayoutAnimationsCTA() {
        animationLocators.defaultLayoutAnimationsCTA.click();
    }

    // Verify Default Layout Animations screen
    public boolean getDefaultLayoutAnimationsPageTitle() {
        return animationLocators.defaultLayoutAnimationsPageTitle.isDisplayed();
    }

    // Click Add Button CTA
    public void clickAddButtonCTA() throws InterruptedException {
        animationLocators.addButtonCTA.click();
        Thread.sleep(500);
    }

    // Verify new button appears
    public boolean getFourthButton() {
        return animationLocators.fourthAddedButton.isDisplayed();
    }

}
