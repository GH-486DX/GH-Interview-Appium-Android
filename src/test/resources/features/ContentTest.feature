Feature: Verify Content in the Test App

  Background:
    Given User clicks the Content CTA

  Scenario: Check that text asset appears
    When User clicks the Assets CTA
    And User clicks the Read Asset CTA
    Then User can see the Read Asset screen
    And User can see the raw test asset

  Scenario: Check that styled text appears
    When User clicks the Resources CTA
    And User clicks the Styled Text CTA
    Then User can see the Styled Text screen
    And User can see the styled text