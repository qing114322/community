package com.qhit.lostGoods.service;

import java.util.List;
import com.qhit.lostGoods.pojo.LostGoods;

public interface ILostGoodsService {

    boolean insert(Object object);

    boolean  update(Object object);

    boolean  updateSelective(Object object);

    boolean delete(Object id);

    List findAll();

    LostGoods findById(Object id);

    List<LostGoods> search(LostGoods lostGoods);

}