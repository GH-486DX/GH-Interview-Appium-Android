package com.gh486dx.definitions;

import com.gh486dx.actions.ContentActions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class ContentDefinitions {

    final ContentActions objContent = new ContentActions();

    @Given("User clicks the Content CTA")
    public void userClicksTheContentCTA() {
        objContent.clickContentCTA();
    }

    @When("User clicks the Assets CTA")
    public void userClicksTheAssetsCTA() {
        objContent.clickAssetsCTA();
    }

    @And("User clicks the Read Asset CTA")
    public void userClicksTheReadAssetCTA() {
        objContent.clickReadAssetCTA();
    }

    @Then("User can see the Read Asset screen")
    public void userCanSeeTheReadAssetScreen() {
        Assert.assertTrue(objContent.getReadAssetPageTitle());
    }

    @And("User can see the raw test asset")
    public void userCanSeeTheRawTestAsset() {
        Assert.assertTrue(objContent.getRawText());
    }

    @When("User clicks the Resources CTA")
    public void userClicksTheResourcesCTA() {
        objContent.clickResourcesCTA();
    }

    @And("User clicks the Styled Text CTA")
    public void userClicksTheStyledTextCTA() {
        objContent.clickStyledTextCTA();
    }

    @Then("User can see the Styled Text screen")
    public void userCanSeeTheStyledTextScreen() {
        Assert.assertTrue(objContent.getStyledTextPageTitle());
    }

    @And("User can see the styled text")
    public void userCanSeeTheStyledText() {
        Assert.assertTrue(objContent.getStyledText());
    }
}