package com.ch.service;

import com.ch.pojo.Article;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author chenk
 * @date 2022/2/23
 * @description 功能
 */
@Service
public interface ArticleService {
    //art列表
    List<Article> findArticleList();

    //创建分类
    int createArticle(Article art);
    //通过id获取商品分类信息
    Article getArticleById(Integer id);
    //更新商品分类
    int updateCate(Article article);
    //删除art
    int deleteCate(Integer aid);
}
