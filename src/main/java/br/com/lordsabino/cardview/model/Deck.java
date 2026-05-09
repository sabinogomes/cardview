package br.com.lordsabino.cardview.model;

import java.util.*;

public class Deck {

    public static final int MIN_CARDS = 40;
    public static final int MAX_CARDS = 60;

    private Long id;
    private String publicId;
    private String name;
    private String description;

    private final List<Card> cards = new ArrayList<>();

    public void generatePublicId() {

        if (this.publicId == null || this.publicId.isBlank()) {

            this.publicId = UUID.randomUUID()
                    .toString()
                    .replace("-", "")
                    .substring(0, 12)
                    .toUpperCase(Locale.ROOT);
        }
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPublicId() {
        return publicId;
    }

    public void setPublicId(String publicId) {
        this.publicId = publicId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Card> getCards() {
        return List.copyOf(cards);
    }

    public void addCard(Card card) {

        if (card == null) {
            throw new IllegalArgumentException("Card cannot be null");
        }

        if (cards.size() >= MAX_CARDS) {
            throw new IllegalStateException("Deck is full");
        }

        cards.add(card);
    }

    public int size() {
        return cards.size();
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Deck deck)) return false;
        return Objects.equals(id, deck.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}