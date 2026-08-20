import assert from "node:assert/strict";
import { test } from "node:test";

import SpellCard from "../domain/card/SpellCard.js";
import CardType from "../domain/enums/CardType.js";

test("SpellCard deve retornar SPELL como tipo", () => {
  const card = new SpellCard({
    id: 1,
    name: "Monster Reborn",
    spellProperty: "NORMAL",
    passcode: "83764718",
    status: "UNLIMITED",
    description: "Target 1 monster in either GY; Special Summon it.",
    imageUrl: "monster-reborn.png",
  });

  assert.equal(card.getCardType(), CardType.SPELL);
});

test("SpellCard deve armazenar seus dados corretamente", () => {
  const card = new SpellCard({
    id: 1,
    name: "Monster Reborn",
    spellProperty: "NORMAL",
    passcode: "83764718",
    status: "UNLIMITED",
    description: "Target 1 monster in either GY; Special Summon it.",
    imageUrl: "monster-reborn.png",
  });

  assert.equal(card.id, 1);
  assert.equal(card.name, "Monster Reborn");
  assert.equal(card.spellProperty, "NORMAL");
  assert.equal(card.passcode, "83764718");
  assert.equal(card.status, "UNLIMITED");
  assert.equal(
    card.description,
    "Target 1 monster in either GY; Special Summon it."
  );
  assert.equal(card.imageUrl, "monster-reborn.png");
});
