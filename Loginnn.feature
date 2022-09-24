Feature: H_Parlour apps
Scenario Outline: Franchisee Forms
Given Enter the username as <username>
Given Enter the password as <password>
When Click the login button
Given Enter the Name
Given Enter the Email
Given Enter the Mobile Number
Given Enter the Whatsapp No
Given Click the Male option
Given Click the Marital Status option
Given Click the Language option
Given Click the Occupation option
When Select the Educational Qualification  option
Given Enter the Individual's Monthly Income
Given Enter the Family's total Monthly Income
When Select the State option
When Select the District option
When Select the Town option
Given Enter the Address
Given Enter the Pincode
Given Enter the Residing since : (year)
Given Enter the Proof Type
When Click the choose file option
When Click the next button
Examples:
|username||password|
|'C001'||'123456'|