Feature: Login
  As a user, I want to login the login page with username and password

  @loginPositive
  Scenario Outline: login with correct credentials and verify that user name is "<exceptedUsername>"
    Given User is on the login page
    When User enters correct username "<username>"
    And User enters correct password "<password>"
    And User clicks login button
    Then User name should be "<exceptedUsername>"

    Examples:
      | username                       | password | exceptedUsername               |
      | helpdesk49@cybertekschool.com  | UserUser | helpdesk49@cybertekschool.com  |
      | helpdesk50@cybertekschool.com  | UserUser | helpdesk50@cybertekschool.com  |
      | hr49@cybertekschool.com        | UserUser | hr49@cybertekschool.com        |
      | hr50@cybertekschool.com        | UserUser | hr50@cybertekschool.com        |
      | marketing49@cybertekschool.com | UserUser | marketing49@cybertekschool.com |
      | marketing49@cybertekschool.com | UserUser | marketing49@cybertekschool.com |


  @loginNegative
  Scenario Outline: login with incorrect credentials and verify that  "<warningMessage>"
    Given User is on the login page
    When User enters correct username "<username>"
    And User enters incorrect password "<password>"
    And User clicks login button
    Then User should see warning message: "<warningMessage>"

    Examples:
      | username                      | password      | warningMessage              |
      | helpdesk49@cybertekschool.com | wrongPassword | Incorrect login or password |








