package com.qhit.goodsImage.dao;

import org.apache.ibatis.annotations.Mapper;
import com.qhit.goodsImage.pojo.GoodsImage;
import java.util.List;

@Mapper  
public interface IGoodsImageDao {

    boolean insert(Object object);

    boolean  update(Object object);

    boolean  updateSelective(Object object);

    boolean delete(Object object);

    List freeFind(String sql);

    List findAll();

    List findById(Object id);

    boolean freeUpdate(String sql);

    List<GoodsImage> search(GoodsImage goodsImage);

    List findByLgId(Object lgId);

    List findByImageName(Object imageName);

}