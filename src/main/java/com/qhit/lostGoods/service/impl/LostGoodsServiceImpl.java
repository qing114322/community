package com.qhit.lostGoods.service.impl;

import com.qhit.lostGoods.service.ILostGoodsService;
import java.util.List;
import com.qhit.lostGoods.dao.ILostGoodsDao;
import com.qhit.lostGoods.pojo.LostGoods;
import org.springframework.stereotype.Service;
import javax.annotation.Resource; 



@Service 
public class LostGoodsServiceImpl  implements ILostGoodsService {

    @Resource 
    ILostGoodsDao dao;

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
        LostGoods lostGoods = findById(id); 
        return dao.delete(lostGoods); 
    } 

    @Override 
    public List findAll() { 
        return dao.findAll(); 
    } 

    @Override 
    public LostGoods findById(Object id) { 
        List<LostGoods> list = dao.findById(id); 
        return  list.get(0); 
    } 

    @Override 
    public List<LostGoods> search(LostGoods lostGoods) { 
        return dao.search(lostGoods); 
    } 

}