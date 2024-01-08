@SmokeScenario
Feature: Check Login Feature


  @SmokeTest
  Scenario: SC1: Check Login With Valid Data
    Given    User Enter Valid Username and Password
    When     User Click Login Button
    Then     User shall navigate to home page