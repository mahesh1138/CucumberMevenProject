Feature: Test MyAttendance Details

  Background: Below are the common steps for every scenario  //it is used for common steps
    Given User launch chrome browser
    When User opens URL "http://hr.ysecit.in/#/login"
    Then User enters username as "1138" and password as "Jamun@123"
    And Click on Login

  Scenario: Check My Attendance details
    Then user click on Personal information tab
    And click on MyAttendance link
    Then Select employee from date and to date and click on submit button
    And click on Punchin details and verify break details
    Then close the pop up window
    And Close the browser
