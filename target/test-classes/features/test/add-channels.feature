Feature: Test View Add Edit Delete Channel

  @openhim
  Scenario: View Channels
    Given I add the test case IDs to the shared storage for hiptest reporting
      | project | suite           | section | test-case-id |
      | Openhim | Console Testing | Clients | 692          |
    When I navigate to the openhim landing page
    And I enter username of
      | username         |
      | root@openhim.org |
    And I enter a password of "test"
    And I click the login button
    Then I am confronted by the openhim-dashboard
    Then I click on the channels menu


  @openhim
  Scenario: Add Channels
    Given I add the test case IDs to the shared storage for hiptest reporting
      | project | suite           | section | test-case-id |
      | Openhim | Console Testing | Clients | 694          |
    When I navigate to the openhim landing page
    And I enter username of
      | username         |
      | root@openhim.org |
    And I enter a password of "test"
    And I click the login button
    Then I am confronted by the openhim-dashboard
    Then I click on the channels menu
    And I click on Add Channel
    And I add basic info
      | channelName  | channelDescription |
      | Test Channel | Test Description   |
    And I add Request Info
      | urlPath   | addRequestMatchClient |
      | /test/url | Test                  |
    And I add Roue info
      | routName     | hostAddress      | hostPort |
      | openhim test | test.openhim.org | 9000     |
    And I save the channel
