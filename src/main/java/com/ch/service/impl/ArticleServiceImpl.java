package com.ch.service.impl;

import com.ch.pojo.Article;
import com.ch.service.ArticleService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author chenk
 * @date 2022/2/23 21:46
 * @description
 */
@Service
public class ArticleServiceImpl implements ArticleService {
    @Override
    public List<Article> findArticleList() {
        return null;
    }

    @Override
    public int createArticle(Article art) {
        return 0;
    }

    @Override
    public Article getArticleById(Integer id) {
        return null;
    }

    @Override
    public int updateCate(Article article) {
        return 0;
    }

    @Override
    public int deleteCate(Integer aid) {
        return 0;
    }
}
