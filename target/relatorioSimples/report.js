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
    }
  ],
  "line": 11,
  "name": ": Consulta",
  "description": "",
  "id": ":-consulta",
  "keyword": "Feature"
});
formatter.before({
  "duration": 10399427900,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": ": Consultar Ovo de Pascoa",
  "description": "",
  "id": ":-consulta;:-consultar-ovo-de-pascoa",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 13,
  "name": "que acesso o site Wikipedia em Portugues",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "pesquiso por \"Ovo de Pascoa\"",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "exibe a expressao \"Ovo de Pascoa\" no titulo da guia",
  "keyword": "Then "
});
formatter.match({
  "location": "Post.queAcessoOSiteWikipediaEmPortugues()"
});
formatter.result({
  "duration": 5843337100,
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
  "duration": 3018023500,
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
  "duration": 144595800,
  "status": "passed"
});
formatter.after({
  "duration": 1102741200,
  "status": "passed"
});
});