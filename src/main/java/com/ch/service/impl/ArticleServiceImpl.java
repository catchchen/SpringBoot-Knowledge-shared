package com.ch.service.impl;

import com.ch.pojo.entity.Article;
import com.ch.service.ArticleService;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

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


    @Override
    public List<Article> listAll() {
        return null;
    }

    @Override
    public List<Article> listAllByIds(Collection<Long> ids) {
        return null;
    }

    @Override
    public Optional<Article> fetchById(Long id) {
        return Optional.empty();
    }

    @Override
    public Article getById(Long id) {
        return null;
    }

    @Override
    public Article getByIdOfNullable(Long id) {
        return null;
    }

    @Override
    public boolean existsById(Long id) {
        return false;
    }

    @Override
    public void mustExistById(Long id) {

    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public Article create(Article D) {
        return null;
    }

    @Override
    public List<Article> createInBatch(Collection<Article> Ds) {
        return null;
    }

    @Override
    public Article update(Article D) {
        return null;
    }

    @Override
    public List<Article> updateInBatch(Collection<Article> Ds) {
        return null;
    }

    @Override
    public Article removeById(Long id) {
        return null;
    }

    @Override
    public Article removeByIdOfNullable(Long id) {
        return null;
    }

    @Override
    public void remove(Article D) {

    }

    @Override
    public void removeInBatch(Collection<Long> ids) {

    }

    @Override
    public void removeAll(Collection<Article> Ds) {

    }

    @Override
    public void removeAll() {

    }
}
