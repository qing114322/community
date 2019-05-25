package com.qhit.forumImage.service;

import java.util.List;
import com.qhit.forumImage.pojo.ForumImage;

public interface IForumImageService {

    boolean insert(Object object);

    boolean  update(Object object);

    boolean  updateSelective(Object object);

    boolean delete(Object id);

    List findAll();

    ForumImage findById(Object id);

    List<ForumImage> search(ForumImage forumImage);

}