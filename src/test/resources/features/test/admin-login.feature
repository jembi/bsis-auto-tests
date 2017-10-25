Feature: Test login and logout functionality

  @openhim
  Scenario: Login with valid user details.
    Given I add the test case IDs to the shared storage for hiptest reporting
      | project | suite           | section | test-case-id |
      | Openhim | Console Testing | Login   | 681          |
    When I navigate to the bsislanding page
    And I enter username of
      | username         |
      | superuser |
    And I enter a password of "superuser"
    And I click the login button
    Then I am confronted by the bsis-homepage
    Then I check that I have the correct "permissions"
    Then I click on the profile Icon
    And click on Logout
    Then I am confronted by the openhim landing page


