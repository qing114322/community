package com.qhit.secendComment.pojo;




public class SecendComment { 
    private Integer scId;    // 
    private Integer comId;    //父评 
    private Integer forId;    //帖子 
    private String scTime;    //时间 
    private Integer fabulouscount;    //点赞数 

    public Integer getScId() { 
        return scId;
    }

    public void setScId(Integer scId) { 
        this.scId = scId;
    } 

    public Integer getComId() { 
        return comId;
    }

    public void setComId(Integer comId) { 
        this.comId = comId;
    } 

    public Integer getForId() { 
        return forId;
    }

    public void setForId(Integer forId) { 
        this.forId = forId;
    } 

    public String getScTime() { 
        return scTime;
    }

    public void setScTime(String scTime) { 
        this.scTime = scTime;
    }
    public Integer getFabulouscount() { 
        return fabulouscount;
    }

    public void setFabulouscount(Integer fabulouscount) { 
        this.fabulouscount = fabulouscount;
    } 


 }