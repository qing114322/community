package com.qhit.commentFabulous.dao;

import org.apache.ibatis.annotations.Mapper;
import com.qhit.commentFabulous.pojo.CommentFabulous;
import java.util.List;



@Mapper  
public interface ICommentFabulousDao {

    boolean insert(Object object);

    boolean  update(Object object);

    boolean  updateSelective(Object object);

    boolean delete(Object object);

    List freeFind(String sql);

    List findAll();

    List findById(Object id);

    boolean freeUpdate(String sql);

    List<CommentFabulous> search(CommentFabulous commentFabulous);

    List findByUserId(Object userId);

    List findByComId(Object comId);

}