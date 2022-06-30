Feature: Delete Lead

@Smoke @Regression
Scenario: Delete Lead and verify if deleted


Given Load the application url 'http://leaftaps.com/opentaps/control/main'
Given enter username as 'Demosalesmanager'
Given enter pwd as 'crmsfa'
When click 'Submit' button
Then 'Leaftaps' title to be verified
When click 'CRM/SFA' link
Then 'My Home' title to be verified
When click 'Leads' link
Then 'My Leads' title to be verified
When click 'Find Leads' link
Then 'Find Lead' title to be verified
When enter '1' in phone number
When click 'Find Leads' button using xpath tag a
When click first result from Lead List
Then 'View Lead' title to be verified
#Then get text from the view lead
When click 'Delete' button using xpath tag a
When click 'Find Leads' button from shortcuts
Then check the lead is deleted successfully