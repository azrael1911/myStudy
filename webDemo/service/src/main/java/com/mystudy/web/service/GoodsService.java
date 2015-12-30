package com.mystudy.web.service;

import com.mystudy.web.common.datasource.annotation.DataSource;
import com.mystudy.web.model.Goods;

import java.util.List;

/**
 * Created by 程祥 on 15/12/21.
 * Function：
 */
public interface GoodsService {
    @DataSource("readDataSource")
    List<Goods> selectAll() throws Exception;

    Goods selectById(String id) throws Exception;

    int insertGoods(List<Goods> list) throws Exception;
}