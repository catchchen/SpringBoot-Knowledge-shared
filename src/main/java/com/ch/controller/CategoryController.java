package com.ch.controller;

import com.ch.pojo.Article;
import com.ch.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @author chenk
 * @date 2022/2/23 21:47
 * @description
 */
@Controller
public class CategoryController {
    @Autowired
    private ArticleService articleService;


    /**
     *  商品分类列表
     */

    @RequestMapping(value = "/category/list.action")
    public String list( Model model) {

        //商品分类列表
        //一级分类
        List<Article> list1=articleService.findArticleList();
        model.addAttribute("list", list1);
        //二级分类
//        List<Article> catelist2=articleService.findCateList();
//        model.addAttribute("catelist2", catelist2);

        return "category_list";

    }

    /**
     * 创建商品分类
     */
    @RequestMapping("/category/create")
    @ResponseBody
    public String cateCreate(Article cate, HttpSession session) {

        // 执行Service层中的创建方法，返回的是受影响的行数
        int rows = articleService.createArticle(cate);
        if(rows > 0){
            return "OK";
        }else{
            return "FAIL";
        }
    }

    /**
     * 通过id获取商品分类信息
     */
    @RequestMapping("/category/getCateById")
    @ResponseBody
    public Article getCateById(Integer aid) {

        Article cate = articleService.getArticleById(aid);

        return cate;
    }

    /**
     * 更新商品分类
     */
    @RequestMapping("/category/update")
    @ResponseBody
    public String cateUpdate(Article category) {
        System.out.println("======="+category);
        int rows = articleService.updateCate(category);
        if(rows > 0){
            return "OK";
        }else{
            return "FAIL";
        }
    }

    /**
     * 删除商品分类信息
     */
    @RequestMapping("/category/delete")
    @ResponseBody
    public String cateDelete(Integer cate_id) {
        int rows = articleService.deleteCate(cate_id);
        if(rows > 0){
            return "OK";
        }else{
            return "FAIL";
        }
    }
}
