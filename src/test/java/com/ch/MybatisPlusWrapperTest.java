package com.ch;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ch.dao.article.ArticleDao;
import com.ch.pojo.entity.Article;
import com.ch.service.ArticleService;
import com.ch.web.model.vo.ArticleVo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * @author chenk
 * @date 2022/5/16 16:20
 */
@SpringBootTest
public class MybatisPlusWrapperTest {
    @Autowired
    private ArticleService articleService;
    @Autowired
    private ArticleDao articleDao;

    @Test
    public void test(){
        // 查询
        QueryWrapper<Article> queryWrapper = new QueryWrapper<>();
        queryWrapper.like("title","Hello");
        Article one = articleService.getOne(queryWrapper);
        System.out.println(one.getOriginalContent());
    }
/*

 */
    @Test
    public void testSelectPage(){
        Page<Article> page = new Page<>(1,2);// 第一页每一页 显示 2条数据
        articleDao.selectPage(page,null);
//        page.getPages()
        System.out.println(page);
        // 获取 了
        System.out.println("------");
        System.out.println(page.getRecords());
        System.out.println(page.getPages());
        // 当前的页码
        System.out.println(page.getCurrent());
        // 记录数值
        System.out.println(page.getSize());
        System.out.println(page.getTotal());
        System.out.println(page.hasNext());
        System.out.println(page.hasPrevious());
        System.out.println();
    }
    @Test
    void testPageVo(){
        Page<ArticleVo> page = new Page<>(1,3);
        articleDao.selectYearArticlePageVo(page,2022);
        System.out.println("-------");
        long current = page.getCurrent();
        System.out.println(current);
        List<ArticleVo> records = page.getRecords();
        System.out.println(records.toString());
    }
}
