Feature: addGame

#Add game successfully:
  Scenario:
    Given I am on the add "game" page
    When I enter title as "Zelda"
    And I enter release year as "2017"
    And I enter creators as "Nintendo"
    And I enter image url as "https://i.guim.co.uk/img/media/67edb515d6a2b19ef10b002c6bdd44b40b284316/112_0_1734_1041/master/1734.jpg?width=1200&height=1200&quality=85&auto=format&fit=crop&s=70196ea85a9cc1780e39ed4a960c73d1"
    And I enter video url as "https://www.youtube.com/embed/1rPxiXXxftE"
    And I click add
    Then Item should be added with title of "Zelda"


#Add game unsuccessfully:
  Scenario:
    Given I am on the add "game" page
    When I enter title as "God Of War"
    And I enter release year as "2017"
    And I enter creators as "Nintendo"
    And I enter image url as "https://i.guim.co.uk/img/media/67edb515d6a2b19ef10b002c6bdd44b40b284316/112_0_1734_1041/master/1734.jpg?width=1200&height=1200&quality=85&auto=format&fit=crop&s=70196ea85a9cc1780e39ed4a960c73d1"
    And I enter video url as "https://www.youtube.com/embed/1rPxiXXxftE"
    And I click add
    Then Item should be added with title of "Halo CE"