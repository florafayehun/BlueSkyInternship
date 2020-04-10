$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("homepage.feature");
formatter.feature({
  "line": 2,
  "name": "HomePage",
  "description": "",
  "id": "homepage",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@run"
    }
  ]
});
formatter.scenario({
  "comments": [
    {
      "line": 3,
      "value": "#this is to navigate to the blue sku Citadel homepage"
    }
  ],
  "line": 5,
  "name": "Home Page Navigation",
  "description": "",
  "id": "homepage;home-page-navigation",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "that I naviagate to www.blueskycitadel.com",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I click the homepage menu",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I can view the home page",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePage.that_I_naviagate_to_www_blueskycitadel_com()"
});
formatter.result({
  "duration": 14113489799,
  "status": "passed"
});
formatter.match({
  "location": "HomePage.i_click_the_homepage_menu()"
});
formatter.result({
  "duration": 679070107,
  "status": "passed"
});
formatter.match({
  "location": "HomePage.i_can_view_the_home_page()"
});
formatter.result({
  "duration": 13574653,
  "error_message": "org.junit.ComparisonFailure: expected:\u003cBlueSkyC[mmmmm]itadel\u003e but was:\u003cBlueSkyC[]itadel\u003e\r\n\tat org.junit.Assert.assertEquals(Assert.java:115)\r\n\tat org.junit.Assert.assertEquals(Assert.java:144)\r\n\tat bindings.HomePage.i_can_view_the_home_page(HomePage.java:45)\r\n\tat ✽.Then I can view the home page(homepage.feature:8)\r\n",
  "status": "failed"
});
});