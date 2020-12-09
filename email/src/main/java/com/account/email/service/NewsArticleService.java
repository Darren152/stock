package com.account.email.service;

import com.account.email.model.NewsArticle;
import com.account.email.repositories.NewsArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class NewsArticleService {
    
    @Autowired
    NewsArticleRepository newsArticleRepository;
    
    public Optional<NewsArticle> getArticleBySymbol(String symbol){
        return newsArticleRepository.findById(symbol);
    }
    
    public Iterable<NewsArticle> getAllArticles(){
        return newsArticleRepository.findAll();
    }
    public NewsArticle postArticle(NewsArticle newsArticle){
        return newsArticleRepository.save(newsArticle);
    }
    
    public NewsArticle updateArticle(NewsArticle newsArticle, String symbol){
        newsArticleRepository.findById(symbol);
        return newsArticleRepository.save(newsArticle);
    }
    
    public void deleteArticle(String symbol){
        newsArticleRepository.deleteById(symbol);
    } 
}
