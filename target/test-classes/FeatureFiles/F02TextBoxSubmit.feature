Feature: Test Login Functionality

  @Test
  Scenario Outline: Perform Login Functionality by entering Userid and Password

    Given user launches the application
    When user selects data from excel sheet "<SheetName>" <RowNum>
    When user cliks on Elements Application
    When user cliks on Text Box
    When user enters "Full Name", "Email", "Current Address" and "Permanent Address"
    When user clicks on Submit button

    Examples:
      | SheetName | RowNum |  |  |  |  |
      | Sheet1    | 1      |  |  |  |  |
      | Sheet1    | 2      |  |  |  |  |
      | Sheet1    | 3      |  |  |  |  |
      | Sheet1    | 4      |  |  |  |  |
