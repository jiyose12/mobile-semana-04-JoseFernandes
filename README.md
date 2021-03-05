# mobile-semana-04-JoseFernandes
# DESCRIÇÃO
Desenvolva um aplicativo para obter o nome e o ano de nascimento de uma pessoa. Esse aplicativo
deverá calcular e exibir a respectiva idade.
# REQUISITOS
O aplicativo deverá possuir 02 (duas) telas.
A tela inicial (principal) deverá conter os campos para obtenção do nome e da idade (Figura 01). A tela
é subdividida em 4 (quatro) áreas de igual proporção, conforme especificação a seguir:

| Área  |  Descrição  |
| ------------------- | ------------------- |
|  Primeira |  Contém apenas a descrição (QUANTOS ANOS VOCÊ TEM?!) do aplicativo |
|  Segunda |  Contém um EditText configurado com hint (android:hint="Informe seu nome") |
|  Terceira |  Contém um EditText configurado com hint (android:hint="Informe o ano que nasceu") e teclado numérico (android:inputType="number") |
|  Quarta |  Contém um Button, com o texto “Calcular”. |

A segunda tela deve possuir apenas um texto (TextView) para informar a idade calculada

Ao clicar em “Calcular”, o aplicativo deverá gerar um objeto do tipo “Pessoa”. Segue o código da classe:


```kotlin
class Pessoa {
  var nome: String
  var ano: Int
  constructor(nome: String, ano: Int){
    this.nome = nome
    this.ano = ano
  }
  fun idade(): Int{
    return 2021 - this.ano
  }
}
```

A segunda tela receberá o objeto “Pessoa” e através do método “idade()” deverá obter a idade calculada para exibir na mensagem da tela.

A segunda tela deverá registrar um listener para identificar o click no texto (TextView). Ao tocar no texto, o aplicativo deverá encerrar a segunda tela e retornar para tela principal (MainActivity).

# RESPOSTA
<div align="center">
<img width=250 heigh=500 src="https://raw.githubusercontent.com/jiyose12/mobile-semana-04-JoseFernandes/master/tela01.jpeg"/>
<img width=250 heigh=500 src="https://raw.githubusercontent.com/jiyose12/mobile-semana-04-JoseFernandes/master/tela02.jpeg"/>
</div>

[foto0]: <tela01.jpeg>
[foto1]: <tela02.jpeg>
