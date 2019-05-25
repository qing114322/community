package com.qhit.forumProhibit.service.impl;

import com.qhit.forumProhibit.service.IForumProhibitService;
import java.util.List;
import com.qhit.forumProhibit.dao.IForumProhibitDao;
import com.qhit.forumProhibit.pojo.ForumProhibit;
import org.springframework.stereotype.Service;
import javax.annotation.Resource; 


@Service 
public class ForumProhibitServiceImpl  implements IForumProhibitService {

    @Resource 
    IForumProhibitDao dao;

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
        ForumProhibit forumProhibit = findById(id); 
        return dao.delete(forumProhibit); 
    } 

    @Override 
    public List findAll() { 
        return dao.findAll(); 
    } 

    @Override 
    public ForumProhibit findById(Object id) { 
        List<ForumProhibit> list = dao.findById(id); 
        return  list.get(0); 
    } 

    @Override 
    public List<ForumProhibit> search(ForumProhibit forumProhibit) { 
        return dao.search(forumProhibit); 
    } 

}