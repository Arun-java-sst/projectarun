@login2
Feature: User have to validate the login function in login page in blosoomgifts 
  Background:
   Given Maximize, handle synchronization and clear popup
    
   
  Scenario: Validate with valid gmail and valid password for adactin 
    When  User Have to pass the valid "<gmail>" and valid "<password>" and click login
      |arunkumar06mugam@gmail.com| #0
      |Test@12345|       #1
      |kumararun321| #2
      |V2T7IL|       #3
     

  Scenario: Validate with invalid gmail and valid password for adactin
    When  User Have to pass the invalid "<gmail>" and valid "<password>" and click login
     |arunkumaru8|Test@12345| #list1
     |kumararun31|V2T7IL| #list2
     |321kumararun|LI73V|  #list3
   
   
  Scenario: Validate with valid gmail and invalid password for adactin
    When  User Have to pass the valid "<gmail>" and invalid "<password>" and click login
     |gmail|arunkumar06mugam@gmail.com|
     |password|V2Trt|
     
    
  Scenario: Validate with invalid gmail and invalid password for adactin
    When  User Have to pass the invalid "<gmail>" and invalid "<password>" and click login
     |gmail|password|
     |ary765huma|ghjh788|
     |aryunkuma|vgh67|
     |ytfkumar|hhh678|
 
  
  