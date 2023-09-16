Feature: Check Sport Catalog
  As a user, I want to check the sport catalog and navigate to Decathlon's catalog.

  @catalog
  Scenario: View Decathlon Catalogue
    Given the user is on the home page
    When he click on the catalogue to display the catalogue list
    And he select the sport catalogue
    Then 3 results should appear
    And he click on "Decathlon"
    Then the breadcrumb should display "Magasins", "Sport", "Decathlon"
    And the title should be "Catalogue Decathlon Maroc"
