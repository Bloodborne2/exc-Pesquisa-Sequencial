# 📌 Ordenação e Busca em Java

Este programa implementa a ordenação de um vetor de nomes utilizando os métodos de **Seleção**, **Inserção** e **Troca**. Após a ordenação, realiza a **Pesquisa Binária** e a **Pesquisa Sequencial** para encontrar a posição de um nome específico.

## 📖 Funcionalidade

O programa recebe um vetor desordenado de nomes e realiza a ordenação de três formas diferentes. Após isso, permite buscar um nome no vetor ordenado usando pesquisa binária e pesquisa sequencial. Ele compara as etapas percorridas em cada método de busca.

## 🏗️ Estrutura do Código

A implementação conta com métodos específicos para cada tipo de ordenação e busca. Cada método percorre o vetor de forma diferente, mostrando as trocas e comparações feitas até a conclusão da busca.

## ⚙️ Execução

Para executar o programa, compile e execute o arquivo Java:

```bash
javac Main.java
java Main
O programa imprimirá o vetor ordenado e mostrará os passos da busca pelo nome "JORGE" em cada método de pesquisa.

📌 Exemplo de Entrada
O vetor original de nomes é:

["JAIR", "VALDIR", "CARLOS", "JORGE", "BIA", "ANA", "ZÉLIA", "MANOEL", "CARLA"]
Após a ordenação, o vetor fica:

["ANA", "BIA", "CARLA", "CARLOS", "JAIR", "JORGE", "MANOEL", "VALDIR", "ZÉLIA"]
🔎 Resultado da Busca
Ao buscar "JORGE":

Pesquisa Sequencial: Percorre as posições uma a uma até encontrar o nome.

Pesquisa Binária: Divide o vetor ao meio a cada iteração até localizar o nome.

O programa exibe os passos realizados em cada método.

🎯 Objetivo
Esse código demonstra a eficiência de diferentes algoritmos de ordenação e busca, permitindo comparar a quantidade de operações executadas para encontrar um elemento.


Esse **README.md** está bem estruturado e segue o formato adequado para um repositório no GitHub. Se preci
