package com.dev.backend.entities;

import java.time.Instant;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "tb_tweet")
@Getter
@Setter
@EqualsAndHashCode(of = "id")
public class Tweet {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private User user;
    private String content;
    @CreationTimestamp
    private Instant moment;

}