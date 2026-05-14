package br.com.lordsabino.cardview.main;

import br.com.lordsabino.cardview.model.Card;
import br.com.lordsabino.cardview.model.CardStat;
import br.com.lordsabino.cardview.model.SpellTrap;
import br.com.lordsabino.cardview.model.Monster;
import br.com.lordsabino.cardview.model.enums.*;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        Monster darkMagician = new Monster(
                "Dark Magician",
                Attribute.DARK,
                new LinkedHashSet<>(Set.of(Types.SPELLCASTER, Types.NORMAL)),
                7,
                2500,
                2100,
                "46986414",
                Statuses.UNLIMITED,
                "The ultimate wizard in terms of attack and defense."
        );

        Monster darkMagicianGirl = new Monster(
                "Dark Magician Girl",
                Attribute.DARK,
                new LinkedHashSet<>(Set.of(Types.SPELLCASTER, Types.EFFECT)),
                6,
                2000,
                1700,
                "38033121",
                Statuses.UNLIMITED,
                "Gains 300 ATK for every \"Dark Magician\" or \"Magician of Black Chaos\" in the GY."
        );

        Monster magicianOfBlackChaos = new Monster(
                "Magician of Black Chaos",
                Attribute.DARK,
                new LinkedHashSet<>(Set.of(Types.SPELLCASTER, Types.RITUAL)),
                8,
                2800,
                2600,
                "30208479",
                Statuses.UNLIMITED,
                "You can Ritual Summon this card with \"Black Magic Ritual\"."
        );

        SpellTrap darkRenewal  = new SpellTrap(
                "Dark Renewal",
                SpellTrapType.TRAP,
                SpellTrapProperty.NORMAL,
                "09287078",
                Statuses.UNLIMITED,
                """
                         When your opponent Normal or Special Summons a monster(s):
                         Target 1 of those monsters and 1 Spellcaster monster you control;
                         send both monsters to the GY, then you can Special Summon 1 DARK Spellcaster monster from your
                         Deck or GY.
                        """
                );

        SpellTrap darkMagicCurtain = new SpellTrap(
                "Dark Magic Curtain",
                SpellTrapType.SPELL,
                SpellTrapProperty.NORMAL,
                "99789342",
                Statuses.UNLIMITED,
                """
                          Pay half your LP; Special Summon 1 "Dark Magician" from your Deck. You cannot Summon other
                          monsters the turn you activate this card (but you can Set).
                """
        );

        SpellTrap spellbindingCircle = new SpellTrap(
                "Spellbinding Circle",
                SpellTrapType.TRAP,
                SpellTrapProperty.CONTINUOUS,
                "18807108",
                Statuses.UNLIMITED,
                """
                         Activate this card by targeting 1 monster your opponent controls; it cannot attack or change
                         its battle position. When that monster is destroyed, destroy this card.
                        """
        );

        List<Card> cards = List.of(
                darkMagician,
                darkMagicianGirl,
                magicianOfBlackChaos,
                darkRenewal,
                darkMagicCurtain,
                spellbindingCircle
        );

        List<CardStat> monsters = List.of(
                darkMagician,
                darkMagicianGirl,
                magicianOfBlackChaos
        );


        System.out.println("===== Search By Name =====");
        cards.forEach(card -> System.out.println(card.getName()));

        System.out.println("\n===== Print All Cards =====");
        cards.forEach(System.out::println);

        System.out.println("\n===== Filter Cards By Attack Great than 2500 =====");
        monsters.stream()
                .filter(monster -> monster.getAttack() >= 2500)
                .forEach(System.out::println);



    }
}
