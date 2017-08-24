package com.hebeu.keyan.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ERewardExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ERewardExample() {
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

        public Criteria andRewardIdIsNull() {
            addCriterion("reward_id is null");
            return (Criteria) this;
        }

        public Criteria andRewardIdIsNotNull() {
            addCriterion("reward_id is not null");
            return (Criteria) this;
        }

        public Criteria andRewardIdEqualTo(String value) {
            addCriterion("reward_id =", value, "rewardId");
            return (Criteria) this;
        }

        public Criteria andRewardIdNotEqualTo(String value) {
            addCriterion("reward_id <>", value, "rewardId");
            return (Criteria) this;
        }

        public Criteria andRewardIdGreaterThan(String value) {
            addCriterion("reward_id >", value, "rewardId");
            return (Criteria) this;
        }

        public Criteria andRewardIdGreaterThanOrEqualTo(String value) {
            addCriterion("reward_id >=", value, "rewardId");
            return (Criteria) this;
        }

        public Criteria andRewardIdLessThan(String value) {
            addCriterion("reward_id <", value, "rewardId");
            return (Criteria) this;
        }

        public Criteria andRewardIdLessThanOrEqualTo(String value) {
            addCriterion("reward_id <=", value, "rewardId");
            return (Criteria) this;
        }

        public Criteria andRewardIdLike(String value) {
            addCriterion("reward_id like", value, "rewardId");
            return (Criteria) this;
        }

        public Criteria andRewardIdNotLike(String value) {
            addCriterion("reward_id not like", value, "rewardId");
            return (Criteria) this;
        }

        public Criteria andRewardIdIn(List<String> values) {
            addCriterion("reward_id in", values, "rewardId");
            return (Criteria) this;
        }

        public Criteria andRewardIdNotIn(List<String> values) {
            addCriterion("reward_id not in", values, "rewardId");
            return (Criteria) this;
        }

        public Criteria andRewardIdBetween(String value1, String value2) {
            addCriterion("reward_id between", value1, value2, "rewardId");
            return (Criteria) this;
        }

        public Criteria andRewardIdNotBetween(String value1, String value2) {
            addCriterion("reward_id not between", value1, value2, "rewardId");
            return (Criteria) this;
        }

        public Criteria andSubjectTypeIdIsNull() {
            addCriterion("subject_type_id is null");
            return (Criteria) this;
        }

        public Criteria andSubjectTypeIdIsNotNull() {
            addCriterion("subject_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andSubjectTypeIdEqualTo(Integer value) {
            addCriterion("subject_type_id =", value, "subjectTypeId");
            return (Criteria) this;
        }

        public Criteria andSubjectTypeIdNotEqualTo(Integer value) {
            addCriterion("subject_type_id <>", value, "subjectTypeId");
            return (Criteria) this;
        }

        public Criteria andSubjectTypeIdGreaterThan(Integer value) {
            addCriterion("subject_type_id >", value, "subjectTypeId");
            return (Criteria) this;
        }

        public Criteria andSubjectTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("subject_type_id >=", value, "subjectTypeId");
            return (Criteria) this;
        }

        public Criteria andSubjectTypeIdLessThan(Integer value) {
            addCriterion("subject_type_id <", value, "subjectTypeId");
            return (Criteria) this;
        }

        public Criteria andSubjectTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("subject_type_id <=", value, "subjectTypeId");
            return (Criteria) this;
        }

        public Criteria andSubjectTypeIdIn(List<Integer> values) {
            addCriterion("subject_type_id in", values, "subjectTypeId");
            return (Criteria) this;
        }

        public Criteria andSubjectTypeIdNotIn(List<Integer> values) {
            addCriterion("subject_type_id not in", values, "subjectTypeId");
            return (Criteria) this;
        }

        public Criteria andSubjectTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("subject_type_id between", value1, value2, "subjectTypeId");
            return (Criteria) this;
        }

        public Criteria andSubjectTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("subject_type_id not between", value1, value2, "subjectTypeId");
            return (Criteria) this;
        }

        public Criteria andResultTypeIdIsNull() {
            addCriterion("result_type_id is null");
            return (Criteria) this;
        }

        public Criteria andResultTypeIdIsNotNull() {
            addCriterion("result_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andResultTypeIdEqualTo(Integer value) {
            addCriterion("result_type_id =", value, "resultTypeId");
            return (Criteria) this;
        }

        public Criteria andResultTypeIdNotEqualTo(Integer value) {
            addCriterion("result_type_id <>", value, "resultTypeId");
            return (Criteria) this;
        }

        public Criteria andResultTypeIdGreaterThan(Integer value) {
            addCriterion("result_type_id >", value, "resultTypeId");
            return (Criteria) this;
        }

        public Criteria andResultTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("result_type_id >=", value, "resultTypeId");
            return (Criteria) this;
        }

        public Criteria andResultTypeIdLessThan(Integer value) {
            addCriterion("result_type_id <", value, "resultTypeId");
            return (Criteria) this;
        }

        public Criteria andResultTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("result_type_id <=", value, "resultTypeId");
            return (Criteria) this;
        }

        public Criteria andResultTypeIdIn(List<Integer> values) {
            addCriterion("result_type_id in", values, "resultTypeId");
            return (Criteria) this;
        }

        public Criteria andResultTypeIdNotIn(List<Integer> values) {
            addCriterion("result_type_id not in", values, "resultTypeId");
            return (Criteria) this;
        }

        public Criteria andResultTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("result_type_id between", value1, value2, "resultTypeId");
            return (Criteria) this;
        }

        public Criteria andResultTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("result_type_id not between", value1, value2, "resultTypeId");
            return (Criteria) this;
        }

        public Criteria andSchoolNumberIsNull() {
            addCriterion("school_number is null");
            return (Criteria) this;
        }

        public Criteria andSchoolNumberIsNotNull() {
            addCriterion("school_number is not null");
            return (Criteria) this;
        }

        public Criteria andSchoolNumberEqualTo(String value) {
            addCriterion("school_number =", value, "schoolNumber");
            return (Criteria) this;
        }

        public Criteria andSchoolNumberNotEqualTo(String value) {
            addCriterion("school_number <>", value, "schoolNumber");
            return (Criteria) this;
        }

        public Criteria andSchoolNumberGreaterThan(String value) {
            addCriterion("school_number >", value, "schoolNumber");
            return (Criteria) this;
        }

        public Criteria andSchoolNumberGreaterThanOrEqualTo(String value) {
            addCriterion("school_number >=", value, "schoolNumber");
            return (Criteria) this;
        }

        public Criteria andSchoolNumberLessThan(String value) {
            addCriterion("school_number <", value, "schoolNumber");
            return (Criteria) this;
        }

        public Criteria andSchoolNumberLessThanOrEqualTo(String value) {
            addCriterion("school_number <=", value, "schoolNumber");
            return (Criteria) this;
        }

        public Criteria andSchoolNumberLike(String value) {
            addCriterion("school_number like", value, "schoolNumber");
            return (Criteria) this;
        }

        public Criteria andSchoolNumberNotLike(String value) {
            addCriterion("school_number not like", value, "schoolNumber");
            return (Criteria) this;
        }

        public Criteria andSchoolNumberIn(List<String> values) {
            addCriterion("school_number in", values, "schoolNumber");
            return (Criteria) this;
        }

        public Criteria andSchoolNumberNotIn(List<String> values) {
            addCriterion("school_number not in", values, "schoolNumber");
            return (Criteria) this;
        }

        public Criteria andSchoolNumberBetween(String value1, String value2) {
            addCriterion("school_number between", value1, value2, "schoolNumber");
            return (Criteria) this;
        }

        public Criteria andSchoolNumberNotBetween(String value1, String value2) {
            addCriterion("school_number not between", value1, value2, "schoolNumber");
            return (Criteria) this;
        }

        public Criteria andResultNameIsNull() {
            addCriterion("result_name is null");
            return (Criteria) this;
        }

        public Criteria andResultNameIsNotNull() {
            addCriterion("result_name is not null");
            return (Criteria) this;
        }

        public Criteria andResultNameEqualTo(String value) {
            addCriterion("result_name =", value, "resultName");
            return (Criteria) this;
        }

        public Criteria andResultNameNotEqualTo(String value) {
            addCriterion("result_name <>", value, "resultName");
            return (Criteria) this;
        }

        public Criteria andResultNameGreaterThan(String value) {
            addCriterion("result_name >", value, "resultName");
            return (Criteria) this;
        }

        public Criteria andResultNameGreaterThanOrEqualTo(String value) {
            addCriterion("result_name >=", value, "resultName");
            return (Criteria) this;
        }

        public Criteria andResultNameLessThan(String value) {
            addCriterion("result_name <", value, "resultName");
            return (Criteria) this;
        }

        public Criteria andResultNameLessThanOrEqualTo(String value) {
            addCriterion("result_name <=", value, "resultName");
            return (Criteria) this;
        }

        public Criteria andResultNameLike(String value) {
            addCriterion("result_name like", value, "resultName");
            return (Criteria) this;
        }

        public Criteria andResultNameNotLike(String value) {
            addCriterion("result_name not like", value, "resultName");
            return (Criteria) this;
        }

        public Criteria andResultNameIn(List<String> values) {
            addCriterion("result_name in", values, "resultName");
            return (Criteria) this;
        }

        public Criteria andResultNameNotIn(List<String> values) {
            addCriterion("result_name not in", values, "resultName");
            return (Criteria) this;
        }

        public Criteria andResultNameBetween(String value1, String value2) {
            addCriterion("result_name between", value1, value2, "resultName");
            return (Criteria) this;
        }

        public Criteria andResultNameNotBetween(String value1, String value2) {
            addCriterion("result_name not between", value1, value2, "resultName");
            return (Criteria) this;
        }

        public Criteria andRewTypeIdIsNull() {
            addCriterion("rew_type_id is null");
            return (Criteria) this;
        }

        public Criteria andRewTypeIdIsNotNull() {
            addCriterion("rew_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andRewTypeIdEqualTo(Integer value) {
            addCriterion("rew_type_id =", value, "rewTypeId");
            return (Criteria) this;
        }

        public Criteria andRewTypeIdNotEqualTo(Integer value) {
            addCriterion("rew_type_id <>", value, "rewTypeId");
            return (Criteria) this;
        }

        public Criteria andRewTypeIdGreaterThan(Integer value) {
            addCriterion("rew_type_id >", value, "rewTypeId");
            return (Criteria) this;
        }

        public Criteria andRewTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("rew_type_id >=", value, "rewTypeId");
            return (Criteria) this;
        }

        public Criteria andRewTypeIdLessThan(Integer value) {
            addCriterion("rew_type_id <", value, "rewTypeId");
            return (Criteria) this;
        }

        public Criteria andRewTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("rew_type_id <=", value, "rewTypeId");
            return (Criteria) this;
        }

        public Criteria andRewTypeIdIn(List<Integer> values) {
            addCriterion("rew_type_id in", values, "rewTypeId");
            return (Criteria) this;
        }

        public Criteria andRewTypeIdNotIn(List<Integer> values) {
            addCriterion("rew_type_id not in", values, "rewTypeId");
            return (Criteria) this;
        }

        public Criteria andRewTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("rew_type_id between", value1, value2, "rewTypeId");
            return (Criteria) this;
        }

        public Criteria andRewTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("rew_type_id not between", value1, value2, "rewTypeId");
            return (Criteria) this;
        }

        public Criteria andSubjectFirstIdIsNull() {
            addCriterion("subject_first_id is null");
            return (Criteria) this;
        }

        public Criteria andSubjectFirstIdIsNotNull() {
            addCriterion("subject_first_id is not null");
            return (Criteria) this;
        }

        public Criteria andSubjectFirstIdEqualTo(Integer value) {
            addCriterion("subject_first_id =", value, "subjectFirstId");
            return (Criteria) this;
        }

        public Criteria andSubjectFirstIdNotEqualTo(Integer value) {
            addCriterion("subject_first_id <>", value, "subjectFirstId");
            return (Criteria) this;
        }

        public Criteria andSubjectFirstIdGreaterThan(Integer value) {
            addCriterion("subject_first_id >", value, "subjectFirstId");
            return (Criteria) this;
        }

        public Criteria andSubjectFirstIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("subject_first_id >=", value, "subjectFirstId");
            return (Criteria) this;
        }

        public Criteria andSubjectFirstIdLessThan(Integer value) {
            addCriterion("subject_first_id <", value, "subjectFirstId");
            return (Criteria) this;
        }

        public Criteria andSubjectFirstIdLessThanOrEqualTo(Integer value) {
            addCriterion("subject_first_id <=", value, "subjectFirstId");
            return (Criteria) this;
        }

        public Criteria andSubjectFirstIdIn(List<Integer> values) {
            addCriterion("subject_first_id in", values, "subjectFirstId");
            return (Criteria) this;
        }

        public Criteria andSubjectFirstIdNotIn(List<Integer> values) {
            addCriterion("subject_first_id not in", values, "subjectFirstId");
            return (Criteria) this;
        }

        public Criteria andSubjectFirstIdBetween(Integer value1, Integer value2) {
            addCriterion("subject_first_id between", value1, value2, "subjectFirstId");
            return (Criteria) this;
        }

        public Criteria andSubjectFirstIdNotBetween(Integer value1, Integer value2) {
            addCriterion("subject_first_id not between", value1, value2, "subjectFirstId");
            return (Criteria) this;
        }

        public Criteria andRewClassIdIsNull() {
            addCriterion("rew_class_id is null");
            return (Criteria) this;
        }

        public Criteria andRewClassIdIsNotNull() {
            addCriterion("rew_class_id is not null");
            return (Criteria) this;
        }

        public Criteria andRewClassIdEqualTo(Integer value) {
            addCriterion("rew_class_id =", value, "rewClassId");
            return (Criteria) this;
        }

        public Criteria andRewClassIdNotEqualTo(Integer value) {
            addCriterion("rew_class_id <>", value, "rewClassId");
            return (Criteria) this;
        }

        public Criteria andRewClassIdGreaterThan(Integer value) {
            addCriterion("rew_class_id >", value, "rewClassId");
            return (Criteria) this;
        }

        public Criteria andRewClassIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("rew_class_id >=", value, "rewClassId");
            return (Criteria) this;
        }

        public Criteria andRewClassIdLessThan(Integer value) {
            addCriterion("rew_class_id <", value, "rewClassId");
            return (Criteria) this;
        }

        public Criteria andRewClassIdLessThanOrEqualTo(Integer value) {
            addCriterion("rew_class_id <=", value, "rewClassId");
            return (Criteria) this;
        }

        public Criteria andRewClassIdIn(List<Integer> values) {
            addCriterion("rew_class_id in", values, "rewClassId");
            return (Criteria) this;
        }

        public Criteria andRewClassIdNotIn(List<Integer> values) {
            addCriterion("rew_class_id not in", values, "rewClassId");
            return (Criteria) this;
        }

        public Criteria andRewClassIdBetween(Integer value1, Integer value2) {
            addCriterion("rew_class_id between", value1, value2, "rewClassId");
            return (Criteria) this;
        }

        public Criteria andRewClassIdNotBetween(Integer value1, Integer value2) {
            addCriterion("rew_class_id not between", value1, value2, "rewClassId");
            return (Criteria) this;
        }

        public Criteria andRewLevelIdIsNull() {
            addCriterion("rew_level_id is null");
            return (Criteria) this;
        }

        public Criteria andRewLevelIdIsNotNull() {
            addCriterion("rew_level_id is not null");
            return (Criteria) this;
        }

        public Criteria andRewLevelIdEqualTo(Integer value) {
            addCriterion("rew_level_id =", value, "rewLevelId");
            return (Criteria) this;
        }

        public Criteria andRewLevelIdNotEqualTo(Integer value) {
            addCriterion("rew_level_id <>", value, "rewLevelId");
            return (Criteria) this;
        }

        public Criteria andRewLevelIdGreaterThan(Integer value) {
            addCriterion("rew_level_id >", value, "rewLevelId");
            return (Criteria) this;
        }

        public Criteria andRewLevelIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("rew_level_id >=", value, "rewLevelId");
            return (Criteria) this;
        }

        public Criteria andRewLevelIdLessThan(Integer value) {
            addCriterion("rew_level_id <", value, "rewLevelId");
            return (Criteria) this;
        }

        public Criteria andRewLevelIdLessThanOrEqualTo(Integer value) {
            addCriterion("rew_level_id <=", value, "rewLevelId");
            return (Criteria) this;
        }

        public Criteria andRewLevelIdIn(List<Integer> values) {
            addCriterion("rew_level_id in", values, "rewLevelId");
            return (Criteria) this;
        }

        public Criteria andRewLevelIdNotIn(List<Integer> values) {
            addCriterion("rew_level_id not in", values, "rewLevelId");
            return (Criteria) this;
        }

        public Criteria andRewLevelIdBetween(Integer value1, Integer value2) {
            addCriterion("rew_level_id between", value1, value2, "rewLevelId");
            return (Criteria) this;
        }

        public Criteria andRewLevelIdNotBetween(Integer value1, Integer value2) {
            addCriterion("rew_level_id not between", value1, value2, "rewLevelId");
            return (Criteria) this;
        }

        public Criteria andFinishWayIdIsNull() {
            addCriterion("finish_way_id is null");
            return (Criteria) this;
        }

        public Criteria andFinishWayIdIsNotNull() {
            addCriterion("finish_way_id is not null");
            return (Criteria) this;
        }

        public Criteria andFinishWayIdEqualTo(Integer value) {
            addCriterion("finish_way_id =", value, "finishWayId");
            return (Criteria) this;
        }

        public Criteria andFinishWayIdNotEqualTo(Integer value) {
            addCriterion("finish_way_id <>", value, "finishWayId");
            return (Criteria) this;
        }

        public Criteria andFinishWayIdGreaterThan(Integer value) {
            addCriterion("finish_way_id >", value, "finishWayId");
            return (Criteria) this;
        }

        public Criteria andFinishWayIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("finish_way_id >=", value, "finishWayId");
            return (Criteria) this;
        }

        public Criteria andFinishWayIdLessThan(Integer value) {
            addCriterion("finish_way_id <", value, "finishWayId");
            return (Criteria) this;
        }

        public Criteria andFinishWayIdLessThanOrEqualTo(Integer value) {
            addCriterion("finish_way_id <=", value, "finishWayId");
            return (Criteria) this;
        }

        public Criteria andFinishWayIdIn(List<Integer> values) {
            addCriterion("finish_way_id in", values, "finishWayId");
            return (Criteria) this;
        }

        public Criteria andFinishWayIdNotIn(List<Integer> values) {
            addCriterion("finish_way_id not in", values, "finishWayId");
            return (Criteria) this;
        }

        public Criteria andFinishWayIdBetween(Integer value1, Integer value2) {
            addCriterion("finish_way_id between", value1, value2, "finishWayId");
            return (Criteria) this;
        }

        public Criteria andFinishWayIdNotBetween(Integer value1, Integer value2) {
            addCriterion("finish_way_id not between", value1, value2, "finishWayId");
            return (Criteria) this;
        }

        public Criteria andRewGradeIdIsNull() {
            addCriterion("rew_grade_id is null");
            return (Criteria) this;
        }

        public Criteria andRewGradeIdIsNotNull() {
            addCriterion("rew_grade_id is not null");
            return (Criteria) this;
        }

        public Criteria andRewGradeIdEqualTo(Integer value) {
            addCriterion("rew_grade_id =", value, "rewGradeId");
            return (Criteria) this;
        }

        public Criteria andRewGradeIdNotEqualTo(Integer value) {
            addCriterion("rew_grade_id <>", value, "rewGradeId");
            return (Criteria) this;
        }

        public Criteria andRewGradeIdGreaterThan(Integer value) {
            addCriterion("rew_grade_id >", value, "rewGradeId");
            return (Criteria) this;
        }

        public Criteria andRewGradeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("rew_grade_id >=", value, "rewGradeId");
            return (Criteria) this;
        }

        public Criteria andRewGradeIdLessThan(Integer value) {
            addCriterion("rew_grade_id <", value, "rewGradeId");
            return (Criteria) this;
        }

        public Criteria andRewGradeIdLessThanOrEqualTo(Integer value) {
            addCriterion("rew_grade_id <=", value, "rewGradeId");
            return (Criteria) this;
        }

        public Criteria andRewGradeIdIn(List<Integer> values) {
            addCriterion("rew_grade_id in", values, "rewGradeId");
            return (Criteria) this;
        }

        public Criteria andRewGradeIdNotIn(List<Integer> values) {
            addCriterion("rew_grade_id not in", values, "rewGradeId");
            return (Criteria) this;
        }

        public Criteria andRewGradeIdBetween(Integer value1, Integer value2) {
            addCriterion("rew_grade_id between", value1, value2, "rewGradeId");
            return (Criteria) this;
        }

        public Criteria andRewGradeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("rew_grade_id not between", value1, value2, "rewGradeId");
            return (Criteria) this;
        }

        public Criteria andRewCertificateNumIsNull() {
            addCriterion("rew_certificate_num is null");
            return (Criteria) this;
        }

        public Criteria andRewCertificateNumIsNotNull() {
            addCriterion("rew_certificate_num is not null");
            return (Criteria) this;
        }

        public Criteria andRewCertificateNumEqualTo(String value) {
            addCriterion("rew_certificate_num =", value, "rewCertificateNum");
            return (Criteria) this;
        }

        public Criteria andRewCertificateNumNotEqualTo(String value) {
            addCriterion("rew_certificate_num <>", value, "rewCertificateNum");
            return (Criteria) this;
        }

        public Criteria andRewCertificateNumGreaterThan(String value) {
            addCriterion("rew_certificate_num >", value, "rewCertificateNum");
            return (Criteria) this;
        }

        public Criteria andRewCertificateNumGreaterThanOrEqualTo(String value) {
            addCriterion("rew_certificate_num >=", value, "rewCertificateNum");
            return (Criteria) this;
        }

        public Criteria andRewCertificateNumLessThan(String value) {
            addCriterion("rew_certificate_num <", value, "rewCertificateNum");
            return (Criteria) this;
        }

        public Criteria andRewCertificateNumLessThanOrEqualTo(String value) {
            addCriterion("rew_certificate_num <=", value, "rewCertificateNum");
            return (Criteria) this;
        }

        public Criteria andRewCertificateNumLike(String value) {
            addCriterion("rew_certificate_num like", value, "rewCertificateNum");
            return (Criteria) this;
        }

        public Criteria andRewCertificateNumNotLike(String value) {
            addCriterion("rew_certificate_num not like", value, "rewCertificateNum");
            return (Criteria) this;
        }

        public Criteria andRewCertificateNumIn(List<String> values) {
            addCriterion("rew_certificate_num in", values, "rewCertificateNum");
            return (Criteria) this;
        }

        public Criteria andRewCertificateNumNotIn(List<String> values) {
            addCriterion("rew_certificate_num not in", values, "rewCertificateNum");
            return (Criteria) this;
        }

        public Criteria andRewCertificateNumBetween(String value1, String value2) {
            addCriterion("rew_certificate_num between", value1, value2, "rewCertificateNum");
            return (Criteria) this;
        }

        public Criteria andRewCertificateNumNotBetween(String value1, String value2) {
            addCriterion("rew_certificate_num not between", value1, value2, "rewCertificateNum");
            return (Criteria) this;
        }

        public Criteria andRewDateIsNull() {
            addCriterion("rew_date is null");
            return (Criteria) this;
        }

        public Criteria andRewDateIsNotNull() {
            addCriterion("rew_date is not null");
            return (Criteria) this;
        }

        public Criteria andRewDateEqualTo(Date value) {
            addCriterion("rew_date =", value, "rewDate");
            return (Criteria) this;
        }

        public Criteria andRewDateNotEqualTo(Date value) {
            addCriterion("rew_date <>", value, "rewDate");
            return (Criteria) this;
        }

        public Criteria andRewDateGreaterThan(Date value) {
            addCriterion("rew_date >", value, "rewDate");
            return (Criteria) this;
        }

        public Criteria andRewDateGreaterThanOrEqualTo(Date value) {
            addCriterion("rew_date >=", value, "rewDate");
            return (Criteria) this;
        }

        public Criteria andRewDateLessThan(Date value) {
            addCriterion("rew_date <", value, "rewDate");
            return (Criteria) this;
        }

        public Criteria andRewDateLessThanOrEqualTo(Date value) {
            addCriterion("rew_date <=", value, "rewDate");
            return (Criteria) this;
        }

        public Criteria andRewDateIn(List<Date> values) {
            addCriterion("rew_date in", values, "rewDate");
            return (Criteria) this;
        }

        public Criteria andRewDateNotIn(List<Date> values) {
            addCriterion("rew_date not in", values, "rewDate");
            return (Criteria) this;
        }

        public Criteria andRewDateBetween(Date value1, Date value2) {
            addCriterion("rew_date between", value1, value2, "rewDate");
            return (Criteria) this;
        }

        public Criteria andRewDateNotBetween(Date value1, Date value2) {
            addCriterion("rew_date not between", value1, value2, "rewDate");
            return (Criteria) this;
        }

        public Criteria andSignIdIsNull() {
            addCriterion("sign_id is null");
            return (Criteria) this;
        }

        public Criteria andSignIdIsNotNull() {
            addCriterion("sign_id is not null");
            return (Criteria) this;
        }

        public Criteria andSignIdEqualTo(Integer value) {
            addCriterion("sign_id =", value, "signId");
            return (Criteria) this;
        }

        public Criteria andSignIdNotEqualTo(Integer value) {
            addCriterion("sign_id <>", value, "signId");
            return (Criteria) this;
        }

        public Criteria andSignIdGreaterThan(Integer value) {
            addCriterion("sign_id >", value, "signId");
            return (Criteria) this;
        }

        public Criteria andSignIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("sign_id >=", value, "signId");
            return (Criteria) this;
        }

        public Criteria andSignIdLessThan(Integer value) {
            addCriterion("sign_id <", value, "signId");
            return (Criteria) this;
        }

        public Criteria andSignIdLessThanOrEqualTo(Integer value) {
            addCriterion("sign_id <=", value, "signId");
            return (Criteria) this;
        }

        public Criteria andSignIdIn(List<Integer> values) {
            addCriterion("sign_id in", values, "signId");
            return (Criteria) this;
        }

        public Criteria andSignIdNotIn(List<Integer> values) {
            addCriterion("sign_id not in", values, "signId");
            return (Criteria) this;
        }

        public Criteria andSignIdBetween(Integer value1, Integer value2) {
            addCriterion("sign_id between", value1, value2, "signId");
            return (Criteria) this;
        }

        public Criteria andSignIdNotBetween(Integer value1, Integer value2) {
            addCriterion("sign_id not between", value1, value2, "signId");
            return (Criteria) this;
        }

        public Criteria andRewUnitIsNull() {
            addCriterion("rew_unit is null");
            return (Criteria) this;
        }

        public Criteria andRewUnitIsNotNull() {
            addCriterion("rew_unit is not null");
            return (Criteria) this;
        }

        public Criteria andRewUnitEqualTo(String value) {
            addCriterion("rew_unit =", value, "rewUnit");
            return (Criteria) this;
        }

        public Criteria andRewUnitNotEqualTo(String value) {
            addCriterion("rew_unit <>", value, "rewUnit");
            return (Criteria) this;
        }

        public Criteria andRewUnitGreaterThan(String value) {
            addCriterion("rew_unit >", value, "rewUnit");
            return (Criteria) this;
        }

        public Criteria andRewUnitGreaterThanOrEqualTo(String value) {
            addCriterion("rew_unit >=", value, "rewUnit");
            return (Criteria) this;
        }

        public Criteria andRewUnitLessThan(String value) {
            addCriterion("rew_unit <", value, "rewUnit");
            return (Criteria) this;
        }

        public Criteria andRewUnitLessThanOrEqualTo(String value) {
            addCriterion("rew_unit <=", value, "rewUnit");
            return (Criteria) this;
        }

        public Criteria andRewUnitLike(String value) {
            addCriterion("rew_unit like", value, "rewUnit");
            return (Criteria) this;
        }

        public Criteria andRewUnitNotLike(String value) {
            addCriterion("rew_unit not like", value, "rewUnit");
            return (Criteria) this;
        }

        public Criteria andRewUnitIn(List<String> values) {
            addCriterion("rew_unit in", values, "rewUnit");
            return (Criteria) this;
        }

        public Criteria andRewUnitNotIn(List<String> values) {
            addCriterion("rew_unit not in", values, "rewUnit");
            return (Criteria) this;
        }

        public Criteria andRewUnitBetween(String value1, String value2) {
            addCriterion("rew_unit between", value1, value2, "rewUnit");
            return (Criteria) this;
        }

        public Criteria andRewUnitNotBetween(String value1, String value2) {
            addCriterion("rew_unit not between", value1, value2, "rewUnit");
            return (Criteria) this;
        }

        public Criteria andBonusIsNull() {
            addCriterion("bonus is null");
            return (Criteria) this;
        }

        public Criteria andBonusIsNotNull() {
            addCriterion("bonus is not null");
            return (Criteria) this;
        }

        public Criteria andBonusEqualTo(Double value) {
            addCriterion("bonus =", value, "bonus");
            return (Criteria) this;
        }

        public Criteria andBonusNotEqualTo(Double value) {
            addCriterion("bonus <>", value, "bonus");
            return (Criteria) this;
        }

        public Criteria andBonusGreaterThan(Double value) {
            addCriterion("bonus >", value, "bonus");
            return (Criteria) this;
        }

        public Criteria andBonusGreaterThanOrEqualTo(Double value) {
            addCriterion("bonus >=", value, "bonus");
            return (Criteria) this;
        }

        public Criteria andBonusLessThan(Double value) {
            addCriterion("bonus <", value, "bonus");
            return (Criteria) this;
        }

        public Criteria andBonusLessThanOrEqualTo(Double value) {
            addCriterion("bonus <=", value, "bonus");
            return (Criteria) this;
        }

        public Criteria andBonusIn(List<Double> values) {
            addCriterion("bonus in", values, "bonus");
            return (Criteria) this;
        }

        public Criteria andBonusNotIn(List<Double> values) {
            addCriterion("bonus not in", values, "bonus");
            return (Criteria) this;
        }

        public Criteria andBonusBetween(Double value1, Double value2) {
            addCriterion("bonus between", value1, value2, "bonus");
            return (Criteria) this;
        }

        public Criteria andBonusNotBetween(Double value1, Double value2) {
            addCriterion("bonus not between", value1, value2, "bonus");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andLeaderIsNull() {
            addCriterion("leader is null");
            return (Criteria) this;
        }

        public Criteria andLeaderIsNotNull() {
            addCriterion("leader is not null");
            return (Criteria) this;
        }

        public Criteria andLeaderEqualTo(String value) {
            addCriterion("leader =", value, "leader");
            return (Criteria) this;
        }

        public Criteria andLeaderNotEqualTo(String value) {
            addCriterion("leader <>", value, "leader");
            return (Criteria) this;
        }

        public Criteria andLeaderGreaterThan(String value) {
            addCriterion("leader >", value, "leader");
            return (Criteria) this;
        }

        public Criteria andLeaderGreaterThanOrEqualTo(String value) {
            addCriterion("leader >=", value, "leader");
            return (Criteria) this;
        }

        public Criteria andLeaderLessThan(String value) {
            addCriterion("leader <", value, "leader");
            return (Criteria) this;
        }

        public Criteria andLeaderLessThanOrEqualTo(String value) {
            addCriterion("leader <=", value, "leader");
            return (Criteria) this;
        }

        public Criteria andLeaderLike(String value) {
            addCriterion("leader like", value, "leader");
            return (Criteria) this;
        }

        public Criteria andLeaderNotLike(String value) {
            addCriterion("leader not like", value, "leader");
            return (Criteria) this;
        }

        public Criteria andLeaderIn(List<String> values) {
            addCriterion("leader in", values, "leader");
            return (Criteria) this;
        }

        public Criteria andLeaderNotIn(List<String> values) {
            addCriterion("leader not in", values, "leader");
            return (Criteria) this;
        }

        public Criteria andLeaderBetween(String value1, String value2) {
            addCriterion("leader between", value1, value2, "leader");
            return (Criteria) this;
        }

        public Criteria andLeaderNotBetween(String value1, String value2) {
            addCriterion("leader not between", value1, value2, "leader");
            return (Criteria) this;
        }

        public Criteria andRegistrantIsNull() {
            addCriterion("registrant is null");
            return (Criteria) this;
        }

        public Criteria andRegistrantIsNotNull() {
            addCriterion("registrant is not null");
            return (Criteria) this;
        }

        public Criteria andRegistrantEqualTo(String value) {
            addCriterion("registrant =", value, "registrant");
            return (Criteria) this;
        }

        public Criteria andRegistrantNotEqualTo(String value) {
            addCriterion("registrant <>", value, "registrant");
            return (Criteria) this;
        }

        public Criteria andRegistrantGreaterThan(String value) {
            addCriterion("registrant >", value, "registrant");
            return (Criteria) this;
        }

        public Criteria andRegistrantGreaterThanOrEqualTo(String value) {
            addCriterion("registrant >=", value, "registrant");
            return (Criteria) this;
        }

        public Criteria andRegistrantLessThan(String value) {
            addCriterion("registrant <", value, "registrant");
            return (Criteria) this;
        }

        public Criteria andRegistrantLessThanOrEqualTo(String value) {
            addCriterion("registrant <=", value, "registrant");
            return (Criteria) this;
        }

        public Criteria andRegistrantLike(String value) {
            addCriterion("registrant like", value, "registrant");
            return (Criteria) this;
        }

        public Criteria andRegistrantNotLike(String value) {
            addCriterion("registrant not like", value, "registrant");
            return (Criteria) this;
        }

        public Criteria andRegistrantIn(List<String> values) {
            addCriterion("registrant in", values, "registrant");
            return (Criteria) this;
        }

        public Criteria andRegistrantNotIn(List<String> values) {
            addCriterion("registrant not in", values, "registrant");
            return (Criteria) this;
        }

        public Criteria andRegistrantBetween(String value1, String value2) {
            addCriterion("registrant between", value1, value2, "registrant");
            return (Criteria) this;
        }

        public Criteria andRegistrantNotBetween(String value1, String value2) {
            addCriterion("registrant not between", value1, value2, "registrant");
            return (Criteria) this;
        }

        public Criteria andPersonListIsNull() {
            addCriterion("person_list is null");
            return (Criteria) this;
        }

        public Criteria andPersonListIsNotNull() {
            addCriterion("person_list is not null");
            return (Criteria) this;
        }

        public Criteria andPersonListEqualTo(String value) {
            addCriterion("person_list =", value, "personList");
            return (Criteria) this;
        }

        public Criteria andPersonListNotEqualTo(String value) {
            addCriterion("person_list <>", value, "personList");
            return (Criteria) this;
        }

        public Criteria andPersonListGreaterThan(String value) {
            addCriterion("person_list >", value, "personList");
            return (Criteria) this;
        }

        public Criteria andPersonListGreaterThanOrEqualTo(String value) {
            addCriterion("person_list >=", value, "personList");
            return (Criteria) this;
        }

        public Criteria andPersonListLessThan(String value) {
            addCriterion("person_list <", value, "personList");
            return (Criteria) this;
        }

        public Criteria andPersonListLessThanOrEqualTo(String value) {
            addCriterion("person_list <=", value, "personList");
            return (Criteria) this;
        }

        public Criteria andPersonListLike(String value) {
            addCriterion("person_list like", value, "personList");
            return (Criteria) this;
        }

        public Criteria andPersonListNotLike(String value) {
            addCriterion("person_list not like", value, "personList");
            return (Criteria) this;
        }

        public Criteria andPersonListIn(List<String> values) {
            addCriterion("person_list in", values, "personList");
            return (Criteria) this;
        }

        public Criteria andPersonListNotIn(List<String> values) {
            addCriterion("person_list not in", values, "personList");
            return (Criteria) this;
        }

        public Criteria andPersonListBetween(String value1, String value2) {
            addCriterion("person_list between", value1, value2, "personList");
            return (Criteria) this;
        }

        public Criteria andPersonListNotBetween(String value1, String value2) {
            addCriterion("person_list not between", value1, value2, "personList");
            return (Criteria) this;
        }

        public Criteria andAttachmentIsNull() {
            addCriterion("attachment is null");
            return (Criteria) this;
        }

        public Criteria andAttachmentIsNotNull() {
            addCriterion("attachment is not null");
            return (Criteria) this;
        }

        public Criteria andAttachmentEqualTo(String value) {
            addCriterion("attachment =", value, "attachment");
            return (Criteria) this;
        }

        public Criteria andAttachmentNotEqualTo(String value) {
            addCriterion("attachment <>", value, "attachment");
            return (Criteria) this;
        }

        public Criteria andAttachmentGreaterThan(String value) {
            addCriterion("attachment >", value, "attachment");
            return (Criteria) this;
        }

        public Criteria andAttachmentGreaterThanOrEqualTo(String value) {
            addCriterion("attachment >=", value, "attachment");
            return (Criteria) this;
        }

        public Criteria andAttachmentLessThan(String value) {
            addCriterion("attachment <", value, "attachment");
            return (Criteria) this;
        }

        public Criteria andAttachmentLessThanOrEqualTo(String value) {
            addCriterion("attachment <=", value, "attachment");
            return (Criteria) this;
        }

        public Criteria andAttachmentLike(String value) {
            addCriterion("attachment like", value, "attachment");
            return (Criteria) this;
        }

        public Criteria andAttachmentNotLike(String value) {
            addCriterion("attachment not like", value, "attachment");
            return (Criteria) this;
        }

        public Criteria andAttachmentIn(List<String> values) {
            addCriterion("attachment in", values, "attachment");
            return (Criteria) this;
        }

        public Criteria andAttachmentNotIn(List<String> values) {
            addCriterion("attachment not in", values, "attachment");
            return (Criteria) this;
        }

        public Criteria andAttachmentBetween(String value1, String value2) {
            addCriterion("attachment between", value1, value2, "attachment");
            return (Criteria) this;
        }

        public Criteria andAttachmentNotBetween(String value1, String value2) {
            addCriterion("attachment not between", value1, value2, "attachment");
            return (Criteria) this;
        }

        public Criteria andAuditStatusIdIsNull() {
            addCriterion("audit_status_id is null");
            return (Criteria) this;
        }

        public Criteria andAuditStatusIdIsNotNull() {
            addCriterion("audit_status_id is not null");
            return (Criteria) this;
        }

        public Criteria andAuditStatusIdEqualTo(Integer value) {
            addCriterion("audit_status_id =", value, "auditStatusId");
            return (Criteria) this;
        }

        public Criteria andAuditStatusIdNotEqualTo(Integer value) {
            addCriterion("audit_status_id <>", value, "auditStatusId");
            return (Criteria) this;
        }

        public Criteria andAuditStatusIdGreaterThan(Integer value) {
            addCriterion("audit_status_id >", value, "auditStatusId");
            return (Criteria) this;
        }

        public Criteria andAuditStatusIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("audit_status_id >=", value, "auditStatusId");
            return (Criteria) this;
        }

        public Criteria andAuditStatusIdLessThan(Integer value) {
            addCriterion("audit_status_id <", value, "auditStatusId");
            return (Criteria) this;
        }

        public Criteria andAuditStatusIdLessThanOrEqualTo(Integer value) {
            addCriterion("audit_status_id <=", value, "auditStatusId");
            return (Criteria) this;
        }

        public Criteria andAuditStatusIdIn(List<Integer> values) {
            addCriterion("audit_status_id in", values, "auditStatusId");
            return (Criteria) this;
        }

        public Criteria andAuditStatusIdNotIn(List<Integer> values) {
            addCriterion("audit_status_id not in", values, "auditStatusId");
            return (Criteria) this;
        }

        public Criteria andAuditStatusIdBetween(Integer value1, Integer value2) {
            addCriterion("audit_status_id between", value1, value2, "auditStatusId");
            return (Criteria) this;
        }

        public Criteria andAuditStatusIdNotBetween(Integer value1, Integer value2) {
            addCriterion("audit_status_id not between", value1, value2, "auditStatusId");
            return (Criteria) this;
        }

        public Criteria andAuditPersonId1IsNull() {
            addCriterion("audit_person_id1 is null");
            return (Criteria) this;
        }

        public Criteria andAuditPersonId1IsNotNull() {
            addCriterion("audit_person_id1 is not null");
            return (Criteria) this;
        }

        public Criteria andAuditPersonId1EqualTo(String value) {
            addCriterion("audit_person_id1 =", value, "auditPersonId1");
            return (Criteria) this;
        }

        public Criteria andAuditPersonId1NotEqualTo(String value) {
            addCriterion("audit_person_id1 <>", value, "auditPersonId1");
            return (Criteria) this;
        }

        public Criteria andAuditPersonId1GreaterThan(String value) {
            addCriterion("audit_person_id1 >", value, "auditPersonId1");
            return (Criteria) this;
        }

        public Criteria andAuditPersonId1GreaterThanOrEqualTo(String value) {
            addCriterion("audit_person_id1 >=", value, "auditPersonId1");
            return (Criteria) this;
        }

        public Criteria andAuditPersonId1LessThan(String value) {
            addCriterion("audit_person_id1 <", value, "auditPersonId1");
            return (Criteria) this;
        }

        public Criteria andAuditPersonId1LessThanOrEqualTo(String value) {
            addCriterion("audit_person_id1 <=", value, "auditPersonId1");
            return (Criteria) this;
        }

        public Criteria andAuditPersonId1Like(String value) {
            addCriterion("audit_person_id1 like", value, "auditPersonId1");
            return (Criteria) this;
        }

        public Criteria andAuditPersonId1NotLike(String value) {
            addCriterion("audit_person_id1 not like", value, "auditPersonId1");
            return (Criteria) this;
        }

        public Criteria andAuditPersonId1In(List<String> values) {
            addCriterion("audit_person_id1 in", values, "auditPersonId1");
            return (Criteria) this;
        }

        public Criteria andAuditPersonId1NotIn(List<String> values) {
            addCriterion("audit_person_id1 not in", values, "auditPersonId1");
            return (Criteria) this;
        }

        public Criteria andAuditPersonId1Between(String value1, String value2) {
            addCriterion("audit_person_id1 between", value1, value2, "auditPersonId1");
            return (Criteria) this;
        }

        public Criteria andAuditPersonId1NotBetween(String value1, String value2) {
            addCriterion("audit_person_id1 not between", value1, value2, "auditPersonId1");
            return (Criteria) this;
        }

        public Criteria andAuditPoinion1IsNull() {
            addCriterion("audit_poinion1 is null");
            return (Criteria) this;
        }

        public Criteria andAuditPoinion1IsNotNull() {
            addCriterion("audit_poinion1 is not null");
            return (Criteria) this;
        }

        public Criteria andAuditPoinion1EqualTo(String value) {
            addCriterion("audit_poinion1 =", value, "auditPoinion1");
            return (Criteria) this;
        }

        public Criteria andAuditPoinion1NotEqualTo(String value) {
            addCriterion("audit_poinion1 <>", value, "auditPoinion1");
            return (Criteria) this;
        }

        public Criteria andAuditPoinion1GreaterThan(String value) {
            addCriterion("audit_poinion1 >", value, "auditPoinion1");
            return (Criteria) this;
        }

        public Criteria andAuditPoinion1GreaterThanOrEqualTo(String value) {
            addCriterion("audit_poinion1 >=", value, "auditPoinion1");
            return (Criteria) this;
        }

        public Criteria andAuditPoinion1LessThan(String value) {
            addCriterion("audit_poinion1 <", value, "auditPoinion1");
            return (Criteria) this;
        }

        public Criteria andAuditPoinion1LessThanOrEqualTo(String value) {
            addCriterion("audit_poinion1 <=", value, "auditPoinion1");
            return (Criteria) this;
        }

        public Criteria andAuditPoinion1Like(String value) {
            addCriterion("audit_poinion1 like", value, "auditPoinion1");
            return (Criteria) this;
        }

        public Criteria andAuditPoinion1NotLike(String value) {
            addCriterion("audit_poinion1 not like", value, "auditPoinion1");
            return (Criteria) this;
        }

        public Criteria andAuditPoinion1In(List<String> values) {
            addCriterion("audit_poinion1 in", values, "auditPoinion1");
            return (Criteria) this;
        }

        public Criteria andAuditPoinion1NotIn(List<String> values) {
            addCriterion("audit_poinion1 not in", values, "auditPoinion1");
            return (Criteria) this;
        }

        public Criteria andAuditPoinion1Between(String value1, String value2) {
            addCriterion("audit_poinion1 between", value1, value2, "auditPoinion1");
            return (Criteria) this;
        }

        public Criteria andAuditPoinion1NotBetween(String value1, String value2) {
            addCriterion("audit_poinion1 not between", value1, value2, "auditPoinion1");
            return (Criteria) this;
        }

        public Criteria andAuditPersonId2IsNull() {
            addCriterion("audit_person_id2 is null");
            return (Criteria) this;
        }

        public Criteria andAuditPersonId2IsNotNull() {
            addCriterion("audit_person_id2 is not null");
            return (Criteria) this;
        }

        public Criteria andAuditPersonId2EqualTo(String value) {
            addCriterion("audit_person_id2 =", value, "auditPersonId2");
            return (Criteria) this;
        }

        public Criteria andAuditPersonId2NotEqualTo(String value) {
            addCriterion("audit_person_id2 <>", value, "auditPersonId2");
            return (Criteria) this;
        }

        public Criteria andAuditPersonId2GreaterThan(String value) {
            addCriterion("audit_person_id2 >", value, "auditPersonId2");
            return (Criteria) this;
        }

        public Criteria andAuditPersonId2GreaterThanOrEqualTo(String value) {
            addCriterion("audit_person_id2 >=", value, "auditPersonId2");
            return (Criteria) this;
        }

        public Criteria andAuditPersonId2LessThan(String value) {
            addCriterion("audit_person_id2 <", value, "auditPersonId2");
            return (Criteria) this;
        }

        public Criteria andAuditPersonId2LessThanOrEqualTo(String value) {
            addCriterion("audit_person_id2 <=", value, "auditPersonId2");
            return (Criteria) this;
        }

        public Criteria andAuditPersonId2Like(String value) {
            addCriterion("audit_person_id2 like", value, "auditPersonId2");
            return (Criteria) this;
        }

        public Criteria andAuditPersonId2NotLike(String value) {
            addCriterion("audit_person_id2 not like", value, "auditPersonId2");
            return (Criteria) this;
        }

        public Criteria andAuditPersonId2In(List<String> values) {
            addCriterion("audit_person_id2 in", values, "auditPersonId2");
            return (Criteria) this;
        }

        public Criteria andAuditPersonId2NotIn(List<String> values) {
            addCriterion("audit_person_id2 not in", values, "auditPersonId2");
            return (Criteria) this;
        }

        public Criteria andAuditPersonId2Between(String value1, String value2) {
            addCriterion("audit_person_id2 between", value1, value2, "auditPersonId2");
            return (Criteria) this;
        }

        public Criteria andAuditPersonId2NotBetween(String value1, String value2) {
            addCriterion("audit_person_id2 not between", value1, value2, "auditPersonId2");
            return (Criteria) this;
        }

        public Criteria andAuditPoinion2IsNull() {
            addCriterion("audit_poinion2 is null");
            return (Criteria) this;
        }

        public Criteria andAuditPoinion2IsNotNull() {
            addCriterion("audit_poinion2 is not null");
            return (Criteria) this;
        }

        public Criteria andAuditPoinion2EqualTo(String value) {
            addCriterion("audit_poinion2 =", value, "auditPoinion2");
            return (Criteria) this;
        }

        public Criteria andAuditPoinion2NotEqualTo(String value) {
            addCriterion("audit_poinion2 <>", value, "auditPoinion2");
            return (Criteria) this;
        }

        public Criteria andAuditPoinion2GreaterThan(String value) {
            addCriterion("audit_poinion2 >", value, "auditPoinion2");
            return (Criteria) this;
        }

        public Criteria andAuditPoinion2GreaterThanOrEqualTo(String value) {
            addCriterion("audit_poinion2 >=", value, "auditPoinion2");
            return (Criteria) this;
        }

        public Criteria andAuditPoinion2LessThan(String value) {
            addCriterion("audit_poinion2 <", value, "auditPoinion2");
            return (Criteria) this;
        }

        public Criteria andAuditPoinion2LessThanOrEqualTo(String value) {
            addCriterion("audit_poinion2 <=", value, "auditPoinion2");
            return (Criteria) this;
        }

        public Criteria andAuditPoinion2Like(String value) {
            addCriterion("audit_poinion2 like", value, "auditPoinion2");
            return (Criteria) this;
        }

        public Criteria andAuditPoinion2NotLike(String value) {
            addCriterion("audit_poinion2 not like", value, "auditPoinion2");
            return (Criteria) this;
        }

        public Criteria andAuditPoinion2In(List<String> values) {
            addCriterion("audit_poinion2 in", values, "auditPoinion2");
            return (Criteria) this;
        }

        public Criteria andAuditPoinion2NotIn(List<String> values) {
            addCriterion("audit_poinion2 not in", values, "auditPoinion2");
            return (Criteria) this;
        }

        public Criteria andAuditPoinion2Between(String value1, String value2) {
            addCriterion("audit_poinion2 between", value1, value2, "auditPoinion2");
            return (Criteria) this;
        }

        public Criteria andAuditPoinion2NotBetween(String value1, String value2) {
            addCriterion("audit_poinion2 not between", value1, value2, "auditPoinion2");
            return (Criteria) this;
        }

        public Criteria andInsertTimeIsNull() {
            addCriterion("insert_time is null");
            return (Criteria) this;
        }

        public Criteria andInsertTimeIsNotNull() {
            addCriterion("insert_time is not null");
            return (Criteria) this;
        }

        public Criteria andInsertTimeEqualTo(Date value) {
            addCriterion("insert_time =", value, "insertTime");
            return (Criteria) this;
        }

        public Criteria andInsertTimeNotEqualTo(Date value) {
            addCriterion("insert_time <>", value, "insertTime");
            return (Criteria) this;
        }

        public Criteria andInsertTimeGreaterThan(Date value) {
            addCriterion("insert_time >", value, "insertTime");
            return (Criteria) this;
        }

        public Criteria andInsertTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("insert_time >=", value, "insertTime");
            return (Criteria) this;
        }

        public Criteria andInsertTimeLessThan(Date value) {
            addCriterion("insert_time <", value, "insertTime");
            return (Criteria) this;
        }

        public Criteria andInsertTimeLessThanOrEqualTo(Date value) {
            addCriterion("insert_time <=", value, "insertTime");
            return (Criteria) this;
        }

        public Criteria andInsertTimeIn(List<Date> values) {
            addCriterion("insert_time in", values, "insertTime");
            return (Criteria) this;
        }

        public Criteria andInsertTimeNotIn(List<Date> values) {
            addCriterion("insert_time not in", values, "insertTime");
            return (Criteria) this;
        }

        public Criteria andInsertTimeBetween(Date value1, Date value2) {
            addCriterion("insert_time between", value1, value2, "insertTime");
            return (Criteria) this;
        }

        public Criteria andInsertTimeNotBetween(Date value1, Date value2) {
            addCriterion("insert_time not between", value1, value2, "insertTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeIsNull() {
            addCriterion("last_time is null");
            return (Criteria) this;
        }

        public Criteria andLastTimeIsNotNull() {
            addCriterion("last_time is not null");
            return (Criteria) this;
        }

        public Criteria andLastTimeEqualTo(Date value) {
            addCriterion("last_time =", value, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeNotEqualTo(Date value) {
            addCriterion("last_time <>", value, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeGreaterThan(Date value) {
            addCriterion("last_time >", value, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("last_time >=", value, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeLessThan(Date value) {
            addCriterion("last_time <", value, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeLessThanOrEqualTo(Date value) {
            addCriterion("last_time <=", value, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeIn(List<Date> values) {
            addCriterion("last_time in", values, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeNotIn(List<Date> values) {
            addCriterion("last_time not in", values, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeBetween(Date value1, Date value2) {
            addCriterion("last_time between", value1, value2, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeNotBetween(Date value1, Date value2) {
            addCriterion("last_time not between", value1, value2, "lastTime");
            return (Criteria) this;
        }

        public Criteria andScoreIsNull() {
            addCriterion("score is null");
            return (Criteria) this;
        }

        public Criteria andScoreIsNotNull() {
            addCriterion("score is not null");
            return (Criteria) this;
        }

        public Criteria andScoreEqualTo(Double value) {
            addCriterion("score =", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotEqualTo(Double value) {
            addCriterion("score <>", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThan(Double value) {
            addCriterion("score >", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThanOrEqualTo(Double value) {
            addCriterion("score >=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThan(Double value) {
            addCriterion("score <", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThanOrEqualTo(Double value) {
            addCriterion("score <=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreIn(List<Double> values) {
            addCriterion("score in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotIn(List<Double> values) {
            addCriterion("score not in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreBetween(Double value1, Double value2) {
            addCriterion("score between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotBetween(Double value1, Double value2) {
            addCriterion("score not between", value1, value2, "score");
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