$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("./src/test/java/features/new_invoice.feature");
formatter.feature({
  "line": 1,
  "name": "New Invoice Page",
  "description": "As a user I want a New Invoice Page so that Invoice can be created",
  "id": "new-invoice-page",
  "keyword": "Feature"
});
formatter.before({
  "duration": 5664679200,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "New Invoice page should display",
  "description": "",
  "id": "new-invoice-page;new-invoice-page-should-display",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "a user with username \"techfiosdemo@gmail.com\" and password \"abc123\"",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user navigates to New Invoice Page",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "New Invoice page should display",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user creates a new invoice using Full Name \"Adnan\" Company Name \"HP\" Email \"adnan@gmail.com\" Phone \"555-908-6543\" Address \"345 Sunny Hill\" City \"Bronx\" State/Region \"NY\" ZIP/Postal Code \"11590\"",
  "keyword": "When "
});
formatter.match({
  "arguments": [
    {
      "val": "techfiosdemo@gmail.com",
      "offset": 22
    },
    {
      "val": "abc123",
      "offset": 60
    }
  ],
  "location": "NewInvoiceSteps.a_user_with_username_and_password(String,String)"
});
formatter.result({
  "duration": 9127244500,
  "status": "passed"
});
formatter.match({
  "location": "NewInvoiceSteps.user_navigates_to_New_Invoice_Page()"
});
formatter.result({
  "duration": 10286783500,
  "status": "passed"
});
formatter.match({
  "location": "NewInvoiceSteps.new_Invoice_page_should_display()"
});
formatter.result({
  "duration": 243410000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Adnan",
      "offset": 44
    },
    {
      "val": "HP",
      "offset": 65
    },
    {
      "val": "adnan@gmail.com",
      "offset": 76
    },
    {
      "val": "555-908-6543",
      "offset": 100
    },
    {
      "val": "345 Sunny Hill",
      "offset": 123
    },
    {
      "val": "Bronx",
      "offset": 145
    },
    {
      "val": "NY",
      "offset": 166
    },
    {
      "val": "11590",
      "offset": 187
    }
  ],
  "location": "NewInvoiceSteps.user_creates_a_new_invoice_using_Full_Name_Company_Name_Email_Phone_Address_City_State_Region_ZIP_Postal_Code(String,String,String,String,String,String,String,String)"
});
formatter.result({
  "duration": 13966001200,
  "status": "passed"
});
formatter.after({
  "duration": 3721975600,
  "status": "passed"
});
});