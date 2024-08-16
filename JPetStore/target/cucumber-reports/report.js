$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "line": 1,
  "name": "Test login functionality",
  "description": "",
  "id": "test-login-functionality",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Check login is successful with valid credentials",
  "description": "",
  "id": "test-login-functionality;check-login-is-successful-with-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "browser is open",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user is on login page",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "user enters username and password",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user clicks on login button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user is navigated to the application home page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.browser_is_open()"
});
formatter.result({
  "duration": 4985573200,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.user_is_on_login_page()"
});
formatter.result({
  "duration": 306569500,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.user_enters_username_and_password()"
});
formatter.result({
  "duration": 37944600,
  "error_message": "java.lang.IllegalArgumentException: Keys to send should be a not null CharSequence\r\n\tat org.openqa.selenium.remote.RemoteWebElement.sendKeys(RemoteWebElement.java:97)\r\n\tat pages.LoginPage.enterUsername(LoginPage.java:25)\r\n\tat stepDefinitions.LoginSteps.user_enters_username_and_password(LoginSteps.java:39)\r\n\tat ✽.When user enters username and password(Login.feature:6)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "LoginSteps.user_clicks_on_login_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginSteps.user_is_navigated_to_the_application_home_page()"
});
formatter.result({
  "status": "skipped"
});
});