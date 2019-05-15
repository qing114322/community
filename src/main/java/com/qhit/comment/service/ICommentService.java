package com.qhit.comment.service;

import java.util.List;
import java.util.Map;

import com.qhit.comment.pojo.Comment;

public interface ICommentService {

    boolean insert(Object object);

    boolean  update(Object object);

    boolean  updateSelective(Object object);

    boolean delete(Object id);

    List findAll();

    Comment findById(Object id);

    List<Comment> search(Comment comment);

    Map forumComments(String forId);
}