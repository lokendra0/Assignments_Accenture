package com.accenture.Assignment.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.accenture.Assignment.Model.Article;
import com.accenture.Assignment.Repository.ArticlesRepository;

@Service
public class CachedArticlesService implements ArticlesService {

   @Autowired
   private ArticlesRepository articlesRepository;

   @Autowired
   private CacheManager cacheManager;

   @Override
   @Cacheable(value = "articles", key = "#articleId")
   public Article getArticle(Long articleId) {
       return articlesRepository.get(articleId);
   }

   @Override
   @CacheEvict(value = "articles", key = "#articleId")
   public void removeArticle(Long articleId) {
       articlesRepository.remove(articleId);
   }


   @Override
   @CacheEvict(value = "articles", key = "#articleId")
   public Article updateLikes(Long articleId, int likes) {
       Article updatedArticle = articlesRepository.updateLikes(articleId, likes);
       // Evict the old entry from the cache
       cacheManager.getCache("articles").evict(articleId);
       return updatedArticle;
   }

@Override
public void saveArticle(Article article) {
	 articlesRepository.save(article);
	
}
}
