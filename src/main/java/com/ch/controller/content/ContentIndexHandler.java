package com.ch.controller.content;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.conditions.query.QueryChainWrapper;
import com.ch.pojo.entity.Article;
import com.ch.pojo.entity.User;
import com.ch.service.ArticleService;
import com.ch.service.user.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


@Slf4j
@Controller
@RequestMapping
@RequiredArgsConstructor
public class ContentIndexHandler {

    private final ArticleService articleService;
    private final UserService userService;

    /**
     * 游客用户 访问网站 页面 对页面进行初始化
     * @param map 返回页面的数据
     * @return
     */
    @GetMapping
    public String index(ModelMap map){ //  String token
        ArrayList<Article> articles = new ArrayList<>();
        Article article = new Article();
        article.setThumbnail("/upload/article/img/1.png");
        article.setTitle("标题");
        article.setSummary("你好！ " +
                "这是你第一次使用 **Markdown编辑器** 所展示的欢迎页。" +
                "如果你想学习如何使用Markdown编辑器, 可以仔细阅读这篇文章，" +
                "了解一下Markdown的基本语法知识。");
        log.info("index ---> page website");
        articles.add(article);
        // 默认添加 的文章 注册的时候进行的
        map.addAttribute("posts",articles);
        //get user list
        List<User> list = userService.list(); //
        // 通过 Grade 分数升序排序 显示用户排名
        articleService.list();
//        map.addAttribute("hots", );
        map.addAttribute("users",list.stream()
                .sorted(Comparator.comparingLong(User::getGrade)
                        .reversed())
                .collect(Collectors.toList()));
        return "index";
    }

    // 登录用户 页面的初始化
    @GetMapping(value = "page/{page}")
    public String index(Integer p, Model model) {
//        log.info("user tiaozhuan page");
        // 如何根据 token 拿到用户数据
//      User user = userService.getUser();
        // 过滤器 实现token到 的转换
        // 用户信息add进去
//        PageHelper.startPage()
        model.addAttribute("avr");
//        articleService.findArticleList();
        return "index";
    }
}
