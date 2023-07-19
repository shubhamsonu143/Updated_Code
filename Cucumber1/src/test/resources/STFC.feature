	Feature: To verify the STFC Fixed Depsoit

  Scenario Outline: Landing Page

    Given user navigates to STFC_Landing Page

    When I enter Username as "<Mobile_No>" and Password as "<Pin_code>" and EmailId as "<emailId>"

    Then I click the InvestNow

    Then OTP field should displayed

    And User Verify the Scheme_details_Page

    When user enter InvestAmount as "<amountInputFd>" and Ternure_Input as "<tenureinputfd>"

    Then user click tenure info button

    And user click tenure done button

    Then user click SelectInterestPayout info button

    And user SelectInterestPayout done button

    Then user choose the InterestPayout DropDown

    And user click the Are u senior citizen button

    Then user click the Continue Button

    Then PAN details Page should displayed

    Examples:
      | Mobile_No  | Pin_code | emailId                        | amountInputFd | tenureinputfd |
      | 9488712093 | 606201   | sathishperiyasamy449@gmail.com | 60000         | 24            |
      | 9488712093 | 606201   | sathishperiyasamy449@gmail.com | 60000         | 24            |
      | 9488712093 | 606201   | sathishperiyasamy449@gmail.com | 60000         | 24            |









	