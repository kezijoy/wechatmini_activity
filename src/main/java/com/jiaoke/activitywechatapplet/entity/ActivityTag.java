package com.jiaoke.activitywechatapplet.entity;

import java.io.Serializable;

public class ActivityTag implements Serializable {
    private Integer activityTagId;

    private String activityTagName;

    private static final long serialVersionUID = 1L;

    public Integer getActivityTagId() {
        return activityTagId;
    }

    public void setActivityTagId(Integer activityTagId) {
        this.activityTagId = activityTagId;
    }

    public String getActivityTagName() {
        return activityTagName;
    }

    public void setActivityTagName(String activityTagName) {
        this.activityTagName = activityTagName == null ? null : activityTagName.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", activityTagId=").append(activityTagId);
        sb.append(", activityTagName=").append(activityTagName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}