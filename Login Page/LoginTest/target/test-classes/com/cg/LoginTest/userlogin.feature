Feature: Login

Scenario: If both are successful
  Given I am on Sample login page
   When I enter username as user1
   And I enter password as pwd1
   Then Alert successful
   
Scenario: If Username correct only
  Given I am on Sample login page
   When I enter username as user1
   And I enter password as pwd12
   Then Alert failed 
   
  Scenario: Both are wrong
  Given I am on Sample login page
   When I enter username as user12
   And I enter password as pwd12
   Then Alert failed completely
    