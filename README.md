# Demonstração de Herança e Polimorfismo em Java - Solutis School Dev Trail

Este repositório apresenta um projeto de estudo prático sobre os conceitos de herança e polimorfismo em Java. O objetivo é explorar como classes base e suas derivadas podem ser utilizadas para modelar diferentes entidades em cenários como um zoológico e uma empresa, promovendo a reutilização de código e a implementação de comportamento especializado.

## Visão Geral do Projeto

O projeto está organizado em dois módulos principais: um dedicado à simulação de um zoológico, onde diferentes tipos de animais são modelados, e outro que simula uma estrutura empresarial, com funcionários em diversos níveis de escolaridade e cargos. As classes estão devidamente organizadas em pacotes dentro do diretório `src`.

### Pacote `animal`
- **Descrição:**
  - Este pacote contém a modelagem de um zoológico, onde cada classe representa um tipo de animal ou entidade relacionada.

- **Componentes Principais:**
  - **Animal.java**: Classe abstrata que define os atributos comuns, como `nome` e `idade`, e métodos genéricos para os animais. Serve como base para classes especializadas.
  - **Cachorro.java, Cavalo.java, Preguica.java**: Subclasses que estendem `Animal`, cada uma implementando comportamentos específicos, como sons e ações típicas dos respectivos animais.
  - **Veterinario.java**: Classe responsável por realizar exames nos animais, utilizando polimorfismo para invocar o método `produzirSom()` de maneira genérica.
  - **Zoologico.java**: Classe que administra um conjunto de jaulas, contendo diferentes animais, e permite a interação com eles, como ouvir seus sons e observar suas ações.
  - **Main**: Classe de entrada que executa a simulação do zoológico.

### Pacote `empresa`
- **Descrição:**
  - Este pacote modela uma estrutura empresarial, onde diferentes tipos de funcionários, com níveis de escolaridade distintos, são representados.

- **Componentes Principais:**
  - **Funcionario.java**: Classe base que define os atributos e métodos comuns a todos os funcionários, como `nome`, `codigoFuncional`, `rendaTotal`, e `comissao`. Inclui o método `calcularRendaTotal()`, que é sobrescrito nas subclasses para ajustar a remuneração total conforme o cargo e a formação.
  - **FuncionarioEnsinoBasico.java, FuncionarioEnsinoMedio.java, FuncionarioGraduacao.java**: Subclasses que estendem `Funcionario`, ajustando a remuneração e outros atributos com base no nível de escolaridade.
  - **Comissao.java**: Classe abstrata que define a lógica para calcular a comissão dos funcionários, servindo de base para classes específicas.
  - **Gerente.java, Supervisor.java, Vendedor.java**: Subclasses de `Comissao` que representam diferentes cargos dentro da empresa, cada um com uma lógica específica para o cálculo da comissão.
  - **MainEmpresa.java**: Classe de entrada que executa a simulação da empresa, permitindo a criação de funcionários com diferentes níveis de escolaridade e cargos, e o cálculo de suas remunerações.

## Conceitos Explorados

Este projeto visa ilustrar como a herança e o polimorfismo podem ser aplicados para criar sistemas de classes robustos em Java. A herança permite que classes especializadas reutilizem código das classes base, enquanto o polimorfismo possibilita o uso de uma interface comum para manipular objetos de diferentes tipos de forma genérica.

## Exemplo de Uso

A seguir, um exemplo de como instanciar e utilizar a classe `Cachorro` no contexto do zoológico:

```java
Cachorro cachorro = new Cachorro("Caramelo", 3);
System.out.println("Nome do cachorro: " + cachorro.obterNome());
cachorro.produzirSom(); // Exibe "Au Au"
cachorro.executarAcao(); // Exibe "O cachorro está brincando com uma bola"
```

## Compilação e Execução

Para compilar e executar o projeto, siga os passos abaixo:

1. **Compilação:**
   
   ```bash
    javac src/animal/*.java src/empresa/*.java
   
2. **Execução da simulação do Zoológico:**

   ```bash
   java animal.Main

3. **Execução da simulação da Empresa:**

   ```bash
   java empresa.MainEmpresa
   ```
   
### Considerações Finais
Este projeto serve como um exemplo prático de como herança e polimorfismo podem ser empregados para criar um sistema de classes em Java. A flexibilidade e a reutilização de código proporcionadas por essas técnicas são fundamentais em projetos de software que exigem manutenibilidade e extensibilidade.   
