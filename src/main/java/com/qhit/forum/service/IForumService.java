package com.qhit.forum.service;

import java.util.List;
import java.util.Map;

import com.qhit.forum.pojo.Forum;
/**
* Created by GeneratorCode on 2019/05/06
*/
public interface IForumService {

    boolean insert(Object object);

    boolean  update(Object object);

    boolean  updateSelective(Object object);

    boolean delete(Object id);

    List findAll();

    Forum findById(Object id);

    List<Forum> search(Forum forum);

    List<Forum> overview();

    Map findDetails(String forId);

    List<Forum> popular();

    List<Forum> refinement();

    List<Forum> top();


}