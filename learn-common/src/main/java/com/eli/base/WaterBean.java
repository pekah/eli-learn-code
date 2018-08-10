package com.eli.base;

/**
 * Created by elizhou on 2018/7/13.
 */
public class WaterBean {
    private Integer changeType;
    private String tradeId;
    private String summaryId;
    private Long changeCredit;
    private Long totalCredit;

    public Integer getChangeType() {
        return changeType;
    }

    public void setChangeType(Integer changeType) {
        this.changeType = changeType;
    }

    public String getTradeId() {
        return tradeId;
    }

    public void setTradeId(String tradeId) {
        this.tradeId = tradeId;
    }

    public String getSummaryId() {
        return summaryId;
    }

    public void setSummaryId(String summaryId) {
        this.summaryId = summaryId;
    }

    public Long getChangeCredit() {
        return changeCredit;
    }

    public void setChangeCredit(Long changeCredit) {
        this.changeCredit = changeCredit;
    }

    public Long getTotalCredit() {
        return totalCredit;
    }

    public void setTotalCredit(Long totalCredit) {
        this.totalCredit = totalCredit;
    }
}
