# Calculadora de Áreas em Java

Aplicação interativa em Java para calcular a área de formas geométricas utilizando conceitos de programação orientada a objetos.

---

## Visão Geral

Este projeto é uma calculadora executada no terminal que permite ao usuário calcular a área de diferentes formas geométricas por meio de um menu interativo.

Foi desenvolvido com o objetivo de praticar conceitos fundamentais de Java, como herança, polimorfismo e sobrescrita de métodos.

---

## Funcionalidades

- Menu interativo no terminal
- Cálculo de área de:
  - Quadrado
  - Retângulo
  - Círculo
  - Triângulo

- Validação de entrada (apenas valores positivos)
- Execução contínua até o usuário sair

---

## Tecnologias

- Java (JDK 8 ou superior)

---

## Conceitos Utilizados

- Programação Orientada a Objetos (POO)
- Herança
- Polimorfismo
- Sobrescrita de métodos (override)
- Encapsulamento
- Entrada de dados com Scanner

---

## Estrutura do Projeto

```bash
java-area-calculator/
├── src/
│   ├── Main.java
│   ├── FormaGeometrica.java
│   ├── Quadrado.java
│   ├── Retangulo.java
│   ├── Circulo.java
│   └── Triangulo.java
└── README.md
```

---

## Como Executar

1. Acesse a pasta do projeto:

```bash
cd java-area-calculator/src
```

2. Compile os arquivos:

```bash
javac *.java
```

3. Execute o programa:

```bash
java Main
```

---

## Exemplo de Uso

```
****** CALCULADORA DE ÁREAS ******
1 - Quadrado
2 - Retângulo
3 - Círculo
4 - Triângulo
0 - Sair

Escolha uma opção: 1
Digite o lado do quadrado: 4

Área do quadrado: 16.00
```

---

## Possíveis Melhorias

- Adicionar novas formas geométricas
- Melhorar a interface do terminal
- Criar versão com interface gráfica (JavaFX ou Swing)
- Organizar o projeto com packages

---

## Autor

Projeto desenvolvido como parte dos estudos em Java.
