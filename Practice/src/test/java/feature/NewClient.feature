Feature: NewClient

  Background:
    Given login to platform as Ewa Testowa user

  Scenario Outline: Create a new client
    When go to Platform
    And click on Sales
    And choose Recently visited clients
    And click on Add new client
    And complete "<fullname>", "<shortname>" and "<taxID>" about client
    Then see success notification "<fullname>"

    Examples:
      | fullname | shortname | taxID |
      | Test     | TT        | 5555  |
#      | Tset     | TT        | 6666  |