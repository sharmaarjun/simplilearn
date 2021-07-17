#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Login
  I want to use this template for my feature file

	Background: Clear cache
		Given The existing cache should be removed


  @login @smoke @dev
  Scenario: Login with valid credentials
    Given User is registered with company
    And Status of user is active
    When I login with UN(arjun) and PWD(qwerty)
    And click on login button
    Then I am able to login 

	@login @sanity @regression
	Scenario: Login with Invalid credentials
		When I login with UN(admin) and PWD(root)
		And click on login button
		Then I should not be able to login
		
#		@param
#		Scenario Outline: Successful login with param data
#		Given user is registered
#		When user navigates to login page
#		And enters the <username> and <password>
#		Then user is able to login
#		Examples:
#		| username | password |
#		| arjun 	 | qwerty   |
#		| admin    | root     |

		@dataparam
		Scenario: Login with dataparam scene
		When user navigates to login page
		And enter the data
		|arjun|qwerty|
		|admin|root  |
		Then Login or No Login

  #@tag2
  #Scenario Outline: Title of your scenario outline
    #Given I want to write a step with <name>
    #When I check for the <value> in step
    #Then I verify the <status> in step
#
    #Examples: 
      #| name  | value | status  |
      #| name1 |     5 | success |
      #| name2 |     7 | Fail    |
