package br.com.lordsabino.cardview.Main;

import br.com.lordsabino.cardview.model.Card;
import br.com.lordsabino.cardview.model.MagicTrap;
import br.com.lordsabino.cardview.model.Monster;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) {

        Monster darkMagician = new Monster(
                "Dark Magician",
                "DARK",
                "Spellcaster/Normal",
                7,
                2500,
                2100,
                "46986414",
                "Unlimited",
                "The ultimate wizard in terms of attack and defense."
        );

        Monster darkMagicianGirl = new Monster(
                "Dark Magician Girl",
                "DARK",
                "Spellcaster/Normal",
                6,
                2000,
                1700,
                "38033121",
                "Unlimited",
                "Gains 300 ATK for every \"Dark Magician\" or \"Magician of Black Chaos\" in the GY."
        );

        Monster magicianOfBlackChaos = new Monster(
                "Magician of Black Chaos",
                "DARK",
                "Spellcaster/Normal",
                8,
                2800,
                2600,
                "30208479",
                "Unlimited",
                "You can Ritual Summon this card with \"Black Magic Ritual\"."
        );

        MagicTrap darkRenewal  = new MagicTrap(
                "Dark Renewal",
                "Trap",
                "Normal",
                "09287078",
                "Unlimited",
                """
                         When your opponent Normal or Special Summons a monster(s):
                         Target 1 of those monsters and 1 Spellcaster monster you control;
                         send both monsters to the GY, then you can Special Summon 1 DARK Spellcaster monster from your
                         Deck or GY.
                        """
                );

        MagicTrap darkMagicCurtain = new MagicTrap(
                "Dark Magic Curtain",
                "Spell",
                "Normal",
                "99789342",
                "Unlimited",
                """
                          Pay half your LP; Special Summon 1 "Dark Magician" from your Deck. You cannot Summon other
                          monsters the turn you activate this card (but you can Set).
                """
        );

        MagicTrap spellbindingCircle = new MagicTrap(
                "Spellbinding Circle",
                "Trap",
                "Continuous",
                "18807108",
                "Unlimited",
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

        System.out.println(" ===== Search By Name =====");
        cards.forEach(card -> System.out.println(card.getName()));

        System.out.println(" ===== Show All Cards =====");
        cards.forEach(System.out::println);

        System.out.println(" ===== Supplier =====");
        Supplier<List<Card>> allCards = () -> Arrays.asList(darkMagician, darkMagicianGirl, spellbindingCircle);
        System.out.println(allCards.get());

    }
}
