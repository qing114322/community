package com.qhit.forumImage.controller; 

import com.qhit.forumImage.pojo.ForumImage; 
import com.qhit.forumImage.service.IForumImageService; 
import org.springframework.web.bind.annotation.RequestMapping; 
import javax.annotation.Resource; 
import java.util.List; 
import org.springframework.web.bind.annotation.RestController; 



@RestController 
@RequestMapping("/forumImage") 
public class ForumImageController { 

    @Resource 
    IForumImageService forumImageService; 

    @RequestMapping("/insert") 
    public void insert(ForumImage forumImage) { 
        forumImageService.insert(forumImage); 
    } 

    @RequestMapping("/delete") 
    public void delete(Integer fiId) { 
        forumImageService.delete(fiId); 
    } 

    @RequestMapping("/update") 
    public void update(ForumImage forumImage) { 
        forumImageService.update(forumImage); 
    } 

    @RequestMapping("/updateSelective") 
    public void updateSelective(ForumImage forumImage) { 
        forumImageService.updateSelective(forumImage); 
    } 

    @RequestMapping("/load") 
    public ForumImage load(Integer fiId) { 
        ForumImage forumImage = forumImageService.findById(fiId); 
        return forumImage; 
    } 

    @RequestMapping("/list") 
    public List<ForumImage> list()  { 
        List<ForumImage> list = forumImageService.findAll(); 
        return list; 
    } 

    @RequestMapping("/search") 
    public List<ForumImage> search(ForumImage forumImage) { 
        List<ForumImage> list = forumImageService.search(forumImage); 
        return list; 
    } 

} 
