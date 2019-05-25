package com.qhit.secendComment.service.impl;

import com.qhit.secendComment.service.ISecendCommentService;
import java.util.List;
import com.qhit.secendComment.dao.ISecendCommentDao;
import com.qhit.secendComment.pojo.SecendComment;
import org.springframework.stereotype.Service;
import javax.annotation.Resource; 



@Service 
public class SecendCommentServiceImpl  implements ISecendCommentService {

    @Resource 
    ISecendCommentDao dao;

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
        SecendComment secendComment = findById(id); 
        return dao.delete(secendComment); 
    } 

    @Override 
    public List findAll() { 
        return dao.findAll(); 
    } 

    @Override 
    public SecendComment findById(Object id) { 
        List<SecendComment> list = dao.findById(id); 
        return  list.get(0); 
    } 

    @Override 
    public List<SecendComment> search(SecendComment secendComment) { 
        return dao.search(secendComment); 
    } 

}