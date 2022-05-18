package com.ch.controller.content.api;

import com.ch.pojo.entity.Article;
import com.ch.service.ArticleService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

/**
 * @author chenk
 * @date 2022/2/23 21:47
 * @description 分类管理控制类
 */
@Controller
@RequestMapping("/sort")
public class SortController {
@Resource
    private ArticleService articleService;


    /**
     *  商品分类列表
     */

    @RequestMapping(value = "/")
    public String list() {

        //商品分类列表
        //一级分类
//        List<Article> list1=articleService.findArticleList();
//        model.addAttribute("list", list1);
        //二级分类
//        List<Article> catelist2=articleService.findCateList();
//        model.addAttribute("catelist2", catelist2);

        return " ";

    }

    /**
     * 创建商品分类
     */
    @PostMapping("/create")
    public String cateCreate(@RequestBody Article art, HttpSession session) {
        int uid =Integer.parseInt(session.getAttribute("uid").toString());
//        int rows = articleService.createArticle(art);
        int rows = 1;
        if(rows > 0){
            return "创建成功";
        }else{
            return "创建失败";
        }
    }

    /**
     * 通过id获取商品分类信息
     */
    @RequestMapping("/category/getCateById")
    @ResponseBody
    public Article getSortById(Integer aid) {

//        Article cate = articleService.getArticleById(aid);

        return new Article();
    }

    /**
     * 更新商品分类
     */
    @RequestMapping("/category/update")
    @ResponseBody
    public String cateUpdate(Article category) {
        System.out.println("======="+category);
//        int rows = articleService.updateCate(category);
        int rows = 1;
        if(rows > 0){
            return "OK";
        }else{
            return "FAIL";
        }
    }

    /**
     * 删除商品分类信息
     */
    @RequestMapping("/remove")
    @ResponseBody
    public String cate(Integer aid) {
//        = articleService.deleteCate(aid);
        int rows=1;
        if(rows > 0){
            return "OK";
        }else{
            return "FAIL";
        }
    }
}
