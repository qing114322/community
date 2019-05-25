package com.qhit.goodsImage.service.impl;

import com.qhit.goodsImage.service.IGoodsImageService;
import java.util.List;
import com.qhit.goodsImage.dao.IGoodsImageDao;
import com.qhit.goodsImage.pojo.GoodsImage;
import org.springframework.stereotype.Service;
import javax.annotation.Resource; 



@Service 
public class GoodsImageServiceImpl  implements IGoodsImageService {

    @Resource 
    IGoodsImageDao dao;

    @Override 
    public boolean insert(Object object) { 
        return dao.insert(object); 
    } 

    @Override 
    public boolean update(Object object) { 
        return dao.update(object); 
    } 

    @Override 
    public boolean updateSelective(Object object) { 
        return dao.updateSelective(object); 
    } 

    @Override 
    public boolean delete(Object id) { 
        GoodsImage goodsImage = findById(id); 
        return dao.delete(goodsImage); 
    } 

    @Override 
    public List findAll() { 
        return dao.findAll(); 
    } 

    @Override 
    public GoodsImage findById(Object id) { 
        List<GoodsImage> list = dao.findById(id); 
        return  list.get(0); 
    } 

    @Override 
    public List<GoodsImage> search(GoodsImage goodsImage) { 
        return dao.search(goodsImage); 
    } 

}