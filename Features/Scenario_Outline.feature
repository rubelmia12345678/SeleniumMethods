Feature: Testing login page with set of data
As a user I want login by my userNmae and userPass

Scenario Outline: login page test

Given I am on facebook login page
When I enter my valid <userNmae> and <userPass>
Then I souuld be able to succesfully login

Examples:

|userNmae|userPass|
|tanima|t1234|
|rubel|r5678|
|Adrita|a420|