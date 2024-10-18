package com.gh486dx.actions;

import com.gh486dx.locators.ViewsLocators;
import com.gh486dx.utils.HelperClass;
import com.google.common.collect.ImmutableMap;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;

public class ViewsActions {

    final ViewsLocators viewsLocators;

    public ViewsActions() {
        this.viewsLocators = new ViewsLocators();
        PageFactory.initElements(HelperClass.getAndroidDriver(), viewsLocators);
    }

    // Click Views CTA
    public void clickViewsCTA() {
        viewsLocators.viewsCTA.click();
    }

    // Click Gallery CTA
    public void clickGalleryCTA() {
        viewsLocators.galleryCTA.click();
    }

    // Click Photos CTA
    public void clickPhotosCTA() {
        viewsLocators.photosCTA.click();
    }

    // Verify Photos screen appears
    public boolean getPhotosPageTitle() {
        return viewsLocators.photosPageTitle.isDisplayed();
    }

    // Verify photo gallery image appears
    public boolean getGalleryImage() {
        return viewsLocators.galleyPhoto.isDisplayed();
    }

    // Click Search Views CTA
    public void clickSearchViewsCTA() throws InterruptedException {
        for (int i = 0; i < 2; i++) {
            ((JavascriptExecutor) HelperClass.getAndroidDriver()).executeScript("mobile: swipeGesture", ImmutableMap.of(
                    "left", 100, "top", 100,
                    "width", 200, "height", 200,
                    "direction", "up", "percent", 0.85
            ));
            Thread.sleep(1500);
        }
        viewsLocators.searchViewCTA.click();
    }

    // Click Filter CTA
    public void clickFilterCTA() {
        viewsLocators.filterCTA.click();
    }

    // Verify Filters screen appears
    public boolean getFiltersPageTitle() {
        return viewsLocators.filterPageTitle.isDisplayed();
    }

    // Type a filter term
    public void typeFilter(String inputText) {
        viewsLocators.filterTextInput.sendKeys(inputText);
    }

    // Verify Filter List Item Ackawi appears
    public boolean getFiltersListItemAckawi() {
        return viewsLocators.filterListItemAckawi.isDisplayed();
    }

    // Verify Filter List Item Acorn appears
    public boolean getFiltersListItemAcorn() {
        return viewsLocators.filterListItemAcorn.isDisplayed();
    }

}
