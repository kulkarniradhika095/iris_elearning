Feature: This file contains all the test cases of Bank page

Scenario: Verify search result for Banking exams
Given Chrome browser is opened
And Url is launched
When Click on All Courses tab
Then All courses tab should show Government Job Exams and Banking tabs to be selected by default
Then Click on Bank Maha Pack tab
Then Close Browser
