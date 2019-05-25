package com.qhit.lostGoods.dao;

import org.apache.ibatis.annotations.Mapper;
import com.qhit.lostGoods.pojo.LostGoods;
import java.util.List;



@Mapper  
public interface ILostGoodsDao {

    boolean insert(Object object);

    boolean  update(Object object);

    boolean  updateSelective(Object object);

    boolean delete(Object object);

    List freeFind(String sql);

    List findAll();

    List findById(Object id);

    boolean freeUpdate(String sql);

    List<LostGoods> search(LostGoods lostGoods);

    List findByLgTime(Object lgTime);

    List findByUserId(Object userId);

    List findByLgTheme(Object lgTheme);

    List findByLgContent(Object lgContent);

    List findByGiId(Object giId);

    List findByExaState(Object exaState);

    List findByFabulouscount(Object fabulouscount);

    List findByCompleted(Object completed);

}