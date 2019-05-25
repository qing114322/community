package com.qhit.goodsImage.service;

import java.util.List;
import com.qhit.goodsImage.pojo.GoodsImage;

public interface IGoodsImageService {

    boolean insert(Object object);

    boolean  update(Object object);

    boolean  updateSelective(Object object);

    boolean delete(Object id);

    List findAll();

    GoodsImage findById(Object id);

    List<GoodsImage> search(GoodsImage goodsImage);

}