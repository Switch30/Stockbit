Feature: feature to test no 3

  Scenario: Validate test no 3
  
	Given User3 go to “https://demoqa.com/books”
	When User3 in “Book Store” page
	And User3 search book “Git Pocket Guide”
	And User3 click book “Git Pocket Guide”
	Then User3 see “Git Pocket Guide”