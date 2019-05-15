package com.qhit.activity.dao;

import org.apache.ibatis.annotations.Mapper;
import com.qhit.activity.pojo.Activity;
import java.util.List;



@Mapper  
public interface IActivityDao {

    boolean insert(Object object);

    boolean  update(Object object);

    boolean  updateSelective(Object object);

    boolean delete(Object object);

    List freeFind(String sql);

    List findAll();

    List findById(Object id);

    boolean freeUpdate(String sql);

    List<Activity> search(Activity activity);

    List findByActTime(Object actTime);

    List findByActThene(Object actThene);

    List findByActContent(Object actContent);

    List findByState(Object state);

}