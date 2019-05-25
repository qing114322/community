package com.qhit.forumFabulous.dao;

import org.apache.ibatis.annotations.Mapper;
import com.qhit.forumFabulous.pojo.ForumFabulous;
import java.util.List;



@Mapper  
public interface IForumFabulousDao {

    boolean insert(Object object);

    boolean  update(Object object);

    boolean  updateSelective(Object object);

    boolean delete(Object object);

    List freeFind(String sql);

    List findAll();

    List findById(Object id);

    boolean freeUpdate(String sql);

    List<ForumFabulous> search(ForumFabulous forumFabulous);

    List findByUserId(Object userId);

    List findByForId(Object forId);

}