package com.ch.service;

import com.ch.pojo.Article;
import com.ch.pojo.Sort;
import com.ch.web.utils.Pages;

import java.util.List;

/**
 * @author chenk
 * @date 2022/2/23
 * @description 功能
 */
public interface SortService {
    // 查询客户列表
    public Pages<Sort> findGoodsList(Integer page, Integer rows);

    //商品分类列表
    public List<Sort> findCateList();
    List<Sort> findArticleList();
    //创建分类
    int createArticle(Article art);
    //通过id获取商品分类信息
    Article getCateById(Integer id);
    //更新商品分类
    int updateCate(Article article);
    //删除商品分类信息
    int deleteCate(Integer cate_id);




}
