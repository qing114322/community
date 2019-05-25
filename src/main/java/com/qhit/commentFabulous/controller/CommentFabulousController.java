package com.qhit.commentFabulous.controller; 

import com.qhit.commentFabulous.pojo.CommentFabulous; 
import com.qhit.commentFabulous.service.ICommentFabulousService; 
import org.springframework.web.bind.annotation.RequestMapping; 
import javax.annotation.Resource; 
import java.util.List; 
import org.springframework.web.bind.annotation.RestController; 



@RestController 
@RequestMapping("/commentFabulous") 
public class CommentFabulousController { 

    @Resource 
    ICommentFabulousService commentFabulousService; 

    @RequestMapping("/insert") 
    public void insert(CommentFabulous commentFabulous) { 
        commentFabulousService.insert(commentFabulous); 
    } 

    @RequestMapping("/delete") 
    public void delete(Integer cfId) { 
        commentFabulousService.delete(cfId); 
    } 

    @RequestMapping("/update") 
    public void update(CommentFabulous commentFabulous) { 
        commentFabulousService.update(commentFabulous); 
    } 

    @RequestMapping("/updateSelective") 
    public void updateSelective(CommentFabulous commentFabulous) { 
        commentFabulousService.updateSelective(commentFabulous); 
    } 

    @RequestMapping("/load") 
    public CommentFabulous load(Integer cfId) { 
        CommentFabulous commentFabulous = commentFabulousService.findById(cfId); 
        return commentFabulous; 
    } 

    @RequestMapping("/list") 
    public List<CommentFabulous> list()  { 
        List<CommentFabulous> list = commentFabulousService.findAll(); 
        return list; 
    } 

    @RequestMapping("/search") 
    public List<CommentFabulous> search(CommentFabulous commentFabulous) { 
        List<CommentFabulous> list = commentFabulousService.search(commentFabulous); 
        return list; 
    } 

} 
