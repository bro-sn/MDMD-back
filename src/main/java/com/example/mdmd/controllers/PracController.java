package com.example.mdmd.controllers;

import com.example.mdmd.model.Book;
import com.example.mdmd.repository.BookRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
public class PracController {

    private final BookRepository bookRepository;

    public PracController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    // GET: 입력 폼 + 목록 + 선택된 책 정보
    @GetMapping("/prac")
//    public String showForm(Model model) {
//        model.addAttribute("book", new Book()); // 폼 바인딩용 객체
//        return "prac";
//    }
    public String showForm(@RequestParam(required = false) Long id, Model model) {
        model.addAttribute("book", new Book()); // 입력용 빈 객체
        model.addAttribute("bookList", bookRepository.findAll()); // 전체 책 목록

        if (id != null) {
            Optional<Book> selected = bookRepository.findById(id);
            model.addAttribute("selectedBook", bookRepository.findById(id).orElse(null)); // 선택된 책 정보
        }

        return "prac"; // prac.html 렌더링
    }
    // POST: 책 저장
    @PostMapping("/prac")
    public String submit(@ModelAttribute Book book) {
        bookRepository.save(book); // 저장
        return "redirect:/prac";
    }
}

