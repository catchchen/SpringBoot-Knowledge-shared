package com.ch.controller.context;

import com.ch.service.ArticleService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequiredArgsConstructor
@RequestMapping("post/article")
public class UserPostArticleController {

    private final ArticleService articleService;
//    PostSer

}
