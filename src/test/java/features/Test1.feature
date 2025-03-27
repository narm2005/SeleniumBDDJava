Feature: Test Validate login in to SStech portal

  Scenario: Sc1, Validate login in to SStech
    Given I login in to Portal
    When I am on Home Page
    Then I validate user name is diaplayed


  Scenario: Sc2, Search Employee on the portal
    Given I login in to Portal
    When I am on Home Page
    Then I validate user name is diaplayed