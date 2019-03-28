package com.jiaoke.activitywechatapplet.entity;

import java.io.Serializable;
import java.util.Date;

public class Activity implements Serializable {
    private Integer activityId;

    private String activityName;

    private String activityChargeType;

    private Long activityCost;

    private Date activityStartTime;

    private Date activityEndTime;

    private Date registrationStartTime;

    private Date registrationEndTime;

    private Integer peopleNumber;

    private String coverImageId;

    private String activityStatus;

    private Integer createrId;

    private String description;

    private String address;

    private static final long serialVersionUID = 1L;

    public Integer getActivityId() {
        return activityId;
    }

    public void setActivityId(Integer activityId) {
        this.activityId = activityId;
    }

    public String getActivityName() {
        return activityName;
    }

    public void setActivityName(String activityName) {
        this.activityName = activityName == null ? null : activityName.trim();
    }

    public String getActivityChargeType() {
        return activityChargeType;
    }

    public void setActivityChargeType(String activityChargeType) {
        this.activityChargeType = activityChargeType == null ? null : activityChargeType.trim();
    }

    public Long getActivityCost() {
        return activityCost;
    }

    public void setActivityCost(Long activityCost) {
        this.activityCost = activityCost;
    }

    public Date getActivityStartTime() {
        return activityStartTime;
    }

    public void setActivityStartTime(Date activityStartTime) {
        this.activityStartTime = activityStartTime;
    }

    public Date getActivityEndTime() {
        return activityEndTime;
    }

    public void setActivityEndTime(Date activityEndTime) {
        this.activityEndTime = activityEndTime;
    }

    public Date getRegistrationStartTime() {
        return registrationStartTime;
    }

    public void setRegistrationStartTime(Date registrationStartTime) {
        this.registrationStartTime = registrationStartTime;
    }

    public Date getRegistrationEndTime() {
        return registrationEndTime;
    }

    public void setRegistrationEndTime(Date registrationEndTime) {
        this.registrationEndTime = registrationEndTime;
    }

    public Integer getPeopleNumber() {
        return peopleNumber;
    }

    public void setPeopleNumber(Integer peopleNumber) {
        this.peopleNumber = peopleNumber;
    }

    public String getCoverImageId() {
        return coverImageId;
    }

    public void setCoverImageId(String coverImageId) {
        this.coverImageId = coverImageId == null ? null : coverImageId.trim();
    }

    public String getActivityStatus() {
        return activityStatus;
    }

    public void setActivityStatus(String activityStatus) {
        this.activityStatus = activityStatus == null ? null : activityStatus.trim();
    }

    public Integer getCreaterId() {
        return createrId;
    }

    public void setCreaterId(Integer createrId) {
        this.createrId = createrId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", activityId=").append(activityId);
        sb.append(", activityName=").append(activityName);
        sb.append(", activityChargeType=").append(activityChargeType);
        sb.append(", activityCost=").append(activityCost);
        sb.append(", activityStartTime=").append(activityStartTime);
        sb.append(", activityEndTime=").append(activityEndTime);
        sb.append(", registrationStartTime=").append(registrationStartTime);
        sb.append(", registrationEndTime=").append(registrationEndTime);
        sb.append(", peopleNumber=").append(peopleNumber);
        sb.append(", coverImageId=").append(coverImageId);
        sb.append(", activityStatus=").append(activityStatus);
        sb.append(", createrId=").append(createrId);
        sb.append(", description=").append(description);
        sb.append(", address=").append(address);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}