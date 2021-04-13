package com.mongo.db.resource;


import com.mongo.db.model.Book;
import com.mongo.db.mongorepo.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class BookController {
    @Autowired
    BookRepo bookRepo;

    @PostMapping
    public Book save(@RequestBody Book book) {
        return bookRepo.save(book);
    }

    @GetMapping("/getAllBooks")
    public List<Book> getAll() {
        return bookRepo.findAll();
    }

    @GetMapping("/get/{id}")
    public Optional<Book> finfdById(@PathVariable int id) {
        return bookRepo.findById(id);
    }

    @DeleteMapping("delete/{id}")
    public void deleteById(@PathVariable int id) {
        bookRepo.deleteById(id);
    }
}
