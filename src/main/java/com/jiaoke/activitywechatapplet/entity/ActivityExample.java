package com.jiaoke.activitywechatapplet.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ActivityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ActivityExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andActivityIdIsNull() {
            addCriterion("activity_id is null");
            return (Criteria) this;
        }

        public Criteria andActivityIdIsNotNull() {
            addCriterion("activity_id is not null");
            return (Criteria) this;
        }

        public Criteria andActivityIdEqualTo(Integer value) {
            addCriterion("activity_id =", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdNotEqualTo(Integer value) {
            addCriterion("activity_id <>", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdGreaterThan(Integer value) {
            addCriterion("activity_id >", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("activity_id >=", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdLessThan(Integer value) {
            addCriterion("activity_id <", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdLessThanOrEqualTo(Integer value) {
            addCriterion("activity_id <=", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdIn(List<Integer> values) {
            addCriterion("activity_id in", values, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdNotIn(List<Integer> values) {
            addCriterion("activity_id not in", values, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdBetween(Integer value1, Integer value2) {
            addCriterion("activity_id between", value1, value2, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdNotBetween(Integer value1, Integer value2) {
            addCriterion("activity_id not between", value1, value2, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityNameIsNull() {
            addCriterion("activity_name is null");
            return (Criteria) this;
        }

        public Criteria andActivityNameIsNotNull() {
            addCriterion("activity_name is not null");
            return (Criteria) this;
        }

        public Criteria andActivityNameEqualTo(String value) {
            addCriterion("activity_name =", value, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameNotEqualTo(String value) {
            addCriterion("activity_name <>", value, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameGreaterThan(String value) {
            addCriterion("activity_name >", value, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameGreaterThanOrEqualTo(String value) {
            addCriterion("activity_name >=", value, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameLessThan(String value) {
            addCriterion("activity_name <", value, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameLessThanOrEqualTo(String value) {
            addCriterion("activity_name <=", value, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameLike(String value) {
            addCriterion("activity_name like", value, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameNotLike(String value) {
            addCriterion("activity_name not like", value, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameIn(List<String> values) {
            addCriterion("activity_name in", values, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameNotIn(List<String> values) {
            addCriterion("activity_name not in", values, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameBetween(String value1, String value2) {
            addCriterion("activity_name between", value1, value2, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameNotBetween(String value1, String value2) {
            addCriterion("activity_name not between", value1, value2, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityChargeTypeIsNull() {
            addCriterion("activity_charge_type is null");
            return (Criteria) this;
        }

        public Criteria andActivityChargeTypeIsNotNull() {
            addCriterion("activity_charge_type is not null");
            return (Criteria) this;
        }

        public Criteria andActivityChargeTypeEqualTo(String value) {
            addCriterion("activity_charge_type =", value, "activityChargeType");
            return (Criteria) this;
        }

        public Criteria andActivityChargeTypeNotEqualTo(String value) {
            addCriterion("activity_charge_type <>", value, "activityChargeType");
            return (Criteria) this;
        }

        public Criteria andActivityChargeTypeGreaterThan(String value) {
            addCriterion("activity_charge_type >", value, "activityChargeType");
            return (Criteria) this;
        }

        public Criteria andActivityChargeTypeGreaterThanOrEqualTo(String value) {
            addCriterion("activity_charge_type >=", value, "activityChargeType");
            return (Criteria) this;
        }

        public Criteria andActivityChargeTypeLessThan(String value) {
            addCriterion("activity_charge_type <", value, "activityChargeType");
            return (Criteria) this;
        }

        public Criteria andActivityChargeTypeLessThanOrEqualTo(String value) {
            addCriterion("activity_charge_type <=", value, "activityChargeType");
            return (Criteria) this;
        }

        public Criteria andActivityChargeTypeLike(String value) {
            addCriterion("activity_charge_type like", value, "activityChargeType");
            return (Criteria) this;
        }

        public Criteria andActivityChargeTypeNotLike(String value) {
            addCriterion("activity_charge_type not like", value, "activityChargeType");
            return (Criteria) this;
        }

        public Criteria andActivityChargeTypeIn(List<String> values) {
            addCriterion("activity_charge_type in", values, "activityChargeType");
            return (Criteria) this;
        }

        public Criteria andActivityChargeTypeNotIn(List<String> values) {
            addCriterion("activity_charge_type not in", values, "activityChargeType");
            return (Criteria) this;
        }

        public Criteria andActivityChargeTypeBetween(String value1, String value2) {
            addCriterion("activity_charge_type between", value1, value2, "activityChargeType");
            return (Criteria) this;
        }

        public Criteria andActivityChargeTypeNotBetween(String value1, String value2) {
            addCriterion("activity_charge_type not between", value1, value2, "activityChargeType");
            return (Criteria) this;
        }

        public Criteria andActivityCostIsNull() {
            addCriterion("activity_cost is null");
            return (Criteria) this;
        }

        public Criteria andActivityCostIsNotNull() {
            addCriterion("activity_cost is not null");
            return (Criteria) this;
        }

        public Criteria andActivityCostEqualTo(Long value) {
            addCriterion("activity_cost =", value, "activityCost");
            return (Criteria) this;
        }

        public Criteria andActivityCostNotEqualTo(Long value) {
            addCriterion("activity_cost <>", value, "activityCost");
            return (Criteria) this;
        }

        public Criteria andActivityCostGreaterThan(Long value) {
            addCriterion("activity_cost >", value, "activityCost");
            return (Criteria) this;
        }

        public Criteria andActivityCostGreaterThanOrEqualTo(Long value) {
            addCriterion("activity_cost >=", value, "activityCost");
            return (Criteria) this;
        }

        public Criteria andActivityCostLessThan(Long value) {
            addCriterion("activity_cost <", value, "activityCost");
            return (Criteria) this;
        }

        public Criteria andActivityCostLessThanOrEqualTo(Long value) {
            addCriterion("activity_cost <=", value, "activityCost");
            return (Criteria) this;
        }

        public Criteria andActivityCostIn(List<Long> values) {
            addCriterion("activity_cost in", values, "activityCost");
            return (Criteria) this;
        }

        public Criteria andActivityCostNotIn(List<Long> values) {
            addCriterion("activity_cost not in", values, "activityCost");
            return (Criteria) this;
        }

        public Criteria andActivityCostBetween(Long value1, Long value2) {
            addCriterion("activity_cost between", value1, value2, "activityCost");
            return (Criteria) this;
        }

        public Criteria andActivityCostNotBetween(Long value1, Long value2) {
            addCriterion("activity_cost not between", value1, value2, "activityCost");
            return (Criteria) this;
        }

        public Criteria andActivityStartTimeIsNull() {
            addCriterion("activity_start_time is null");
            return (Criteria) this;
        }

        public Criteria andActivityStartTimeIsNotNull() {
            addCriterion("activity_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andActivityStartTimeEqualTo(Date value) {
            addCriterion("activity_start_time =", value, "activityStartTime");
            return (Criteria) this;
        }

        public Criteria andActivityStartTimeNotEqualTo(Date value) {
            addCriterion("activity_start_time <>", value, "activityStartTime");
            return (Criteria) this;
        }

        public Criteria andActivityStartTimeGreaterThan(Date value) {
            addCriterion("activity_start_time >", value, "activityStartTime");
            return (Criteria) this;
        }

        public Criteria andActivityStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("activity_start_time >=", value, "activityStartTime");
            return (Criteria) this;
        }

        public Criteria andActivityStartTimeLessThan(Date value) {
            addCriterion("activity_start_time <", value, "activityStartTime");
            return (Criteria) this;
        }

        public Criteria andActivityStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("activity_start_time <=", value, "activityStartTime");
            return (Criteria) this;
        }

        public Criteria andActivityStartTimeIn(List<Date> values) {
            addCriterion("activity_start_time in", values, "activityStartTime");
            return (Criteria) this;
        }

        public Criteria andActivityStartTimeNotIn(List<Date> values) {
            addCriterion("activity_start_time not in", values, "activityStartTime");
            return (Criteria) this;
        }

        public Criteria andActivityStartTimeBetween(Date value1, Date value2) {
            addCriterion("activity_start_time between", value1, value2, "activityStartTime");
            return (Criteria) this;
        }

        public Criteria andActivityStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("activity_start_time not between", value1, value2, "activityStartTime");
            return (Criteria) this;
        }

        public Criteria andActivityEndTimeIsNull() {
            addCriterion("activity_end_time is null");
            return (Criteria) this;
        }

        public Criteria andActivityEndTimeIsNotNull() {
            addCriterion("activity_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andActivityEndTimeEqualTo(Date value) {
            addCriterion("activity_end_time =", value, "activityEndTime");
            return (Criteria) this;
        }

        public Criteria andActivityEndTimeNotEqualTo(Date value) {
            addCriterion("activity_end_time <>", value, "activityEndTime");
            return (Criteria) this;
        }

        public Criteria andActivityEndTimeGreaterThan(Date value) {
            addCriterion("activity_end_time >", value, "activityEndTime");
            return (Criteria) this;
        }

        public Criteria andActivityEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("activity_end_time >=", value, "activityEndTime");
            return (Criteria) this;
        }

        public Criteria andActivityEndTimeLessThan(Date value) {
            addCriterion("activity_end_time <", value, "activityEndTime");
            return (Criteria) this;
        }

        public Criteria andActivityEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("activity_end_time <=", value, "activityEndTime");
            return (Criteria) this;
        }

        public Criteria andActivityEndTimeIn(List<Date> values) {
            addCriterion("activity_end_time in", values, "activityEndTime");
            return (Criteria) this;
        }

        public Criteria andActivityEndTimeNotIn(List<Date> values) {
            addCriterion("activity_end_time not in", values, "activityEndTime");
            return (Criteria) this;
        }

        public Criteria andActivityEndTimeBetween(Date value1, Date value2) {
            addCriterion("activity_end_time between", value1, value2, "activityEndTime");
            return (Criteria) this;
        }

        public Criteria andActivityEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("activity_end_time not between", value1, value2, "activityEndTime");
            return (Criteria) this;
        }

        public Criteria andRegistrationStartTimeIsNull() {
            addCriterion("registration_start_time is null");
            return (Criteria) this;
        }

        public Criteria andRegistrationStartTimeIsNotNull() {
            addCriterion("registration_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andRegistrationStartTimeEqualTo(Date value) {
            addCriterion("registration_start_time =", value, "registrationStartTime");
            return (Criteria) this;
        }

        public Criteria andRegistrationStartTimeNotEqualTo(Date value) {
            addCriterion("registration_start_time <>", value, "registrationStartTime");
            return (Criteria) this;
        }

        public Criteria andRegistrationStartTimeGreaterThan(Date value) {
            addCriterion("registration_start_time >", value, "registrationStartTime");
            return (Criteria) this;
        }

        public Criteria andRegistrationStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("registration_start_time >=", value, "registrationStartTime");
            return (Criteria) this;
        }

        public Criteria andRegistrationStartTimeLessThan(Date value) {
            addCriterion("registration_start_time <", value, "registrationStartTime");
            return (Criteria) this;
        }

        public Criteria andRegistrationStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("registration_start_time <=", value, "registrationStartTime");
            return (Criteria) this;
        }

        public Criteria andRegistrationStartTimeIn(List<Date> values) {
            addCriterion("registration_start_time in", values, "registrationStartTime");
            return (Criteria) this;
        }

        public Criteria andRegistrationStartTimeNotIn(List<Date> values) {
            addCriterion("registration_start_time not in", values, "registrationStartTime");
            return (Criteria) this;
        }

        public Criteria andRegistrationStartTimeBetween(Date value1, Date value2) {
            addCriterion("registration_start_time between", value1, value2, "registrationStartTime");
            return (Criteria) this;
        }

        public Criteria andRegistrationStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("registration_start_time not between", value1, value2, "registrationStartTime");
            return (Criteria) this;
        }

        public Criteria andRegistrationEndTimeIsNull() {
            addCriterion("registration_end_time is null");
            return (Criteria) this;
        }

        public Criteria andRegistrationEndTimeIsNotNull() {
            addCriterion("registration_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andRegistrationEndTimeEqualTo(Date value) {
            addCriterion("registration_end_time =", value, "registrationEndTime");
            return (Criteria) this;
        }

        public Criteria andRegistrationEndTimeNotEqualTo(Date value) {
            addCriterion("registration_end_time <>", value, "registrationEndTime");
            return (Criteria) this;
        }

        public Criteria andRegistrationEndTimeGreaterThan(Date value) {
            addCriterion("registration_end_time >", value, "registrationEndTime");
            return (Criteria) this;
        }

        public Criteria andRegistrationEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("registration_end_time >=", value, "registrationEndTime");
            return (Criteria) this;
        }

        public Criteria andRegistrationEndTimeLessThan(Date value) {
            addCriterion("registration_end_time <", value, "registrationEndTime");
            return (Criteria) this;
        }

        public Criteria andRegistrationEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("registration_end_time <=", value, "registrationEndTime");
            return (Criteria) this;
        }

        public Criteria andRegistrationEndTimeIn(List<Date> values) {
            addCriterion("registration_end_time in", values, "registrationEndTime");
            return (Criteria) this;
        }

        public Criteria andRegistrationEndTimeNotIn(List<Date> values) {
            addCriterion("registration_end_time not in", values, "registrationEndTime");
            return (Criteria) this;
        }

        public Criteria andRegistrationEndTimeBetween(Date value1, Date value2) {
            addCriterion("registration_end_time between", value1, value2, "registrationEndTime");
            return (Criteria) this;
        }

        public Criteria andRegistrationEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("registration_end_time not between", value1, value2, "registrationEndTime");
            return (Criteria) this;
        }

        public Criteria andPeopleNumberIsNull() {
            addCriterion("people_number is null");
            return (Criteria) this;
        }

        public Criteria andPeopleNumberIsNotNull() {
            addCriterion("people_number is not null");
            return (Criteria) this;
        }

        public Criteria andPeopleNumberEqualTo(Integer value) {
            addCriterion("people_number =", value, "peopleNumber");
            return (Criteria) this;
        }

        public Criteria andPeopleNumberNotEqualTo(Integer value) {
            addCriterion("people_number <>", value, "peopleNumber");
            return (Criteria) this;
        }

        public Criteria andPeopleNumberGreaterThan(Integer value) {
            addCriterion("people_number >", value, "peopleNumber");
            return (Criteria) this;
        }

        public Criteria andPeopleNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("people_number >=", value, "peopleNumber");
            return (Criteria) this;
        }

        public Criteria andPeopleNumberLessThan(Integer value) {
            addCriterion("people_number <", value, "peopleNumber");
            return (Criteria) this;
        }

        public Criteria andPeopleNumberLessThanOrEqualTo(Integer value) {
            addCriterion("people_number <=", value, "peopleNumber");
            return (Criteria) this;
        }

        public Criteria andPeopleNumberIn(List<Integer> values) {
            addCriterion("people_number in", values, "peopleNumber");
            return (Criteria) this;
        }

        public Criteria andPeopleNumberNotIn(List<Integer> values) {
            addCriterion("people_number not in", values, "peopleNumber");
            return (Criteria) this;
        }

        public Criteria andPeopleNumberBetween(Integer value1, Integer value2) {
            addCriterion("people_number between", value1, value2, "peopleNumber");
            return (Criteria) this;
        }

        public Criteria andPeopleNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("people_number not between", value1, value2, "peopleNumber");
            return (Criteria) this;
        }

        public Criteria andCoverImageIdIsNull() {
            addCriterion("cover_image_id is null");
            return (Criteria) this;
        }

        public Criteria andCoverImageIdIsNotNull() {
            addCriterion("cover_image_id is not null");
            return (Criteria) this;
        }

        public Criteria andCoverImageIdEqualTo(String value) {
            addCriterion("cover_image_id =", value, "coverImageId");
            return (Criteria) this;
        }

        public Criteria andCoverImageIdNotEqualTo(String value) {
            addCriterion("cover_image_id <>", value, "coverImageId");
            return (Criteria) this;
        }

        public Criteria andCoverImageIdGreaterThan(String value) {
            addCriterion("cover_image_id >", value, "coverImageId");
            return (Criteria) this;
        }

        public Criteria andCoverImageIdGreaterThanOrEqualTo(String value) {
            addCriterion("cover_image_id >=", value, "coverImageId");
            return (Criteria) this;
        }

        public Criteria andCoverImageIdLessThan(String value) {
            addCriterion("cover_image_id <", value, "coverImageId");
            return (Criteria) this;
        }

        public Criteria andCoverImageIdLessThanOrEqualTo(String value) {
            addCriterion("cover_image_id <=", value, "coverImageId");
            return (Criteria) this;
        }

        public Criteria andCoverImageIdLike(String value) {
            addCriterion("cover_image_id like", value, "coverImageId");
            return (Criteria) this;
        }

        public Criteria andCoverImageIdNotLike(String value) {
            addCriterion("cover_image_id not like", value, "coverImageId");
            return (Criteria) this;
        }

        public Criteria andCoverImageIdIn(List<String> values) {
            addCriterion("cover_image_id in", values, "coverImageId");
            return (Criteria) this;
        }

        public Criteria andCoverImageIdNotIn(List<String> values) {
            addCriterion("cover_image_id not in", values, "coverImageId");
            return (Criteria) this;
        }

        public Criteria andCoverImageIdBetween(String value1, String value2) {
            addCriterion("cover_image_id between", value1, value2, "coverImageId");
            return (Criteria) this;
        }

        public Criteria andCoverImageIdNotBetween(String value1, String value2) {
            addCriterion("cover_image_id not between", value1, value2, "coverImageId");
            return (Criteria) this;
        }

        public Criteria andActivityStatusIsNull() {
            addCriterion("activity_status is null");
            return (Criteria) this;
        }

        public Criteria andActivityStatusIsNotNull() {
            addCriterion("activity_status is not null");
            return (Criteria) this;
        }

        public Criteria andActivityStatusEqualTo(String value) {
            addCriterion("activity_status =", value, "activityStatus");
            return (Criteria) this;
        }

        public Criteria andActivityStatusNotEqualTo(String value) {
            addCriterion("activity_status <>", value, "activityStatus");
            return (Criteria) this;
        }

        public Criteria andActivityStatusGreaterThan(String value) {
            addCriterion("activity_status >", value, "activityStatus");
            return (Criteria) this;
        }

        public Criteria andActivityStatusGreaterThanOrEqualTo(String value) {
            addCriterion("activity_status >=", value, "activityStatus");
            return (Criteria) this;
        }

        public Criteria andActivityStatusLessThan(String value) {
            addCriterion("activity_status <", value, "activityStatus");
            return (Criteria) this;
        }

        public Criteria andActivityStatusLessThanOrEqualTo(String value) {
            addCriterion("activity_status <=", value, "activityStatus");
            return (Criteria) this;
        }

        public Criteria andActivityStatusLike(String value) {
            addCriterion("activity_status like", value, "activityStatus");
            return (Criteria) this;
        }

        public Criteria andActivityStatusNotLike(String value) {
            addCriterion("activity_status not like", value, "activityStatus");
            return (Criteria) this;
        }

        public Criteria andActivityStatusIn(List<String> values) {
            addCriterion("activity_status in", values, "activityStatus");
            return (Criteria) this;
        }

        public Criteria andActivityStatusNotIn(List<String> values) {
            addCriterion("activity_status not in", values, "activityStatus");
            return (Criteria) this;
        }

        public Criteria andActivityStatusBetween(String value1, String value2) {
            addCriterion("activity_status between", value1, value2, "activityStatus");
            return (Criteria) this;
        }

        public Criteria andActivityStatusNotBetween(String value1, String value2) {
            addCriterion("activity_status not between", value1, value2, "activityStatus");
            return (Criteria) this;
        }

        public Criteria andCreaterIdIsNull() {
            addCriterion("creater_id is null");
            return (Criteria) this;
        }

        public Criteria andCreaterIdIsNotNull() {
            addCriterion("creater_id is not null");
            return (Criteria) this;
        }

        public Criteria andCreaterIdEqualTo(Integer value) {
            addCriterion("creater_id =", value, "createrId");
            return (Criteria) this;
        }

        public Criteria andCreaterIdNotEqualTo(Integer value) {
            addCriterion("creater_id <>", value, "createrId");
            return (Criteria) this;
        }

        public Criteria andCreaterIdGreaterThan(Integer value) {
            addCriterion("creater_id >", value, "createrId");
            return (Criteria) this;
        }

        public Criteria andCreaterIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("creater_id >=", value, "createrId");
            return (Criteria) this;
        }

        public Criteria andCreaterIdLessThan(Integer value) {
            addCriterion("creater_id <", value, "createrId");
            return (Criteria) this;
        }

        public Criteria andCreaterIdLessThanOrEqualTo(Integer value) {
            addCriterion("creater_id <=", value, "createrId");
            return (Criteria) this;
        }

        public Criteria andCreaterIdIn(List<Integer> values) {
            addCriterion("creater_id in", values, "createrId");
            return (Criteria) this;
        }

        public Criteria andCreaterIdNotIn(List<Integer> values) {
            addCriterion("creater_id not in", values, "createrId");
            return (Criteria) this;
        }

        public Criteria andCreaterIdBetween(Integer value1, Integer value2) {
            addCriterion("creater_id between", value1, value2, "createrId");
            return (Criteria) this;
        }

        public Criteria andCreaterIdNotBetween(Integer value1, Integer value2) {
            addCriterion("creater_id not between", value1, value2, "createrId");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}