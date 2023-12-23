package com.echocolat.catalogue;

import com.echocolat.catalogue.model.Article;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.echocolat.catalogue.repository.ArticleRepository;

@Configuration
public class LoadDatabase {
    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initDatabase(ArticleRepository repository) {
        return args -> {
            log.info("creating data");
            repository.save(new Article("rasoir", "super rasoir", 22.11, "pièce"));
            repository.save(new Article("robe de soirée", "...", 87.99, "pièce"));
        };
    }
}
