package com.ch.controller.context;

import com.ch.service.ArticleService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequiredArgsConstructor
public class ContentSearchController {
    private final ArticleService articleService;
    // 使用@RequestParam注释的defaultValue属性，
    // keyword默认使用空字符 sql实现
    @GetMapping("/search/{keyword}")
    public String searchContentInfo(@RequestParam(value = "pageNum",defaultValue = "1") Integer pageNum,
                                    @RequestParam(value = "pageSize",defaultValue = "5") Integer pageSize,
                                    @PathVariable(value = "keyword",required = false) String keyword){



        return "context/home";
    }

}
