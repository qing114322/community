package com.qhit.forumProhibit.controller; 

import com.qhit.forumProhibit.pojo.ForumProhibit; 
import com.qhit.forumProhibit.service.IForumProhibitService; 
import org.springframework.web.bind.annotation.RequestMapping; 
import javax.annotation.Resource; 
import java.util.List; 
import org.springframework.web.bind.annotation.RestController; 



@RestController 
@RequestMapping("/forumProhibit") 
public class ForumProhibitController { 

    @Resource 
    IForumProhibitService forumProhibitService; 

    @RequestMapping("/insert") 
    public void insert(ForumProhibit forumProhibit) { 
        forumProhibitService.insert(forumProhibit); 
    } 

    @RequestMapping("/delete") 
    public void delete(Integer fpId) { 
        forumProhibitService.delete(fpId); 
    } 

    @RequestMapping("/update") 
    public void update(ForumProhibit forumProhibit) { 
        forumProhibitService.update(forumProhibit); 
    } 

    @RequestMapping("/updateSelective") 
    public void updateSelective(ForumProhibit forumProhibit) { 
        forumProhibitService.updateSelective(forumProhibit); 
    } 

    @RequestMapping("/load") 
    public ForumProhibit load(Integer fpId) { 
        ForumProhibit forumProhibit = forumProhibitService.findById(fpId); 
        return forumProhibit; 
    } 

    @RequestMapping("/list") 
    public List<ForumProhibit> list()  { 
        List<ForumProhibit> list = forumProhibitService.findAll(); 
        return list; 
    } 

    @RequestMapping("/search") 
    public List<ForumProhibit> search(ForumProhibit forumProhibit) { 
        List<ForumProhibit> list = forumProhibitService.search(forumProhibit); 
        return list; 
    } 

} 
