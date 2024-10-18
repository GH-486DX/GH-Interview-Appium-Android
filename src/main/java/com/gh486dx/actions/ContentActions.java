package com.gh486dx.actions;

import com.gh486dx.locators.ContentLocators;
import com.gh486dx.utils.HelperClass;
import org.openqa.selenium.support.PageFactory;

public class ContentActions {

    final ContentLocators contentLocators;

    public ContentActions() {
        this.contentLocators = new ContentLocators();
        PageFactory.initElements(HelperClass.getAndroidDriver(), contentLocators);
    }

    // Click Content CTA
    public void clickContentCTA() {
        contentLocators.contentCTA.click();
    }

    // Click Assets CTA
    public void clickAssetsCTA() {
        contentLocators.assetsCTA.click();
    }

    // Click Read Asset CTA
    public void clickReadAssetCTA() {
        contentLocators.readAssetCTA.click();
    }

    // Verify Read Asset screen
    public boolean getReadAssetPageTitle() {
        return contentLocators.readAssetPageTitle.isDisplayed();
    }

    // Verify raw text asset appears
    public boolean getRawText() {
        return contentLocators.rawTextAsset.isDisplayed();
    }

    // Return raw text value
    public String getRawTextValue() {
        return contentLocators.rawTextAsset.getText();
    }

    // Click Resources CTA
    public void clickResourcesCTA() {
        contentLocators.resourcesCTA.click();
    }

    // Click Styled Text CTA
    public void clickStyledTextCTA() {
        contentLocators.styledTextCTA.click();
    }

    // Verify Styled Text screen
    public boolean getStyledTextPageTitle() {
        return contentLocators.styledTextPageTitle.isDisplayed();
    }

    // Verify Styled Text appears
    public boolean getStyledText() {
        return contentLocators.styledText.isDisplayed();
    }

    // Return Styled Text value
    public String getStyledTextValue() {
        return contentLocators.styledText.getText();
    }

}
