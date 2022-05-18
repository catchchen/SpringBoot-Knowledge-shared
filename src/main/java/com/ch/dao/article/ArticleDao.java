package com.ch.dao.article;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ch.pojo.entity.Article;
import com.ch.web.model.vo.ArticleVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author chenk
 * @date 2022/3/19
 * @description 文章类的 数据访问对象
 */
public interface ArticleDao extends BaseMapper<Article> {
//    int insertArticle();
//
//    Article selectById(long id);
//
//    List<Article> selectLatestArticles(@Param("offset") int offset, @Param("limit") int limit);
//
//    void updateCommentCount(@Param("questionId") int questionId,@Param("commentCount") int commentCount);
//
//    void deleteById(@Param("id") long id);

    // page 必须放在 第一个语句中
     Page<ArticleVo> selectYearArticlePageVo(@Param("page") Page<ArticleVo> page, @Param("year") Integer year);
}
