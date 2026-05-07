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
        this.name = name;
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

    public void setLevel(int level) {
        this.level = level;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
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