Feature: Verify Gallery in the Test App

  Background:
    Given User clicks the Views CTA

  Scenario: Check that images appear
    When User clicks the Gallery CTA
    And User clicks the Photos CTA
    Then User can see the Photos screen
    And User can see a photo gallery image
