package com.qhit.commentReport.controller; 

import com.qhit.commentReport.pojo.CommentReport; 
import com.qhit.commentReport.service.ICommentReportService; 
import org.springframework.web.bind.annotation.RequestMapping; 
import javax.annotation.Resource; 
import java.util.List; 
import org.springframework.web.bind.annotation.RestController; 



@RestController 
@RequestMapping("/commentReport") 
public class CommentReportController { 

    @Resource 
    ICommentReportService commentReportService; 

    @RequestMapping("/insert") 
    public void insert(CommentReport commentReport) { 
        commentReportService.insert(commentReport); 
    } 

    @RequestMapping("/delete") 
    public void delete(Integer crId) { 
        commentReportService.delete(crId); 
    } 

    @RequestMapping("/update") 
    public void update(CommentReport commentReport) { 
        commentReportService.update(commentReport); 
    } 

    @RequestMapping("/updateSelective") 
    public void updateSelective(CommentReport commentReport) { 
        commentReportService.updateSelective(commentReport); 
    } 

    @RequestMapping("/load") 
    public CommentReport load(Integer crId) { 
        CommentReport commentReport = commentReportService.findById(crId); 
        return commentReport; 
    } 

    @RequestMapping("/list") 
    public List<CommentReport> list()  { 
        List<CommentReport> list = commentReportService.findAll(); 
        return list; 
    } 

    @RequestMapping("/search") 
    public List<CommentReport> search(CommentReport commentReport) { 
        List<CommentReport> list = commentReportService.search(commentReport); 
        return list; 
    } 

} 
