package com.qhit.secendComment.service;

import java.util.List;
import com.qhit.secendComment.pojo.SecendComment;

public interface ISecendCommentService {

    boolean insert(Object object);

    boolean  update(Object object);

    boolean  updateSelective(Object object);

    boolean delete(Object id);

    List findAll();

    SecendComment findById(Object id);

    List<SecendComment> search(SecendComment secendComment);

}