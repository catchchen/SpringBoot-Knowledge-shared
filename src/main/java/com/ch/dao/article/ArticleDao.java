package com.ch.dao.article;

import com.ch.pojo.entity.Article;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author chenk
 * @date 2022/3/19
 * @description 文章类的数据访问对象
 */
public interface ArticleDao {
    int insertArticle();

    Article selectById(long id);

    List<Article> selectLatestArticles(@Param("offset") int offset, @Param("limit") int limit);

    void updateCommentCount(@Param("questionId") int questionId,@Param("commentCount") int commentCount);

    void deleteById(@Param("id") long id);
}
