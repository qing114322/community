package com.qhit.activity.pojo;




public class Activity { 
    private Integer actId;    //活动——主键 
    private String actTime;    //发布时间 
    private String actThene;    //主题
    private String actContent; //内容
    private Integer state;    //1、正在进行 2、长期活动 3、已过期 


    public String getActContent() {
        return actContent;
    }

    public void setActContent(String actContent) {
        this.actContent = actContent;
    }

    public Integer getActId() {
        return actId;
    }

    public void setActId(Integer actId) { 
        this.actId = actId;
    } 

    public String getActTime() { 
        return actTime;
    }

    public void setActTime(String actTime) { 
        this.actTime = actTime;
    }
    public String getActThene() { 
        return actThene;
    }

    public void setActThene(String actThene) { 
        this.actThene = actThene;
    }
    public Integer getState() { 
        return state;
    }

    public void setState(Integer state) { 
        this.state = state;
    } 


 }