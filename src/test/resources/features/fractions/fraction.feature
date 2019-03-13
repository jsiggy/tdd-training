Feature: add fractions

  As a student, I need to be able to calculate fraction arithmetic so that I can check my homework answers

  A/C
  - add any 2 or more fractions
  - we still need to be able to add integers or fractions and an integer
  - results should be in a reduced format
  - results should be either improper or

  Questions:
  - how to handle error cases

  UI:
  - follows normal UI conventions

  Scenario: integer arithmetic still works
    Given the current result is 10
    When we add 5
    Then the result is 15
