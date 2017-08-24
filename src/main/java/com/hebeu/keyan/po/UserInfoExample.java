package com.hebeu.keyan.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserInfoExample() {
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

        public Criteria andWorkNumIsNull() {
            addCriterion("work_num is null");
            return (Criteria) this;
        }

        public Criteria andWorkNumIsNotNull() {
            addCriterion("work_num is not null");
            return (Criteria) this;
        }

        public Criteria andWorkNumEqualTo(String value) {
            addCriterion("work_num =", value, "workNum");
            return (Criteria) this;
        }

        public Criteria andWorkNumNotEqualTo(String value) {
            addCriterion("work_num <>", value, "workNum");
            return (Criteria) this;
        }

        public Criteria andWorkNumGreaterThan(String value) {
            addCriterion("work_num >", value, "workNum");
            return (Criteria) this;
        }

        public Criteria andWorkNumGreaterThanOrEqualTo(String value) {
            addCriterion("work_num >=", value, "workNum");
            return (Criteria) this;
        }

        public Criteria andWorkNumLessThan(String value) {
            addCriterion("work_num <", value, "workNum");
            return (Criteria) this;
        }

        public Criteria andWorkNumLessThanOrEqualTo(String value) {
            addCriterion("work_num <=", value, "workNum");
            return (Criteria) this;
        }

        public Criteria andWorkNumLike(String value) {
            addCriterion("work_num like", value, "workNum");
            return (Criteria) this;
        }

        public Criteria andWorkNumNotLike(String value) {
            addCriterion("work_num not like", value, "workNum");
            return (Criteria) this;
        }

        public Criteria andWorkNumIn(List<String> values) {
            addCriterion("work_num in", values, "workNum");
            return (Criteria) this;
        }

        public Criteria andWorkNumNotIn(List<String> values) {
            addCriterion("work_num not in", values, "workNum");
            return (Criteria) this;
        }

        public Criteria andWorkNumBetween(String value1, String value2) {
            addCriterion("work_num between", value1, value2, "workNum");
            return (Criteria) this;
        }

        public Criteria andWorkNumNotBetween(String value1, String value2) {
            addCriterion("work_num not between", value1, value2, "workNum");
            return (Criteria) this;
        }

        public Criteria andWorkNameIsNull() {
            addCriterion("work_name is null");
            return (Criteria) this;
        }

        public Criteria andWorkNameIsNotNull() {
            addCriterion("work_name is not null");
            return (Criteria) this;
        }

        public Criteria andWorkNameEqualTo(String value) {
            addCriterion("work_name =", value, "workName");
            return (Criteria) this;
        }

        public Criteria andWorkNameNotEqualTo(String value) {
            addCriterion("work_name <>", value, "workName");
            return (Criteria) this;
        }

        public Criteria andWorkNameGreaterThan(String value) {
            addCriterion("work_name >", value, "workName");
            return (Criteria) this;
        }

        public Criteria andWorkNameGreaterThanOrEqualTo(String value) {
            addCriterion("work_name >=", value, "workName");
            return (Criteria) this;
        }

        public Criteria andWorkNameLessThan(String value) {
            addCriterion("work_name <", value, "workName");
            return (Criteria) this;
        }

        public Criteria andWorkNameLessThanOrEqualTo(String value) {
            addCriterion("work_name <=", value, "workName");
            return (Criteria) this;
        }

        public Criteria andWorkNameLike(String value) {
            addCriterion("work_name like", value, "workName");
            return (Criteria) this;
        }

        public Criteria andWorkNameNotLike(String value) {
            addCriterion("work_name not like", value, "workName");
            return (Criteria) this;
        }

        public Criteria andWorkNameIn(List<String> values) {
            addCriterion("work_name in", values, "workName");
            return (Criteria) this;
        }

        public Criteria andWorkNameNotIn(List<String> values) {
            addCriterion("work_name not in", values, "workName");
            return (Criteria) this;
        }

        public Criteria andWorkNameBetween(String value1, String value2) {
            addCriterion("work_name between", value1, value2, "workName");
            return (Criteria) this;
        }

        public Criteria andWorkNameNotBetween(String value1, String value2) {
            addCriterion("work_name not between", value1, value2, "workName");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(String value) {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(String value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(String value) {
            addCriterion("sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(String value) {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(String value) {
            addCriterion("sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(String value) {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLike(String value) {
            addCriterion("sex like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotLike(String value) {
            addCriterion("sex not like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<String> values) {
            addCriterion("sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<String> values) {
            addCriterion("sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(String value1, String value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(String value1, String value2) {
            addCriterion("sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNull() {
            addCriterion("birthday is null");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNotNull() {
            addCriterion("birthday is not null");
            return (Criteria) this;
        }

        public Criteria andBirthdayEqualTo(Date value) {
            addCriterion("birthday =", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotEqualTo(Date value) {
            addCriterion("birthday <>", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThan(Date value) {
            addCriterion("birthday >", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThanOrEqualTo(Date value) {
            addCriterion("birthday >=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThan(Date value) {
            addCriterion("birthday <", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThanOrEqualTo(Date value) {
            addCriterion("birthday <=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayIn(List<Date> values) {
            addCriterion("birthday in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotIn(List<Date> values) {
            addCriterion("birthday not in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayBetween(Date value1, Date value2) {
            addCriterion("birthday between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotBetween(Date value1, Date value2) {
            addCriterion("birthday not between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andPhotoIsNull() {
            addCriterion("photo is null");
            return (Criteria) this;
        }

        public Criteria andPhotoIsNotNull() {
            addCriterion("photo is not null");
            return (Criteria) this;
        }

        public Criteria andPhotoEqualTo(String value) {
            addCriterion("photo =", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoNotEqualTo(String value) {
            addCriterion("photo <>", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoGreaterThan(String value) {
            addCriterion("photo >", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoGreaterThanOrEqualTo(String value) {
            addCriterion("photo >=", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoLessThan(String value) {
            addCriterion("photo <", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoLessThanOrEqualTo(String value) {
            addCriterion("photo <=", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoLike(String value) {
            addCriterion("photo like", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoNotLike(String value) {
            addCriterion("photo not like", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoIn(List<String> values) {
            addCriterion("photo in", values, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoNotIn(List<String> values) {
            addCriterion("photo not in", values, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoBetween(String value1, String value2) {
            addCriterion("photo between", value1, value2, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoNotBetween(String value1, String value2) {
            addCriterion("photo not between", value1, value2, "photo");
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

        public Criteria andTitleTypeIdIsNull() {
            addCriterion("title_type_id is null");
            return (Criteria) this;
        }

        public Criteria andTitleTypeIdIsNotNull() {
            addCriterion("title_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andTitleTypeIdEqualTo(Integer value) {
            addCriterion("title_type_id =", value, "titleTypeId");
            return (Criteria) this;
        }

        public Criteria andTitleTypeIdNotEqualTo(Integer value) {
            addCriterion("title_type_id <>", value, "titleTypeId");
            return (Criteria) this;
        }

        public Criteria andTitleTypeIdGreaterThan(Integer value) {
            addCriterion("title_type_id >", value, "titleTypeId");
            return (Criteria) this;
        }

        public Criteria andTitleTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("title_type_id >=", value, "titleTypeId");
            return (Criteria) this;
        }

        public Criteria andTitleTypeIdLessThan(Integer value) {
            addCriterion("title_type_id <", value, "titleTypeId");
            return (Criteria) this;
        }

        public Criteria andTitleTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("title_type_id <=", value, "titleTypeId");
            return (Criteria) this;
        }

        public Criteria andTitleTypeIdIn(List<Integer> values) {
            addCriterion("title_type_id in", values, "titleTypeId");
            return (Criteria) this;
        }

        public Criteria andTitleTypeIdNotIn(List<Integer> values) {
            addCriterion("title_type_id not in", values, "titleTypeId");
            return (Criteria) this;
        }

        public Criteria andTitleTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("title_type_id between", value1, value2, "titleTypeId");
            return (Criteria) this;
        }

        public Criteria andTitleTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("title_type_id not between", value1, value2, "titleTypeId");
            return (Criteria) this;
        }

        public Criteria andTitleLevelIdIsNull() {
            addCriterion("title_level_id is null");
            return (Criteria) this;
        }

        public Criteria andTitleLevelIdIsNotNull() {
            addCriterion("title_level_id is not null");
            return (Criteria) this;
        }

        public Criteria andTitleLevelIdEqualTo(Integer value) {
            addCriterion("title_level_id =", value, "titleLevelId");
            return (Criteria) this;
        }

        public Criteria andTitleLevelIdNotEqualTo(Integer value) {
            addCriterion("title_level_id <>", value, "titleLevelId");
            return (Criteria) this;
        }

        public Criteria andTitleLevelIdGreaterThan(Integer value) {
            addCriterion("title_level_id >", value, "titleLevelId");
            return (Criteria) this;
        }

        public Criteria andTitleLevelIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("title_level_id >=", value, "titleLevelId");
            return (Criteria) this;
        }

        public Criteria andTitleLevelIdLessThan(Integer value) {
            addCriterion("title_level_id <", value, "titleLevelId");
            return (Criteria) this;
        }

        public Criteria andTitleLevelIdLessThanOrEqualTo(Integer value) {
            addCriterion("title_level_id <=", value, "titleLevelId");
            return (Criteria) this;
        }

        public Criteria andTitleLevelIdIn(List<Integer> values) {
            addCriterion("title_level_id in", values, "titleLevelId");
            return (Criteria) this;
        }

        public Criteria andTitleLevelIdNotIn(List<Integer> values) {
            addCriterion("title_level_id not in", values, "titleLevelId");
            return (Criteria) this;
        }

        public Criteria andTitleLevelIdBetween(Integer value1, Integer value2) {
            addCriterion("title_level_id between", value1, value2, "titleLevelId");
            return (Criteria) this;
        }

        public Criteria andTitleLevelIdNotBetween(Integer value1, Integer value2) {
            addCriterion("title_level_id not between", value1, value2, "titleLevelId");
            return (Criteria) this;
        }

        public Criteria andEducationIdIsNull() {
            addCriterion("education_id is null");
            return (Criteria) this;
        }

        public Criteria andEducationIdIsNotNull() {
            addCriterion("education_id is not null");
            return (Criteria) this;
        }

        public Criteria andEducationIdEqualTo(Integer value) {
            addCriterion("education_id =", value, "educationId");
            return (Criteria) this;
        }

        public Criteria andEducationIdNotEqualTo(Integer value) {
            addCriterion("education_id <>", value, "educationId");
            return (Criteria) this;
        }

        public Criteria andEducationIdGreaterThan(Integer value) {
            addCriterion("education_id >", value, "educationId");
            return (Criteria) this;
        }

        public Criteria andEducationIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("education_id >=", value, "educationId");
            return (Criteria) this;
        }

        public Criteria andEducationIdLessThan(Integer value) {
            addCriterion("education_id <", value, "educationId");
            return (Criteria) this;
        }

        public Criteria andEducationIdLessThanOrEqualTo(Integer value) {
            addCriterion("education_id <=", value, "educationId");
            return (Criteria) this;
        }

        public Criteria andEducationIdIn(List<Integer> values) {
            addCriterion("education_id in", values, "educationId");
            return (Criteria) this;
        }

        public Criteria andEducationIdNotIn(List<Integer> values) {
            addCriterion("education_id not in", values, "educationId");
            return (Criteria) this;
        }

        public Criteria andEducationIdBetween(Integer value1, Integer value2) {
            addCriterion("education_id between", value1, value2, "educationId");
            return (Criteria) this;
        }

        public Criteria andEducationIdNotBetween(Integer value1, Integer value2) {
            addCriterion("education_id not between", value1, value2, "educationId");
            return (Criteria) this;
        }

        public Criteria andDegreeIdIsNull() {
            addCriterion("degree_id is null");
            return (Criteria) this;
        }

        public Criteria andDegreeIdIsNotNull() {
            addCriterion("degree_id is not null");
            return (Criteria) this;
        }

        public Criteria andDegreeIdEqualTo(Integer value) {
            addCriterion("degree_id =", value, "degreeId");
            return (Criteria) this;
        }

        public Criteria andDegreeIdNotEqualTo(Integer value) {
            addCriterion("degree_id <>", value, "degreeId");
            return (Criteria) this;
        }

        public Criteria andDegreeIdGreaterThan(Integer value) {
            addCriterion("degree_id >", value, "degreeId");
            return (Criteria) this;
        }

        public Criteria andDegreeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("degree_id >=", value, "degreeId");
            return (Criteria) this;
        }

        public Criteria andDegreeIdLessThan(Integer value) {
            addCriterion("degree_id <", value, "degreeId");
            return (Criteria) this;
        }

        public Criteria andDegreeIdLessThanOrEqualTo(Integer value) {
            addCriterion("degree_id <=", value, "degreeId");
            return (Criteria) this;
        }

        public Criteria andDegreeIdIn(List<Integer> values) {
            addCriterion("degree_id in", values, "degreeId");
            return (Criteria) this;
        }

        public Criteria andDegreeIdNotIn(List<Integer> values) {
            addCriterion("degree_id not in", values, "degreeId");
            return (Criteria) this;
        }

        public Criteria andDegreeIdBetween(Integer value1, Integer value2) {
            addCriterion("degree_id between", value1, value2, "degreeId");
            return (Criteria) this;
        }

        public Criteria andDegreeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("degree_id not between", value1, value2, "degreeId");
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

        public Criteria andSubjectSecondIdIsNull() {
            addCriterion("subject_second_id is null");
            return (Criteria) this;
        }

        public Criteria andSubjectSecondIdIsNotNull() {
            addCriterion("subject_second_id is not null");
            return (Criteria) this;
        }

        public Criteria andSubjectSecondIdEqualTo(Integer value) {
            addCriterion("subject_second_id =", value, "subjectSecondId");
            return (Criteria) this;
        }

        public Criteria andSubjectSecondIdNotEqualTo(Integer value) {
            addCriterion("subject_second_id <>", value, "subjectSecondId");
            return (Criteria) this;
        }

        public Criteria andSubjectSecondIdGreaterThan(Integer value) {
            addCriterion("subject_second_id >", value, "subjectSecondId");
            return (Criteria) this;
        }

        public Criteria andSubjectSecondIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("subject_second_id >=", value, "subjectSecondId");
            return (Criteria) this;
        }

        public Criteria andSubjectSecondIdLessThan(Integer value) {
            addCriterion("subject_second_id <", value, "subjectSecondId");
            return (Criteria) this;
        }

        public Criteria andSubjectSecondIdLessThanOrEqualTo(Integer value) {
            addCriterion("subject_second_id <=", value, "subjectSecondId");
            return (Criteria) this;
        }

        public Criteria andSubjectSecondIdIn(List<Integer> values) {
            addCriterion("subject_second_id in", values, "subjectSecondId");
            return (Criteria) this;
        }

        public Criteria andSubjectSecondIdNotIn(List<Integer> values) {
            addCriterion("subject_second_id not in", values, "subjectSecondId");
            return (Criteria) this;
        }

        public Criteria andSubjectSecondIdBetween(Integer value1, Integer value2) {
            addCriterion("subject_second_id between", value1, value2, "subjectSecondId");
            return (Criteria) this;
        }

        public Criteria andSubjectSecondIdNotBetween(Integer value1, Integer value2) {
            addCriterion("subject_second_id not between", value1, value2, "subjectSecondId");
            return (Criteria) this;
        }

        public Criteria andSubjectThirdIdIsNull() {
            addCriterion("subject_third_id is null");
            return (Criteria) this;
        }

        public Criteria andSubjectThirdIdIsNotNull() {
            addCriterion("subject_third_id is not null");
            return (Criteria) this;
        }

        public Criteria andSubjectThirdIdEqualTo(Integer value) {
            addCriterion("subject_third_id =", value, "subjectThirdId");
            return (Criteria) this;
        }

        public Criteria andSubjectThirdIdNotEqualTo(Integer value) {
            addCriterion("subject_third_id <>", value, "subjectThirdId");
            return (Criteria) this;
        }

        public Criteria andSubjectThirdIdGreaterThan(Integer value) {
            addCriterion("subject_third_id >", value, "subjectThirdId");
            return (Criteria) this;
        }

        public Criteria andSubjectThirdIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("subject_third_id >=", value, "subjectThirdId");
            return (Criteria) this;
        }

        public Criteria andSubjectThirdIdLessThan(Integer value) {
            addCriterion("subject_third_id <", value, "subjectThirdId");
            return (Criteria) this;
        }

        public Criteria andSubjectThirdIdLessThanOrEqualTo(Integer value) {
            addCriterion("subject_third_id <=", value, "subjectThirdId");
            return (Criteria) this;
        }

        public Criteria andSubjectThirdIdIn(List<Integer> values) {
            addCriterion("subject_third_id in", values, "subjectThirdId");
            return (Criteria) this;
        }

        public Criteria andSubjectThirdIdNotIn(List<Integer> values) {
            addCriterion("subject_third_id not in", values, "subjectThirdId");
            return (Criteria) this;
        }

        public Criteria andSubjectThirdIdBetween(Integer value1, Integer value2) {
            addCriterion("subject_third_id between", value1, value2, "subjectThirdId");
            return (Criteria) this;
        }

        public Criteria andSubjectThirdIdNotBetween(Integer value1, Integer value2) {
            addCriterion("subject_third_id not between", value1, value2, "subjectThirdId");
            return (Criteria) this;
        }

        public Criteria andCollegeId1IsNull() {
            addCriterion("college_id1 is null");
            return (Criteria) this;
        }

        public Criteria andCollegeId1IsNotNull() {
            addCriterion("college_id1 is not null");
            return (Criteria) this;
        }

        public Criteria andCollegeId1EqualTo(Integer value) {
            addCriterion("college_id1 =", value, "collegeId1");
            return (Criteria) this;
        }

        public Criteria andCollegeId1NotEqualTo(Integer value) {
            addCriterion("college_id1 <>", value, "collegeId1");
            return (Criteria) this;
        }

        public Criteria andCollegeId1GreaterThan(Integer value) {
            addCriterion("college_id1 >", value, "collegeId1");
            return (Criteria) this;
        }

        public Criteria andCollegeId1GreaterThanOrEqualTo(Integer value) {
            addCriterion("college_id1 >=", value, "collegeId1");
            return (Criteria) this;
        }

        public Criteria andCollegeId1LessThan(Integer value) {
            addCriterion("college_id1 <", value, "collegeId1");
            return (Criteria) this;
        }

        public Criteria andCollegeId1LessThanOrEqualTo(Integer value) {
            addCriterion("college_id1 <=", value, "collegeId1");
            return (Criteria) this;
        }

        public Criteria andCollegeId1In(List<Integer> values) {
            addCriterion("college_id1 in", values, "collegeId1");
            return (Criteria) this;
        }

        public Criteria andCollegeId1NotIn(List<Integer> values) {
            addCriterion("college_id1 not in", values, "collegeId1");
            return (Criteria) this;
        }

        public Criteria andCollegeId1Between(Integer value1, Integer value2) {
            addCriterion("college_id1 between", value1, value2, "collegeId1");
            return (Criteria) this;
        }

        public Criteria andCollegeId1NotBetween(Integer value1, Integer value2) {
            addCriterion("college_id1 not between", value1, value2, "collegeId1");
            return (Criteria) this;
        }

        public Criteria andDepartmentId1IsNull() {
            addCriterion("department_id1 is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentId1IsNotNull() {
            addCriterion("department_id1 is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentId1EqualTo(Integer value) {
            addCriterion("department_id1 =", value, "departmentId1");
            return (Criteria) this;
        }

        public Criteria andDepartmentId1NotEqualTo(Integer value) {
            addCriterion("department_id1 <>", value, "departmentId1");
            return (Criteria) this;
        }

        public Criteria andDepartmentId1GreaterThan(Integer value) {
            addCriterion("department_id1 >", value, "departmentId1");
            return (Criteria) this;
        }

        public Criteria andDepartmentId1GreaterThanOrEqualTo(Integer value) {
            addCriterion("department_id1 >=", value, "departmentId1");
            return (Criteria) this;
        }

        public Criteria andDepartmentId1LessThan(Integer value) {
            addCriterion("department_id1 <", value, "departmentId1");
            return (Criteria) this;
        }

        public Criteria andDepartmentId1LessThanOrEqualTo(Integer value) {
            addCriterion("department_id1 <=", value, "departmentId1");
            return (Criteria) this;
        }

        public Criteria andDepartmentId1In(List<Integer> values) {
            addCriterion("department_id1 in", values, "departmentId1");
            return (Criteria) this;
        }

        public Criteria andDepartmentId1NotIn(List<Integer> values) {
            addCriterion("department_id1 not in", values, "departmentId1");
            return (Criteria) this;
        }

        public Criteria andDepartmentId1Between(Integer value1, Integer value2) {
            addCriterion("department_id1 between", value1, value2, "departmentId1");
            return (Criteria) this;
        }

        public Criteria andDepartmentId1NotBetween(Integer value1, Integer value2) {
            addCriterion("department_id1 not between", value1, value2, "departmentId1");
            return (Criteria) this;
        }

        public Criteria andCollegeId2IsNull() {
            addCriterion("college_id2 is null");
            return (Criteria) this;
        }

        public Criteria andCollegeId2IsNotNull() {
            addCriterion("college_id2 is not null");
            return (Criteria) this;
        }

        public Criteria andCollegeId2EqualTo(Integer value) {
            addCriterion("college_id2 =", value, "collegeId2");
            return (Criteria) this;
        }

        public Criteria andCollegeId2NotEqualTo(Integer value) {
            addCriterion("college_id2 <>", value, "collegeId2");
            return (Criteria) this;
        }

        public Criteria andCollegeId2GreaterThan(Integer value) {
            addCriterion("college_id2 >", value, "collegeId2");
            return (Criteria) this;
        }

        public Criteria andCollegeId2GreaterThanOrEqualTo(Integer value) {
            addCriterion("college_id2 >=", value, "collegeId2");
            return (Criteria) this;
        }

        public Criteria andCollegeId2LessThan(Integer value) {
            addCriterion("college_id2 <", value, "collegeId2");
            return (Criteria) this;
        }

        public Criteria andCollegeId2LessThanOrEqualTo(Integer value) {
            addCriterion("college_id2 <=", value, "collegeId2");
            return (Criteria) this;
        }

        public Criteria andCollegeId2In(List<Integer> values) {
            addCriterion("college_id2 in", values, "collegeId2");
            return (Criteria) this;
        }

        public Criteria andCollegeId2NotIn(List<Integer> values) {
            addCriterion("college_id2 not in", values, "collegeId2");
            return (Criteria) this;
        }

        public Criteria andCollegeId2Between(Integer value1, Integer value2) {
            addCriterion("college_id2 between", value1, value2, "collegeId2");
            return (Criteria) this;
        }

        public Criteria andCollegeId2NotBetween(Integer value1, Integer value2) {
            addCriterion("college_id2 not between", value1, value2, "collegeId2");
            return (Criteria) this;
        }

        public Criteria andDepartmentId2IsNull() {
            addCriterion("department_id2 is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentId2IsNotNull() {
            addCriterion("department_id2 is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentId2EqualTo(Integer value) {
            addCriterion("department_id2 =", value, "departmentId2");
            return (Criteria) this;
        }

        public Criteria andDepartmentId2NotEqualTo(Integer value) {
            addCriterion("department_id2 <>", value, "departmentId2");
            return (Criteria) this;
        }

        public Criteria andDepartmentId2GreaterThan(Integer value) {
            addCriterion("department_id2 >", value, "departmentId2");
            return (Criteria) this;
        }

        public Criteria andDepartmentId2GreaterThanOrEqualTo(Integer value) {
            addCriterion("department_id2 >=", value, "departmentId2");
            return (Criteria) this;
        }

        public Criteria andDepartmentId2LessThan(Integer value) {
            addCriterion("department_id2 <", value, "departmentId2");
            return (Criteria) this;
        }

        public Criteria andDepartmentId2LessThanOrEqualTo(Integer value) {
            addCriterion("department_id2 <=", value, "departmentId2");
            return (Criteria) this;
        }

        public Criteria andDepartmentId2In(List<Integer> values) {
            addCriterion("department_id2 in", values, "departmentId2");
            return (Criteria) this;
        }

        public Criteria andDepartmentId2NotIn(List<Integer> values) {
            addCriterion("department_id2 not in", values, "departmentId2");
            return (Criteria) this;
        }

        public Criteria andDepartmentId2Between(Integer value1, Integer value2) {
            addCriterion("department_id2 between", value1, value2, "departmentId2");
            return (Criteria) this;
        }

        public Criteria andDepartmentId2NotBetween(Integer value1, Integer value2) {
            addCriterion("department_id2 not between", value1, value2, "departmentId2");
            return (Criteria) this;
        }

        public Criteria andCollegeId3IsNull() {
            addCriterion("college_id3 is null");
            return (Criteria) this;
        }

        public Criteria andCollegeId3IsNotNull() {
            addCriterion("college_id3 is not null");
            return (Criteria) this;
        }

        public Criteria andCollegeId3EqualTo(Integer value) {
            addCriterion("college_id3 =", value, "collegeId3");
            return (Criteria) this;
        }

        public Criteria andCollegeId3NotEqualTo(Integer value) {
            addCriterion("college_id3 <>", value, "collegeId3");
            return (Criteria) this;
        }

        public Criteria andCollegeId3GreaterThan(Integer value) {
            addCriterion("college_id3 >", value, "collegeId3");
            return (Criteria) this;
        }

        public Criteria andCollegeId3GreaterThanOrEqualTo(Integer value) {
            addCriterion("college_id3 >=", value, "collegeId3");
            return (Criteria) this;
        }

        public Criteria andCollegeId3LessThan(Integer value) {
            addCriterion("college_id3 <", value, "collegeId3");
            return (Criteria) this;
        }

        public Criteria andCollegeId3LessThanOrEqualTo(Integer value) {
            addCriterion("college_id3 <=", value, "collegeId3");
            return (Criteria) this;
        }

        public Criteria andCollegeId3In(List<Integer> values) {
            addCriterion("college_id3 in", values, "collegeId3");
            return (Criteria) this;
        }

        public Criteria andCollegeId3NotIn(List<Integer> values) {
            addCriterion("college_id3 not in", values, "collegeId3");
            return (Criteria) this;
        }

        public Criteria andCollegeId3Between(Integer value1, Integer value2) {
            addCriterion("college_id3 between", value1, value2, "collegeId3");
            return (Criteria) this;
        }

        public Criteria andCollegeId3NotBetween(Integer value1, Integer value2) {
            addCriterion("college_id3 not between", value1, value2, "collegeId3");
            return (Criteria) this;
        }

        public Criteria andJobStatusIdIsNull() {
            addCriterion("job_status_id is null");
            return (Criteria) this;
        }

        public Criteria andJobStatusIdIsNotNull() {
            addCriterion("job_status_id is not null");
            return (Criteria) this;
        }

        public Criteria andJobStatusIdEqualTo(Integer value) {
            addCriterion("job_status_id =", value, "jobStatusId");
            return (Criteria) this;
        }

        public Criteria andJobStatusIdNotEqualTo(Integer value) {
            addCriterion("job_status_id <>", value, "jobStatusId");
            return (Criteria) this;
        }

        public Criteria andJobStatusIdGreaterThan(Integer value) {
            addCriterion("job_status_id >", value, "jobStatusId");
            return (Criteria) this;
        }

        public Criteria andJobStatusIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("job_status_id >=", value, "jobStatusId");
            return (Criteria) this;
        }

        public Criteria andJobStatusIdLessThan(Integer value) {
            addCriterion("job_status_id <", value, "jobStatusId");
            return (Criteria) this;
        }

        public Criteria andJobStatusIdLessThanOrEqualTo(Integer value) {
            addCriterion("job_status_id <=", value, "jobStatusId");
            return (Criteria) this;
        }

        public Criteria andJobStatusIdIn(List<Integer> values) {
            addCriterion("job_status_id in", values, "jobStatusId");
            return (Criteria) this;
        }

        public Criteria andJobStatusIdNotIn(List<Integer> values) {
            addCriterion("job_status_id not in", values, "jobStatusId");
            return (Criteria) this;
        }

        public Criteria andJobStatusIdBetween(Integer value1, Integer value2) {
            addCriterion("job_status_id between", value1, value2, "jobStatusId");
            return (Criteria) this;
        }

        public Criteria andJobStatusIdNotBetween(Integer value1, Integer value2) {
            addCriterion("job_status_id not between", value1, value2, "jobStatusId");
            return (Criteria) this;
        }

        public Criteria andDutyIdIsNull() {
            addCriterion("duty_id is null");
            return (Criteria) this;
        }

        public Criteria andDutyIdIsNotNull() {
            addCriterion("duty_id is not null");
            return (Criteria) this;
        }

        public Criteria andDutyIdEqualTo(Integer value) {
            addCriterion("duty_id =", value, "dutyId");
            return (Criteria) this;
        }

        public Criteria andDutyIdNotEqualTo(Integer value) {
            addCriterion("duty_id <>", value, "dutyId");
            return (Criteria) this;
        }

        public Criteria andDutyIdGreaterThan(Integer value) {
            addCriterion("duty_id >", value, "dutyId");
            return (Criteria) this;
        }

        public Criteria andDutyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("duty_id >=", value, "dutyId");
            return (Criteria) this;
        }

        public Criteria andDutyIdLessThan(Integer value) {
            addCriterion("duty_id <", value, "dutyId");
            return (Criteria) this;
        }

        public Criteria andDutyIdLessThanOrEqualTo(Integer value) {
            addCriterion("duty_id <=", value, "dutyId");
            return (Criteria) this;
        }

        public Criteria andDutyIdIn(List<Integer> values) {
            addCriterion("duty_id in", values, "dutyId");
            return (Criteria) this;
        }

        public Criteria andDutyIdNotIn(List<Integer> values) {
            addCriterion("duty_id not in", values, "dutyId");
            return (Criteria) this;
        }

        public Criteria andDutyIdBetween(Integer value1, Integer value2) {
            addCriterion("duty_id between", value1, value2, "dutyId");
            return (Criteria) this;
        }

        public Criteria andDutyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("duty_id not between", value1, value2, "dutyId");
            return (Criteria) this;
        }

        public Criteria andIdCardIsNull() {
            addCriterion("id_card is null");
            return (Criteria) this;
        }

        public Criteria andIdCardIsNotNull() {
            addCriterion("id_card is not null");
            return (Criteria) this;
        }

        public Criteria andIdCardEqualTo(String value) {
            addCriterion("id_card =", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardNotEqualTo(String value) {
            addCriterion("id_card <>", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardGreaterThan(String value) {
            addCriterion("id_card >", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardGreaterThanOrEqualTo(String value) {
            addCriterion("id_card >=", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardLessThan(String value) {
            addCriterion("id_card <", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardLessThanOrEqualTo(String value) {
            addCriterion("id_card <=", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardLike(String value) {
            addCriterion("id_card like", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardNotLike(String value) {
            addCriterion("id_card not like", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardIn(List<String> values) {
            addCriterion("id_card in", values, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardNotIn(List<String> values) {
            addCriterion("id_card not in", values, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardBetween(String value1, String value2) {
            addCriterion("id_card between", value1, value2, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardNotBetween(String value1, String value2) {
            addCriterion("id_card not between", value1, value2, "idCard");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andResearchAreaIsNull() {
            addCriterion("research_area is null");
            return (Criteria) this;
        }

        public Criteria andResearchAreaIsNotNull() {
            addCriterion("research_area is not null");
            return (Criteria) this;
        }

        public Criteria andResearchAreaEqualTo(String value) {
            addCriterion("research_area =", value, "researchArea");
            return (Criteria) this;
        }

        public Criteria andResearchAreaNotEqualTo(String value) {
            addCriterion("research_area <>", value, "researchArea");
            return (Criteria) this;
        }

        public Criteria andResearchAreaGreaterThan(String value) {
            addCriterion("research_area >", value, "researchArea");
            return (Criteria) this;
        }

        public Criteria andResearchAreaGreaterThanOrEqualTo(String value) {
            addCriterion("research_area >=", value, "researchArea");
            return (Criteria) this;
        }

        public Criteria andResearchAreaLessThan(String value) {
            addCriterion("research_area <", value, "researchArea");
            return (Criteria) this;
        }

        public Criteria andResearchAreaLessThanOrEqualTo(String value) {
            addCriterion("research_area <=", value, "researchArea");
            return (Criteria) this;
        }

        public Criteria andResearchAreaLike(String value) {
            addCriterion("research_area like", value, "researchArea");
            return (Criteria) this;
        }

        public Criteria andResearchAreaNotLike(String value) {
            addCriterion("research_area not like", value, "researchArea");
            return (Criteria) this;
        }

        public Criteria andResearchAreaIn(List<String> values) {
            addCriterion("research_area in", values, "researchArea");
            return (Criteria) this;
        }

        public Criteria andResearchAreaNotIn(List<String> values) {
            addCriterion("research_area not in", values, "researchArea");
            return (Criteria) this;
        }

        public Criteria andResearchAreaBetween(String value1, String value2) {
            addCriterion("research_area between", value1, value2, "researchArea");
            return (Criteria) this;
        }

        public Criteria andResearchAreaNotBetween(String value1, String value2) {
            addCriterion("research_area not between", value1, value2, "researchArea");
            return (Criteria) this;
        }

        public Criteria andPostTypeIdIsNull() {
            addCriterion("post_type_id is null");
            return (Criteria) this;
        }

        public Criteria andPostTypeIdIsNotNull() {
            addCriterion("post_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andPostTypeIdEqualTo(Integer value) {
            addCriterion("post_type_id =", value, "postTypeId");
            return (Criteria) this;
        }

        public Criteria andPostTypeIdNotEqualTo(Integer value) {
            addCriterion("post_type_id <>", value, "postTypeId");
            return (Criteria) this;
        }

        public Criteria andPostTypeIdGreaterThan(Integer value) {
            addCriterion("post_type_id >", value, "postTypeId");
            return (Criteria) this;
        }

        public Criteria andPostTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("post_type_id >=", value, "postTypeId");
            return (Criteria) this;
        }

        public Criteria andPostTypeIdLessThan(Integer value) {
            addCriterion("post_type_id <", value, "postTypeId");
            return (Criteria) this;
        }

        public Criteria andPostTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("post_type_id <=", value, "postTypeId");
            return (Criteria) this;
        }

        public Criteria andPostTypeIdIn(List<Integer> values) {
            addCriterion("post_type_id in", values, "postTypeId");
            return (Criteria) this;
        }

        public Criteria andPostTypeIdNotIn(List<Integer> values) {
            addCriterion("post_type_id not in", values, "postTypeId");
            return (Criteria) this;
        }

        public Criteria andPostTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("post_type_id between", value1, value2, "postTypeId");
            return (Criteria) this;
        }

        public Criteria andPostTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("post_type_id not between", value1, value2, "postTypeId");
            return (Criteria) this;
        }

        public Criteria andPostLevelIdIsNull() {
            addCriterion("post_level_id is null");
            return (Criteria) this;
        }

        public Criteria andPostLevelIdIsNotNull() {
            addCriterion("post_level_id is not null");
            return (Criteria) this;
        }

        public Criteria andPostLevelIdEqualTo(Integer value) {
            addCriterion("post_level_id =", value, "postLevelId");
            return (Criteria) this;
        }

        public Criteria andPostLevelIdNotEqualTo(Integer value) {
            addCriterion("post_level_id <>", value, "postLevelId");
            return (Criteria) this;
        }

        public Criteria andPostLevelIdGreaterThan(Integer value) {
            addCriterion("post_level_id >", value, "postLevelId");
            return (Criteria) this;
        }

        public Criteria andPostLevelIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("post_level_id >=", value, "postLevelId");
            return (Criteria) this;
        }

        public Criteria andPostLevelIdLessThan(Integer value) {
            addCriterion("post_level_id <", value, "postLevelId");
            return (Criteria) this;
        }

        public Criteria andPostLevelIdLessThanOrEqualTo(Integer value) {
            addCriterion("post_level_id <=", value, "postLevelId");
            return (Criteria) this;
        }

        public Criteria andPostLevelIdIn(List<Integer> values) {
            addCriterion("post_level_id in", values, "postLevelId");
            return (Criteria) this;
        }

        public Criteria andPostLevelIdNotIn(List<Integer> values) {
            addCriterion("post_level_id not in", values, "postLevelId");
            return (Criteria) this;
        }

        public Criteria andPostLevelIdBetween(Integer value1, Integer value2) {
            addCriterion("post_level_id between", value1, value2, "postLevelId");
            return (Criteria) this;
        }

        public Criteria andPostLevelIdNotBetween(Integer value1, Integer value2) {
            addCriterion("post_level_id not between", value1, value2, "postLevelId");
            return (Criteria) this;
        }

        public Criteria andAdministrativeDutiesIsNull() {
            addCriterion("administrative_duties is null");
            return (Criteria) this;
        }

        public Criteria andAdministrativeDutiesIsNotNull() {
            addCriterion("administrative_duties is not null");
            return (Criteria) this;
        }

        public Criteria andAdministrativeDutiesEqualTo(String value) {
            addCriterion("administrative_duties =", value, "administrativeDuties");
            return (Criteria) this;
        }

        public Criteria andAdministrativeDutiesNotEqualTo(String value) {
            addCriterion("administrative_duties <>", value, "administrativeDuties");
            return (Criteria) this;
        }

        public Criteria andAdministrativeDutiesGreaterThan(String value) {
            addCriterion("administrative_duties >", value, "administrativeDuties");
            return (Criteria) this;
        }

        public Criteria andAdministrativeDutiesGreaterThanOrEqualTo(String value) {
            addCriterion("administrative_duties >=", value, "administrativeDuties");
            return (Criteria) this;
        }

        public Criteria andAdministrativeDutiesLessThan(String value) {
            addCriterion("administrative_duties <", value, "administrativeDuties");
            return (Criteria) this;
        }

        public Criteria andAdministrativeDutiesLessThanOrEqualTo(String value) {
            addCriterion("administrative_duties <=", value, "administrativeDuties");
            return (Criteria) this;
        }

        public Criteria andAdministrativeDutiesLike(String value) {
            addCriterion("administrative_duties like", value, "administrativeDuties");
            return (Criteria) this;
        }

        public Criteria andAdministrativeDutiesNotLike(String value) {
            addCriterion("administrative_duties not like", value, "administrativeDuties");
            return (Criteria) this;
        }

        public Criteria andAdministrativeDutiesIn(List<String> values) {
            addCriterion("administrative_duties in", values, "administrativeDuties");
            return (Criteria) this;
        }

        public Criteria andAdministrativeDutiesNotIn(List<String> values) {
            addCriterion("administrative_duties not in", values, "administrativeDuties");
            return (Criteria) this;
        }

        public Criteria andAdministrativeDutiesBetween(String value1, String value2) {
            addCriterion("administrative_duties between", value1, value2, "administrativeDuties");
            return (Criteria) this;
        }

        public Criteria andAdministrativeDutiesNotBetween(String value1, String value2) {
            addCriterion("administrative_duties not between", value1, value2, "administrativeDuties");
            return (Criteria) this;
        }

        public Criteria andTimeOfJobIsNull() {
            addCriterion("time_of_job is null");
            return (Criteria) this;
        }

        public Criteria andTimeOfJobIsNotNull() {
            addCriterion("time_of_job is not null");
            return (Criteria) this;
        }

        public Criteria andTimeOfJobEqualTo(Date value) {
            addCriterion("time_of_job =", value, "timeOfJob");
            return (Criteria) this;
        }

        public Criteria andTimeOfJobNotEqualTo(Date value) {
            addCriterion("time_of_job <>", value, "timeOfJob");
            return (Criteria) this;
        }

        public Criteria andTimeOfJobGreaterThan(Date value) {
            addCriterion("time_of_job >", value, "timeOfJob");
            return (Criteria) this;
        }

        public Criteria andTimeOfJobGreaterThanOrEqualTo(Date value) {
            addCriterion("time_of_job >=", value, "timeOfJob");
            return (Criteria) this;
        }

        public Criteria andTimeOfJobLessThan(Date value) {
            addCriterion("time_of_job <", value, "timeOfJob");
            return (Criteria) this;
        }

        public Criteria andTimeOfJobLessThanOrEqualTo(Date value) {
            addCriterion("time_of_job <=", value, "timeOfJob");
            return (Criteria) this;
        }

        public Criteria andTimeOfJobIn(List<Date> values) {
            addCriterion("time_of_job in", values, "timeOfJob");
            return (Criteria) this;
        }

        public Criteria andTimeOfJobNotIn(List<Date> values) {
            addCriterion("time_of_job not in", values, "timeOfJob");
            return (Criteria) this;
        }

        public Criteria andTimeOfJobBetween(Date value1, Date value2) {
            addCriterion("time_of_job between", value1, value2, "timeOfJob");
            return (Criteria) this;
        }

        public Criteria andTimeOfJobNotBetween(Date value1, Date value2) {
            addCriterion("time_of_job not between", value1, value2, "timeOfJob");
            return (Criteria) this;
        }

        public Criteria andCountryIdIsNull() {
            addCriterion("country_id is null");
            return (Criteria) this;
        }

        public Criteria andCountryIdIsNotNull() {
            addCriterion("country_id is not null");
            return (Criteria) this;
        }

        public Criteria andCountryIdEqualTo(Integer value) {
            addCriterion("country_id =", value, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdNotEqualTo(Integer value) {
            addCriterion("country_id <>", value, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdGreaterThan(Integer value) {
            addCriterion("country_id >", value, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("country_id >=", value, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdLessThan(Integer value) {
            addCriterion("country_id <", value, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdLessThanOrEqualTo(Integer value) {
            addCriterion("country_id <=", value, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdIn(List<Integer> values) {
            addCriterion("country_id in", values, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdNotIn(List<Integer> values) {
            addCriterion("country_id not in", values, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdBetween(Integer value1, Integer value2) {
            addCriterion("country_id between", value1, value2, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdNotBetween(Integer value1, Integer value2) {
            addCriterion("country_id not between", value1, value2, "countryId");
            return (Criteria) this;
        }

        public Criteria andNationIdIsNull() {
            addCriterion("nation_id is null");
            return (Criteria) this;
        }

        public Criteria andNationIdIsNotNull() {
            addCriterion("nation_id is not null");
            return (Criteria) this;
        }

        public Criteria andNationIdEqualTo(Integer value) {
            addCriterion("nation_id =", value, "nationId");
            return (Criteria) this;
        }

        public Criteria andNationIdNotEqualTo(Integer value) {
            addCriterion("nation_id <>", value, "nationId");
            return (Criteria) this;
        }

        public Criteria andNationIdGreaterThan(Integer value) {
            addCriterion("nation_id >", value, "nationId");
            return (Criteria) this;
        }

        public Criteria andNationIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("nation_id >=", value, "nationId");
            return (Criteria) this;
        }

        public Criteria andNationIdLessThan(Integer value) {
            addCriterion("nation_id <", value, "nationId");
            return (Criteria) this;
        }

        public Criteria andNationIdLessThanOrEqualTo(Integer value) {
            addCriterion("nation_id <=", value, "nationId");
            return (Criteria) this;
        }

        public Criteria andNationIdIn(List<Integer> values) {
            addCriterion("nation_id in", values, "nationId");
            return (Criteria) this;
        }

        public Criteria andNationIdNotIn(List<Integer> values) {
            addCriterion("nation_id not in", values, "nationId");
            return (Criteria) this;
        }

        public Criteria andNationIdBetween(Integer value1, Integer value2) {
            addCriterion("nation_id between", value1, value2, "nationId");
            return (Criteria) this;
        }

        public Criteria andNationIdNotBetween(Integer value1, Integer value2) {
            addCriterion("nation_id not between", value1, value2, "nationId");
            return (Criteria) this;
        }

        public Criteria andPostcodeIsNull() {
            addCriterion("postcode is null");
            return (Criteria) this;
        }

        public Criteria andPostcodeIsNotNull() {
            addCriterion("postcode is not null");
            return (Criteria) this;
        }

        public Criteria andPostcodeEqualTo(String value) {
            addCriterion("postcode =", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeNotEqualTo(String value) {
            addCriterion("postcode <>", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeGreaterThan(String value) {
            addCriterion("postcode >", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeGreaterThanOrEqualTo(String value) {
            addCriterion("postcode >=", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeLessThan(String value) {
            addCriterion("postcode <", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeLessThanOrEqualTo(String value) {
            addCriterion("postcode <=", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeLike(String value) {
            addCriterion("postcode like", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeNotLike(String value) {
            addCriterion("postcode not like", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeIn(List<String> values) {
            addCriterion("postcode in", values, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeNotIn(List<String> values) {
            addCriterion("postcode not in", values, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeBetween(String value1, String value2) {
            addCriterion("postcode between", value1, value2, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeNotBetween(String value1, String value2) {
            addCriterion("postcode not between", value1, value2, "postcode");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andOfficeTelIsNull() {
            addCriterion("office_tel is null");
            return (Criteria) this;
        }

        public Criteria andOfficeTelIsNotNull() {
            addCriterion("office_tel is not null");
            return (Criteria) this;
        }

        public Criteria andOfficeTelEqualTo(String value) {
            addCriterion("office_tel =", value, "officeTel");
            return (Criteria) this;
        }

        public Criteria andOfficeTelNotEqualTo(String value) {
            addCriterion("office_tel <>", value, "officeTel");
            return (Criteria) this;
        }

        public Criteria andOfficeTelGreaterThan(String value) {
            addCriterion("office_tel >", value, "officeTel");
            return (Criteria) this;
        }

        public Criteria andOfficeTelGreaterThanOrEqualTo(String value) {
            addCriterion("office_tel >=", value, "officeTel");
            return (Criteria) this;
        }

        public Criteria andOfficeTelLessThan(String value) {
            addCriterion("office_tel <", value, "officeTel");
            return (Criteria) this;
        }

        public Criteria andOfficeTelLessThanOrEqualTo(String value) {
            addCriterion("office_tel <=", value, "officeTel");
            return (Criteria) this;
        }

        public Criteria andOfficeTelLike(String value) {
            addCriterion("office_tel like", value, "officeTel");
            return (Criteria) this;
        }

        public Criteria andOfficeTelNotLike(String value) {
            addCriterion("office_tel not like", value, "officeTel");
            return (Criteria) this;
        }

        public Criteria andOfficeTelIn(List<String> values) {
            addCriterion("office_tel in", values, "officeTel");
            return (Criteria) this;
        }

        public Criteria andOfficeTelNotIn(List<String> values) {
            addCriterion("office_tel not in", values, "officeTel");
            return (Criteria) this;
        }

        public Criteria andOfficeTelBetween(String value1, String value2) {
            addCriterion("office_tel between", value1, value2, "officeTel");
            return (Criteria) this;
        }

        public Criteria andOfficeTelNotBetween(String value1, String value2) {
            addCriterion("office_tel not between", value1, value2, "officeTel");
            return (Criteria) this;
        }

        public Criteria andOfficeFaxIsNull() {
            addCriterion("office_fax is null");
            return (Criteria) this;
        }

        public Criteria andOfficeFaxIsNotNull() {
            addCriterion("office_fax is not null");
            return (Criteria) this;
        }

        public Criteria andOfficeFaxEqualTo(String value) {
            addCriterion("office_fax =", value, "officeFax");
            return (Criteria) this;
        }

        public Criteria andOfficeFaxNotEqualTo(String value) {
            addCriterion("office_fax <>", value, "officeFax");
            return (Criteria) this;
        }

        public Criteria andOfficeFaxGreaterThan(String value) {
            addCriterion("office_fax >", value, "officeFax");
            return (Criteria) this;
        }

        public Criteria andOfficeFaxGreaterThanOrEqualTo(String value) {
            addCriterion("office_fax >=", value, "officeFax");
            return (Criteria) this;
        }

        public Criteria andOfficeFaxLessThan(String value) {
            addCriterion("office_fax <", value, "officeFax");
            return (Criteria) this;
        }

        public Criteria andOfficeFaxLessThanOrEqualTo(String value) {
            addCriterion("office_fax <=", value, "officeFax");
            return (Criteria) this;
        }

        public Criteria andOfficeFaxLike(String value) {
            addCriterion("office_fax like", value, "officeFax");
            return (Criteria) this;
        }

        public Criteria andOfficeFaxNotLike(String value) {
            addCriterion("office_fax not like", value, "officeFax");
            return (Criteria) this;
        }

        public Criteria andOfficeFaxIn(List<String> values) {
            addCriterion("office_fax in", values, "officeFax");
            return (Criteria) this;
        }

        public Criteria andOfficeFaxNotIn(List<String> values) {
            addCriterion("office_fax not in", values, "officeFax");
            return (Criteria) this;
        }

        public Criteria andOfficeFaxBetween(String value1, String value2) {
            addCriterion("office_fax between", value1, value2, "officeFax");
            return (Criteria) this;
        }

        public Criteria andOfficeFaxNotBetween(String value1, String value2) {
            addCriterion("office_fax not between", value1, value2, "officeFax");
            return (Criteria) this;
        }

        public Criteria andTutorTypeIdIsNull() {
            addCriterion("tutor_type_id is null");
            return (Criteria) this;
        }

        public Criteria andTutorTypeIdIsNotNull() {
            addCriterion("tutor_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andTutorTypeIdEqualTo(Integer value) {
            addCriterion("tutor_type_id =", value, "tutorTypeId");
            return (Criteria) this;
        }

        public Criteria andTutorTypeIdNotEqualTo(Integer value) {
            addCriterion("tutor_type_id <>", value, "tutorTypeId");
            return (Criteria) this;
        }

        public Criteria andTutorTypeIdGreaterThan(Integer value) {
            addCriterion("tutor_type_id >", value, "tutorTypeId");
            return (Criteria) this;
        }

        public Criteria andTutorTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("tutor_type_id >=", value, "tutorTypeId");
            return (Criteria) this;
        }

        public Criteria andTutorTypeIdLessThan(Integer value) {
            addCriterion("tutor_type_id <", value, "tutorTypeId");
            return (Criteria) this;
        }

        public Criteria andTutorTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("tutor_type_id <=", value, "tutorTypeId");
            return (Criteria) this;
        }

        public Criteria andTutorTypeIdIn(List<Integer> values) {
            addCriterion("tutor_type_id in", values, "tutorTypeId");
            return (Criteria) this;
        }

        public Criteria andTutorTypeIdNotIn(List<Integer> values) {
            addCriterion("tutor_type_id not in", values, "tutorTypeId");
            return (Criteria) this;
        }

        public Criteria andTutorTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("tutor_type_id between", value1, value2, "tutorTypeId");
            return (Criteria) this;
        }

        public Criteria andTutorTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("tutor_type_id not between", value1, value2, "tutorTypeId");
            return (Criteria) this;
        }

        public Criteria andForeignLanguageId1IsNull() {
            addCriterion("foreign_language_id1 is null");
            return (Criteria) this;
        }

        public Criteria andForeignLanguageId1IsNotNull() {
            addCriterion("foreign_language_id1 is not null");
            return (Criteria) this;
        }

        public Criteria andForeignLanguageId1EqualTo(Integer value) {
            addCriterion("foreign_language_id1 =", value, "foreignLanguageId1");
            return (Criteria) this;
        }

        public Criteria andForeignLanguageId1NotEqualTo(Integer value) {
            addCriterion("foreign_language_id1 <>", value, "foreignLanguageId1");
            return (Criteria) this;
        }

        public Criteria andForeignLanguageId1GreaterThan(Integer value) {
            addCriterion("foreign_language_id1 >", value, "foreignLanguageId1");
            return (Criteria) this;
        }

        public Criteria andForeignLanguageId1GreaterThanOrEqualTo(Integer value) {
            addCriterion("foreign_language_id1 >=", value, "foreignLanguageId1");
            return (Criteria) this;
        }

        public Criteria andForeignLanguageId1LessThan(Integer value) {
            addCriterion("foreign_language_id1 <", value, "foreignLanguageId1");
            return (Criteria) this;
        }

        public Criteria andForeignLanguageId1LessThanOrEqualTo(Integer value) {
            addCriterion("foreign_language_id1 <=", value, "foreignLanguageId1");
            return (Criteria) this;
        }

        public Criteria andForeignLanguageId1In(List<Integer> values) {
            addCriterion("foreign_language_id1 in", values, "foreignLanguageId1");
            return (Criteria) this;
        }

        public Criteria andForeignLanguageId1NotIn(List<Integer> values) {
            addCriterion("foreign_language_id1 not in", values, "foreignLanguageId1");
            return (Criteria) this;
        }

        public Criteria andForeignLanguageId1Between(Integer value1, Integer value2) {
            addCriterion("foreign_language_id1 between", value1, value2, "foreignLanguageId1");
            return (Criteria) this;
        }

        public Criteria andForeignLanguageId1NotBetween(Integer value1, Integer value2) {
            addCriterion("foreign_language_id1 not between", value1, value2, "foreignLanguageId1");
            return (Criteria) this;
        }

        public Criteria andLanguageLevelId1IsNull() {
            addCriterion("language_level_id1 is null");
            return (Criteria) this;
        }

        public Criteria andLanguageLevelId1IsNotNull() {
            addCriterion("language_level_id1 is not null");
            return (Criteria) this;
        }

        public Criteria andLanguageLevelId1EqualTo(Integer value) {
            addCriterion("language_level_id1 =", value, "languageLevelId1");
            return (Criteria) this;
        }

        public Criteria andLanguageLevelId1NotEqualTo(Integer value) {
            addCriterion("language_level_id1 <>", value, "languageLevelId1");
            return (Criteria) this;
        }

        public Criteria andLanguageLevelId1GreaterThan(Integer value) {
            addCriterion("language_level_id1 >", value, "languageLevelId1");
            return (Criteria) this;
        }

        public Criteria andLanguageLevelId1GreaterThanOrEqualTo(Integer value) {
            addCriterion("language_level_id1 >=", value, "languageLevelId1");
            return (Criteria) this;
        }

        public Criteria andLanguageLevelId1LessThan(Integer value) {
            addCriterion("language_level_id1 <", value, "languageLevelId1");
            return (Criteria) this;
        }

        public Criteria andLanguageLevelId1LessThanOrEqualTo(Integer value) {
            addCriterion("language_level_id1 <=", value, "languageLevelId1");
            return (Criteria) this;
        }

        public Criteria andLanguageLevelId1In(List<Integer> values) {
            addCriterion("language_level_id1 in", values, "languageLevelId1");
            return (Criteria) this;
        }

        public Criteria andLanguageLevelId1NotIn(List<Integer> values) {
            addCriterion("language_level_id1 not in", values, "languageLevelId1");
            return (Criteria) this;
        }

        public Criteria andLanguageLevelId1Between(Integer value1, Integer value2) {
            addCriterion("language_level_id1 between", value1, value2, "languageLevelId1");
            return (Criteria) this;
        }

        public Criteria andLanguageLevelId1NotBetween(Integer value1, Integer value2) {
            addCriterion("language_level_id1 not between", value1, value2, "languageLevelId1");
            return (Criteria) this;
        }

        public Criteria andForeignLanguageId2IsNull() {
            addCriterion("foreign_language_id2 is null");
            return (Criteria) this;
        }

        public Criteria andForeignLanguageId2IsNotNull() {
            addCriterion("foreign_language_id2 is not null");
            return (Criteria) this;
        }

        public Criteria andForeignLanguageId2EqualTo(Integer value) {
            addCriterion("foreign_language_id2 =", value, "foreignLanguageId2");
            return (Criteria) this;
        }

        public Criteria andForeignLanguageId2NotEqualTo(Integer value) {
            addCriterion("foreign_language_id2 <>", value, "foreignLanguageId2");
            return (Criteria) this;
        }

        public Criteria andForeignLanguageId2GreaterThan(Integer value) {
            addCriterion("foreign_language_id2 >", value, "foreignLanguageId2");
            return (Criteria) this;
        }

        public Criteria andForeignLanguageId2GreaterThanOrEqualTo(Integer value) {
            addCriterion("foreign_language_id2 >=", value, "foreignLanguageId2");
            return (Criteria) this;
        }

        public Criteria andForeignLanguageId2LessThan(Integer value) {
            addCriterion("foreign_language_id2 <", value, "foreignLanguageId2");
            return (Criteria) this;
        }

        public Criteria andForeignLanguageId2LessThanOrEqualTo(Integer value) {
            addCriterion("foreign_language_id2 <=", value, "foreignLanguageId2");
            return (Criteria) this;
        }

        public Criteria andForeignLanguageId2In(List<Integer> values) {
            addCriterion("foreign_language_id2 in", values, "foreignLanguageId2");
            return (Criteria) this;
        }

        public Criteria andForeignLanguageId2NotIn(List<Integer> values) {
            addCriterion("foreign_language_id2 not in", values, "foreignLanguageId2");
            return (Criteria) this;
        }

        public Criteria andForeignLanguageId2Between(Integer value1, Integer value2) {
            addCriterion("foreign_language_id2 between", value1, value2, "foreignLanguageId2");
            return (Criteria) this;
        }

        public Criteria andForeignLanguageId2NotBetween(Integer value1, Integer value2) {
            addCriterion("foreign_language_id2 not between", value1, value2, "foreignLanguageId2");
            return (Criteria) this;
        }

        public Criteria andLanguageLevelId2IsNull() {
            addCriterion("language_level_id2 is null");
            return (Criteria) this;
        }

        public Criteria andLanguageLevelId2IsNotNull() {
            addCriterion("language_level_id2 is not null");
            return (Criteria) this;
        }

        public Criteria andLanguageLevelId2EqualTo(Integer value) {
            addCriterion("language_level_id2 =", value, "languageLevelId2");
            return (Criteria) this;
        }

        public Criteria andLanguageLevelId2NotEqualTo(Integer value) {
            addCriterion("language_level_id2 <>", value, "languageLevelId2");
            return (Criteria) this;
        }

        public Criteria andLanguageLevelId2GreaterThan(Integer value) {
            addCriterion("language_level_id2 >", value, "languageLevelId2");
            return (Criteria) this;
        }

        public Criteria andLanguageLevelId2GreaterThanOrEqualTo(Integer value) {
            addCriterion("language_level_id2 >=", value, "languageLevelId2");
            return (Criteria) this;
        }

        public Criteria andLanguageLevelId2LessThan(Integer value) {
            addCriterion("language_level_id2 <", value, "languageLevelId2");
            return (Criteria) this;
        }

        public Criteria andLanguageLevelId2LessThanOrEqualTo(Integer value) {
            addCriterion("language_level_id2 <=", value, "languageLevelId2");
            return (Criteria) this;
        }

        public Criteria andLanguageLevelId2In(List<Integer> values) {
            addCriterion("language_level_id2 in", values, "languageLevelId2");
            return (Criteria) this;
        }

        public Criteria andLanguageLevelId2NotIn(List<Integer> values) {
            addCriterion("language_level_id2 not in", values, "languageLevelId2");
            return (Criteria) this;
        }

        public Criteria andLanguageLevelId2Between(Integer value1, Integer value2) {
            addCriterion("language_level_id2 between", value1, value2, "languageLevelId2");
            return (Criteria) this;
        }

        public Criteria andLanguageLevelId2NotBetween(Integer value1, Integer value2) {
            addCriterion("language_level_id2 not between", value1, value2, "languageLevelId2");
            return (Criteria) this;
        }

        public Criteria andLearningSituationIsNull() {
            addCriterion("learning_situation is null");
            return (Criteria) this;
        }

        public Criteria andLearningSituationIsNotNull() {
            addCriterion("learning_situation is not null");
            return (Criteria) this;
        }

        public Criteria andLearningSituationEqualTo(String value) {
            addCriterion("learning_situation =", value, "learningSituation");
            return (Criteria) this;
        }

        public Criteria andLearningSituationNotEqualTo(String value) {
            addCriterion("learning_situation <>", value, "learningSituation");
            return (Criteria) this;
        }

        public Criteria andLearningSituationGreaterThan(String value) {
            addCriterion("learning_situation >", value, "learningSituation");
            return (Criteria) this;
        }

        public Criteria andLearningSituationGreaterThanOrEqualTo(String value) {
            addCriterion("learning_situation >=", value, "learningSituation");
            return (Criteria) this;
        }

        public Criteria andLearningSituationLessThan(String value) {
            addCriterion("learning_situation <", value, "learningSituation");
            return (Criteria) this;
        }

        public Criteria andLearningSituationLessThanOrEqualTo(String value) {
            addCriterion("learning_situation <=", value, "learningSituation");
            return (Criteria) this;
        }

        public Criteria andLearningSituationLike(String value) {
            addCriterion("learning_situation like", value, "learningSituation");
            return (Criteria) this;
        }

        public Criteria andLearningSituationNotLike(String value) {
            addCriterion("learning_situation not like", value, "learningSituation");
            return (Criteria) this;
        }

        public Criteria andLearningSituationIn(List<String> values) {
            addCriterion("learning_situation in", values, "learningSituation");
            return (Criteria) this;
        }

        public Criteria andLearningSituationNotIn(List<String> values) {
            addCriterion("learning_situation not in", values, "learningSituation");
            return (Criteria) this;
        }

        public Criteria andLearningSituationBetween(String value1, String value2) {
            addCriterion("learning_situation between", value1, value2, "learningSituation");
            return (Criteria) this;
        }

        public Criteria andLearningSituationNotBetween(String value1, String value2) {
            addCriterion("learning_situation not between", value1, value2, "learningSituation");
            return (Criteria) this;
        }

        public Criteria andPartTimeAcademicIsNull() {
            addCriterion("part_time_academic is null");
            return (Criteria) this;
        }

        public Criteria andPartTimeAcademicIsNotNull() {
            addCriterion("part_time_academic is not null");
            return (Criteria) this;
        }

        public Criteria andPartTimeAcademicEqualTo(String value) {
            addCriterion("part_time_academic =", value, "partTimeAcademic");
            return (Criteria) this;
        }

        public Criteria andPartTimeAcademicNotEqualTo(String value) {
            addCriterion("part_time_academic <>", value, "partTimeAcademic");
            return (Criteria) this;
        }

        public Criteria andPartTimeAcademicGreaterThan(String value) {
            addCriterion("part_time_academic >", value, "partTimeAcademic");
            return (Criteria) this;
        }

        public Criteria andPartTimeAcademicGreaterThanOrEqualTo(String value) {
            addCriterion("part_time_academic >=", value, "partTimeAcademic");
            return (Criteria) this;
        }

        public Criteria andPartTimeAcademicLessThan(String value) {
            addCriterion("part_time_academic <", value, "partTimeAcademic");
            return (Criteria) this;
        }

        public Criteria andPartTimeAcademicLessThanOrEqualTo(String value) {
            addCriterion("part_time_academic <=", value, "partTimeAcademic");
            return (Criteria) this;
        }

        public Criteria andPartTimeAcademicLike(String value) {
            addCriterion("part_time_academic like", value, "partTimeAcademic");
            return (Criteria) this;
        }

        public Criteria andPartTimeAcademicNotLike(String value) {
            addCriterion("part_time_academic not like", value, "partTimeAcademic");
            return (Criteria) this;
        }

        public Criteria andPartTimeAcademicIn(List<String> values) {
            addCriterion("part_time_academic in", values, "partTimeAcademic");
            return (Criteria) this;
        }

        public Criteria andPartTimeAcademicNotIn(List<String> values) {
            addCriterion("part_time_academic not in", values, "partTimeAcademic");
            return (Criteria) this;
        }

        public Criteria andPartTimeAcademicBetween(String value1, String value2) {
            addCriterion("part_time_academic between", value1, value2, "partTimeAcademic");
            return (Criteria) this;
        }

        public Criteria andPartTimeAcademicNotBetween(String value1, String value2) {
            addCriterion("part_time_academic not between", value1, value2, "partTimeAcademic");
            return (Criteria) this;
        }

        public Criteria andAcademicSpecialityIsNull() {
            addCriterion("academic_speciality is null");
            return (Criteria) this;
        }

        public Criteria andAcademicSpecialityIsNotNull() {
            addCriterion("academic_speciality is not null");
            return (Criteria) this;
        }

        public Criteria andAcademicSpecialityEqualTo(String value) {
            addCriterion("academic_speciality =", value, "academicSpeciality");
            return (Criteria) this;
        }

        public Criteria andAcademicSpecialityNotEqualTo(String value) {
            addCriterion("academic_speciality <>", value, "academicSpeciality");
            return (Criteria) this;
        }

        public Criteria andAcademicSpecialityGreaterThan(String value) {
            addCriterion("academic_speciality >", value, "academicSpeciality");
            return (Criteria) this;
        }

        public Criteria andAcademicSpecialityGreaterThanOrEqualTo(String value) {
            addCriterion("academic_speciality >=", value, "academicSpeciality");
            return (Criteria) this;
        }

        public Criteria andAcademicSpecialityLessThan(String value) {
            addCriterion("academic_speciality <", value, "academicSpeciality");
            return (Criteria) this;
        }

        public Criteria andAcademicSpecialityLessThanOrEqualTo(String value) {
            addCriterion("academic_speciality <=", value, "academicSpeciality");
            return (Criteria) this;
        }

        public Criteria andAcademicSpecialityLike(String value) {
            addCriterion("academic_speciality like", value, "academicSpeciality");
            return (Criteria) this;
        }

        public Criteria andAcademicSpecialityNotLike(String value) {
            addCriterion("academic_speciality not like", value, "academicSpeciality");
            return (Criteria) this;
        }

        public Criteria andAcademicSpecialityIn(List<String> values) {
            addCriterion("academic_speciality in", values, "academicSpeciality");
            return (Criteria) this;
        }

        public Criteria andAcademicSpecialityNotIn(List<String> values) {
            addCriterion("academic_speciality not in", values, "academicSpeciality");
            return (Criteria) this;
        }

        public Criteria andAcademicSpecialityBetween(String value1, String value2) {
            addCriterion("academic_speciality between", value1, value2, "academicSpeciality");
            return (Criteria) this;
        }

        public Criteria andAcademicSpecialityNotBetween(String value1, String value2) {
            addCriterion("academic_speciality not between", value1, value2, "academicSpeciality");
            return (Criteria) this;
        }

        public Criteria andHonoraryTitleIsNull() {
            addCriterion("honorary_title is null");
            return (Criteria) this;
        }

        public Criteria andHonoraryTitleIsNotNull() {
            addCriterion("honorary_title is not null");
            return (Criteria) this;
        }

        public Criteria andHonoraryTitleEqualTo(String value) {
            addCriterion("honorary_title =", value, "honoraryTitle");
            return (Criteria) this;
        }

        public Criteria andHonoraryTitleNotEqualTo(String value) {
            addCriterion("honorary_title <>", value, "honoraryTitle");
            return (Criteria) this;
        }

        public Criteria andHonoraryTitleGreaterThan(String value) {
            addCriterion("honorary_title >", value, "honoraryTitle");
            return (Criteria) this;
        }

        public Criteria andHonoraryTitleGreaterThanOrEqualTo(String value) {
            addCriterion("honorary_title >=", value, "honoraryTitle");
            return (Criteria) this;
        }

        public Criteria andHonoraryTitleLessThan(String value) {
            addCriterion("honorary_title <", value, "honoraryTitle");
            return (Criteria) this;
        }

        public Criteria andHonoraryTitleLessThanOrEqualTo(String value) {
            addCriterion("honorary_title <=", value, "honoraryTitle");
            return (Criteria) this;
        }

        public Criteria andHonoraryTitleLike(String value) {
            addCriterion("honorary_title like", value, "honoraryTitle");
            return (Criteria) this;
        }

        public Criteria andHonoraryTitleNotLike(String value) {
            addCriterion("honorary_title not like", value, "honoraryTitle");
            return (Criteria) this;
        }

        public Criteria andHonoraryTitleIn(List<String> values) {
            addCriterion("honorary_title in", values, "honoraryTitle");
            return (Criteria) this;
        }

        public Criteria andHonoraryTitleNotIn(List<String> values) {
            addCriterion("honorary_title not in", values, "honoraryTitle");
            return (Criteria) this;
        }

        public Criteria andHonoraryTitleBetween(String value1, String value2) {
            addCriterion("honorary_title between", value1, value2, "honoraryTitle");
            return (Criteria) this;
        }

        public Criteria andHonoraryTitleNotBetween(String value1, String value2) {
            addCriterion("honorary_title not between", value1, value2, "honoraryTitle");
            return (Criteria) this;
        }

        public Criteria andPlatformIdIsNull() {
            addCriterion("platform_id is null");
            return (Criteria) this;
        }

        public Criteria andPlatformIdIsNotNull() {
            addCriterion("platform_id is not null");
            return (Criteria) this;
        }

        public Criteria andPlatformIdEqualTo(Integer value) {
            addCriterion("platform_id =", value, "platformId");
            return (Criteria) this;
        }

        public Criteria andPlatformIdNotEqualTo(Integer value) {
            addCriterion("platform_id <>", value, "platformId");
            return (Criteria) this;
        }

        public Criteria andPlatformIdGreaterThan(Integer value) {
            addCriterion("platform_id >", value, "platformId");
            return (Criteria) this;
        }

        public Criteria andPlatformIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("platform_id >=", value, "platformId");
            return (Criteria) this;
        }

        public Criteria andPlatformIdLessThan(Integer value) {
            addCriterion("platform_id <", value, "platformId");
            return (Criteria) this;
        }

        public Criteria andPlatformIdLessThanOrEqualTo(Integer value) {
            addCriterion("platform_id <=", value, "platformId");
            return (Criteria) this;
        }

        public Criteria andPlatformIdIn(List<Integer> values) {
            addCriterion("platform_id in", values, "platformId");
            return (Criteria) this;
        }

        public Criteria andPlatformIdNotIn(List<Integer> values) {
            addCriterion("platform_id not in", values, "platformId");
            return (Criteria) this;
        }

        public Criteria andPlatformIdBetween(Integer value1, Integer value2) {
            addCriterion("platform_id between", value1, value2, "platformId");
            return (Criteria) this;
        }

        public Criteria andPlatformIdNotBetween(Integer value1, Integer value2) {
            addCriterion("platform_id not between", value1, value2, "platformId");
            return (Criteria) this;
        }

        public Criteria andInformationStatusIsNull() {
            addCriterion("information_status is null");
            return (Criteria) this;
        }

        public Criteria andInformationStatusIsNotNull() {
            addCriterion("information_status is not null");
            return (Criteria) this;
        }

        public Criteria andInformationStatusEqualTo(Integer value) {
            addCriterion("information_status =", value, "informationStatus");
            return (Criteria) this;
        }

        public Criteria andInformationStatusNotEqualTo(Integer value) {
            addCriterion("information_status <>", value, "informationStatus");
            return (Criteria) this;
        }

        public Criteria andInformationStatusGreaterThan(Integer value) {
            addCriterion("information_status >", value, "informationStatus");
            return (Criteria) this;
        }

        public Criteria andInformationStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("information_status >=", value, "informationStatus");
            return (Criteria) this;
        }

        public Criteria andInformationStatusLessThan(Integer value) {
            addCriterion("information_status <", value, "informationStatus");
            return (Criteria) this;
        }

        public Criteria andInformationStatusLessThanOrEqualTo(Integer value) {
            addCriterion("information_status <=", value, "informationStatus");
            return (Criteria) this;
        }

        public Criteria andInformationStatusIn(List<Integer> values) {
            addCriterion("information_status in", values, "informationStatus");
            return (Criteria) this;
        }

        public Criteria andInformationStatusNotIn(List<Integer> values) {
            addCriterion("information_status not in", values, "informationStatus");
            return (Criteria) this;
        }

        public Criteria andInformationStatusBetween(Integer value1, Integer value2) {
            addCriterion("information_status between", value1, value2, "informationStatus");
            return (Criteria) this;
        }

        public Criteria andInformationStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("information_status not between", value1, value2, "informationStatus");
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