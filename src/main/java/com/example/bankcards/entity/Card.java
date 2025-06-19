package com.example.bankcards.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "card")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "card_id", nullable = false)
    private Long id;
    @Column(name = "cardNumber", nullable = false)
    private Long cardNumber;
    @OneToOne
    @JoinColumn(name = "user_id")
    @JsonIgnore
    private User user;
    @Column(name = "validityPeriod", nullable = false)
    private Instant validityPeriod;
    @Column(name = "cardStatus", nullable = false)
    private CardStatus cardStatus;
    @Column(name = "cardBalance", nullable = false)
    private Long cardBalance;
}
