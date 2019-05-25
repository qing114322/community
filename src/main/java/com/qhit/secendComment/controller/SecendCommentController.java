package com.qhit.secendComment.controller; 

import com.qhit.secendComment.pojo.SecendComment; 
import com.qhit.secendComment.service.ISecendCommentService; 
import org.springframework.web.bind.annotation.RequestMapping; 
import javax.annotation.Resource; 
import java.util.List; 
import org.springframework.web.bind.annotation.RestController; 



@RestController 
@RequestMapping("/secendComment") 
public class SecendCommentController { 

    @Resource 
    ISecendCommentService secendCommentService; 

    @RequestMapping("/insert") 
    public void insert(SecendComment secendComment) { 
        secendCommentService.insert(secendComment); 
    } 

    @RequestMapping("/delete") 
    public void delete(Integer scId) { 
        secendCommentService.delete(scId); 
    } 

    @RequestMapping("/update") 
    public void update(SecendComment secendComment) { 
        secendCommentService.update(secendComment); 
    } 

    @RequestMapping("/updateSelective") 
    public void updateSelective(SecendComment secendComment) { 
        secendCommentService.updateSelective(secendComment); 
    } 

    @RequestMapping("/load") 
    public SecendComment load(Integer scId) { 
        SecendComment secendComment = secendCommentService.findById(scId); 
        return secendComment; 
    } 

    @RequestMapping("/list") 
    public List<SecendComment> list()  { 
        List<SecendComment> list = secendCommentService.findAll(); 
        return list; 
    } 

    @RequestMapping("/search") 
    public List<SecendComment> search(SecendComment secendComment) { 
        List<SecendComment> list = secendCommentService.search(secendComment); 
        return list; 
    } 

} 
