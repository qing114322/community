package com.qhit.forum.service.impl;

import com.qhit.forum.service.IForumService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.qhit.forum.dao.IForumDao;
import com.qhit.forum.pojo.Forum;
import org.springframework.stereotype.Service;
import javax.annotation.Resource; 

/**
* Created by GeneratorCode on 2019/05/06
*/

@Service 
public class ForumServiceImpl  implements IForumService {

    @Resource 
    IForumDao dao;

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
        Forum forum = findById(id); 
        return dao.delete(forum); 
    } 

    @Override 
    public List findAll() { 
        return dao.findAll(); 
    } 

    @Override 
    public Forum findById(Object id) { 
        List<Forum> list = dao.findById(id); 
        return  list.get(0); 
    } 

    @Override 
    public List<Forum> search(Forum forum) { 
        return dao.search(forum); 
    }


    @Override
    public List<Forum> overview() {
        return dao.overview();
    }

    @Override
    public Map findDetails(String forId) {
        Map map = new HashMap();
        map.put("forId",forId);
        return dao.findDetails(map);
    }

    @Override
    public List<Forum> popular() {
        return dao.popular();
    }

    @Override
    public List<Forum> refinement() {
        return dao.refinement();
    }

    @Override
    public List<Forum> top() {
        return dao.top();
    }

}