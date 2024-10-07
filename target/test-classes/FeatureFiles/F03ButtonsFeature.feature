Feature: Test Login Functionality

  @Test
  Scenario: Perform Login Functionality by entering Userid and Password

    Given user launches the application
    When user cliks on Elements Application
    When user cliks on Buttons Icon
    When user cliks on Double click button
    Then user is able to validate Double click message "You have done a double click"
    When user cliks on Right click button
    Then user is able to validate Right click message "You have done a right click"
    When user cliks on single click button
    Then user is able to validate Dynamic click message "You have done a dynamic click"
