Feature:View Product Categories
  As a user, I want to be able to view product categories on the website

  @category
  Scenario:  View Category perfume
    Given the user is on the home page
    When he clicks on the category to display the category list
    And he select the perfume category
    Then the breadcrumb should display "Accueil","Parfums"
    And he title should be "Parfums"
    When he applies the price filter "0-100"
    Then it should display "5" perfums

  @verifyCategory
  Scenario: View Motherboards Category in English
    Given the user is on the home page
    When the user selects the language "English"
    And the application language should be set to English
    When he clicks on the category to display the category list
    And the user clicks on the "Motherboards" category
    Then the user should see the text "Prices are listed for 287 different Motherboards"
