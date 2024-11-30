Feature: Feature to test login functionality
Scenario: check login is successful with credentails

Given user is on Login Page
When user enters username and password
And clicks on login button
Then user is navigated to the home page
