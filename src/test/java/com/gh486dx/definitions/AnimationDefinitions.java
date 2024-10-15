package com.gh486dx.definitions;

import com.gh486dx.actions.AnimationActions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class AnimationDefinitions {

    final AnimationActions objAnimation = new AnimationActions();

    @Given("User clicks the Animation CTA")
    public void user_clicks_the_animation_cta() {
        objAnimation.clickAnimationCTA();
    }

    @When("User clicks the Default Layout Animations CTA")
    public void user_clicks_the_default_layout_animations_cta() {
        objAnimation.clickDefaultLayoutAnimationsCTA();
    }

    @Then("User can see the Default Layout Animations screen")
    public void user_can_see_the_default_layout_animations_screen() {
        Assert.assertTrue(objAnimation.getDefaultLayoutAnimationsPageTitle());
    }

    @And("User is able to click the Add Button CTA")
    public void user_is_able_to_click_the_add_button_cta() {
        objAnimation.clickAddButtonCTA();
    }

    @Then("A new Button appears")
    public void a_new_button_appears() {
        Assert.assertTrue(objAnimation.getNewButton());
    }

}