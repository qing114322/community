package com.qhit.forumProhibit.dao;

import org.apache.ibatis.annotations.Mapper;
import com.qhit.forumProhibit.pojo.ForumProhibit;
import java.util.List;



@Mapper  
public interface IForumProhibitDao {

    boolean insert(Object object);

    boolean  update(Object object);

    boolean  updateSelective(Object object);

    boolean delete(Object object);

    List freeFind(String sql);

    List findAll();

    List findById(Object id);

    boolean freeUpdate(String sql);

    List<ForumProhibit> search(ForumProhibit forumProhibit);

    List findByUserId(Object userId);

    List findByPublish(Object publish);

    List findByComment(Object comment);

}