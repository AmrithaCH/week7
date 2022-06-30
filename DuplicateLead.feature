Feature: Duplicate Lead


@Sanity @Regression
Scenario: Duplicate Lead and verify


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
When enter 'ab' in email
When click 'Find Leads' button using xpath tag a
When click first result from Lead List
Then 'View Lead' title to be verified
When click 'Duplicate Lead' button using xpath tag a
When click Create Lead under duplicate
Then check the lead is duplicated