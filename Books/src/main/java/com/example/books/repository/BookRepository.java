package com.example.books.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.books.model.Book;
import java.util.Optional;

public interface BookRepository extends JpaRepository<Book, Long> {
    @Override
    Optional<Book> findById(Long aLong);
}
