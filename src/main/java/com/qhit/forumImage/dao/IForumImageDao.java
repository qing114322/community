package com.qhit.forumImage.dao;

import org.apache.ibatis.annotations.Mapper;
import com.qhit.forumImage.pojo.ForumImage;
import java.util.List;



@Mapper  
public interface IForumImageDao {

    boolean insert(Object object);

    boolean  update(Object object);

    boolean  updateSelective(Object object);

    boolean delete(Object object);

    List freeFind(String sql);

    List findAll();

    List findById(Object id);

    boolean freeUpdate(String sql);

    List<ForumImage> search(ForumImage forumImage);

    List findByForId(Object forId);

    List findByImageName(Object imageName);

}