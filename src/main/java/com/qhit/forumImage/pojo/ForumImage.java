package com.qhit.forumImage.pojo;




public class ForumImage { 
    private Integer fiId;    //id 
    private Integer forId;    //帖子id 
    private String imageName;    //图片名称 

    public Integer getFiId() { 
        return fiId;
    }

    public void setFiId(Integer fiId) { 
        this.fiId = fiId;
    } 

    public Integer getForId() { 
        return forId;
    }

    public void setForId(Integer forId) { 
        this.forId = forId;
    } 

    public String getImageName() { 
        return imageName;
    }

    public void setImageName(String imageName) { 
        this.imageName = imageName;
    }

 }