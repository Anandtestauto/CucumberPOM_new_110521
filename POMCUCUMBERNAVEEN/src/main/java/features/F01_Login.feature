Feature: Leaftab login functionality

#Background:
#Given launch the chrome browser  
#And Load application URL


#@smoke
#Scenario: Login with  postive credentials
#Given Enter username as demosalesmanager  
#And Enter password as crmsfa
#When Click on Login button
#Then Homepage should be displayed
#Examples:
#|Username|Password|
#|demosalesmanager|crmsfa|




@smoke
Scenario Outline: Login with  postive credentials
Given Enter username as <Username>
And Enter password as <Password>
When Click on Login button
Then Homepage should be displayed
Examples:
|Username|Password|
|demosalesmanager|crmsfa|
|demoCSR|crmsfa|