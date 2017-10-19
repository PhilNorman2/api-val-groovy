$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("adding.feature");
formatter.feature({
  "line": 1,
  "name": "Calculate",
  "description": "",
  "id": "calculate",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Add two numbers",
  "description": "",
  "id": "calculate;add-two-numbers",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "the input \"2+2\"",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "the calculator is run",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "the output should be \"4\"",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "2+2",
      "offset": 11
    }
  ],
  "location": "add_steps.groovy:12"
});
formatter.result({
  "duration": 131098485,
  "status": "passed"
});
formatter.match({
  "location": "add_steps.groovy:16"
});
formatter.result({
  "duration": 11446296,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "4",
      "offset": 22
    }
  ],
  "location": "add_steps.groovy:21"
});
formatter.result({
  "duration": 935212,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "Subtract two numbers",
  "description": "",
  "id": "calculate;subtract-two-numbers",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 9,
  "name": "the input \"9-4\"",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "the calculator is run",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "the output should be \"5\"",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "9-4",
      "offset": 11
    }
  ],
  "location": "add_steps.groovy:12"
});
formatter.result({
  "duration": 152721,
  "status": "passed"
});
formatter.match({
  "location": "add_steps.groovy:16"
});
formatter.result({
  "duration": 5293927,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "5",
      "offset": 22
    }
  ],
  "location": "add_steps.groovy:21"
});
formatter.result({
  "duration": 75540,
  "status": "passed"
});
formatter.uri("repo-create.feature");
formatter.feature({
  "line": 1,
  "name": "I want to create a new repository",
  "description": "",
  "id": "i-want-to-create-a-new-repository",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "I need a new repository",
  "description": "",
  "id": "i-want-to-create-a-new-repository;i-need-a-new-repository",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "I am an authenticated user",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "I create the \"monkey\" repository",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "I request a list of my repositories",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "The results should include a repository name \"monkey\"",
  "keyword": "Then "
});
formatter.match({
  "location": "repo-create_steps.groovy:20"
});
formatter.result({
  "duration": 849059655,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "monkey",
      "offset": 14
    }
  ],
  "location": "repo-create_steps.groovy:46"
});
formatter.result({
  "duration": 734386097,
  "status": "passed"
});
formatter.match({
  "location": "repo-create_steps.groovy:77"
});
formatter.result({
  "duration": 182644787,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "monkey",
      "offset": 46
    }
  ],
  "location": "repo-create_steps.groovy:99"
});
formatter.result({
  "duration": 177354555,
  "status": "passed"
});
formatter.uri("repo-watch.feature");
formatter.feature({
  "line": 1,
  "name": "This is an important repository",
  "description": "",
  "id": "this-is-an-important-repository",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "I want to know when something happens with this repository",
  "description": "",
  "id": "this-is-an-important-repository;i-want-to-know-when-something-happens-with-this-repository",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "I am an authenticated user",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "I have a repository called \"monkey\"",
  "keyword": "And "
});
formatter.step({
  "line": 5,
  "name": "I watch the \"monkey\" repository",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "The \"monkey\" repository will list me as a watcher",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "I delete the repository called \"monkey\"",
  "keyword": "And "
});
formatter.match({
  "location": "repo-create_steps.groovy:20"
});
formatter.result({
  "duration": 153866270,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "monkey",
      "offset": 28
    }
  ],
  "location": "repo-create_steps.groovy:131"
});
formatter.result({
  "duration": 158058,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "monkey",
      "offset": 13
    }
  ],
  "location": "repo-create_steps.groovy:136"
});
formatter.result({
  "duration": 148057525,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "monkey",
      "offset": 5
    }
  ],
  "location": "repo-create_steps.groovy:167"
});
formatter.result({
  "duration": 172448179,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "monkey",
      "offset": 32
    }
  ],
  "location": "repo-create_steps.groovy:202"
});
formatter.result({
  "duration": 198071278,
  "status": "passed"
});
});