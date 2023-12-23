package com.echocolat.catalogue.controller;

import com.echocolat.catalogue.model.Article;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.echocolat.catalogue.repository.ArticleRepository;

import java.util.List;

@RestController
public class ArticleController {
    private final ArticleRepository repository;

    public ArticleController(ArticleRepository repository) {
        this.repository = repository;
    }

    @CrossOrigin(origins = { "http://localhost:8080", "http://localhost:3000" })
    @GetMapping("/api/catalogue")
    public List<Article> all() {
        return repository.findAll();
    }
}
