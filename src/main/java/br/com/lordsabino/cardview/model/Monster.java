package br.com.lordsabino.cardview.model;

import java.util.Objects;

public class Monster implements Card {

    private Long id;
    private String name;
    private String attribute;
    private String types;
    private int level;
    private int attack;
    private int defense;
    private String passcode;
    private String statuses;
    private String description;

    public Monster() {
    }

    public Monster(
            Long id,
            String name,
            String attribute,
            String types,
            int level,
            int attack,
            int defense,
            String passcode,
            String statuses,
            String description
    ) {
        this.setId(id);
        this.setName(name);
        this.attribute = attribute;
        this.types = types;
        this.level = level;
        this.attack = attack;
        this.defense = defense;
        this.passcode = passcode;
        this.statuses = statuses;
        this.description = description;
    }

    @Override
    public String toString() {
        String format = """
                ID: %s
                Name: %s
                Attribute: %s
                Types: %s
                Level: %d
                Attack: %d
                Defense: %d
                Passcode: %s
                Statuses: %s
                Description: %s
                """;

        return String.format(
                format,
                id,
                name,
                attribute,
                types,
                level,
                attack,
                defense,
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

    public void setLevel(int level) {
        if (level <= 0) {
            throw new IllegalArgumentException("Level cannot be zero or negative");
        }
        this.level = level;
    }

    public void setAttack(int attack) {
        if (attack < 0) {
            throw new IllegalArgumentException("Attack cannot be negative");
        }
        this.attack = attack;
    }

    public void setDefense(int defense) {
        if (defense < 0) {
            throw new IllegalArgumentException("Defense cannot be negative");
        }
        this.defense = defense;
    }

    public void setPasscode(String passcode) {
        if (passcode == null || passcode.isBlank()) {
            throw new IllegalArgumentException("Passcode cannot be null or blank");
        }
        this.passcode = passcode;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    public String getTypes() {
        return types;
    }

    public void setTypes(String types) {
        this.types = types;
    }

    public int getLevel() {
        return level;
    }

    public int getAttack() {
        return attack;
    }

    public int getDefense() {
        return defense;
    }

    public String getPasscode() {
        return passcode;
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
        if (this == o) return true;
        if (!(o instanceof Monster monster)) return false;
        if (this.id != null && monster.id != null) {
            return Objects.equals(this.id, monster.id);
        }

        return Objects.equals(this.passcode, monster.passcode);
    }

    @Override
    public int hashCode() {
        return (id != null)
                ? Objects.hash(id)
                : Objects.hash(passcode);
    }
}