import BaseEntity from "../base/BaseEntity.js";

class Card extends BaseEntity {
  constructor({
    id,
    createdAt,
    updatedAt,
    name,
    passcode,
    status,
    description,
    imageUrl,
  }) {
    super({
      id,
      createdAt,
      updatedAt,
    });

    this.name = name;
    this.passcode = passcode;
    this.status = status;
    this.description = description;
    this.imageUrl = imageUrl;
  }
}

export default Card;
