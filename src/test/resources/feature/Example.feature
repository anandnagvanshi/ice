Feature: sample test

  Background: Given base url is ""

@1
  Scenario: Example 1
    When I make a get call on "endpoint"
    Then status is 200


  Scenario: Example 2
    When I make a post call on "endpoint" with payload params
      | key1   | key2   | key3   | Key4   |
      | value1 | value2 | value3 | value4 |
    Then "responsePayloadSomeKey" is "result1"
    And "responsePayloadSomeKey2" is "result2"


  Scenario: Example 3
    When I make a post call on "endpoint" with payload
      | payload             |
      | /resource/file.json |
    Then "responsePayloadSomeKey" is "result1"
    And "responsePayloadSomeKey2" is "result2"


  Scenario Outline: Example 4
    When I make a post call on "endpoint" with "<payload>"
    Then "<key1>" is "<result1>"
    And "<key2>" is "<result2>"

    Examples:
      | payload             | key1    | result1   | key2    | result2   |
      | /resource/file.json | someKey | someValue | someKey | someValue |


  Scenario Outline: Example 5
    When I make a post call on "endpoint" with "<payload>"
    Then result should match with "<expectedResult>"

    Examples:
      | payload             | expectedResult                |
      | /resource/file.json | /resource/expectedResult.json |

