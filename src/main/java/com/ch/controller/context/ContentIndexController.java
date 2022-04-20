package com.ch.controller.context;

import com.ch.pojo.entity.Article;
import com.ch.pojo.entity.User;
import com.ch.service.ArticleService;
import com.ch.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

//@Controller
@Slf4j
//@RequestMapping("/context")
public class ContentIndexController {
    private final ArticleService articleService;
//  UserLogin
    private final UserService userService;
    public ContentIndexController(ArticleService articleService,UserService userService){
        this.articleService = articleService;
        this.userService = userService;
    }

    /**
     * 游客 访问网站 页面 对页面进行初始化
     * @param model
     * @param uid
     * @return
     */
    @RequestMapping("")
    public String index(Model model, Integer uid){
//        articleService.getArticleById();
        User user = userService.getUser(1);
//
//        model.addAttribute("username",user.getUsername());
//        model.addAttribute("avatar",user.getAvatar());
//
//        model.addAttribute("articleContext",getArticleInfo());

        return "index";
    }

    // 登录用户 页面的初始化
    @RequestMapping("/user")
    public String index(Integer p, String token, Model model) {

        model.addAttribute("avr");
        return "index";
    }

    private Object getArticleInfo(){
        Object obj;
        Article art = articleService.getArticleById(1);
//
//        articleService.getTopArticleById();
//
//        articleService.getMostCommentArticle();

        return "1";
    }
}
