Feature: Google Arama Testi

  Background: Kullanici her senaryoda google sitesinde olunacaktır
    Given Kullanici google a gider


  Scenario: Kullanıcı samsung aradiginda samsug görmelidir.
    When Kullanici samsung kelimesini arar
    Then Kullanici sayfada samsung kelimesi gectigini dogrular

  Scenario: Kullanıcı cucumber aradiginda cucumber görmelidir.
    When Kullanici cucumber kelimesini arar
    Then Kullanici sayfada cucumber kelimesi gectigini dogrular

  Scenario: Kullanıcı selenium aradiginda samsug görmelidir.
    When Kullanici selenium kelimesini arar
    Then Kullanici sayfada selenium kelimesi gectigini dogrular