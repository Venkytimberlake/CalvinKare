Feature: Login with Hotel apps
Scenario Outline: Login Page
Given Enter the username as <username>
Given Enter the password as <password>
When Click the login button
Then Welcome page should be displayed

Examples:
|username|password|
|'C001'|'123456'|