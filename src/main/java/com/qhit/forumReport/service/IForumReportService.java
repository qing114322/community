package com.qhit.forumReport.service;

import java.util.List;
import com.qhit.forumReport.pojo.ForumReport;

public interface IForumReportService {

    boolean insert(Object object);

    boolean  update(Object object);

    boolean  updateSelective(Object object);

    boolean delete(Object id);

    List findAll();

    ForumReport findById(Object id);

    List<ForumReport> search(ForumReport forumReport);

}