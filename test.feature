Feature: Checking H Parlor apps
@Smoke
Scenario Outline: Test name present in entered forms
Given Enter the url <url>
When Enter the name
Then Get the Name
Examples: 
|url|
|'http://hub1.cavinkare.in/H_Parlour/index.php/cc/entered_form'|