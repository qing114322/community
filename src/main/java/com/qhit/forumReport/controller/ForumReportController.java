package com.qhit.forumReport.controller; 

import com.qhit.forumReport.pojo.ForumReport; 
import com.qhit.forumReport.service.IForumReportService; 
import org.springframework.web.bind.annotation.RequestMapping; 
import javax.annotation.Resource; 
import java.util.List; 
import org.springframework.web.bind.annotation.RestController; 



@RestController 
@RequestMapping("/forumReport") 
public class ForumReportController { 

    @Resource 
    IForumReportService forumReportService; 

    @RequestMapping("/insert") 
    public void insert(ForumReport forumReport) { 
        forumReportService.insert(forumReport); 
    } 

    @RequestMapping("/delete") 
    public void delete(Integer frId) { 
        forumReportService.delete(frId); 
    } 

    @RequestMapping("/update") 
    public void update(ForumReport forumReport) { 
        forumReportService.update(forumReport); 
    } 

    @RequestMapping("/updateSelective") 
    public void updateSelective(ForumReport forumReport) { 
        forumReportService.updateSelective(forumReport); 
    } 

    @RequestMapping("/load") 
    public ForumReport load(Integer frId) { 
        ForumReport forumReport = forumReportService.findById(frId); 
        return forumReport; 
    } 

    @RequestMapping("/list") 
    public List<ForumReport> list()  { 
        List<ForumReport> list = forumReportService.findAll(); 
        return list; 
    } 

    @RequestMapping("/search") 
    public List<ForumReport> search(ForumReport forumReport) { 
        List<ForumReport> list = forumReportService.search(forumReport); 
        return list; 
    } 

} 
