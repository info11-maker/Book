package com.example.books.model;

import lombok.Data;
import lombok.ToString;
import javax.persistence.*;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "book")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "denumire")
    private String denumire;
    @Column(name = "autor")
    private String autor;
    @ToString.Exclude
    @OneToMany(mappedBy = "book")
    private List <BookChoice> choices;



}
