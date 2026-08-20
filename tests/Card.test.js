import assert from "node:assert/strict";
import { test } from "node:test";

import Card from "../domain/card/Card.js";

test("Card deve exigir a implementação de getCardType", () => {
  class TestCard extends Card {}

  const card = new TestCard({
    id: 1,
    name: "Test Card",
    passcode: "00000000",
    status: "UNLIMITED",
    description: "Card utilizado para testes.",
    imageUrl: "test-card.png",
  });

  assert.throws(
    () => card.getCardType(),
    {
      message: "Card type must be implemented",
    }
  );
});
