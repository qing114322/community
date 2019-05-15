package com.qhit.forum.pojo;



public class Forum { 
    private Integer forId;    //主键 
    private String forTime;    //发布时间 
    private Integer userId;    //发布人 
    private String forTheme;    //主题
    private String forContent;  //内容
    private String newsImage;    //图片
    private Integer exaState;    //审核状态 
    private Integer fabulouscount;    //点赞数量 
    private Integer state;    //0、不置顶 1-5、置顶（按顺序） 
    private Integer elite;    //0、普通  1、加精

    private String name;  //作者
    private int userSex; //性别
    private String portrait; //头像
    private int comcount; // 评论数


    public int getUserSex() {
        return userSex;
    }

    public void setUserSex(int userSex) {
        this.userSex = userSex;
    }

    public String getPortrait() {
        return portrait;
    }

    public void setPortrait(String portrait) {
        this.portrait = portrait;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getComcount() {
        return comcount;
    }

    public void setComcount(int comcount) {
        this.comcount = comcount;
    }

    public String getForContent() {
        return forContent;
    }

    public void setForContent(String forContent) {
        this.forContent = forContent;
    }

    public Integer getForId() {
        return forId;
    }

    public void setForId(Integer forId) { 
        this.forId = forId;
    } 

    public String getForTime() { 
        return forTime;
    }

    public void setForTime(String forTime) { 
        this.forTime = forTime;
    }
    public Integer getUserId() { 
        return userId;
    }

    public void setUserId(Integer userId) { 
        this.userId = userId;
    } 

    public String getForTheme() { 
        return forTheme;
    }

    public void setForTheme(String forTheme) { 
        this.forTheme = forTheme;
    }
    public String getNewsImage() { 
        return newsImage;
    }

    public void setNewsImage(String newsImage) { 
        this.newsImage = newsImage;
    }
    public Integer getExaState() { 
        return exaState;
    }

    public void setExaState(Integer exaState) { 
        this.exaState = exaState;
    } 

    public Integer getFabulouscount() { 
        return fabulouscount;
    }

    public void setFabulouscount(Integer fabulouscount) { 
        this.fabulouscount = fabulouscount;
    } 

    public Integer getState() { 
        return state;
    }

    public void setState(Integer state) { 
        this.state = state;
    } 

    public Integer getElite() { 
        return elite;
    }

    public void setElite(Integer elite) { 
        this.elite = elite;
    }


}