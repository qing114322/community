package com.qhit.activity.service;

import java.util.List;
import com.qhit.activity.pojo.Activity;

public interface IActivityService {

    boolean insert(Object object);

    boolean  update(Object object);

    boolean  updateSelective(Object object);

    boolean delete(Object id);

    List findAll();

    Activity findById(Object id);

    List<Activity> search(Activity activity);

}