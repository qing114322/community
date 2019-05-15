package com.qhit.comment.pojo;




public class Comment { 
    private Integer comId;    //主键 
    private Integer userId;    //评论人 
    private Integer receiveId;    //接收人
    private Integer forId;    //评论贴
    private String comContent;  //评论内容
    private String comTime;    //评论时间 
    private Integer fabulouscount;    //点赞数量

    private String username; //评论人名字
    private String receivename; //接收人名字

    public Integer getReceiveId() {
        return receiveId;
    }

    public void setReceiveId(Integer receiveId) {
        this.receiveId = receiveId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getReceivename() {
        return receivename;
    }

    public void setReceivename(String receivename) {
        this.receivename = receivename;
    }

    public String getComContent() {
        return comContent;
    }

    public void setComContent(String comContent) {
        this.comContent = comContent;
    }

    public Integer getComId() {
        return comId;
    }

    public void setComId(Integer comId) { 
        this.comId = comId;
    } 

    public Integer getUserId() { 
        return userId;
    }

    public void setUserId(Integer userId) { 
        this.userId = userId;
    } 

    public Integer getForId() { 
        return forId;
    }

    public void setForId(Integer forId) { 
        this.forId = forId;
    } 

    public String getComTime() { 
        return comTime;
    }

    public void setComTime(String comTime) { 
        this.comTime = comTime;
    }
    public Integer getFabulouscount() { 
        return fabulouscount;
    }

    public void setFabulouscount(Integer fabulouscount) { 
        this.fabulouscount = fabulouscount;
    }


}