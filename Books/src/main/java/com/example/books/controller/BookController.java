package com.example.books.controller;

import com.example.books.repository.BookRepository;
import com.example.books.model.Book;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.transaction.annotation.Transactional;

@Controller
public class BookController {
    private BookRepository bookRepository;

    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @GetMapping("/book")
    public String getQuestion(Model model){
        return "book";
    }

    @Transactional(readOnly = true)
    @GetMapping("/book/{id}")
    public String getQuestion(@PathVariable int id, Model model){
        Book book = bookRepository.findById((long) id).get();
        model.addAttribute("book", book);
        return "book";
    }

    @PostMapping("/book")
    public String PostQuestion(UserAnswerForm form){
        System.out.println("123");
        return "redirect:/book/book/1";
    }
}