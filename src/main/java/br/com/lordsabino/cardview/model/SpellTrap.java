package br.com.lordsabino.cardview.model;

import br.com.lordsabino.cardview.model.enums.SpellTrapProperty;
import br.com.lordsabino.cardview.model.enums.SpellTrapType;
import br.com.lordsabino.cardview.model.enums.Statuses;

import java.util.Objects;

public class SpellTrap implements Card {

    private Long id;
    private String name;
    private SpellTrapType cardType;
    private SpellTrapProperty property;
    private String passcode;
    private Statuses statuses;
    private String description;

    public SpellTrap() {
    }

    public SpellTrap(
            String name,
            SpellTrapType cardType,
            SpellTrapProperty property,
            String passcode,
            Statuses statuses,
            String description
    ) {
        this.name = name;
        this.cardType = cardType;
        this.property = property;
        this.passcode = passcode;
        this.statuses = statuses;
        this.description = description;
    }

    @Override
    public String toString() {
        String format = """
                Name: %s
                Card Type: %s
                Property: %s
                Passcode: %s
                Statuses: %s
                Description: %s
                """;

        return String.format(
                format,
                name,
                cardType,
                property,
                passcode,
                statuses,
                description
        );
    }

    @Override
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SpellTrapType getCardType() {
        return cardType;
    }

    public void setCardType(SpellTrapType cardType) {
        this.cardType = cardType;
    }

    public SpellTrapProperty getProperty() {
        return property;
    }

    public void setProperty(SpellTrapProperty property) {
        this.property = property;
    }

    @Override
    public String getPasscode() {
        return passcode;
    }

    public void setPasscode(String passcode) {
        this.passcode = passcode;
    }

    public Statuses getStatuses() {
        return statuses;
    }

    public void setStatuses(Statuses statuses) {
        this.statuses = statuses;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof SpellTrap magicTrap)) return false;
        return Objects.equals(passcode, magicTrap.passcode);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(passcode);
    }
}