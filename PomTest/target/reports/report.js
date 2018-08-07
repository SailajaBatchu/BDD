$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login.feature");
formatter.feature({
  "line": 1,
  "name": "Login Form",
  "description": "I want to use this template for my feature file",
  "id": "login-form",
  "keyword": "Feature"
});
formatter.before({
  "duration": 3293582230,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "Login with username and password",
  "description": "",
  "id": "login-form;login-with-username-and-password",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@tag:"
    },
    {
      "line": 4,
      "name": "@execute"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I have a login form",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Username and password matches",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "Login Success",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDef.i_have_a_login_form()"
});
formatter.result({
  "duration": 847602130,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDef.username_and_password_matches()"
});
formatter.result({
  "duration": 178367180,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDef.login_Success()"
});
formatter.result({
  "duration": 83102615,
  "status": "passed"
});
formatter.after({
  "duration": 116413729,
  "status": "passed"
});
});