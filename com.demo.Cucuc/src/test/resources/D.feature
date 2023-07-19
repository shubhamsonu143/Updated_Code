Feature: STFC

  Scenario Outline: User login the Landing_Page with valid credentials
    Given User Landing the STFC Website
    When user entered the mobile number as "<MobileNumber>" and Pincode as "<Pincode>" and Emailid as "<MailId>"
    And User click the InvestNow  button
    Then User should see the Verify OTP Field

    Examples: 
      | MobileNumber | Pincode | MailId                          |
      |   9488712093 |  606201 | sathish.p@novactech.in          |
      |   8124643040 |  600117 | sathishperiyasamy4499@gmail.com |

  Scenario Outline: User login the Landing_Page with Invalid Mobile Number
    Given User landing the STFC Website1
    When User Eneterd the Invalid Mobile number as "<MobileNumber>" and pincode as "<Pincode>" and Emailid as "<MailId>"
    And User click the InvestNow  button1
    And user got the Error message
    Then User should not  see the Verify OTP Field

    Examples: 
      | MobileNumber | Pincode | MailId                          |
      |   2222222222 |  606201 | sathish.p@novactech.in          |
      |   5555555555 |  600117 | sathishperiyasamy4499@gmail.com |

  @regressionTest
  Scenario Outline: user Entered the Scheme Details Page
    Given user verify the Scheme detail Page
    When user entered the Invest Amount as "<amountinputfd>" and tenure input as "<TenureInput>" and select the interest payout as "<InterestPayOut>"
    And user click the InvestNowButton2
    Then user should see the pan details Page
    When user entered the Pan Number "<MinorPan>" and select the title as "<Title>" and enter the FirstName as "<FirstName>" and MiddleName as "<MiddleName>" and LastName as "<LastName>" and DOB as "<Minror_DOB>" and EmailId as "<EmailId>"
    And User click the ProceedButton

    Examples: 
      | amountinputfd | TenureInput | InterestPayOut | MinorPan   | Title  | FirstName | MiddleName | LastName | Minror_DOB | EmailId                |
      |          5000 |          12 | On Maturity    | KFEPS4704E | Minor. | Sathish   | Sree       | P        | 11-07-2015 | sathish.p@novactech.in |

  @SmokeTest
  Scenario Outline: User Entered the Guardian Pan page
    Given user verify ,Whether it is a Guardian Pan Screen
    When user entered the Guradian Pan as "<GuradianPan>"
    When user entered the guardTitle as "<G_Title>" and FirstName as "<G_FName>" and Middlename as "<G_MName>" and LastName as "<G_LName>" and DOB as "<G_DOB>" and Mailid as "<EmailId>"
    And user click the Guardian proceed button
    Then user should see the Deposit summary Page

    Examples:                                                                                                                                                                     
      | GuradianPan | G_Title | G_FName | G_MName | G_LName | G_DOB      | EmailId                         |
      | KFEPS4704E  | Ms.     | Divya   | Sree    | S       | 04-04-1999 | sathishperiyasamy4499@gmail.com |

  @sanityTest
  Scenario: User entered the Deposit_Summary_Page
    Given User ensure he/she is in Deposit_Summary_Page
    And user verify the PaySecurely button is enabled or not
    When user click the edit button ,he/she should go into the SchemeDetail Page
    And User ensure he/she in schemeDetails Page
    Then user click the continue button
    And User click the TermsAndCondition Button
    And user click the Got it button
    And user click the acceptsTermsAndConditions checkBox
    Then user click the Accept_Got_It button
    When user click the Paysecurely button
    And User did not want to continue the payment ,so he/she click the backButton
    And user Cancel the Payment
    Then user tried to Retry the Payment
    And user return to the Depsoit Summary Page
