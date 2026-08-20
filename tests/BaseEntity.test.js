import assert from "node:assert/strict";
import { test } from "node:test";

import BaseEntity from "../domain/base/BaseEntity.js";

test("BaseEntity deve armazenar seus dados corretamente", () => {
  const createdAt = new Date("2026-08-20T12:00:00.000Z");
  const updatedAt = new Date("2026-08-20T13:00:00.000Z");

  const entity = new BaseEntity({
    id: 1,
    createdAt,
    updatedAt,
  });

  assert.equal(entity.id, 1);
  assert.equal(entity.createdAt, createdAt);
  assert.equal(entity.updatedAt, updatedAt);
});
