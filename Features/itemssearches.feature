Feature: searching products

Scenario Outline: searching products in google

Given I am on the google homepage

When I enter the "<Product_name>" in the search bar

And I click on the search botton

Then I can see the search results successfully


Examples: 

| Product_name     |
| United States    |
| Brazil           |
| Japan            |