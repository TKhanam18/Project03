Feature: Other functionalities
Scenario: Verify Other Functionalities

Given I am in Landing Page
When I type on Search bar
And I Click on search icon
And I Click on shipping
Then I Click on Edit Location
And I enter zipcode
And I Click on submit
Then I verify the location