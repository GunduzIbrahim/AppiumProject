@toast
Feature: Android Testing
  Scenario: Popup Toast
    When kullanici API Demos sayfasina gidecek
    And kullanici Views sayfasina gidecek
    And kullanici Expandable Lists sayfasina gidecek
    And kullanici Custom Adapter sayfasina gidecek
    And kulanici People Names basili tutacak ve popup acilacak
    And kullanici Simple action tiklayacak
    Then Tost mesaj "People Names" icerdigini onayla
    Then take the screenshot