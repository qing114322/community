package com.qhit.forumFabulous.service.impl;

import com.qhit.forumFabulous.service.IForumFabulousService;
import java.util.List;
import com.qhit.forumFabulous.dao.IForumFabulousDao;
import com.qhit.forumFabulous.pojo.ForumFabulous;
import org.springframework.stereotype.Service;
import javax.annotation.Resource; 



@Service 
public class ForumFabulousServiceImpl  implements IForumFabulousService {

    @Resource 
    IForumFabulousDao dao;

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
        ForumFabulous forumFabulous = findById(id); 
        return dao.delete(forumFabulous); 
    } 

    @Override 
    public List findAll() { 
        return dao.findAll(); 
    } 

    @Override 
    public ForumFabulous findById(Object id) { 
        List<ForumFabulous> list = dao.findById(id); 
        return  list.get(0); 
    } 

    @Override 
    public List<ForumFabulous> search(ForumFabulous forumFabulous) { 
        return dao.search(forumFabulous); 
    } 

}