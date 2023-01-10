Feature: Amazon Search Feature

  Scenario Outline: Kullanıcı aratacagı kelimeyi sonuçlarda gorebilmelidir
    Given Kullanici amazon sitesine gider
    When Kullanici amazonda "<kelime>" aratir
    Then Kullanici arama sonuclarinda "<kelime>" görmelidir
    And Kullanici ekran goruntusu alir
    And Kullanici browseri kapatir

    Examples:
    |kelime|
    |mac   |
    |windows|
    |linux  |