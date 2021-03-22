$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Post.feature");
formatter.feature({
  "comments": [
    {
      "line": 3,
      "value": "#Funcionalidade: Consulta"
    },
    {
      "line": 4,
      "value": "#Cenario: Consultar Ovo de Pascoa"
    },
    {
      "line": 5,
      "value": "#Dado  que acesso o site Wikipedia em Portugues"
    },
    {
      "line": 6,
      "value": "#Quando pesquiso por \"Ovo de Pascoa\""
    },
    {
      "line": 7,
      "value": "#Entao exibe a expressao \"Ovo de Pascoa\" no titulo da guia"
    },
    {
      "line": 8,
      "value": "#executa pela feature, depois runner,"
    }
  ],
  "line": 12,
  "name": ": Consulta",
  "description": "",
  "id": ":-consulta",
  "keyword": "Feature"
});
formatter.before({
  "duration": 2917620700,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": ": Consultar Ovo de Pascoa",
  "description": "",
  "id": ":-consulta;:-consultar-ovo-de-pascoa",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 14,
  "name": "que acesso o site Wikipedia em Portugues",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "pesquiso por \"Ovo de Pascoa\"",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "exibe a expressao \"Ovo de Pascoa\" no titulo da guia",
  "keyword": "Then "
});
formatter.match({
  "location": "Post.queAcessoOSiteWikipediaEmPortugues()"
});
formatter.result({
  "duration": 5528946900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Ovo de Pascoa",
      "offset": 14
    }
  ],
  "location": "Post.pesquisoPor(String)"
});
formatter.result({
  "duration": 3234413200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Ovo de Pascoa",
      "offset": 19
    }
  ],
  "location": "Post.exibeAExpressaoNoTituloDaGuia(String)"
});
formatter.result({
  "duration": 128377100,
  "status": "passed"
});
formatter.after({
  "duration": 1185135200,
  "status": "passed"
});
});