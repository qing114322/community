package com.qhit.commentFabulous.service.impl;

import com.qhit.commentFabulous.service.ICommentFabulousService;
import java.util.List;
import com.qhit.commentFabulous.dao.ICommentFabulousDao;
import com.qhit.commentFabulous.pojo.CommentFabulous;
import org.springframework.stereotype.Service;
import javax.annotation.Resource; 



@Service 
public class CommentFabulousServiceImpl  implements ICommentFabulousService {

    @Resource 
    ICommentFabulousDao dao;

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
        CommentFabulous commentFabulous = findById(id); 
        return dao.delete(commentFabulous); 
    } 

    @Override 
    public List findAll() { 
        return dao.findAll(); 
    } 

    @Override 
    public CommentFabulous findById(Object id) { 
        List<CommentFabulous> list = dao.findById(id); 
        return  list.get(0); 
    } 

    @Override 
    public List<CommentFabulous> search(CommentFabulous commentFabulous) { 
        return dao.search(commentFabulous); 
    } 

}