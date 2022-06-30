Feature: Edit Lead

@Regression @Sanity
Scenario: Edit Lead

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
When enter 'Ak' in firstname
When click 'Find Leads' button using xpath tag button
When click first result from Lead List
Then 'View Lead' title to be verified
When click 'Edit' link
Then 'opentaps CRM' title to be verified
When update company name 'Ak1'
When click Update button
Then verify updated company name 'Ak1'

