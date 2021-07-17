Feature: Rest Assured feature
 

  @tag1
  Scenario: Validate XML Response 2 test
    Given I have base uri as "https://www.dataaccess.com"
    And I have base path as "/webservicesserver"
    And I have following headers:
    |Content-Type |text/xml|
    |header2 | somewhereHeaderUserf|
    And I use the payload as "NumberConversionDollars.xml"
    When I do a "POST" request on "/NumberConversion.wso"
    Then I log the Body
    And assert following in the body
    |Envelope.Body.NumberToDollarsResponse.NumberToDollarsResult|one hundred and twenty three dollars|
    
    