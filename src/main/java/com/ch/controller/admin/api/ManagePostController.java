package com.ch.controller.admin.api;

import com.ch.common.Response;
import com.ch.pojo.entity.Article;
import com.ch.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
/*
    // 管理员对全部文章的 控制对象
 */
@RestController
@RequestMapping("/api/admin/posts")
public class ManagePostController {

    private final ArticleService articleService;
    @Autowired
    ManagePostController(ArticleService articleService) {
        this.articleService = articleService;
    }
    @GetMapping("/")
    Response<List<Article>> getArticle() {
        List<Article> list = articleService.list();
        return Response.ok(list);
        }
    }
//    @PutMapping("/")
//    Response<List<Article>> changePostStatus() {
//    }
//    @PostMapping("/")
//    Response<List<Article>>
//    @DeleteMapping("")

