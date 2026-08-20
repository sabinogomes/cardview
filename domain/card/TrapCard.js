import Card from "./Card.js";
import CardType from "../enums/CardType.js";

class TrapCard extends Card {
    constructor({
        id,
        name,
        trapProperty,
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

        this.trapProperty = trapProperty;
    }

    getCardType() {
        return CardType.TRAP;
    }
}

export default TrapCard;
