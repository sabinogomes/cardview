import SpellCard from "../domain/card/SpellCard.js";
import TrapCard from "../domain/card/TrapCard.js";
import SpellProperty from "../domain/enums/SpellProperty.js";
import TrapProperty from "../domain/enums/TrapProperty.js";
import CardStatus from "../domain/enums/CardStatus.js";

const spellAndTrap = [
    new TrapCard({
        id: 6,
        name: "Seven Tools of the Bandit",
        trapProperty: TrapProperty.COUNTER,
        passcode: "03819470",
        status: CardStatus.UNLIMITED,
        description: "When a Trap Card is activated: Pay 1000 LP; negate the activation and destroy it.",
        imageUrl: "seven-tools-of-the-bandit.png",
        createdAt: new Date(),
        updatedAt: new Date(),
    }),

    new SpellCard({
        id: 7,
        name: "Double Spell",
        spellProperty: SpellProperty.NORMAL,
        passcode: "24096228",
        status: CardStatus.UNLIMITED,
        description: "Discard 1 Spell Card from your hand. Select 1 Spell Card from your opponent's Graveyard and use it as your own.",
        imageUrl: "double-spell.png",
        createdAt: new Date(),
        updatedAt: new Date(),
    }),

    new SpellCard({
        id: 8,
        name: "Card Destruction",
        spellProperty: SpellProperty.NORMAL,
        passcode: "72892473",
        status: CardStatus.UNLIMITED,
        description: "Each player discards their entire hand, then draws the same number of cards they discarded.",
        imageUrl: "card-destruction.png",
        createdAt: new Date(),
        updatedAt: new Date(),
    }),

    new TrapCard({
        id: 9,
        name: "Magic Jammer",
        trapProperty: TrapProperty.COUNTER,
        passcode: "77414722",
        status: CardStatus.UNLIMITED,
        description: "When a Spell Card is activated: You can discard 1 card; negate the activation and destroy that Spell Card.",
        imageUrl: "magic-jammer.png",
        createdAt: new Date(),
        updatedAt: new Date(),
    }),

    new TrapCard({
        id: 10,
        name: "Mirror Force",
        trapProperty: TrapProperty.NORMAL,
        passcode: "44095762",
        status: CardStatus.UNLIMITED,
        description: "When an opponent's monster declares an attack: Destroy all Attack Position monsters your opponent controls.",
        imageUrl: "mirror-force.png",
        createdAt: new Date(),
        updatedAt: new Date(),
    }),
];

export default spellAndTrap;
