package com.ch.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ch.dao.article.ArticleDao;
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
public class ArticleServiceImpl extends ServiceImpl<ArticleDao,Article> implements ArticleService {
}
