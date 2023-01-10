Feature: Taglarin Kullanimi

  @smoke
  Scenario: Smoke test senaryosu
    Given Smoke testi icin hazirliklar yapildi
    When Smoke testi calistiginda
    Then Smoke testi basarili olmali

    @regression
  Scenario: Regression test senaryosu
    Given Regression testi icin hazirliklar yapildi
    When Regression testi calistiginda
    Then Regression testi basarili olmali

