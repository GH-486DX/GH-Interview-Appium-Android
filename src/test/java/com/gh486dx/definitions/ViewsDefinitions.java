package com.gh486dx.definitions;

import com.gh486dx.actions.ViewsActions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class ViewsDefinitions {

    final ViewsActions objViews = new ViewsActions();

    @Given("User clicks the Views CTA")
    public void userClicksTheViewsCTA() {
        objViews.clickViewsCTA();
    }

    @When("User clicks the Gallery CTA")
    public void userClicksTheGalleryCTA() {
        objViews.clickGalleryCTA();
    }

    @And("User clicks the Photos CTA")
    public void userClicksThePhotosCTA() {
        objViews.clickPhotosCTA();
    }

    @Then("User can see the Photos screen")
    public void userCanSeeThePhotosScreen() {
        Assert.assertTrue(objViews.getPhotosPageTitle());
    }

    @And("User can see a photo gallery image")
    public void userCanSeeAPhotoGalleryImage() {
        Assert.assertTrue(objViews.getGalleryImage());
    }
}