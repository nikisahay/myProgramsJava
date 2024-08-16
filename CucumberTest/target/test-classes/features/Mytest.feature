Feature: Test Yahoo login smoke scenario
 
Scenario: Test login with valid credentials
Given Open the firefox and start application
When I enter valid username and valid password
Then user should be able to login successfully