package com.qhit.commentFabulous.service;

import java.util.List;
import com.qhit.commentFabulous.pojo.CommentFabulous;

public interface ICommentFabulousService {

    boolean insert(Object object);

    boolean  update(Object object);

    boolean  updateSelective(Object object);

    boolean delete(Object id);

    List findAll();

    CommentFabulous findById(Object id);

    List<CommentFabulous> search(CommentFabulous commentFabulous);

}