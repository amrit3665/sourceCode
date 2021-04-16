Feature: Search a Product

Scenario Outline: Search a givn product
Given User Opens the URL
And Types the search <item> in the search box
Then clicks on the Search button

Examples:

|item|
|Java Book|
