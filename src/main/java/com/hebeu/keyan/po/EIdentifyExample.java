package com.hebeu.keyan.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EIdentifyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EIdentifyExample() {
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

        public Criteria andIdentifyIdIsNull() {
            addCriterion("identify_id is null");
            return (Criteria) this;
        }

        public Criteria andIdentifyIdIsNotNull() {
            addCriterion("identify_id is not null");
            return (Criteria) this;
        }

        public Criteria andIdentifyIdEqualTo(String value) {
            addCriterion("identify_id =", value, "identifyId");
            return (Criteria) this;
        }

        public Criteria andIdentifyIdNotEqualTo(String value) {
            addCriterion("identify_id <>", value, "identifyId");
            return (Criteria) this;
        }

        public Criteria andIdentifyIdGreaterThan(String value) {
            addCriterion("identify_id >", value, "identifyId");
            return (Criteria) this;
        }

        public Criteria andIdentifyIdGreaterThanOrEqualTo(String value) {
            addCriterion("identify_id >=", value, "identifyId");
            return (Criteria) this;
        }

        public Criteria andIdentifyIdLessThan(String value) {
            addCriterion("identify_id <", value, "identifyId");
            return (Criteria) this;
        }

        public Criteria andIdentifyIdLessThanOrEqualTo(String value) {
            addCriterion("identify_id <=", value, "identifyId");
            return (Criteria) this;
        }

        public Criteria andIdentifyIdLike(String value) {
            addCriterion("identify_id like", value, "identifyId");
            return (Criteria) this;
        }

        public Criteria andIdentifyIdNotLike(String value) {
            addCriterion("identify_id not like", value, "identifyId");
            return (Criteria) this;
        }

        public Criteria andIdentifyIdIn(List<String> values) {
            addCriterion("identify_id in", values, "identifyId");
            return (Criteria) this;
        }

        public Criteria andIdentifyIdNotIn(List<String> values) {
            addCriterion("identify_id not in", values, "identifyId");
            return (Criteria) this;
        }

        public Criteria andIdentifyIdBetween(String value1, String value2) {
            addCriterion("identify_id between", value1, value2, "identifyId");
            return (Criteria) this;
        }

        public Criteria andIdentifyIdNotBetween(String value1, String value2) {
            addCriterion("identify_id not between", value1, value2, "identifyId");
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

        public Criteria andProjectNameIsNull() {
            addCriterion("project_name is null");
            return (Criteria) this;
        }

        public Criteria andProjectNameIsNotNull() {
            addCriterion("project_name is not null");
            return (Criteria) this;
        }

        public Criteria andProjectNameEqualTo(String value) {
            addCriterion("project_name =", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameNotEqualTo(String value) {
            addCriterion("project_name <>", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameGreaterThan(String value) {
            addCriterion("project_name >", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameGreaterThanOrEqualTo(String value) {
            addCriterion("project_name >=", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameLessThan(String value) {
            addCriterion("project_name <", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameLessThanOrEqualTo(String value) {
            addCriterion("project_name <=", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameLike(String value) {
            addCriterion("project_name like", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameNotLike(String value) {
            addCriterion("project_name not like", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameIn(List<String> values) {
            addCriterion("project_name in", values, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameNotIn(List<String> values) {
            addCriterion("project_name not in", values, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameBetween(String value1, String value2) {
            addCriterion("project_name between", value1, value2, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameNotBetween(String value1, String value2) {
            addCriterion("project_name not between", value1, value2, "projectName");
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

        public Criteria andProjectNumberIsNull() {
            addCriterion("project_number is null");
            return (Criteria) this;
        }

        public Criteria andProjectNumberIsNotNull() {
            addCriterion("project_number is not null");
            return (Criteria) this;
        }

        public Criteria andProjectNumberEqualTo(String value) {
            addCriterion("project_number =", value, "projectNumber");
            return (Criteria) this;
        }

        public Criteria andProjectNumberNotEqualTo(String value) {
            addCriterion("project_number <>", value, "projectNumber");
            return (Criteria) this;
        }

        public Criteria andProjectNumberGreaterThan(String value) {
            addCriterion("project_number >", value, "projectNumber");
            return (Criteria) this;
        }

        public Criteria andProjectNumberGreaterThanOrEqualTo(String value) {
            addCriterion("project_number >=", value, "projectNumber");
            return (Criteria) this;
        }

        public Criteria andProjectNumberLessThan(String value) {
            addCriterion("project_number <", value, "projectNumber");
            return (Criteria) this;
        }

        public Criteria andProjectNumberLessThanOrEqualTo(String value) {
            addCriterion("project_number <=", value, "projectNumber");
            return (Criteria) this;
        }

        public Criteria andProjectNumberLike(String value) {
            addCriterion("project_number like", value, "projectNumber");
            return (Criteria) this;
        }

        public Criteria andProjectNumberNotLike(String value) {
            addCriterion("project_number not like", value, "projectNumber");
            return (Criteria) this;
        }

        public Criteria andProjectNumberIn(List<String> values) {
            addCriterion("project_number in", values, "projectNumber");
            return (Criteria) this;
        }

        public Criteria andProjectNumberNotIn(List<String> values) {
            addCriterion("project_number not in", values, "projectNumber");
            return (Criteria) this;
        }

        public Criteria andProjectNumberBetween(String value1, String value2) {
            addCriterion("project_number between", value1, value2, "projectNumber");
            return (Criteria) this;
        }

        public Criteria andProjectNumberNotBetween(String value1, String value2) {
            addCriterion("project_number not between", value1, value2, "projectNumber");
            return (Criteria) this;
        }

        public Criteria andProjectSourceIdIsNull() {
            addCriterion("project_source_id is null");
            return (Criteria) this;
        }

        public Criteria andProjectSourceIdIsNotNull() {
            addCriterion("project_source_id is not null");
            return (Criteria) this;
        }

        public Criteria andProjectSourceIdEqualTo(Integer value) {
            addCriterion("project_source_id =", value, "projectSourceId");
            return (Criteria) this;
        }

        public Criteria andProjectSourceIdNotEqualTo(Integer value) {
            addCriterion("project_source_id <>", value, "projectSourceId");
            return (Criteria) this;
        }

        public Criteria andProjectSourceIdGreaterThan(Integer value) {
            addCriterion("project_source_id >", value, "projectSourceId");
            return (Criteria) this;
        }

        public Criteria andProjectSourceIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("project_source_id >=", value, "projectSourceId");
            return (Criteria) this;
        }

        public Criteria andProjectSourceIdLessThan(Integer value) {
            addCriterion("project_source_id <", value, "projectSourceId");
            return (Criteria) this;
        }

        public Criteria andProjectSourceIdLessThanOrEqualTo(Integer value) {
            addCriterion("project_source_id <=", value, "projectSourceId");
            return (Criteria) this;
        }

        public Criteria andProjectSourceIdIn(List<Integer> values) {
            addCriterion("project_source_id in", values, "projectSourceId");
            return (Criteria) this;
        }

        public Criteria andProjectSourceIdNotIn(List<Integer> values) {
            addCriterion("project_source_id not in", values, "projectSourceId");
            return (Criteria) this;
        }

        public Criteria andProjectSourceIdBetween(Integer value1, Integer value2) {
            addCriterion("project_source_id between", value1, value2, "projectSourceId");
            return (Criteria) this;
        }

        public Criteria andProjectSourceIdNotBetween(Integer value1, Integer value2) {
            addCriterion("project_source_id not between", value1, value2, "projectSourceId");
            return (Criteria) this;
        }

        public Criteria andProjectType1IdIsNull() {
            addCriterion("project_type1_id is null");
            return (Criteria) this;
        }

        public Criteria andProjectType1IdIsNotNull() {
            addCriterion("project_type1_id is not null");
            return (Criteria) this;
        }

        public Criteria andProjectType1IdEqualTo(Integer value) {
            addCriterion("project_type1_id =", value, "projectType1Id");
            return (Criteria) this;
        }

        public Criteria andProjectType1IdNotEqualTo(Integer value) {
            addCriterion("project_type1_id <>", value, "projectType1Id");
            return (Criteria) this;
        }

        public Criteria andProjectType1IdGreaterThan(Integer value) {
            addCriterion("project_type1_id >", value, "projectType1Id");
            return (Criteria) this;
        }

        public Criteria andProjectType1IdGreaterThanOrEqualTo(Integer value) {
            addCriterion("project_type1_id >=", value, "projectType1Id");
            return (Criteria) this;
        }

        public Criteria andProjectType1IdLessThan(Integer value) {
            addCriterion("project_type1_id <", value, "projectType1Id");
            return (Criteria) this;
        }

        public Criteria andProjectType1IdLessThanOrEqualTo(Integer value) {
            addCriterion("project_type1_id <=", value, "projectType1Id");
            return (Criteria) this;
        }

        public Criteria andProjectType1IdIn(List<Integer> values) {
            addCriterion("project_type1_id in", values, "projectType1Id");
            return (Criteria) this;
        }

        public Criteria andProjectType1IdNotIn(List<Integer> values) {
            addCriterion("project_type1_id not in", values, "projectType1Id");
            return (Criteria) this;
        }

        public Criteria andProjectType1IdBetween(Integer value1, Integer value2) {
            addCriterion("project_type1_id between", value1, value2, "projectType1Id");
            return (Criteria) this;
        }

        public Criteria andProjectType1IdNotBetween(Integer value1, Integer value2) {
            addCriterion("project_type1_id not between", value1, value2, "projectType1Id");
            return (Criteria) this;
        }

        public Criteria andProjectType2IdIsNull() {
            addCriterion("project_type2_id is null");
            return (Criteria) this;
        }

        public Criteria andProjectType2IdIsNotNull() {
            addCriterion("project_type2_id is not null");
            return (Criteria) this;
        }

        public Criteria andProjectType2IdEqualTo(Integer value) {
            addCriterion("project_type2_id =", value, "projectType2Id");
            return (Criteria) this;
        }

        public Criteria andProjectType2IdNotEqualTo(Integer value) {
            addCriterion("project_type2_id <>", value, "projectType2Id");
            return (Criteria) this;
        }

        public Criteria andProjectType2IdGreaterThan(Integer value) {
            addCriterion("project_type2_id >", value, "projectType2Id");
            return (Criteria) this;
        }

        public Criteria andProjectType2IdGreaterThanOrEqualTo(Integer value) {
            addCriterion("project_type2_id >=", value, "projectType2Id");
            return (Criteria) this;
        }

        public Criteria andProjectType2IdLessThan(Integer value) {
            addCriterion("project_type2_id <", value, "projectType2Id");
            return (Criteria) this;
        }

        public Criteria andProjectType2IdLessThanOrEqualTo(Integer value) {
            addCriterion("project_type2_id <=", value, "projectType2Id");
            return (Criteria) this;
        }

        public Criteria andProjectType2IdIn(List<Integer> values) {
            addCriterion("project_type2_id in", values, "projectType2Id");
            return (Criteria) this;
        }

        public Criteria andProjectType2IdNotIn(List<Integer> values) {
            addCriterion("project_type2_id not in", values, "projectType2Id");
            return (Criteria) this;
        }

        public Criteria andProjectType2IdBetween(Integer value1, Integer value2) {
            addCriterion("project_type2_id between", value1, value2, "projectType2Id");
            return (Criteria) this;
        }

        public Criteria andProjectType2IdNotBetween(Integer value1, Integer value2) {
            addCriterion("project_type2_id not between", value1, value2, "projectType2Id");
            return (Criteria) this;
        }

        public Criteria andStartDateIsNull() {
            addCriterion("start_date is null");
            return (Criteria) this;
        }

        public Criteria andStartDateIsNotNull() {
            addCriterion("start_date is not null");
            return (Criteria) this;
        }

        public Criteria andStartDateEqualTo(Date value) {
            addCriterion("start_date =", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotEqualTo(Date value) {
            addCriterion("start_date <>", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateGreaterThan(Date value) {
            addCriterion("start_date >", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateGreaterThanOrEqualTo(Date value) {
            addCriterion("start_date >=", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateLessThan(Date value) {
            addCriterion("start_date <", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateLessThanOrEqualTo(Date value) {
            addCriterion("start_date <=", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateIn(List<Date> values) {
            addCriterion("start_date in", values, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotIn(List<Date> values) {
            addCriterion("start_date not in", values, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateBetween(Date value1, Date value2) {
            addCriterion("start_date between", value1, value2, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotBetween(Date value1, Date value2) {
            addCriterion("start_date not between", value1, value2, "startDate");
            return (Criteria) this;
        }

        public Criteria andExpectEndDateIsNull() {
            addCriterion("expect_end_date is null");
            return (Criteria) this;
        }

        public Criteria andExpectEndDateIsNotNull() {
            addCriterion("expect_end_date is not null");
            return (Criteria) this;
        }

        public Criteria andExpectEndDateEqualTo(Date value) {
            addCriterion("expect_end_date =", value, "expectEndDate");
            return (Criteria) this;
        }

        public Criteria andExpectEndDateNotEqualTo(Date value) {
            addCriterion("expect_end_date <>", value, "expectEndDate");
            return (Criteria) this;
        }

        public Criteria andExpectEndDateGreaterThan(Date value) {
            addCriterion("expect_end_date >", value, "expectEndDate");
            return (Criteria) this;
        }

        public Criteria andExpectEndDateGreaterThanOrEqualTo(Date value) {
            addCriterion("expect_end_date >=", value, "expectEndDate");
            return (Criteria) this;
        }

        public Criteria andExpectEndDateLessThan(Date value) {
            addCriterion("expect_end_date <", value, "expectEndDate");
            return (Criteria) this;
        }

        public Criteria andExpectEndDateLessThanOrEqualTo(Date value) {
            addCriterion("expect_end_date <=", value, "expectEndDate");
            return (Criteria) this;
        }

        public Criteria andExpectEndDateIn(List<Date> values) {
            addCriterion("expect_end_date in", values, "expectEndDate");
            return (Criteria) this;
        }

        public Criteria andExpectEndDateNotIn(List<Date> values) {
            addCriterion("expect_end_date not in", values, "expectEndDate");
            return (Criteria) this;
        }

        public Criteria andExpectEndDateBetween(Date value1, Date value2) {
            addCriterion("expect_end_date between", value1, value2, "expectEndDate");
            return (Criteria) this;
        }

        public Criteria andExpectEndDateNotBetween(Date value1, Date value2) {
            addCriterion("expect_end_date not between", value1, value2, "expectEndDate");
            return (Criteria) this;
        }

        public Criteria andResultFormIsNull() {
            addCriterion("result_form is null");
            return (Criteria) this;
        }

        public Criteria andResultFormIsNotNull() {
            addCriterion("result_form is not null");
            return (Criteria) this;
        }

        public Criteria andResultFormEqualTo(String value) {
            addCriterion("result_form =", value, "resultForm");
            return (Criteria) this;
        }

        public Criteria andResultFormNotEqualTo(String value) {
            addCriterion("result_form <>", value, "resultForm");
            return (Criteria) this;
        }

        public Criteria andResultFormGreaterThan(String value) {
            addCriterion("result_form >", value, "resultForm");
            return (Criteria) this;
        }

        public Criteria andResultFormGreaterThanOrEqualTo(String value) {
            addCriterion("result_form >=", value, "resultForm");
            return (Criteria) this;
        }

        public Criteria andResultFormLessThan(String value) {
            addCriterion("result_form <", value, "resultForm");
            return (Criteria) this;
        }

        public Criteria andResultFormLessThanOrEqualTo(String value) {
            addCriterion("result_form <=", value, "resultForm");
            return (Criteria) this;
        }

        public Criteria andResultFormLike(String value) {
            addCriterion("result_form like", value, "resultForm");
            return (Criteria) this;
        }

        public Criteria andResultFormNotLike(String value) {
            addCriterion("result_form not like", value, "resultForm");
            return (Criteria) this;
        }

        public Criteria andResultFormIn(List<String> values) {
            addCriterion("result_form in", values, "resultForm");
            return (Criteria) this;
        }

        public Criteria andResultFormNotIn(List<String> values) {
            addCriterion("result_form not in", values, "resultForm");
            return (Criteria) this;
        }

        public Criteria andResultFormBetween(String value1, String value2) {
            addCriterion("result_form between", value1, value2, "resultForm");
            return (Criteria) this;
        }

        public Criteria andResultFormNotBetween(String value1, String value2) {
            addCriterion("result_form not between", value1, value2, "resultForm");
            return (Criteria) this;
        }

        public Criteria andResultLevelIdIsNull() {
            addCriterion("result_level_id is null");
            return (Criteria) this;
        }

        public Criteria andResultLevelIdIsNotNull() {
            addCriterion("result_level_id is not null");
            return (Criteria) this;
        }

        public Criteria andResultLevelIdEqualTo(Integer value) {
            addCriterion("result_level_id =", value, "resultLevelId");
            return (Criteria) this;
        }

        public Criteria andResultLevelIdNotEqualTo(Integer value) {
            addCriterion("result_level_id <>", value, "resultLevelId");
            return (Criteria) this;
        }

        public Criteria andResultLevelIdGreaterThan(Integer value) {
            addCriterion("result_level_id >", value, "resultLevelId");
            return (Criteria) this;
        }

        public Criteria andResultLevelIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("result_level_id >=", value, "resultLevelId");
            return (Criteria) this;
        }

        public Criteria andResultLevelIdLessThan(Integer value) {
            addCriterion("result_level_id <", value, "resultLevelId");
            return (Criteria) this;
        }

        public Criteria andResultLevelIdLessThanOrEqualTo(Integer value) {
            addCriterion("result_level_id <=", value, "resultLevelId");
            return (Criteria) this;
        }

        public Criteria andResultLevelIdIn(List<Integer> values) {
            addCriterion("result_level_id in", values, "resultLevelId");
            return (Criteria) this;
        }

        public Criteria andResultLevelIdNotIn(List<Integer> values) {
            addCriterion("result_level_id not in", values, "resultLevelId");
            return (Criteria) this;
        }

        public Criteria andResultLevelIdBetween(Integer value1, Integer value2) {
            addCriterion("result_level_id between", value1, value2, "resultLevelId");
            return (Criteria) this;
        }

        public Criteria andResultLevelIdNotBetween(Integer value1, Integer value2) {
            addCriterion("result_level_id not between", value1, value2, "resultLevelId");
            return (Criteria) this;
        }

        public Criteria andIdentifyUnitIsNull() {
            addCriterion("identify_unit is null");
            return (Criteria) this;
        }

        public Criteria andIdentifyUnitIsNotNull() {
            addCriterion("identify_unit is not null");
            return (Criteria) this;
        }

        public Criteria andIdentifyUnitEqualTo(String value) {
            addCriterion("identify_unit =", value, "identifyUnit");
            return (Criteria) this;
        }

        public Criteria andIdentifyUnitNotEqualTo(String value) {
            addCriterion("identify_unit <>", value, "identifyUnit");
            return (Criteria) this;
        }

        public Criteria andIdentifyUnitGreaterThan(String value) {
            addCriterion("identify_unit >", value, "identifyUnit");
            return (Criteria) this;
        }

        public Criteria andIdentifyUnitGreaterThanOrEqualTo(String value) {
            addCriterion("identify_unit >=", value, "identifyUnit");
            return (Criteria) this;
        }

        public Criteria andIdentifyUnitLessThan(String value) {
            addCriterion("identify_unit <", value, "identifyUnit");
            return (Criteria) this;
        }

        public Criteria andIdentifyUnitLessThanOrEqualTo(String value) {
            addCriterion("identify_unit <=", value, "identifyUnit");
            return (Criteria) this;
        }

        public Criteria andIdentifyUnitLike(String value) {
            addCriterion("identify_unit like", value, "identifyUnit");
            return (Criteria) this;
        }

        public Criteria andIdentifyUnitNotLike(String value) {
            addCriterion("identify_unit not like", value, "identifyUnit");
            return (Criteria) this;
        }

        public Criteria andIdentifyUnitIn(List<String> values) {
            addCriterion("identify_unit in", values, "identifyUnit");
            return (Criteria) this;
        }

        public Criteria andIdentifyUnitNotIn(List<String> values) {
            addCriterion("identify_unit not in", values, "identifyUnit");
            return (Criteria) this;
        }

        public Criteria andIdentifyUnitBetween(String value1, String value2) {
            addCriterion("identify_unit between", value1, value2, "identifyUnit");
            return (Criteria) this;
        }

        public Criteria andIdentifyUnitNotBetween(String value1, String value2) {
            addCriterion("identify_unit not between", value1, value2, "identifyUnit");
            return (Criteria) this;
        }

        public Criteria andFormIdIsNull() {
            addCriterion("form_id is null");
            return (Criteria) this;
        }

        public Criteria andFormIdIsNotNull() {
            addCriterion("form_id is not null");
            return (Criteria) this;
        }

        public Criteria andFormIdEqualTo(Integer value) {
            addCriterion("form_id =", value, "formId");
            return (Criteria) this;
        }

        public Criteria andFormIdNotEqualTo(Integer value) {
            addCriterion("form_id <>", value, "formId");
            return (Criteria) this;
        }

        public Criteria andFormIdGreaterThan(Integer value) {
            addCriterion("form_id >", value, "formId");
            return (Criteria) this;
        }

        public Criteria andFormIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("form_id >=", value, "formId");
            return (Criteria) this;
        }

        public Criteria andFormIdLessThan(Integer value) {
            addCriterion("form_id <", value, "formId");
            return (Criteria) this;
        }

        public Criteria andFormIdLessThanOrEqualTo(Integer value) {
            addCriterion("form_id <=", value, "formId");
            return (Criteria) this;
        }

        public Criteria andFormIdIn(List<Integer> values) {
            addCriterion("form_id in", values, "formId");
            return (Criteria) this;
        }

        public Criteria andFormIdNotIn(List<Integer> values) {
            addCriterion("form_id not in", values, "formId");
            return (Criteria) this;
        }

        public Criteria andFormIdBetween(Integer value1, Integer value2) {
            addCriterion("form_id between", value1, value2, "formId");
            return (Criteria) this;
        }

        public Criteria andFormIdNotBetween(Integer value1, Integer value2) {
            addCriterion("form_id not between", value1, value2, "formId");
            return (Criteria) this;
        }

        public Criteria andIdentifyDateIsNull() {
            addCriterion("identify_date is null");
            return (Criteria) this;
        }

        public Criteria andIdentifyDateIsNotNull() {
            addCriterion("identify_date is not null");
            return (Criteria) this;
        }

        public Criteria andIdentifyDateEqualTo(Date value) {
            addCriterion("identify_date =", value, "identifyDate");
            return (Criteria) this;
        }

        public Criteria andIdentifyDateNotEqualTo(Date value) {
            addCriterion("identify_date <>", value, "identifyDate");
            return (Criteria) this;
        }

        public Criteria andIdentifyDateGreaterThan(Date value) {
            addCriterion("identify_date >", value, "identifyDate");
            return (Criteria) this;
        }

        public Criteria andIdentifyDateGreaterThanOrEqualTo(Date value) {
            addCriterion("identify_date >=", value, "identifyDate");
            return (Criteria) this;
        }

        public Criteria andIdentifyDateLessThan(Date value) {
            addCriterion("identify_date <", value, "identifyDate");
            return (Criteria) this;
        }

        public Criteria andIdentifyDateLessThanOrEqualTo(Date value) {
            addCriterion("identify_date <=", value, "identifyDate");
            return (Criteria) this;
        }

        public Criteria andIdentifyDateIn(List<Date> values) {
            addCriterion("identify_date in", values, "identifyDate");
            return (Criteria) this;
        }

        public Criteria andIdentifyDateNotIn(List<Date> values) {
            addCriterion("identify_date not in", values, "identifyDate");
            return (Criteria) this;
        }

        public Criteria andIdentifyDateBetween(Date value1, Date value2) {
            addCriterion("identify_date between", value1, value2, "identifyDate");
            return (Criteria) this;
        }

        public Criteria andIdentifyDateNotBetween(Date value1, Date value2) {
            addCriterion("identify_date not between", value1, value2, "identifyDate");
            return (Criteria) this;
        }

        public Criteria andIdenLevelIdIsNull() {
            addCriterion("iden_level_id is null");
            return (Criteria) this;
        }

        public Criteria andIdenLevelIdIsNotNull() {
            addCriterion("iden_level_id is not null");
            return (Criteria) this;
        }

        public Criteria andIdenLevelIdEqualTo(Integer value) {
            addCriterion("iden_level_id =", value, "idenLevelId");
            return (Criteria) this;
        }

        public Criteria andIdenLevelIdNotEqualTo(Integer value) {
            addCriterion("iden_level_id <>", value, "idenLevelId");
            return (Criteria) this;
        }

        public Criteria andIdenLevelIdGreaterThan(Integer value) {
            addCriterion("iden_level_id >", value, "idenLevelId");
            return (Criteria) this;
        }

        public Criteria andIdenLevelIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("iden_level_id >=", value, "idenLevelId");
            return (Criteria) this;
        }

        public Criteria andIdenLevelIdLessThan(Integer value) {
            addCriterion("iden_level_id <", value, "idenLevelId");
            return (Criteria) this;
        }

        public Criteria andIdenLevelIdLessThanOrEqualTo(Integer value) {
            addCriterion("iden_level_id <=", value, "idenLevelId");
            return (Criteria) this;
        }

        public Criteria andIdenLevelIdIn(List<Integer> values) {
            addCriterion("iden_level_id in", values, "idenLevelId");
            return (Criteria) this;
        }

        public Criteria andIdenLevelIdNotIn(List<Integer> values) {
            addCriterion("iden_level_id not in", values, "idenLevelId");
            return (Criteria) this;
        }

        public Criteria andIdenLevelIdBetween(Integer value1, Integer value2) {
            addCriterion("iden_level_id between", value1, value2, "idenLevelId");
            return (Criteria) this;
        }

        public Criteria andIdenLevelIdNotBetween(Integer value1, Integer value2) {
            addCriterion("iden_level_id not between", value1, value2, "idenLevelId");
            return (Criteria) this;
        }

        public Criteria andIdenCertificateNumIsNull() {
            addCriterion("iden_certificate_num is null");
            return (Criteria) this;
        }

        public Criteria andIdenCertificateNumIsNotNull() {
            addCriterion("iden_certificate_num is not null");
            return (Criteria) this;
        }

        public Criteria andIdenCertificateNumEqualTo(String value) {
            addCriterion("iden_certificate_num =", value, "idenCertificateNum");
            return (Criteria) this;
        }

        public Criteria andIdenCertificateNumNotEqualTo(String value) {
            addCriterion("iden_certificate_num <>", value, "idenCertificateNum");
            return (Criteria) this;
        }

        public Criteria andIdenCertificateNumGreaterThan(String value) {
            addCriterion("iden_certificate_num >", value, "idenCertificateNum");
            return (Criteria) this;
        }

        public Criteria andIdenCertificateNumGreaterThanOrEqualTo(String value) {
            addCriterion("iden_certificate_num >=", value, "idenCertificateNum");
            return (Criteria) this;
        }

        public Criteria andIdenCertificateNumLessThan(String value) {
            addCriterion("iden_certificate_num <", value, "idenCertificateNum");
            return (Criteria) this;
        }

        public Criteria andIdenCertificateNumLessThanOrEqualTo(String value) {
            addCriterion("iden_certificate_num <=", value, "idenCertificateNum");
            return (Criteria) this;
        }

        public Criteria andIdenCertificateNumLike(String value) {
            addCriterion("iden_certificate_num like", value, "idenCertificateNum");
            return (Criteria) this;
        }

        public Criteria andIdenCertificateNumNotLike(String value) {
            addCriterion("iden_certificate_num not like", value, "idenCertificateNum");
            return (Criteria) this;
        }

        public Criteria andIdenCertificateNumIn(List<String> values) {
            addCriterion("iden_certificate_num in", values, "idenCertificateNum");
            return (Criteria) this;
        }

        public Criteria andIdenCertificateNumNotIn(List<String> values) {
            addCriterion("iden_certificate_num not in", values, "idenCertificateNum");
            return (Criteria) this;
        }

        public Criteria andIdenCertificateNumBetween(String value1, String value2) {
            addCriterion("iden_certificate_num between", value1, value2, "idenCertificateNum");
            return (Criteria) this;
        }

        public Criteria andIdenCertificateNumNotBetween(String value1, String value2) {
            addCriterion("iden_certificate_num not between", value1, value2, "idenCertificateNum");
            return (Criteria) this;
        }

        public Criteria andFinishUnitIsNull() {
            addCriterion("finish_unit is null");
            return (Criteria) this;
        }

        public Criteria andFinishUnitIsNotNull() {
            addCriterion("finish_unit is not null");
            return (Criteria) this;
        }

        public Criteria andFinishUnitEqualTo(String value) {
            addCriterion("finish_unit =", value, "finishUnit");
            return (Criteria) this;
        }

        public Criteria andFinishUnitNotEqualTo(String value) {
            addCriterion("finish_unit <>", value, "finishUnit");
            return (Criteria) this;
        }

        public Criteria andFinishUnitGreaterThan(String value) {
            addCriterion("finish_unit >", value, "finishUnit");
            return (Criteria) this;
        }

        public Criteria andFinishUnitGreaterThanOrEqualTo(String value) {
            addCriterion("finish_unit >=", value, "finishUnit");
            return (Criteria) this;
        }

        public Criteria andFinishUnitLessThan(String value) {
            addCriterion("finish_unit <", value, "finishUnit");
            return (Criteria) this;
        }

        public Criteria andFinishUnitLessThanOrEqualTo(String value) {
            addCriterion("finish_unit <=", value, "finishUnit");
            return (Criteria) this;
        }

        public Criteria andFinishUnitLike(String value) {
            addCriterion("finish_unit like", value, "finishUnit");
            return (Criteria) this;
        }

        public Criteria andFinishUnitNotLike(String value) {
            addCriterion("finish_unit not like", value, "finishUnit");
            return (Criteria) this;
        }

        public Criteria andFinishUnitIn(List<String> values) {
            addCriterion("finish_unit in", values, "finishUnit");
            return (Criteria) this;
        }

        public Criteria andFinishUnitNotIn(List<String> values) {
            addCriterion("finish_unit not in", values, "finishUnit");
            return (Criteria) this;
        }

        public Criteria andFinishUnitBetween(String value1, String value2) {
            addCriterion("finish_unit between", value1, value2, "finishUnit");
            return (Criteria) this;
        }

        public Criteria andFinishUnitNotBetween(String value1, String value2) {
            addCriterion("finish_unit not between", value1, value2, "finishUnit");
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