Feature: UiScrollable
@Srolling
  Scenario: Scrooling_textswitcher_kadar
    And kullanici API Demos sayfasina gidecek
    And kullanici Views sayfasina gidecek
    And kullanici textswitcher secenegini secer
    And kullanıcı next butonuna iki kez tiklar
    Then sayinin iki oldugunu verify edin