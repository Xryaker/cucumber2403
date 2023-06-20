@Positive
@Oleg
Feature: Test certificate validation

  @Vasiliy
  Scenario Outline:
    When I send certificate number "<CERTIFICATE>"
    Then Check certificate validation "<EXPECTED>"
    Examples:
      | CERTIFICATE | EXPECTED |
      | 45126       | false    |
      | 45924126    | true     |
      | 78008248    | true     |
      | 4565        | true     |
