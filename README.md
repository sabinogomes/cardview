# CardView

Projeto de estudo desenvolvido em **Node.js** para modelagem e gerenciamento de cartas de Yu-Gi-Oh!.

O objetivo é praticar conceitos de orientação a objetos, organização de domínio e arquitetura em camadas utilizando JavaScript.

## Tecnologias

- Node.js
- JavaScript (ES Modules)

## Estrutura do projeto

```text
src/
├── data
│   └── monsters.js        # Dados iniciais das cartas
│
├── domain
│   ├── base              # Classes base das entidades
│   ├── card              # Entidades de cartas
│   └── enums             # Valores fixos do domínio
│
├── repository            # Acesso e manipulação dos dados
│
└── main.js               # Ponto de entrada da aplicação
```

## Funcionalidades atuais

- Modelagem de entidades de cartas
- Criação de cartas de monstros
- Enums para atributos do jogo:
  - Raça do monstro
  - Tipo do monstro
  - Atributo elemental
  - Status da carta
  - Propriedades de Magias e Armadilhas
- Repository para busca de cartas

## Exemplo

Uma carta de monstro possui informações como:

```javascript
{
  name: "Dark Magician",
  attribute: "DARK",
  monsterRace: "SPELLCASTER",
  level: 7,
  attack: 2500,
  defense: 2100
}
```

## Próximos passos

- Implementar cartas de Magia e Armadilha
- Criar sistema de deck
- Implementar regras básicas de duelo
- Criar persistência de dados
- Criar API para consulta das cartas

## Licença

Este projeto está licenciado sob a licença MIT.

Você pode utilizar, modificar e distribuir este projeto livremente, desde que mantenha os créditos originais e o aviso de licença.

Consulte o arquivo [LICENSE](LICENSE) para mais detalhes.

---

Projeto criado para fins de estudo e prática de desenvolvimento de software.