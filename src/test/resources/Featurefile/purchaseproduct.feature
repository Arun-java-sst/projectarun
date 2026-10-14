@login
Feature:User Have to Purchase Gifts in Blossom Gift
Background:
Given Maximize, handle synchronization and clear popup

@smoke
Scenario Outline: User Have to Login and purchase gifts by all functionalities  

When User Have to pass the "<gmail>" and "<password>" and click login
And User Have to select gift
     
And User Have to fill the gift message
      |Kumar|               #0
      |Love~Foreever|       #1
      |kumararun321|        #2
      |V2T7IL|              #3
And User Have to fill the delivery address details

And User Have to doing payment
     |cardnum|4242424242424242|
     |expdt|1230|
Then User Have place order

Examples:
     |gmail|password|
     |arunkumar06mugam@gmail.com|Test@12345|