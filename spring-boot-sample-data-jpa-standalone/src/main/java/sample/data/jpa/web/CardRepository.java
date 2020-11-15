package sample.data.jpa.web;

import org.springframework.data.jpa.repository.JpaRepository;

import javax.smartcardio.Card;

public interface CardRepository extends JpaRepository<Card, Long> { }
