Feature: Register

  Scenario: With Valid User Credentials
    Given As Admin User i Should opened the browser and navigated to login page
    When  I register with username "<username>" password "<password>" and email "<email>"
    Then I should be redirected to <isValid> page

      Examples:
   
 |username        | password       | isValid    | email                     |  
 | Nikola84       | kilometar123   | false      | nikola32@test.te          |
 | random         | kilometar12    | true       | random                    | 
 |                | kilometar123   | false      | random                    | 
 | random         |                | false      | random                    |
 | random         | kilometar123   | false      |                           |