Feature: View and Search Brand Products
  As a user, I want to view products related to specific brands and search for products using keywords.

  @viewBrand
  Scenario: View Brand Apple
    Given the user is on the home page
    When he clicks on the brand to display the brand list
    And he select the apple brand
    Then the breadcrumb should display as "Accueil","Apple"
    And  the title must be "Apple"
    When he chooses "mouse"
    Then it should display "2" mouses

    @bsearchBrand
 Scenario Outline: Search Lexmark printer
    Given the user is on the home page
    When the user types <keyword> in the search box and validates
    And the user clicks on "Printers"
    And the user should see "402" results
    When the user filters the results by brand "Lexmark"
    Then the user should see printer name's "Lexmark E460dn"
      Examples:
        |   keyword  |
        |"Imprimante"|
