package com.qhit.userBlacklist.controller; 

import com.qhit.userBlacklist.pojo.UserBlacklist; 
import com.qhit.userBlacklist.service.IUserBlacklistService; 
import org.springframework.web.bind.annotation.RequestMapping; 
import javax.annotation.Resource; 
import java.util.List; 
import org.springframework.web.bind.annotation.RestController; 


@RestController 
@RequestMapping("/userBlacklist") 
public class UserBlacklistController { 

    @Resource 
    IUserBlacklistService userBlacklistService; 

    @RequestMapping("/insert") 
    public void insert(UserBlacklist userBlacklist) { 
        userBlacklistService.insert(userBlacklist); 
    } 

    @RequestMapping("/delete") 
    public void delete(Integer ubId) { 
        userBlacklistService.delete(ubId); 
    } 

    @RequestMapping("/update") 
    public void update(UserBlacklist userBlacklist) { 
        userBlacklistService.update(userBlacklist); 
    } 

    @RequestMapping("/updateSelective") 
    public void updateSelective(UserBlacklist userBlacklist) { 
        userBlacklistService.updateSelective(userBlacklist); 
    } 

    @RequestMapping("/load") 
    public UserBlacklist load(Integer ubId) { 
        UserBlacklist userBlacklist = userBlacklistService.findById(ubId); 
        return userBlacklist; 
    } 

    @RequestMapping("/list") 
    public List<UserBlacklist> list()  { 
        List<UserBlacklist> list = userBlacklistService.findAll(); 
        return list; 
    } 

    @RequestMapping("/search") 
    public List<UserBlacklist> search(UserBlacklist userBlacklist) { 
        List<UserBlacklist> list = userBlacklistService.search(userBlacklist); 
        return list; 
    } 

} 
