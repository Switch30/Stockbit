Feature: feature to test no 2

  Scenario: Validate test no 2
  
 	Given User2 go to “https://demoqa.com/books”
	When User2 in “Book Store” page
	And User2 search book “qa engineer”
	Then User2 see “No rows found”