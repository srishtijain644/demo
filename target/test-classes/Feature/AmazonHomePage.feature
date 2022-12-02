
Feature: Home Page tabs
I want to check home page tabs of Amazon .
@Feature1
Scenario: Today Deal tab
Given User clicks on today deal
Then The result will be displayed

Scenario Outline: Search Box tab
Given User clicks on Search Box
When user enter "<itemname>"
Then Display the result
Examples:
|itemname|
|Yoga mat|
