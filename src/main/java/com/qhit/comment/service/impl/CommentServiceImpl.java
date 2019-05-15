package com.qhit.comment.service.impl;

import com.qhit.comment.service.ICommentService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.qhit.comment.dao.ICommentDao;
import com.qhit.comment.pojo.Comment;
import com.qhit.forum.dao.IForumDao;
import org.springframework.stereotype.Service;
import javax.annotation.Resource; 


@Service 
public class CommentServiceImpl  implements ICommentService {

    @Resource 
    ICommentDao dao;
    @Resource
    IForumDao forumDao;

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
        Comment comment = findById(id); 
        return dao.delete(comment); 
    } 

    @Override 
    public List findAll() { 
        return dao.findAll(); 
    } 

    @Override 
    public Comment findById(Object id) { 
        List<Comment> list = dao.findById(id); 
        return  list.get(0); 
    } 

    @Override 
    public List<Comment> search(Comment comment) { 
        return dao.search(comment); 
    }

    @Override
    public Map forumComments( String forId) {
        Map map = new HashMap();
        map.put("forId",forId);
        Map details = forumDao.findDetails(map);
        List<Map> list = dao.displayComments(map);
        details.put("children",list);
        return details;
    }

}