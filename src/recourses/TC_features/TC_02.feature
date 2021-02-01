#2.Story: As a user, I should be access all the main modules of the app.
# Test case #1- verify users access to the main modules
# 1.Login as a user 
# 2.Verify the user see the following modules: 
# Files
# Galleries    
# Activity 
# Talk 
# Contacts
# Calendar 
# Note  ( Expected module name: Galleries  Actual module name :  Photos )
  @TC1
Feature: As a user, I should be access all the main modules of the app.
  Background: Run Hooks: Launch landing page and click login.
    Scenario Outline: Test case #1- verify users access to the main <module>
      Given Im in the File page
      When I click "<module>"
      Then Load "<module>" page.

      Examples: 
      |module|
      |Files |
      |Galleries|
      |Activity |
      |Talk     |
      |Deck     |
      |Calendar |