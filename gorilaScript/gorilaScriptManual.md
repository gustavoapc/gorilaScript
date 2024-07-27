# gorilaScript
Seja bem-vindo ao manual do usuário do gorilaScript, a sua linguagem de scripting.

## As funcionalidades do gorilaScript são semelhantes a de linguaguens já existentes:

 - Funções
 - Print
 - Estruturas condicionais
 - Estruturas de Repetição

## O gorilaScript é compilado em Java.
A sintaxe do gorila script deve ser semelhante/análoga a disponível abaixo:

## Primeiros passos para começar a escrever em gorilaScript:
O gorilaScript consiste em uma ou mais funções. Portanto, para entendê-lo, vamos começar o nosso guia demonstrando como declarar funções em gorilaScript:
#### Declarando funções: 
Uma função em gorilaScript é declarada usando a palavra reservada 'fun', seus parâmetros são definidos entre parênteses e o tipo de retorno vem logo após os parâmetros. 
```
fun minhaFuncao(int id, string valor) int
    // código
    return retorno
```

#### Como os statements são formados? 
1. ##### Declarando variáveis: 
    Para declarar uma variável em gorilaScript: 
    `{tipo} {nome} = {valor}`
    Por exemplo, para definir um inteiro: 
    `int var = 3`
    Os tipos primitivos suportados são: 
    - int 
    - float
    - char
    - string
    - boolean
    - double
2. ##### Estrutura condicional
    Estruturas condicionais em gorilaScript são simples: 
    ```
    if condicao: 
        // código
    else: 
        // código
    :
    ```
2. ##### Estruturas de repetição: 
    *Definindo uma estrutura for:*
    ```
    for var = 2: 
        // código
    :
    ```
    *Definindo uma estrutura while:*
    ```
    while condicao: 
        // código
    :
    ```
4. ##### Bloco try/catch e exceções
    O tratamento de exceções em gorilaScript é feito da seguinte forma: 
    ```
    try: 
        // código
    catch(exceção): 
        // tratamento
    :
    ```
    Podemos lançar excessões usando o comando throw da seguinte forma:
    ```
    throw "mensagem de erro"
    ```

#### Para printar em gorilaScript, é simples: 
    `print "valor":`