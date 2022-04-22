package com.ch.controller.context;

import com.ch.dao.UserDao;
import com.ch.service.ArticleService;
import com.ch.service.user.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;

@Controller
@RequiredArgsConstructor
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

        mav.addObject("user", userService.getUser(1));
        mav.setViewName("context/home");

        return mav;
    }

}
