package com.example.books.controller;

import com.example.books.model.Book;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "user_answer")
public class UserAnswerForm {
    @Id
    @GeneratedValue
    private int id;
    private int carte_citita;

    @OneToOne
    @JoinColumn(name = "book_id")
    private Book book;
}