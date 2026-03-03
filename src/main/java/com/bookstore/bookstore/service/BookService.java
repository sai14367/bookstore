package com.bookstore.bookstore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.springframework.data.domain.Sort;

import com.bookstore.bookstore.entity.Book;
import com.bookstore.bookstore.exception.ResourceNotFoundException;
import com.bookstore.bookstore.repository.BookRepository;

@Service
public class BookService {

    @Autowired
    private BookRepository repo;

    // ================= BASIC CRUD =================

    public List<Book> getAllBooks() {
        return repo.findAll();
    }

    public Book getBook(Long id) {
        return repo.findById(id)
                .orElseThrow(() ->
                        new ResourceNotFoundException("Book not found with id " + id));
    }

    public Book addBook(Book book) {
        return repo.save(book);
    }

    public Book updateBook(Long id, Book updated) {

        Book book = getBook(id);

        book.setTitle(updated.getTitle());
        book.setAuthor(updated.getAuthor());
        book.setGenre(updated.getGenre());
        book.setIsbn(updated.getIsbn());
        book.setPrice(updated.getPrice());
        book.setDescription(updated.getDescription());
        book.setStockQuantity(updated.getStockQuantity());
        book.setImageUrl(updated.getImageUrl());

        return repo.save(book);
    }

    public void deleteBook(Long id) {

        if (!repo.existsById(id))
            throw new ResourceNotFoundException("Book not found");

        repo.deleteById(id);
    }

    // ================= SEARCH =================

    public List<Book> searchByTitle(String title) {
        return repo.findByTitleContainingIgnoreCase(title);
    }

    public List<Book> searchByAuthor(String author) {
        return repo.findByAuthorContainingIgnoreCase(author);
    }

    public List<Book> searchByGenre(String genre) {
        return repo.findByGenreContainingIgnoreCase(genre);
    }

    // ================= SORT =================

    public List<Book> getSortedBooks(String field) {
        return repo.findAll(Sort.by(Sort.Direction.ASC, field));
    }
}
