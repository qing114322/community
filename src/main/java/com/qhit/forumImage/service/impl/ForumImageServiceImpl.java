package com.qhit.forumImage.service.impl;

import com.qhit.forumImage.service.IForumImageService;
import java.util.List;
import com.qhit.forumImage.dao.IForumImageDao;
import com.qhit.forumImage.pojo.ForumImage;
import org.springframework.stereotype.Service;
import javax.annotation.Resource; 



@Service 
public class ForumImageServiceImpl  implements IForumImageService {

    @Resource 
    IForumImageDao dao;

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
        ForumImage forumImage = findById(id); 
        return dao.delete(forumImage); 
    } 

    @Override 
    public List findAll() { 
        return dao.findAll(); 
    } 

    @Override 
    public ForumImage findById(Object id) { 
        List<ForumImage> list = dao.findById(id); 
        return  list.get(0); 
    } 

    @Override 
    public List<ForumImage> search(ForumImage forumImage) { 
        return dao.search(forumImage); 
    } 

}