package com.echocolat.catalogue.repository;

import com.echocolat.catalogue.model.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Article, Long> {
}
