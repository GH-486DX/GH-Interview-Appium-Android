package com.gh486dx.actions;

import com.gh486dx.locators.ViewsLocators;
import com.gh486dx.utils.HelperClass;
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

}
