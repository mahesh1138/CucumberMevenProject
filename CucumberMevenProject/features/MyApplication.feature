Feature: Test HRM Login scenario

  Scenario: Test login with valid credentials
    Given User launch chrome browser
    When User opens URL "http://hr.ysecit.in/#/login"
    Then User enters username as "1138" and password as "Jamun@123"
    And Click on Login
    And Close the browser
    
    






  
