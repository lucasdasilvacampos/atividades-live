# 💼 Desafio Java: Controle de Turma Simples

## 🧠 Regras do Desafio

### 1. Classe `Aluno`
- Atributos:
    - `String nome`
    - `int idade`
- Métodos:
    - Getters e Setters para `nome` e `idade`
    - `boolean maiorDeIdade()`  
      Retorna `true` se a idade for **maior ou igual a 18**

---

### 2. Classe `Turma`
- Atributo:
    - `Aluno[] alunos` (array com até 5 alunos)
- Métodos:
    - `void adicionarAluno(Aluno a)`  
      Adiciona um aluno no array **se houver espaço disponível**
    - `void listarMaioresDeIdade()`  
      Percorre o array e imprime os nomes dos alunos que são **maiores de idade**

---

### 3. No método `main`
- Crie uma instância de `Turma`
- Crie e adicione **5 alunos** com idades variadas
- Chame o método `listarMaioresDeIdade()` para exibir quem é maior de idade

---

## ✅ Exemplo de saída esperada