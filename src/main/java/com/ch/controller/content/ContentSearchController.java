package com.ch.controller.content;

import com.ch.pojo.entity.Article;
import com.ch.service.ArticleService;
import com.ch.service.user.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequiredArgsConstructor
@RequestMapping("/user")
public class ContentSearchController {
    private final ArticleService articleService;
    private final UserService userService;
    // 使用@RequestParam注释的defaultValue属性，
    // keyword默认使用空字符 sql实现
    @GetMapping("/search/{keyword}")
    public ModelAndView searchContentInfo(@RequestParam(value = "pageNum",defaultValue = "1") Integer pageNum,
                                    @RequestParam(value = "pageSize",defaultValue = "5") Integer pageSize,
                                    @PathVariable(value = "keyword",required = false) String keyword){
        ModelAndView mav = new ModelAndView();
//userService.getUser(1)
        mav.addObject("content", new Article());
        mav.setViewName("context/home");

        return mav;
    }

}