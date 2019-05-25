package com.qhit.commentReport.service;

import java.util.List;
import com.qhit.commentReport.pojo.CommentReport;

public interface ICommentReportService {

    boolean insert(Object object);

    boolean  update(Object object);

    boolean  updateSelective(Object object);

    boolean delete(Object id);

    List findAll();

    CommentReport findById(Object id);

    List<CommentReport> search(CommentReport commentReport);

}