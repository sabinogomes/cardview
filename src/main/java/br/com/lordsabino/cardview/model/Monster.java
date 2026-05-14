package br.com.lordsabino.cardview.model;

import br.com.lordsabino.cardview.model.enums.Attribute;
import br.com.lordsabino.cardview.model.enums.Statuses;
import br.com.lordsabino.cardview.model.enums.Types;

import java.util.Objects;
import java.util.Set;

public class Monster implements CardStat {

    private Long id;
    private String name;
    private Attribute attribute;
    private Set<Types> types;
    private int level;
    private int attack;
    private int defense;
    private String passcode;
    private Statuses statuses;
    private String description;

    public Monster() {
    }

    public Monster(
            String name,
            Attribute attribute,
            Set<Types> types,
            int level,
            int attack,
            int defense,
            String passcode,
            Statuses statuses,
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

    public Attribute getAttribute() {
        return attribute;
    }

    public void setAttribute(Attribute attribute) {
        this.attribute = attribute;
    }

    public Set<Types> getTypes() {
        return types;
    }

    public void setTypes(Set<Types> types) {
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
        if (!(o instanceof Monster monster)) return false;
        return Objects.equals(passcode, monster.passcode);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(passcode);
    }
}