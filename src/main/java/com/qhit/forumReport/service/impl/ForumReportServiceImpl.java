package com.qhit.forumReport.service.impl;

import com.qhit.forumReport.service.IForumReportService;
import java.util.List;
import com.qhit.forumReport.dao.IForumReportDao;
import com.qhit.forumReport.pojo.ForumReport;
import org.springframework.stereotype.Service;
import javax.annotation.Resource; 



@Service 
public class ForumReportServiceImpl  implements IForumReportService {

    @Resource 
    IForumReportDao dao;

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
        ForumReport forumReport = findById(id); 
        return dao.delete(forumReport); 
    } 

    @Override 
    public List findAll() { 
        return dao.findAll(); 
    } 

    @Override 
    public ForumReport findById(Object id) { 
        List<ForumReport> list = dao.findById(id); 
        return  list.get(0); 
    } 

    @Override 
    public List<ForumReport> search(ForumReport forumReport) { 
        return dao.search(forumReport); 
    } 

}