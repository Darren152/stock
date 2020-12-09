package com.account.email.controller;

import com.account.email.model.NewsArticle;
import com.account.email.repositories.NewsArticleRepository;
import com.account.email.service.NewsArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class NewsArticleController {

    @Autowired
    NewsArticleService newsArticleService;

    @RequestMapping(value = "/articles/", method = RequestMethod.GET)
    public Iterable<NewsArticle> getAllArticles(){
        return newsArticleService.getAllArticles();
    }

    @RequestMapping(value = "/article/{symbol}", method = RequestMethod.GET)
    public Optional<NewsArticle> getArticleBySymbol(String symbol){
        return newsArticleService.getArticleBySymbol(symbol);
    }

    @RequestMapping(value = "/article/", method = RequestMethod.POST)
    public NewsArticle postArticle(@RequestBody NewsArticle newsArticle){
        return newsArticleService.postArticle(newsArticle);
    }

    @RequestMapping(value = "/article/{symbol}", method = RequestMethod.PUT)
    public NewsArticle updateNews(@RequestBody NewsArticle newsArticle, @PathVariable String symbol){
        return newsArticleService.updateArticle(newsArticle, symbol);
    }

    @RequestMapping(value = "/article/{symbol}", method = RequestMethod.DELETE)
    public void deleteNewsArticle(@PathVariable String symbol){
        newsArticleService.deleteArticle(symbol);
    }
}
