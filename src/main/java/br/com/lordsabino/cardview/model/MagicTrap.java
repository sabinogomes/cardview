package br.com.lordsabino.cardview.model;

import java.util.Objects;

public class MagicTrap implements Card {

    private Long id;
    private String name;
    private String cardType;
    private String property;
    private String passcode;
    private String statuses;
    private String description;

    public MagicTrap() {
    }

    public MagicTrap(
            String name,
            String cardType,
            String property,
            String passcode,
            String statuses,
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
                ID: %s
                Name: %s
                Card Type: %s
                Property: %s
                Passcode: %s
                Statuses: %s
                Description: %s
                """;

        return String.format(
                format,
                id,
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

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public String getProperty() {
        return property;
    }

    public void setProperty(String property) {
        this.property = property;
    }

    @Override
    public String getPasscode() {
        return passcode;
    }

    public void setPasscode(String passcode) {
        this.passcode = passcode;
    }

    public String getStatuses() {
        return statuses;
    }

    public void setStatuses(String statuses) {
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
        if (!(o instanceof MagicTrap magicTrap)) return false;
        return Objects.equals(passcode, magicTrap.passcode);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(passcode);
    }
}