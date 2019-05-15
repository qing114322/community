package com.qhit.comment.controller; 

import com.qhit.comment.pojo.Comment; 
import com.qhit.comment.service.ICommentService; 
import org.springframework.web.bind.annotation.RequestMapping; 
import javax.annotation.Resource; 
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.RestController; 


@RestController 
@RequestMapping("/comment") 
public class CommentController { 

    @Resource 
    ICommentService commentService; 

    @RequestMapping("/insert") 
    public void insert(Comment comment) { 
        commentService.insert(comment); 
    } 

    @RequestMapping("/delete") 
    public void delete(Integer comId) { 
        commentService.delete(comId); 
    } 

    @RequestMapping("/update") 
    public void update(Comment comment) { 
        commentService.update(comment); 
    } 

    @RequestMapping("/updateSelective") 
    public void updateSelective(Comment comment) { 
        commentService.updateSelective(comment); 
    } 

    @RequestMapping("/load") 
    public Comment load(Integer comId) { 
        Comment comment = commentService.findById(comId); 
        return comment; 
    } 

    @RequestMapping("/list") 
    public List<Comment> list()  { 
        List<Comment> list = commentService.findAll(); 
        return list; 
    } 

    @RequestMapping("/search") 
    public List<Comment> search(Comment comment) { 
        List<Comment> list = commentService.search(comment); 
        return list; 
    }

    @RequestMapping("/forumComments")
    public Map forumComments( String forId) {
        return commentService.forumComments(forId);
    }
}
