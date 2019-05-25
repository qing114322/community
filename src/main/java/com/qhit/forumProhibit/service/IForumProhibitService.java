package com.qhit.forumProhibit.service;

import java.util.List;
import com.qhit.forumProhibit.pojo.ForumProhibit;

public interface IForumProhibitService {

    boolean insert(Object object);

    boolean  update(Object object);

    boolean  updateSelective(Object object);

    boolean delete(Object id);

    List findAll();

    ForumProhibit findById(Object id);

    List<ForumProhibit> search(ForumProhibit forumProhibit);

}