Feature: Check if all books authors

  Background:
    Given Initialize driver

  Scenario Outline: All books should be authors
    Given The user opens Amazon website
    When Click on books department
    And Search <authors> name
    Then Check if all books <authors>
    Examples:
      | authors         |
      | Agatha Christie |
      | Joanne Rowling  |
