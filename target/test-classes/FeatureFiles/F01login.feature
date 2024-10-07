Feature: Test Login Functionality

  @Test
  Scenario Outline: Perform Login Functionality by entering Userid and Password

    Given user launches the application
    When user cliks on BookStore Application
    When user clicks on Login button
    When user enter "<userName>" and "<password>"
    When user clicks on Login button
    Then user successfully logged in to application

    Examples:
      | userName | password    |
      | test     | Password01! |
