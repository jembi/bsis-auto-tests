Feature: Test View Add Edit Delete Channel

  @openhim
  Scenario: View Channels
    Given I add the test case IDs to the shared storage for hiptest reporting
      | project | suite           | section     | test-case-id |
      | Openhim | Console Testing | Visualizers | 698          |
    When I navigate to the openhim landing page
    And I enter username of
      | username         |
      | root@openhim.org |
    And I enter a password of "test"
    And I click the login button
    Then I am confronted by the openhim-dashboard
    Then I click on the visualizers menu
    And I click on Add a Visualizer
    And I add Visualizer details
      | visualizerName  | eventType |
      | Test Visualizer | Test      |
    Then I save the Visualizer