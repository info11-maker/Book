package com.example.books.model;

import lombok.Data;
import org.springframework.web.bind.annotation.GetMapping;

import javax.persistence.*;
@Data
@Entity
@Table(name = "bookChoices")
public class BookChoice {
    @Id
    @GeneratedValue
    private int id;
    @ManyToOne
    @JoinColumn(name = "book_id")
    private Book book;
    private String denumire;

}