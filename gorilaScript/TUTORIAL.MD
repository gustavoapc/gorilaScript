
# Guia de instruções para o ANTLR do GorilaScript
Para rodar quaisquer dos comandos abaixos, é de extrema importancia que esteja no diretorio **'gorilaScript'**
Foi testado e projetado para o Codespaces, porém como o Codespaces não é compativel com Java Swing. No final do manual temos dicas para execução da interface gráfica em Windows.

### 1. Para acessar o diretório correto de execução
```cd /workspaces/gorilaScript/gorilaScript/```

### 2. Para executar o código e as gramaticas:

```java -jar antlr.jar GorilaScript.g4 -o gen```

### 3. Para compilar a linguagem e suas classes, use: (os arquivos irão para a pasta bin)

```javac -cp antlr.jar:gen *.java gen/*.java -d bin```

### 4. Para executar a main e gerar o código em Java:

```java -cp antlr.jar:bin MainGorilaScript```


## Guia para executar a aplicação a partir do código em Java gerado a partir de gorilaScript

### 5. Acessar a pasta onde o código gerado está:
```cd /workspaces/gorilaScript/gorilaScript/out```

### 6. Compilar o arquivo gerado Java:
```javac GeneratedCode.java```

### 7. Compilar o arquivo de comunicação com o usuário:
```javac Main.java```

### 8. Executar o arquivo de comunicação com o usuário:
```java Main```

## Guia para utilizar a interface gráfica
Caso deseje utilizar a **interface gráfica** deverá seguir o passo a instrução abaixo.

**Fazer download do repositório e executar o mesmos passos executando o arquivo "```SwingMain```" ao invés de "```Main```"**.

No Windows, conseguimos sucesso utilizando a IDE **IntelliJ**, recomendamos o uso para executar em **Windows**.
