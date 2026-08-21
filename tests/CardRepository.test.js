import assert from "node:assert/strict";
import { test } from "node:test";

import CardRepository from "../repository/CardRepository.js";

test("CardRepository deve encontrar uma carta pelo id", () => {
  const repository = new CardRepository();

  const card = repository.findById(1);

  assert.ok(card);
  assert.equal(card.id, 1);
  assert.equal(card.name, "Dark Magician");
});
