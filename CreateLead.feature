Feature: Create Lead 

@Sanity @Smoke @Functional
Scenario: Create Lead and Verify

#Given Open Chrome browser
Given Load the application url 'http://leaftaps.com/opentaps/control/main'
Given enter username as 'Demosalesmanager'
Given enter pwd as 'crmsfa'
When click 'Submit' button
Then 'Leaftaps' title to be verified
When click 'CRM/SFA' link
Then 'My Home' title to be verified
When click 'Leads' link
Then 'My Leads' title to be verified
When click 'Create Lead' link
Then 'Create Lead' title to be verified
When fill CompanyName as 'Virtusa'
When fill firstName as 'Amri123'
When fill lastName as 'Sri123'
When select 'LEAD_CONFERENCE' from dropdown
When click CreateLead button
Then 'View Lead' title to be verified
Then verify firstname 'Amri123'
Then verify dropdown selected 'Conference'

