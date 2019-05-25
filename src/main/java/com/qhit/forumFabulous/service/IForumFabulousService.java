package com.qhit.forumFabulous.service;

import java.util.List;
import com.qhit.forumFabulous.pojo.ForumFabulous;

public interface IForumFabulousService {

    boolean insert(Object object);

    boolean  update(Object object);

    boolean  updateSelective(Object object);

    boolean delete(Object id);

    List findAll();

    ForumFabulous findById(Object id);

    List<ForumFabulous> search(ForumFabulous forumFabulous);

}