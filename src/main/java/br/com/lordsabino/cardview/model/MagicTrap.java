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
            Long id,
            String name,
            String cardType,
            String property,
            String passcode,
            String statuses,
            String description
    ) {
        this.setId(id);
        this.setName(name);
        this.cardType = cardType;
        this.property = property;
        this.setPasscode(passcode);
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

    public void setId(Long id) {
        if (id == null || id <= 0) {
            throw new IllegalArgumentException("Id must be positive and not null");
        }
        this.id = id;
    }

    public void setName(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name cannot be null or blank");
        }
        this.name = name;
    }

    public void setCardType(String cardType) {
        if (cardType == null || cardType.isBlank()) {
            throw new IllegalArgumentException("CardType cannot be null or blank");
        }
        this.cardType = cardType;
    }

    public void setProperty(String property) {
        if (property == null || property.isBlank()) {
            throw new IllegalArgumentException("Property cannot be null or blank");
        }
        this.property = property;
    }

    public void setPasscode(String passcode) {
        if (passcode == null || passcode.isBlank()) {
            throw new IllegalArgumentException("Passcode cannot be null or blank");
        }
        this.passcode = passcode;
    }

    public void setStatuses(String statuses) {
        if (statuses == null || statuses.isBlank()) {
            throw new IllegalArgumentException("Statuses cannot be null or blank");
        }
        this.statuses = statuses;
    }

    public void setDescription(String description) {
        if (description == null || description.isBlank()) {
            throw new IllegalArgumentException("Description cannot be null or blank");
        }
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCardType() {
        return cardType;
    }

    public String getProperty() {
        return property;
    }

    public String getPasscode() {
        return passcode;
    }

    public String getStatuses() {
        return statuses;
    }

    public String getDescription() {
        return description;
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