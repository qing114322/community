package com.qhit.lostGoods.pojo;




public class LostGoods { 
    private Integer lgId;    //id 
    private String lgTime;    //发布时间 
    private Integer userId;    //发布人 
    private String lgTheme;    //标题 
    private Integer giId;    //失物图片id 
    private Integer exaState;    //审核状态  {0为未审核，1为审核通过，2为禁止} 
    private Integer fabulouscount;    //点赞数量 
    private Integer completed;    //是否已完成 {0为未完成，1为已完成} 

    public Integer getLgId() { 
        return lgId;
    }

    public void setLgId(Integer lgId) { 
        this.lgId = lgId;
    } 

    public String getLgTime() { 
        return lgTime;
    }

    public void setLgTime(String lgTime) { 
        this.lgTime = lgTime;
    }
    public Integer getUserId() { 
        return userId;
    }

    public void setUserId(Integer userId) { 
        this.userId = userId;
    } 

    public String getLgTheme() { 
        return lgTheme;
    }

    public void setLgTheme(String lgTheme) { 
        this.lgTheme = lgTheme;
    }
    public Integer getGiId() { 
        return giId;
    }

    public void setGiId(Integer giId) { 
        this.giId = giId;
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

    public Integer getCompleted() { 
        return completed;
    }

    public void setCompleted(Integer completed) { 
        this.completed = completed;
    } 


 }