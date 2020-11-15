package sample.data.jpa.web;


import org.springframework.web.bind.annotation.*;

import javax.smartcardio.Card;
import java.util.List;

@RestController
public class CardController {
    private final CardRepository repository;
    public CardController(CardRepository repo){  this.repository=repo;  }

    @GetMapping("/cards")
    List<Card> all() {  return repository.findAll();  }
    @GetMapping("/cards/{id}")
    Card one(@PathVariable Long id) {   return repository.findById(id) .orElseThrow(() -> new RessourceNotFoundException(id));  }
    @PostMapping("/cards")  Card newCard(@RequestBody Card newCard) {  return repository.save(newCard);  }
    @DeleteMapping("/cards/{id}")  void deleteCard(@PathVariable Long id) {  repository.deleteById(id);  } }