Feature: consult

  @CCC
  Scenario: confirm form
    When I click consultation button
    And fill in the form
      | name  | email             | telegram        | telephone | viber     | course     |
      | Aslak | aslak@cucumber.io | @aslak_hellesoy | 974556789 | 789654123 | Java Basic |
    Then Check confirm button

  Scenario:
    When i open page "https://certificate.ithillel.ua/ "
    And send sertificate "56416165464"
    Then sout result