Feature: To validate the login functionality of facebook application

Scenario: To validate login with valid username and invalid password
Given To launch tha chrome browser and maximise window
When To launch tha url of the facebook application
And To pass valid username in email field
And To pass invalid password in password field
And To click the login button
And To check weather nagative to the home page or not 
Then To close the browser
 
Scenario Outline: to validate the positive and negative combination of login functionality
Given user has to launch the browser and maximise the window
When user has to hits the facebook url
And user has to pass the data "<emaildatas>"in email field 
And user has to pass the data "<passworddats>"in password field
And user has to click the login btn
Then user has to close the browser

Examples:
|emaildatas        |passworddats|
|keerthi@gmail.com |keerthi     |
|maven@gmail.com   |258963      |
|selinium@gmail.com|cucucmber   |  
 
 
 
 
 