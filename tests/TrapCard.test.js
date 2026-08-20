import assert from "node:assert/strict";
import { test } from "node:test";

import TrapCard from "../domain/card/TrapCard.js";
import CardType from "../domain/enums/CardType.js";

test("TrapCard deve retornar TRAP como tipo", () => {
  const card = new TrapCard({
    id: 1,
    name: "Mirror Force",
    trapProperty: "NORMAL",
    passcode: "44095762",
    status: "UNLIMITED",
    description:
      "When an opponent's monster declares an attack: Destroy all Attack Position monsters your opponent controls.",
    imageUrl: "mirror-force.png",
  });

  assert.equal(card.getCardType(), CardType.TRAP);
});

test("TrapCard deve armazenar seus dados corretamente", () => {
  const card = new TrapCard({
    id: 1,
    name: "Mirror Force",
    trapProperty: "NORMAL",
    passcode: "44095762",
    status: "UNLIMITED",
    description:
      "When an opponent's monster declares an attack: Destroy all Attack Position monsters your opponent controls.",
    imageUrl: "mirror-force.png",
  });

  assert.equal(card.id, 1);
  assert.equal(card.name, "Mirror Force");
  assert.equal(card.trapProperty, "NORMAL");
  assert.equal(card.passcode, "44095762");
  assert.equal(card.status, "UNLIMITED");
  assert.equal(
    card.description,
    "When an opponent's monster declares an attack: Destroy all Attack Position monsters your opponent controls."
  );
  assert.equal(card.imageUrl, "mirror-force.png");
});
