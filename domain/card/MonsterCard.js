import Card from "./Card.js";

class MonsterCard extends Card {
  constructor({
    id,
    name,
    attribute,
    monsterRace,
    monsterType,
    level,
    attack,
    defense,
    passcode,
    status,
    description,
    imageUrl,
    createdAt,
    updatedAt
  }) {
    super({
      id,
      updatedAt,
      createdAt,
      name,
      passcode,
      status,
      description,
      imageUrl,
    });

    this.attribute = attribute;
    this.monsterRace = monsterRace;
    this.monsterType = monsterType;
    this.level = level;
    this.attack = attack;
    this.defense = defense;
  }
}

export default MonsterCard;