package com.qhit.forumReport.pojo;




public class ForumReport { 
    private Integer frId;    //id 
    private Integer userId;    //举报人id 
    private Integer forId;    //帖子ID 
    private Integer reportType;    //举报类型 
    private Integer exaState;    //审核状态  {0为未审核，1为审核通过，2为禁止} 

    public Integer getFrId() { 
        return frId;
    }

    public void setFrId(Integer frId) { 
        this.frId = frId;
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

    public Integer getReportType() { 
        return reportType;
    }

    public void setReportType(Integer reportType) { 
        this.reportType = reportType;
    } 

    public Integer getExaState() { 
        return exaState;
    }

    public void setExaState(Integer exaState) { 
        this.exaState = exaState;
    } 


 }