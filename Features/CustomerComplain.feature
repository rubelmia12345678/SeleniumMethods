@UserContact
Feature: User should be able to complain about service
As a register customer
I want to complain about the service
So that I can get better service


Scenario: user complain
Given I am on BNY Mellon homepage
When I click on contact
And click on “clicking here”
And put my name, phone number, complaint employee name and click submit
Then I see complain submitted successfully