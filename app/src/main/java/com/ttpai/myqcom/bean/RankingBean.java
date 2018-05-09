package com.ttpai.myqcom.bean;

public class RankingBean {

    public boolean showSplitLine = true;


    /**
     * Ranking : 1
     * name : wipes
     * phone : 13023110962
     * RecommendCount : 0
     * HeadImg : /UpFile/HeadImg/dfe8f21a-e1f7-4212-9bae-8768555c9f54.jpg
     */

    private int Ranking;
    private String name;
    private String phone;
    private int RecommendCount;
    private String HeadImg;

    public int getRanking() {
        return Ranking;
    }

    public void setRanking(int Ranking) {
        this.Ranking = Ranking;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getRecommendCount() {
        return RecommendCount;
    }

    public void setRecommendCount(int RecommendCount) {
        this.RecommendCount = RecommendCount;
    }

    public String getHeadImg() {
        return HeadImg;
    }

    public void setHeadImg(String HeadImg) {
        this.HeadImg = HeadImg;
    }
}
