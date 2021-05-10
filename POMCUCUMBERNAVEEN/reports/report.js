$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/main/java/features/F01_Login.feature");
formatter.feature({
  "name": "Leaftab login functionality",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Login with  postive credentials",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "Enter username as \u003cUsername\u003e",
  "keyword": "Given "
});
formatter.step({
  "name": "Enter password as \u003cPassword\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "Click on Login button",
  "keyword": "When "
});
formatter.step({
  "name": "Homepage should be displayed",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Username",
        "Password"
      ]
    },
    {
      "cells": [
        "demosalesmanager",
        "crmsfa"
      ]
    },
    {
      "cells": [
        "demoCSR",
        "crmsfa"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Login with  postive credentials",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Enter username as demosalesmanager",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStep.enterUsernameAsDemosalesmanager(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter password as crmsfa",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStep.enterPasswordAsCrmsfa(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Login button",
  "keyword": "When "
});
formatter.match({
  "location": "LoginStep.clickOnLoginButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Homepage should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStep.homepageShouldBeDisplayed()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Login with  postive credentials",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Enter username as demoCSR",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStep.enterUsernameAsDemosalesmanager(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter password as crmsfa",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStep.enterPasswordAsCrmsfa(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Login button",
  "keyword": "When "
});
formatter.match({
  "location": "LoginStep.clickOnLoginButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Homepage should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStep.homepageShouldBeDisplayed()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});