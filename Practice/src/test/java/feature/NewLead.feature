Feature: NewLead

  Background:
    Given login to platform as Ewa Testowa user

    Scenario Outline: Create a new lead
      When go to Platform
      And click on Sales
      And choose Recently visited clients
      And click on Add new lead
      And complete basic "<leadName>", "<expectedSignDate>"
      And complete opportunity "<deliveryManager>"
      And complete finance "<expectedProjectStart>", "<firstInvoice>", "<periodicPayments>", "<lastInvoice>"
#      Then see success notification

      Examples:
      |leadName|expectedSignDate|deliveryManager|expectedProjectStart|firstInvoice|periodicPayments|lastInvoice|
      |Nowy    |17/01/2019      |Damian         |17/01/2019          |17/01/2019  |1000            |17/03/2019 |