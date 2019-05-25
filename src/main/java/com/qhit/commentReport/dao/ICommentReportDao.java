package com.qhit.commentReport.dao;

import org.apache.ibatis.annotations.Mapper;
import com.qhit.commentReport.pojo.CommentReport;
import java.util.List;



@Mapper  
public interface ICommentReportDao {

    boolean insert(Object object);

    boolean  update(Object object);

    boolean  updateSelective(Object object);

    boolean delete(Object object);

    List freeFind(String sql);

    List findAll();

    List findById(Object id);

    boolean freeUpdate(String sql);

    List<CommentReport> search(CommentReport commentReport);

    List findByUserId(Object userId);

    List findByComId(Object comId);

    List findByReportType(Object reportType);

    List findByExaState(Object exaState);

}