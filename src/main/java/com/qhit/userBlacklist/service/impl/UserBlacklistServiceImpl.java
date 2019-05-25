package com.qhit.userBlacklist.service.impl;

import com.qhit.userBlacklist.service.IUserBlacklistService;
import java.util.List;
import com.qhit.userBlacklist.dao.IUserBlacklistDao;
import com.qhit.userBlacklist.pojo.UserBlacklist;
import org.springframework.stereotype.Service;
import javax.annotation.Resource; 



@Service 
public class UserBlacklistServiceImpl  implements IUserBlacklistService {

    @Resource 
    IUserBlacklistDao dao;

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
        UserBlacklist userBlacklist = findById(id); 
        return dao.delete(userBlacklist); 
    } 

    @Override 
    public List findAll() { 
        return dao.findAll(); 
    } 

    @Override 
    public UserBlacklist findById(Object id) { 
        List<UserBlacklist> list = dao.findById(id); 
        return  list.get(0); 
    } 

    @Override 
    public List<UserBlacklist> search(UserBlacklist userBlacklist) { 
        return dao.search(userBlacklist); 
    } 

}