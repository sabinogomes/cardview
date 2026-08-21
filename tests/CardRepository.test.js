import assert from "node:assert/strict";
import { test } from "node:test";

import CardRepository from "../repository/CardRepository.js";

import MonsterCard from "../domain/card/MonsterCard.js";
import MonsterAttribute from "../domain/enums/MonsterAttribute.js";
import MonsterRace from "../domain/enums/MonsterRace.js";
import MonsterType from "../domain/enums/MonsterType.js";
import CardStatus from "../domain/enums/CardStatus.js";

test("CardRepository deve encontrar uma carta pelo id", () => {
  const repository = new CardRepository();

  const card = repository.findById(1);

  assert.ok(card);
  assert.equal(card.id, 1);
  assert.equal(card.name, "Dark Magician");
});

test("CardRepository deve retornar undefined quando a carta não existe", () => {
  const repository = new CardRepository();

  const card = repository.findById(999);

  assert.equal(card, undefined);
});

test("CardRepository deve retornar todas as cartas", () => {
  const repository = new CardRepository();

  const cards = repository.findAll();

  assert.ok(Array.isArray(cards));
  assert.equal(cards.length, 5);
});

test("CardRepository deve salvar uma carta", () => {
  const repository = new CardRepository();

  const card = new MonsterCard({
    id: 6,
    name: "Blue-Eyes White Dragon",
    attribute: MonsterAttribute.LIGHT,
    monsterRace: MonsterRace.DRAGON,
    monsterType: [MonsterType.NORMAL],
    level: 8,
    attack: 3000,
    defense: 2500,
    passcode: "89631139",
    status: CardStatus.UNLIMITED,
    description: "A legendary dragon.",
    imageUrl: "blue-eyes-white-dragon.png",
    createdAt: new Date(),
    updatedAt: new Date(),
  });

  repository.save(card);

  assert.ok(repository.findById(6));

  repository.deleteById(6);

  assert.equal(repository.findById(6), undefined);
});

test("CardRepository deve excluir uma carta pelo id", () => {
  const repository = new CardRepository();

  const card = new MonsterCard({
    id: 6,
    name: "Blue-Eyes White Dragon",
    attribute: MonsterAttribute.LIGHT,
    monsterRace: MonsterRace.DRAGON,
    monsterType: [MonsterType.NORMAL],
    level: 8,
    attack: 3000,
    defense: 2500,
    passcode: "89631139",
    status: CardStatus.UNLIMITED,
    description: "A legendary dragon.",
    imageUrl: "blue-eyes-white-dragon.png",
    createdAt: new Date(),
    updatedAt: new Date(),
  });

  repository.save(card);

  assert.ok(repository.findById(6));

  repository.deleteById(6);

  assert.equal(repository.findById(6), undefined);
});

test("CardRepository não deve fazer nada ao excluir uma carta inexistente", () => {
  const repository = new CardRepository();

  assert.doesNotThrow(() => {
    repository.deleteById(999);
  });
});
