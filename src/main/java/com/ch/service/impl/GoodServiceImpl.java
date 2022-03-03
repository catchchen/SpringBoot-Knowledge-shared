package com.ch.service.impl;

import com.ch.pojo.Category;
import com.ch.pojo.Goods;
import com.ch.service.GoodsService;
import com.ch.web.utils.Pages;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author chenk
 * @date 2022/2/23 21:35
 * @description
 */
@Service
public class GoodServiceImpl implements GoodsService {
    @Override
    public Pages<Goods> findGoodsList(Integer page, Integer rows) {
        return null;
    }

    @Override
    public List<Category> findCateList() {
        return null;
    }
}
