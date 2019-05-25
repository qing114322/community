package com.qhit.userBlacklist.service;

import java.util.List;
import com.qhit.userBlacklist.pojo.UserBlacklist;

public interface IUserBlacklistService {

    boolean insert(Object object);

    boolean  update(Object object);

    boolean  updateSelective(Object object);

    boolean delete(Object id);

    List findAll();

    UserBlacklist findById(Object id);

    List<UserBlacklist> search(UserBlacklist userBlacklist);

}