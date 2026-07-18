import monsters from "../data/monsters.js";

class CardRepository {
  findById(id) {
    return monsters.find(card => card.id === id);
  }

  findAll() {
    return monsters;
  }

  save(card) {
    monsters.push(card);
  }

  deleteById(id) {
    const index = monsters.findIndex(card => card.id === id);

    if (index !== -1) {
      monsters.splice(index, 1);
    }
  }
}

export default CardRepository;
