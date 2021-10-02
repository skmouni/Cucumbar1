Feature: My_ account login feature


  Background:open browser and enter the url
    Given open browser
    When enter the url "http://practice.automationtesting.in/"

  Scenario: Login with user name and password
   # Given open browser
  #  When enter the url "http://practice.automationtesting.in/"
    And  click on my account menu
    And enter registerd "username" and "password"
    Then the user verify field headers
      | Email address |
      | Password      |


#  Scenario Outline: Login with user name and password
#   # Given open browser
#  # When enter the url "http://practice.automationtesting.in/"
#
#  #  Given open browser
#  #  When enter the url "http://practice.automationtesting.in/"
#    And  click on my account menu
#    And  enter registerd "<username>" and "<password>"
#    And click on login button
#    Then user must be suceesfully login to the webpage
#    Examples:
#      | username | password    |
#      | siri     | srreddy@123 |
#      | mouni    | mouni@123   |
#      | anna     | anna@345    |
