package com.accenture.Assignment.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.accenture.Assignment.Model.*;

public interface ArticlesRepository extends JpaRepository<Article, Long> { 

    Article save(Article article); 

    Article get(Long articleId); 

    void remove(Long articleId); 

    Article updateLikes(Long articleId, int likes); 

} 
