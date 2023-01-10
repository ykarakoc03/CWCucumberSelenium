Feature: Google Arama Feature

  #Scenario Outline DDT(Data Driven Test) yapma yetenegini bizlere saglar
  #Testlerimiz tabloda bulunan satır sayısı (ilk satır haric) kadar çalışıp testi yapar

  Scenario Outline:
    Given Kullanici google sayfasindadir
    When Kullanici "<aranacakKelime>" arattiginda
    Then Kullanici title da "<dogrulanacakKelime>" gormelidir

    Examples:
    |aranacakKelime|dogrulanacakKelime|
    |samsung       |samsung           |
    |cucumber      |cucumber          |
    |selenium      |selenium          |