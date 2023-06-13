Feature: Empty first run

  Scenario: Sout
    When sout my name
    And  sout my family
    Then sout my age

    Scenario: data
      When sout my name "Oleg"
      And  sout my family "Ivanov" and family my wife "Shevchenko"