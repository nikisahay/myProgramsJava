$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Mytest.feature");
formatter.feature({
  "line": 1,
  "name": "Test ApparelStore smoke scenario",
  "description": "",
  "id": "test-apparelstore-smoke-scenario",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Test login with valid credentials",
  "description": "",
  "id": "test-apparelstore-smoke-scenario;test-login-with-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "Open the firefox and start application",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I enter valid username and valid password",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user should be able to login successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "Step.open_the_firefox_and_start_application()"
});
formatter.result({
  "duration": 7180265899,
  "status": "passed"
});
formatter.match({
  "location": "Step.I_enter_valid_username_and_valid_password()"
});
formatter.result({
  "duration": 2526662200,
  "status": "passed"
});
formatter.match({
  "location": "Step.user_should_be_able_to_login_successfully()"
});
formatter.result({
  "duration": 2173988100,
  "status": "passed"
});
});