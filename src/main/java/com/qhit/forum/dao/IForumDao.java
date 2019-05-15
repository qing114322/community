package com.qhit.forum.dao;

import org.apache.ibatis.annotations.Mapper;
import com.qhit.forum.pojo.Forum;
import java.util.List;
import java.util.Map;



@Mapper  
public interface IForumDao {

    boolean insert(Object object);

    boolean  update(Object object);

    boolean  updateSelective(Object object);

    boolean delete(Object object);

    List freeFind(String sql);

    List findAll();

    List findById(Object id);

    boolean freeUpdate(String sql);

    List<Forum> search(Forum forum);

    List findByForTime(Object forTime);

    List findByUserId(Object userId);

    List findByForTheme(Object forTheme);

    List findByForContent(Object forContent);

    List findByNewsImage(Object newsImage);

    List findByExaState(Object exaState);

    List findByFabulouscount(Object fabulouscount);

    List findByState(Object state);

    List findByElite(Object elite);

    List<Forum> overview();

    Map findDetails(Map map);

    List<Forum> popular();

    List<Forum> refinement();

    List<Forum> top();

}