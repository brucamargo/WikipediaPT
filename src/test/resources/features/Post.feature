

  #Funcionalidade: Consulta
    #Cenario: Consultar Ovo de Pascoa
      #Dado  que acesso o site Wikipedia em Portugues
      #Quando pesquiso por "Ovo de Pascoa"
      #Entao exibe a expressao "Ovo de Pascoa" no titulo da guia
    #executa pela feature, depois runner,



Feature: : Consulta
  Scenario: : Consultar Ovo de Pascoa
    Given  que acesso o site Wikipedia em Portugues
    When pesquiso por "Ovo de Pascoa"
    Then exibe a expressao "Ovo de Pascoa" no titulo da guia



