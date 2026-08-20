import assert from "node:assert/strict";

import MonsterCard from "../domain/card/MonsterCard.js";
import CardType from "../domain/enums/CardType.js";

const card = new MonsterCard({
  id: 1,
  name: "Dark Magician",
  attribute: "DARK",
  monsterRace: "SPELLCASTER",
  monsterType: ["NORMAL"],
  level: 7,
  attack: 2500,
  defense: 2100,
  passcode: "46986414",
  status: "UNLIMITED",
  description: "The ultimate wizard in terms of attack and defense.",
  imageUrl: "dark-magician.png",
});

assert.equal(card.getCardType(), CardType.MONSTER);
assert.equal(card.name, "Dark Magician");
assert.equal(card.attribute, "DARK");
assert.equal(card.monsterRace, "SPELLCASTER");
assert.deepEqual(card.monsterType, ["NORMAL"]);
assert.equal(card.level, 7);
assert.equal(card.attack, 2500);
assert.equal(card.defense, 2100);

// coisas herdadas

assert.equal(card.id, 1);
assert.equal(card.passcode, "46986414");
assert.equal(card.status, "UNLIMITED");
assert.equal(
  card.description,
  "The ultimate wizard in terms of attack and defense."
);
assert.equal(card.imageUrl, "dark-magician.png");

console.log("✓ MonsterCard: tipo da carta está correto");