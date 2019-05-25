package com.qhit.userBlacklist.dao;

import org.apache.ibatis.annotations.Mapper;
import com.qhit.userBlacklist.pojo.UserBlacklist;
import java.util.List;


@Mapper  
public interface IUserBlacklistDao {

    boolean insert(Object object);

    boolean  update(Object object);

    boolean  updateSelective(Object object);

    boolean delete(Object object);

    List freeFind(String sql);

    List findAll();

    List findById(Object id);

    boolean freeUpdate(String sql);

    List<UserBlacklist> search(UserBlacklist userBlacklist);

    List findByUserId(Object userId);

    List findByBlackId(Object blackId);

}