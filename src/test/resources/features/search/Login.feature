Feature: Login Depo Web

  @ValidLogin
  Scenario Outline: Verify valid login for Depo web
    Given the user launches Depo website
    When the user clicks on login from home page
    When user enters with "<username>" and "<password>"
    Then user should be logged in

    Examples: 
      | username                         | password   |
      | Ramana.qa7@gmail.com | London#242 |

  @InvalidUser
  Scenario Outline: Verify user with invalid username and paswword tries to login is not able to login
    Given the user launches Depo website
    When the user clicks on login from home page
    When user enters with "<username>" and "<password>"
    Then user should not be logged in

    Examples: 
      | username        | password   |
      | Ramana           | London#242 |

      
     @InvalidPassword
  Scenario Outline: Verify user with invalid username and paswword tries to login is not able to login
    Given the user launches Depo website
    When the user clicks on login from home page
    When user enters with "<username>" and "<password>"
    Then user should not be logged in

    Examples: 
      | username        | password   |
      | Ramana.qa7@gmail.com | London$242 |
     
     @InvalidUsrpwd
  Scenario Outline: Verify user with invalid username and paswword tries to login is not able to login
    Given the user launches Depo website
    When the user clicks on login from home page
    When user enters with "<username>" and "<password>"
    Then user should not be logged in

    Examples: 
      | username        | password   |
      | Ramana.qa      | London$242 |  