Feature: Implement with scenario outline and Background

Background: Login
Given Load the application url 'http://leaftaps.com/opentaps/control/main'
Given enter username as 'Demosalesmanager'
Given enter pwd as 'crmsfa'
When click 'Submit' button
Then 'Leaftaps' title to be verified
When click 'CRM/SFA' link
Then 'My Home' title to be verified
When click 'Leads' link
Then 'My Leads' title to be verified


Scenario Outline: Create Lead
When click 'Create Lead' link
Then 'Create Lead' title to be verified
When fill CompanyName as <companyName>
When fill firstName as <firstName>
When fill lastName as <LastName>
When select <dropdownValue> from dropdown
When click CreateLead button
Then 'View Lead' title to be verified
Then verify firstname <verifyfName>
Then verify dropdown selected <verifyDropDown>
Examples: 
|companyName|firstName|LastName|dropdownValue|verifyfName|verifyDropDown|
|'Virtusa'|'Amri12'|'Srini12'|'LEAD_CONFERENCE'|'Amri12'|'Conference'|
|'Amazon'|'Amr13'|'Srini13'|'LEAD_CONFERENCE'|'Amr13'|'Conference'|

Scenario: Edit Lead
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

Scenario: Duplicate Lead
When click 'Find Leads' link
Then 'Find Lead' title to be verified
When enter 'ab' in email
When click 'Find Leads' button using xpath tag a
When click first result from Lead List
Then 'View Lead' title to be verified
When click 'Duplicate Lead' button using xpath tag a
When click Create Lead under duplicate
Then check the lead is duplicated


Scenario: Delete lead
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