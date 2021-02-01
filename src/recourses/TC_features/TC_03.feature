#3.Story: As a user, I should be access to Files module.
#
# Test case #1 - verify users can access to Files module
# 1.Login as a user
# 2.Verify the page tile is Files module’s tile
#
# Test case #2 - verify users can select all the uploaded files from the page
# 1.Login as a user
# 2.Click the top left checkbox of the table
# 3.Assert all the files are selected(Pre-condition: there should be at least 2 files are uploaded the page)
#
# Test case #3 - verify users can add a file to favorites.
# 1.Login as a user
# 2.Click action-icon from any file on the page
# 3.Choose “Add to Favorites” option
# 4.Click “Favorites” sub-module on the left side
# 5.Verify the chosen file is listed on the table (Pre-condition: there should be at least 1 file is uploaded)
  Feature: As a user, I should be access to Files module.
    Background: Run Hooks: Launch landing page and click login.
      Scenario: verify users can access to Files module
        Given Login as a user
        Then Verify the page tile is Files module’s tile
      Scenario: verify users can select all the uploaded files from the page
        Given Login as a user
        When Click the top left checkbox of the table
        And There are two or more files selected
        Then Assert check all the files are selected
      Scenario: verify users can add a file to favorites.
        Given Login as a user
        When  Click action-icon from any file on the page & Choose “Add to Favorites” option
        Then Click “Favorites” sub-module on the left side
        And Verify the chosen file is listed on the table

