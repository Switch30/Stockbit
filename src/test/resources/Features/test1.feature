Feature: feature to test no 1

  Scenario: Validate test no 1
  
    Given User1 go to “https://demoqa.com/select-menu”
    When User1 in “select menu” page
    And User1 choose select value “Another root option”
    And User1 choose select one “Other”
    And User1 choose old style select menu “Aqua”
    And User1 choose multi select drop down “all color”
    Then User1 success input all select menu
