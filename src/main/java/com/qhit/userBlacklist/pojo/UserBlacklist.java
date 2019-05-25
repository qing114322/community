package com.qhit.userBlacklist.pojo;




public class UserBlacklist { 
    private Integer ubId;    //id 
    private Integer userId;    //用户id 
    private Integer blackId;    //被拉黑用户id 

    public Integer getUbId() { 
        return ubId;
    }

    public void setUbId(Integer ubId) { 
        this.ubId = ubId;
    } 

    public Integer getUserId() { 
        return userId;
    }

    public void setUserId(Integer userId) { 
        this.userId = userId;
    } 

    public Integer getBlackId() { 
        return blackId;
    }

    public void setBlackId(Integer blackId) { 
        this.blackId = blackId;
    } 


 }