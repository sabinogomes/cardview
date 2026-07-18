import MonsterCard from "../domain/card/MonsterCard.js";
import MonsterAttribute from "../domain/enums/MonsterAttribute.js";
import MonsterRace from "../domain/enums/MonsterRace.js";
import MonsterType from "../domain/enums/MonsterType.js";
import CardStatus from "../domain/enums/CardStatus.js";

const monsters = [
    new MonsterCard({
        id: 1,
        name: "Dark Magician",
        attribute: MonsterAttribute.DARK,
        monsterRace: MonsterRace.SPELLCASTER,
        monsterType: [MonsterType.NORMAL],
        level: 7,
        attack: 2500,
        defense: 2100,
        passcode: "46986414",
        status: CardStatus.UNLIMITED,
        description: "The ultimate wizard in terms of attack and defense.",
        imageUrl: "dark-magician.png",
        createdAt: new Date(),
        updatedAt: new Date(),
    }),

    new MonsterCard({
        id: 2,
        name: "Summoned Skull",
        attribute: MonsterAttribute.DARK,
        monsterRace: MonsterRace.FIEND,
        monsterType: [MonsterType.NORMAL],
        level: 6,
        attack: 2500,
        defense: 1200,
        passcode: "70781052",
        status: CardStatus.UNLIMITED,
        description: "A fiend with dark powers for confusing the enemy.",
        imageUrl: "summoned-skull.png",
        createdAt: new Date(),
        updatedAt: new Date(),
    }),

    new MonsterCard({
        id: 3,
        name: "Celtic Guardian",
        attribute: MonsterAttribute.EARTH,
        monsterRace: MonsterRace.WARRIOR,
        monsterType: [MonsterType.NORMAL],
        level: 4,
        attack: 1400,
        defense: 1200,
        passcode: "91152256",
        status: CardStatus.UNLIMITED,
        description: "An elf who learned to wield a sword, he baffles enemies with lightning-swift attacks.",
        imageUrl: "celtic-guardian.png",
        createdAt: new Date(),
        updatedAt: new Date(),
    }),

    new MonsterCard({
        id: 4,
        name: "Kuriboh",
        attribute: MonsterAttribute.DARK,
        monsterRace: MonsterRace.FIEND,
        monsterType: [MonsterType.EFFECT],
        level: 1,
        attack: 300,
        defense: 200,
        passcode: "40640057",
        status: CardStatus.UNLIMITED,
        description: "During damage calculation, if this card is in your hand: You can discard this card; you take no battle damage from that battle.",
        imageUrl: "kuriboh.png",
        createdAt: new Date(),
        updatedAt: new Date(),
    }),

    new MonsterCard({
        id: 5,
        name: "Gaia The Fierce Knight",
        attribute: MonsterAttribute.EARTH,
        monsterRace: MonsterRace.WARRIOR,
        monsterType: [MonsterType.NORMAL],
        level: 7,
        attack: 2300,
        defense: 2100,
        passcode: "06368038",
        status: CardStatus.UNLIMITED,
        description: "A knight whose horse travels faster than the wind. His battle-charge is a force to be reckoned with.",
        imageUrl: "gaia-the-fierce-knight.png",
        createdAt: new Date(),
        updatedAt: new Date(),
    }),
];

export default monsters;
