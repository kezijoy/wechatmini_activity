package com.jiaoke.activitywechatapplet.entity;

import java.io.Serializable;

public class ActivityType implements Serializable {
    private Integer activityTypeId;

    private String activityTypeName;

    private static final long serialVersionUID = 1L;

    public Integer getActivityTypeId() {
        return activityTypeId;
    }

    public void setActivityTypeId(Integer activityTypeId) {
        this.activityTypeId = activityTypeId;
    }

    public String getActivityTypeName() {
        return activityTypeName;
    }

    public void setActivityTypeName(String activityTypeName) {
        this.activityTypeName = activityTypeName == null ? null : activityTypeName.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", activityTypeId=").append(activityTypeId);
        sb.append(", activityTypeName=").append(activityTypeName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}