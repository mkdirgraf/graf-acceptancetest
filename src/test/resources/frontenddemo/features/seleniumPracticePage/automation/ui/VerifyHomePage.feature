@domain=PDS @ui @capabilityid=tima
  Feature: Verify all the mandatory elements in Practice Home page

  @auto @acceptance
  Scenario: Validate all the elements
    Given user navigates to Practice Page
    And verify that Practice Page text and button are displayed
    And validate all the radio buttons are displayed and clickable
