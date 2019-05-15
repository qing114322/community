package com.qhit.activity.controller; 

import com.qhit.activity.pojo.Activity; 
import com.qhit.activity.service.IActivityService;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List; 
import org.springframework.web.bind.annotation.RestController; 



@RestController 
@RequestMapping("/activity") 
public class ActivityController { 

    @Resource 
    IActivityService activityService; 

    @RequestMapping("/insert") 
    public void insert(Activity activity) { 
        activityService.insert(activity); 
    } 

    @RequestMapping("/delete") 
    public void delete(Integer actId) { 
        activityService.delete(actId); 
    } 

    @RequestMapping("/update") 
    public void update(Activity activity) { 
        activityService.update(activity); 
    } 

    @RequestMapping("/updateSelective") 
    public void updateSelective(Activity activity) { 
        activityService.updateSelective(activity); 
    } 

    @RequestMapping("/load") 
    public Activity load(Integer actId) { 
        Activity activity = activityService.findById(actId); 
        return activity; 
    } 

    @RequestMapping("/list") 
    public List<Activity> list(HttpSession session)  {
        List<Activity> list = activityService.findAll();
        Object zeng = session.getAttribute("zeng");
        System.out.println(zeng);
        return list; 
    } 

    @RequestMapping("/search") 
    public List<Activity> search(Activity activity) { 
        List<Activity> list = activityService.search(activity); 
        return list; 
    } 

} 
