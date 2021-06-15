Feature: Register
  I want to register me in the web site.

  Scenario Outline: Register in DemoGuru
    Given the user enters the registration page
    When the user enters the information
      | firstName   | lastName   | phoneNumber   | emailAddress   | username   | password   |
      | <firstName> | <lastName> | <phoneNumber> | <emailAddress> | <username> | <password> |
    Then you can see the welcome text on the screen
      | username   | password   |
      | <username> | <password> |
    Examples:
      | firstName | lastName | phoneNumber | emailAddress       | username | password |
      | Janinson  | Hurtado  | 3117942068  | janinson@gmail.com | jani     | hola     |
      | Hamilton  | Urrego   | 31040084714 | urrego@gmail.com   | hami     | mundo    |