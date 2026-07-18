import CardRepository from "./repository/CardRepository.js";

const repository = new CardRepository();

const card = repository.findById(1);

const allCards = repository.findAll();

console.log("===== Filter By Id =====");
console.log(card.name);

console.log("===== Print all =====");
console.log(allCards);