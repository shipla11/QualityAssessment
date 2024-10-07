# QualityAssessment

**Project Name**: QA_Assessment

**Languages Used**: Java,BDD,Cucumber
**IDE**: Intelij
**Build tool**: Maven
**Pom.xml**: Pom.xml is used to manage dependencies and plugins(Added dependencies like Selenium-java,apache poi,testng,cucumber junit)
**Driver**:added chromedriver.exe

**Pages**:Maintained seprate page for each web page
LoginPage: This page is maintained for Login functionality(Added locators and their respective methods)
TextBoxSubmitPage:This page is maintained for submitting detils like Username, email,Current address and Permanent Address(Added locators and their respective methods)
ButtonPage:This page is maintained for performing button related actions Click,Doubleclick and Dynamic Click(Added locators and their respective methods)

**TestBaseClass**:
Added TestBaseClass to initialise the Webdriver and Lunch URL based on browser(chrome,edge and firefox) ,Maximize browser

**Utility**:
Added utilities
Config reader:Added code for loading property file to read data from Config.properties( read browsername,URL and Excelsheet path)
Excel helper: Added common utility to read data from excelsheet
FunctionCaller: Added common utility for Actions which are requernt to perform frequently clickOnWebElement,enterDataFromExcel,clickOnElementByJS, scrollTillElement and waitUntillElementVisible

**Resources**:
Config.peroperties: added file for mentioned common data used accross framework(URL,browser and Excelsheet path)
TestData.xlsx: added test data for execution of testcases

**Feature file**:
F01login.feature: Added feature file for login functionality with help of Given When and Then keywords(Testdata is used from Examples)
F02TextBoxSubmit.feature: Added feature file for submitting detils like Username, email,Current address and Permanent Address(Testdata is used from Excelsheet)
F03ButtonsFeature.feature: Added feature file for performing button related actions Click,Doubleclick and Dynamic Click also perform assertion for each action.

**StepDefination**:Added Stepdefinations for its associated feature files added code to perform required actions
LoginSteps  
TextBoxSubmitSteps
ButtonsClickSteps

**TestRunner**:
Added TestRunner to execute Testcases
Provided Feature file path,Stepdefination file path and added plugin and tags to execute required testcases

 





