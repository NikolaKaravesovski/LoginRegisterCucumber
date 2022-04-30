Feature: Login

  Scenario: With Valid User Credentials
    Given As Admin User i Should opened the browser and navigated to login page
    When I login in with username "<username>" and password "<password>"
    Then I should be redirected to <isValid> page

 
    
   Examples:
   
   |username    |  password      | isValid |
   |SkyBird     |Makedonija1903  | account |
   |SkyBird1    |Makedonija1903  | login   |
   |            |Makedonija1903& | login   |
   |SkyBird     |                | login   |
   |SkyBird     |Makedonija19803^| login   |