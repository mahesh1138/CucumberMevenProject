$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("./features/MyAttendanc.feature");
formatter.feature({
  "line": 1,
  "name": "Test MyAttendance Details",
  "description": "",
  "id": "test-myattendance-details",
  "keyword": "Feature"
});
formatter.before({
  "duration": 5551522600,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "Below are the common steps for every scenario  //it is used for common steps",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "User launch chrome browser",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User opens URL \"http://hr.ysecit.in/#/login\"",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User enters username as \"1138\" and password as \"Jamun@123\"",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "Click on Login",
  "keyword": "And "
});
formatter.match({
  "location": "SmokeTest.user_launch_chrome_browser()"
});
formatter.result({
  "duration": 100263300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "http://hr.ysecit.in/#/login",
      "offset": 16
    }
  ],
  "location": "SmokeTest.user_opens_URL(String)"
});
formatter.result({
  "duration": 3095761600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1138",
      "offset": 25
    },
    {
      "val": "Jamun@123",
      "offset": 48
    }
  ],
  "location": "SmokeTest.user_enters_username_as_and_password_as(String,String)"
});
formatter.result({
  "duration": 202931100,
  "status": "passed"
});
formatter.match({
  "location": "SmokeTest.click_on_Login()"
});
formatter.result({
  "duration": 2110010100,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "Check My Attendance details",
  "description": "",
  "id": "test-myattendance-details;check-my-attendance-details",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 10,
  "name": "user click on Personal information tab",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "click on MyAttendance link",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "Select employee from date and to date and click on submit button",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "click on Punchin details and verify break details",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "close the pop up window",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "Close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "SmokeTest.user_click_on_Personal_information_tab()"
});
formatter.result({
  "duration": 1070126300,
  "status": "passed"
});
formatter.match({
  "location": "SmokeTest.click_on_MyAttendance_link()"
});
formatter.result({
  "duration": 2097049200,
  "status": "passed"
});
formatter.match({
  "location": "SmokeTest.select_employee_from_date_and_to_date_and_click_on_submit_button()"
});
formatter.result({
  "duration": 6616660500,
  "status": "passed"
});
formatter.match({
  "location": "SmokeTest.click_on_Punchin_details_and_verify_break_details()"
});
formatter.result({
  "duration": 3096721200,
  "status": "passed"
});
formatter.match({
  "location": "SmokeTest.close_the_pop_up_window()"
});
formatter.result({
  "duration": 2079113800,
  "status": "passed"
});
formatter.match({
  "location": "SmokeTest.close_the_browser()"
});
formatter.result({
  "duration": 1197547200,
  "status": "passed"
});
});