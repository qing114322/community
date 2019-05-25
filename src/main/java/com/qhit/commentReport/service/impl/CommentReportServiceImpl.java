package com.qhit.commentReport.service.impl;

import com.qhit.commentReport.service.ICommentReportService;
import java.util.List;
import com.qhit.commentReport.dao.ICommentReportDao;
import com.qhit.commentReport.pojo.CommentReport;
import org.springframework.stereotype.Service;
import javax.annotation.Resource; 



@Service 
public class CommentReportServiceImpl  implements ICommentReportService {

    @Resource 
    ICommentReportDao dao;

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
        CommentReport commentReport = findById(id); 
        return dao.delete(commentReport); 
    } 

    @Override 
    public List findAll() { 
        return dao.findAll(); 
    } 

    @Override 
    public CommentReport findById(Object id) { 
        List<CommentReport> list = dao.findById(id); 
        return  list.get(0); 
    } 

    @Override 
    public List<CommentReport> search(CommentReport commentReport) { 
        return dao.search(commentReport); 
    } 

}