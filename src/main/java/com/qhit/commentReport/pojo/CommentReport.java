package com.qhit.commentReport.pojo;




public class CommentReport { 
    private Integer crId;    //id 
    private Integer userId;    //举报人id 
    private Integer comId;    //评论ID 
    private Integer reportType;    //举报类型 
    private Integer exaState;    //审核状态  {0为未审核，1为审核通过，2为禁止} 

    public Integer getCrId() { 
        return crId;
    }

    public void setCrId(Integer crId) { 
        this.crId = crId;
    } 

    public Integer getUserId() { 
        return userId;
    }

    public void setUserId(Integer userId) { 
        this.userId = userId;
    } 

    public Integer getComId() { 
        return comId;
    }

    public void setComId(Integer comId) { 
        this.comId = comId;
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