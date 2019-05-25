package com.qhit.secendComment.dao;

import org.apache.ibatis.annotations.Mapper;
import com.qhit.secendComment.pojo.SecendComment;
import java.util.List;



@Mapper  
public interface ISecendCommentDao {

    boolean insert(Object object);

    boolean  update(Object object);

    boolean  updateSelective(Object object);

    boolean delete(Object object);

    List freeFind(String sql);

    List findAll();

    List findById(Object id);

    boolean freeUpdate(String sql);

    List<SecendComment> search(SecendComment secendComment);

    List findByComId(Object comId);

    List findByForId(Object forId);

    List findByScContent(Object scContent);

    List findByScTime(Object scTime);

    List findByFabulouscount(Object fabulouscount);

}