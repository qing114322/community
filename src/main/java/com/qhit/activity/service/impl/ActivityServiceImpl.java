package com.qhit.activity.service.impl;

import com.qhit.activity.service.IActivityService;
import java.util.List;
import com.qhit.activity.dao.IActivityDao;
import com.qhit.activity.pojo.Activity;
import org.springframework.stereotype.Service;
import javax.annotation.Resource; 



@Service 
public class ActivityServiceImpl  implements IActivityService {

    @Resource 
    IActivityDao dao;

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
        Activity activity = findById(id); 
        return dao.delete(activity); 
    } 

    @Override 
    public List findAll() { 
        return dao.findAll(); 
    } 

    @Override 
    public Activity findById(Object id) { 
        List<Activity> list = dao.findById(id); 
        return  list.get(0); 
    } 

    @Override 
    public List<Activity> search(Activity activity) { 
        return dao.search(activity); 
    } 

}