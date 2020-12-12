Feature: New Invoice Page
	As a user I want a New Invoice Page so that Invoice can be created
	
Scenario: New Invoice page should display 
Given a user with username "techfiosdemo@gmail.com" and password "abc123"
When user navigates to New Invoice Page
Then New Invoice page should display
When user creates a new invoice using Full Name "Adnan" Company Name "HP" Email "adnan@gmail.com" Phone "555-908-6543" Address "345 Sunny Hill" City "Bronx" State/Region "NY" ZIP/Postal Code "11590"



