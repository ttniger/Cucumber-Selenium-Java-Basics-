Feature: LoginFeature
  This feature deals with the login functionality of the applications

  Scenario: Login with correct username and password
    Given I navigate to the login page
    And I enter the following details for Login
      | username | password      |
      | admin    | adminpassword |
#    And I enter the username as "admin" and "adminpassword" as admin
    And I click login button
    Then I should see userform page

#  Scenario Outline: Login with correct username and password with scenario outline
#    Given I navigate to the login page
#    And I enter <username> and <password> for Login
#
##    And I enter the username as "admin" and "adminpassword" as admin
#    And I click login button
#    Then I should see userform page
#    Examples:
#      | username | password      |
#      | execute    | automation |
#      | done    | automation2|
#      | execute su    | automation3|