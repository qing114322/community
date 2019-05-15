package com.qhit.comment.dao;

import org.apache.ibatis.annotations.Mapper;
import com.qhit.comment.pojo.Comment;
import java.util.List;
import java.util.Map;


@Mapper  
public interface ICommentDao {

    boolean insert(Object object);

    boolean  update(Object object);

    boolean  updateSelective(Object object);

    boolean delete(Object object);

    List freeFind(String sql);

    List findAll();

    List findById(Object id);

    boolean freeUpdate(String sql);

    List<Comment> search(Comment comment);

    List findByUserId(Object userId);

    List findByForId(Object forId);

    List findByComContent(Object comContent);

    List findByComTime(Object comTime);

    List findByFabulouscount(Object fabulouscount);

//    List<Comment> details(int start,int sum);

    List<Map> displayComments(Map map);

}