package com.jiaoke.activitywechatapplet.entity;

import java.io.Serializable;

public class ActivityTagRelation implements Serializable {
    private Integer id;

    private Integer activityTagId;

    private Integer activityId;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getActivityTagId() {
        return activityTagId;
    }

    public void setActivityTagId(Integer activityTagId) {
        this.activityTagId = activityTagId;
    }

    public Integer getActivityId() {
        return activityId;
    }

    public void setActivityId(Integer activityId) {
        this.activityId = activityId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", activityTagId=").append(activityTagId);
        sb.append(", activityId=").append(activityId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}