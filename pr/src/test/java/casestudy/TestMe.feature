
@tag
Feature: TestMe App
  @reg
  Scenario: Registration of TestMe App
    Given I want to type the URL
    And  click on SignUp
    Then I enter the username
    And   enter the First name
    And   enter the last name
    And   enter the password
    And  enter the confirm password
    And  choose the Gender
    And  enter the E-mail
    And  enter the mobile number
    And  enter the DOB
    And  enter the Address
    And I choose the Security question
    And enter the answer
    Then I click on Register
  @login
  Scenario Outline: Login
    Given I want to type the URL
    Then   I click on SignIn button
    And   I Enter "<Username>" and "<password>"
    And I click on Login 
    Then TestMe app Homepage is displayed
    Examples:
      | Username  | password    | 
      | lalitha   | password123 |
      
  @cart
  Scenario: The one where user moves to cart without adding the item
  
  When User Search particular product like Head Phone
  And  try to proceed to payment page without adding the item in the cart
  Then TestMe app  does not display the cart icon
 
  
 
    