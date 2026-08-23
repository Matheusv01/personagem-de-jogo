# ⚔️ Sistema de Personagem (RPG em Java)

Projeto desenvolvido em Java para aplicar conceitos essenciais de **Orientação a Objetos** e **Encapsulamento**, simulando o gerenciamento de status de um personagem de jogo.

---

## 📌 Sobre o Projeto

O objetivo do projeto é controlar a vida e a energia de um personagem por meio de regras de negócio estritas. O sistema impede a alteração livre dos atributos e garante a validação dos limites através de ações de jogo.

### 🎯 Funcionalidades

* **Encapsulamento e Proteção:** Atributos protegidos sem a presença de métodos `setter` diretos.
* **Validação de Limites:** Controle de vida e energia dentro da escala de 0 a 100, com nível inicial padrão fixado em 1.
* **Ações de Negócio:**
  * `receberDano(int dano)`: Subtrai a vida mantendo o limite mínimo em 0.
  * `descansar()`: Recupera a energia respeitando o teto máximo de 100.
  * `atacar()`: Consome energia e bloqueia a ação se a energia for insuficiente.
* **Cálculo Automático de Status:**
  * **Vivo:** Vida maior que 0.
  * **Derrotado:** Vida igual a 0.

---

## 🛠️ Tecnologias Utilizadas

* **Linguagem:** Java
* **Paradigma:** Orientação a Objetos (POO)
* **Recursos do Java Moderno:** Uso de `java.lang.IO.*` (Preview Features / Implicitly Declared Classes)

---
