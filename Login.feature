Feature: Login functionality 


@Smoke
Scenario: Login with positive credential

#Given Open Chrome browser
Given Load the application url 'http://leaftaps.com/opentaps/control/main'
Given enter username as 'Demosalesmanager'
Given enter pwd as 'crmsfa'
When click 'Submit' button
Then Homepage should be displayed
When click 'CRM/SFA' link



