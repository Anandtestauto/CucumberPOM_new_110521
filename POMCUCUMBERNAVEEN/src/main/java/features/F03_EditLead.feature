#@functional @regression
Feature: Edit Lead Functionality

Scenario Outline: To check the functionality of Edit Lead page
Given Enter username as <Username>
And Enter password as <Password>
When Click on Login button
Then Homepage should be displayed
When click on crmsfa link
Then MyHome page should be displayed  
When click on the leads link
Then My Leads should be displayed
When click on the link find leads
Then Find Lead page should be displayed
When Click on the link phone
Given Enter the phone number as <PhoneNum>
When click on the button FindLeads 
And click on the first lead link from the displayed
Then View Lead Page should be displayed
When Click on the link Edit
Given Edit the companyname as <Cname>
When Click on the submit button
Then View Lead Page should be displayed
Examples:
|Username|Password|PhoneNum|Cname|
|demosalesmanager|crmsfa|9|TCS|