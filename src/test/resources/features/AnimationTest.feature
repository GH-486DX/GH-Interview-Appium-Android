Feature: Verify Animations in the Test App

  Background:
    Given User clicks the Animation CTA

  Scenario: Check that buttons can be added
    When User clicks the Default Layout Animations CTA
    Then User can see the Default Layout Animations screen
    And User can add four additional buttons