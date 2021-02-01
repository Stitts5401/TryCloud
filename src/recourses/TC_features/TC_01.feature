#1.Story: As a user, I should be able to login.
# Test case 1 - verify user login successfully.
# 1.Navigate to login page http://qa.trycloud.net/index.php/login?clear=1.
# 2.Enter valid username.
# 3.Enter valid password.
# 4.Click login button.
# 5.Verify the URL is chawed to homepage’s url(Put this test case in testBase class with an annotation so it runs for all the test case).

@TC1
Feature: Story: As a user, I should be able to login. URL doesnt change when wrong pass entered.

  Background: Run Hooks: Launch landing page and click login.

    Scenario Outline: Login with valid <username> and <password>
        Given I log in with valid "<username>" and "<password>"
        When  I login with valid info.
        Then URL is chawed to homepage's url.

      Examples:
      |username|password   |
      |User25  |Userpass123|
      |User55  |Userpass123|
      |User85  |Userpass123|
      |User115 |Userpass123|

      Scenario Outline: Login with invalid <username> and <password>
        Given I login with invalid "<username>" "<password>".
        When I login with invalid info.
        Then Wrong password message should be displayed.
        And page title and url stay the same.
        Examples:
          |username|password   |
          |User25  |Useasdfrpass123|
          |User55  |Usasferpass123|
          |User85  |Userasdfpass123|
          |User115 |Useasdfrpass123|