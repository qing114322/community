package com.qhit.forum.controller; 

import com.alibaba.fastjson.JSON;
import com.qhit.forum.pojo.Forum;
import com.qhit.forum.service.IForumService;
import com.qhit.utils.HttpUtil;
import com.qhit.utils.Upload;
import net.sf.json.JSONObject;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.RestController; 


@RestController 
@RequestMapping("/forum") 
public class ForumController { 

    @Resource 
    IForumService forumService;
    @Resource
    HttpUtil httpUtil;
    @Resource
    Upload upload;

    @RequestMapping("/insert") 
    public void insert(Forum forum, HttpSession session, HttpServletRequest request, HttpServletResponse response) throws Exception {
        //调用文件上传的方法返回一个文件的绝对路径+文件的名称的字符串
        String s = upload.handleFileUpload(request, response);
        String[] split = s.split(",");
        for (int i = 0; i < split.length; i++) {
            System.out.println(split[i]);
        }
        forumService.insert(forum); 
    } 

    @RequestMapping("/delete") 
    public void delete(Integer forId) { 
        forumService.delete(forId); 
    } 

    @RequestMapping("/update") 
    public void update(Forum forum) { 
        forumService.update(forum); 
    } 

    @RequestMapping("/updateSelective") 
    public void updateSelective(Forum forum) { 
        forumService.updateSelective(forum); 
    } 

    @RequestMapping("/load") 
    public Forum load(Integer forId) { 
        Forum forum = forumService.findById(forId); 
        return forum; 
    } 

    @RequestMapping("/list") 
    public List<Forum> list(HttpSession session)  {
        List<Forum> list = forumService.findAll();
        return list; 
    } 

    @RequestMapping("/search") 
    public List<Forum> search(Forum forum) { 
        List<Forum> list = forumService.search(forum); 
        return list; 
    }

    @RequestMapping("/overview")
    public List<Forum> overview() {
        return forumService.overview();
    }

    @RequestMapping("/popular")
    public List<Forum> popular() {
        return forumService.popular();
    }

    @RequestMapping("/refinement")
    public List<Forum> refinement() {
        return forumService.refinement();
    }

    @RequestMapping("/top")
    public List<Forum> top() {
        return forumService.top();
    }

    @RequestMapping("/sessions")
    public List<Forum> sessions(HttpSession session) {
//        String json = (String) session.getAttribute("baseUserLogin");
//        JSONObject jsonObject = JSONObject.fromObject(json);
//        Map mapTypes = (Map) JSON.parseObject(String.valueOf(jsonObject));
//        System.out.println("这个是用JSON类的parseObject来解析JSON字符串!!!");
//        for (Object obj : mapTypes.keySet()){
//            System.out.println("key为："+obj+"值为："+mapTypes.get(obj));
//        }
        Object news = httpUtil.getForList("news", "news/list", List.class, null);
        System.out.println(news);
        return null;
    }

}
