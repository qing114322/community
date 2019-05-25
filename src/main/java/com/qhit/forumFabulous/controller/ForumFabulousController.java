package com.qhit.forumFabulous.controller; 

import com.qhit.forumFabulous.pojo.ForumFabulous; 
import com.qhit.forumFabulous.service.IForumFabulousService; 
import org.springframework.web.bind.annotation.RequestMapping; 
import javax.annotation.Resource; 
import java.util.List; 
import org.springframework.web.bind.annotation.RestController; 


@RestController 
@RequestMapping("/forumFabulous") 
public class ForumFabulousController { 

    @Resource 
    IForumFabulousService forumFabulousService; 

    @RequestMapping("/insert") 
    public void insert(ForumFabulous forumFabulous) { 
        forumFabulousService.insert(forumFabulous); 
    } 

    @RequestMapping("/delete") 
    public void delete(Integer ffId) { 
        forumFabulousService.delete(ffId); 
    } 

    @RequestMapping("/update") 
    public void update(ForumFabulous forumFabulous) { 
        forumFabulousService.update(forumFabulous); 
    } 

    @RequestMapping("/updateSelective") 
    public void updateSelective(ForumFabulous forumFabulous) { 
        forumFabulousService.updateSelective(forumFabulous); 
    } 

    @RequestMapping("/load") 
    public ForumFabulous load(Integer ffId) { 
        ForumFabulous forumFabulous = forumFabulousService.findById(ffId); 
        return forumFabulous; 
    } 

    @RequestMapping("/list") 
    public List<ForumFabulous> list()  { 
        List<ForumFabulous> list = forumFabulousService.findAll(); 
        return list; 
    } 

    @RequestMapping("/search") 
    public List<ForumFabulous> search(ForumFabulous forumFabulous) { 
        List<ForumFabulous> list = forumFabulousService.search(forumFabulous); 
        return list; 
    } 

} 
