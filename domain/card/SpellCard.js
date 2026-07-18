import Card from "./Card.js";

class SpellCard extends Card {
    constructor({
        id,
        name,
        spellProperty,
        passcode,
        status,
        description,
        imageUrl,
        createdAt,
        updatedAt
    }) {
        super({
            id,
            name,
            passcode,
            status,
            description,
            imageUrl,
            createdAt,
            updatedAt
        });

        this.spellProperty = spellProperty;
    }

    getCardType() {
        return CardType.SPELL;
    }
}

export default SpellCard;
