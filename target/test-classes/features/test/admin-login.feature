Feature: Test login and logout functionality

  @openhim
  Scenario: Login with valid user details.
    Given I add the test case IDs to the shared storage for hiptest reporting
      | project | suite           | section | test-case-id |
      | Openhim | Console Testing | Login   | 681          |
    When I navigate to the openhim landing page
    And I enter username of
      | username         |
      | root@openhim.org |
    And I enter a password of "test"
    And I click the login button
    Then I am confronted by the openhim-dashboard


  @openhim
  Scenario: Login with valid user details.
    Given I add the test case IDs to the shared storage for hiptest reporting
      | project | suite           | section | test-case-id |
      | Openhim | Console Testing | Login   | 703          |
    When I navigate to the openhim landing page
    And I enter username of
      | username         |
      | root@openhim.org |
    And I enter a password of "test"
    And I click the login button
    Then I am confronted by the openhim-dashboard
    Then I click on the profile Icon
    And click on Logout
    Then I am confronted by the openhim landing page
