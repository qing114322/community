package com.qhit.forumProhibit.pojo;



public class ForumProhibit { 
    private Integer fpId;    //id 
    private Integer userId;    //用户id 
    private Integer publish;    //是否允许发帖  {允许为0，禁用为1} 
    private Integer comment;    //是否允许评论  {允许为0，禁用为1} 

    public Integer getFpId() { 
        return fpId;
    }

    public void setFpId(Integer fpId) { 
        this.fpId = fpId;
    } 

    public Integer getUserId() { 
        return userId;
    }

    public void setUserId(Integer userId) { 
        this.userId = userId;
    } 

    public Integer getPublish() { 
        return publish;
    }

    public void setPublish(Integer publish) { 
        this.publish = publish;
    } 

    public Integer getComment() { 
        return comment;
    }

    public void setComment(Integer comment) { 
        this.comment = comment;
    } 


 }