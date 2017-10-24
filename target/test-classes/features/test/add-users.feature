Feature: Test ability to add, edit and remove users

  @openhim
  Scenario: Login with valid user details and add a new user
    Given I add the test case IDs to the shared storage for hiptest reporting
      | project | suite           | section | test-case-id |
      | Openhim | Console Testing | Users   | 806          |
    When I navigate to the openhim landing page
    And I enter username of
      | username         |
      | root@openhim.org |
    And I enter a password of "test"
    And I click the login button
    Then I am confronted by the openhim-dashboard
    Then I navigate to the users section
    And I click on Add a new User