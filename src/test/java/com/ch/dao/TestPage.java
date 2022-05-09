package com.ch.dao;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ch.pojo.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import javax.annotation.Resource;

/**
 * @author chenk
 * @date 2022/5/9 12:34
 * @description
 */
@SpringBootTest
public class TestPage {
    @Resource
    private UserDao userDao;

    @Test
    public void testPage(){
        Page<User> page = new Page(1,3);
        userDao.selectPage(page, null);
        System.out.println(page.getRecords());
        System.out.println(page.getCurrent());
        System.out.println(page.getTotal());
    }
}
