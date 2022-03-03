package com.ch.controller;

/**
 * @author chenk
 * @date 2022/2/23 21:34
 * @description
 */

import com.ch.pojo.Category;
import com.ch.pojo.Goods;
import com.ch.service.GoodsService;
import com.ch.web.utils.Pages;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * 商品管理控制器类
 */
@Controller
public class GoodsController {



        // 依赖注入
        @Autowired
        private GoodsService goodsService;


        /**
         *  商品列表
         */
        @RequestMapping(value = "/goods/list.action")
        public String list(@RequestParam(defaultValue="1")Integer page,
                           @RequestParam(defaultValue="10")Integer rows, Model model) {
            // 所有商品列表
            Pages<Goods> goods = goodsService.findGoodsList(page, rows);
            model.addAttribute("page", goods);

            //商品分类列表

            List<Category> catelist=goodsService.findCateList();
            model.addAttribute("catelist", catelist);

            return "goods_list";
        }


    }