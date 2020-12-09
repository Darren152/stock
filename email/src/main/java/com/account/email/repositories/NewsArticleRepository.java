package com.account.email.repositories;

import com.account.email.model.NewsArticle;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NewsArticleRepository extends CrudRepository<NewsArticle, String> {
}
