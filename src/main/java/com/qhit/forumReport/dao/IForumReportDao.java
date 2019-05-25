package com.qhit.forumReport.dao;

import org.apache.ibatis.annotations.Mapper;
import com.qhit.forumReport.pojo.ForumReport;
import java.util.List;



@Mapper  
public interface IForumReportDao {

    boolean insert(Object object);

    boolean  update(Object object);

    boolean  updateSelective(Object object);

    boolean delete(Object object);

    List freeFind(String sql);

    List findAll();

    List findById(Object id);

    boolean freeUpdate(String sql);

    List<ForumReport> search(ForumReport forumReport);

    List findByUserId(Object userId);

    List findByForId(Object forId);

    List findByReportType(Object reportType);

    List findByExaState(Object exaState);

}