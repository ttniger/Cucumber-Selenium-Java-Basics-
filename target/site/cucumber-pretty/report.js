$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "line": 1,
  "name": "LoginFeature",
  "description": "This feature deals with the login functionality of the applications",
  "id": "loginfeature",
  "keyword": "Feature"
});
formatter.before({
  "duration": 10086439700,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Login with correct username and password",
  "description": "",
  "id": "loginfeature;login-with-correct-username-and-password",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I navigate to the login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I enter the following details for Login",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 7
    },
    {
      "cells": [
        "admin",
        "adminpassword"
      ],
      "line": 8
    }
  ],
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 9,
      "value": "#    And I enter the username as \"admin\" and \"adminpassword\" as admin"
    }
  ],
  "line": 10,
  "name": "I click login button",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I should see userform page",
  "keyword": "Then "
});
formatter.match({
  "location": "loginStep.iNavigateToTheLoginPage()"
});
formatter.result({
  "duration": 2579076100,
  "status": "passed"
});
formatter.match({
  "location": "loginStep.iEnterTheFollowingDetailsForLogin(DataTable)"
});
formatter.result({
  "duration": 6266044700,
  "status": "passed"
});
formatter.match({
  "location": "loginStep.iClickLoginButton()"
});
formatter.result({
  "duration": 376020000,
  "status": "passed"
});
formatter.match({
  "location": "loginStep.iShouldSeeUserformPage()"
});
formatter.result({
  "duration": 59680700,
  "status": "passed"
});
formatter.after({
  "duration": 89400,
  "status": "passed"
});
});