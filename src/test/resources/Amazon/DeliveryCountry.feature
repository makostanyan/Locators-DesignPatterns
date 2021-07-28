Feature: Check if delivery country is Armenia

  Background:
    Given Initialize driver

  Scenario: Delivery country should be Armenia
    Given The user opens Amazon website
    When The user gets delivery country
    Then Delivery to Armenia is displayed
