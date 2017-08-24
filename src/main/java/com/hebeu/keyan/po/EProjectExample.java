package com.hebeu.keyan.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EProjectExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EProjectExample() {
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

        public Criteria andProjectIdIsNull() {
            addCriterion("project_id is null");
            return (Criteria) this;
        }

        public Criteria andProjectIdIsNotNull() {
            addCriterion("project_id is not null");
            return (Criteria) this;
        }

        public Criteria andProjectIdEqualTo(String value) {
            addCriterion("project_id =", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotEqualTo(String value) {
            addCriterion("project_id <>", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdGreaterThan(String value) {
            addCriterion("project_id >", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdGreaterThanOrEqualTo(String value) {
            addCriterion("project_id >=", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdLessThan(String value) {
            addCriterion("project_id <", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdLessThanOrEqualTo(String value) {
            addCriterion("project_id <=", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdLike(String value) {
            addCriterion("project_id like", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotLike(String value) {
            addCriterion("project_id not like", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdIn(List<String> values) {
            addCriterion("project_id in", values, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotIn(List<String> values) {
            addCriterion("project_id not in", values, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdBetween(String value1, String value2) {
            addCriterion("project_id between", value1, value2, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotBetween(String value1, String value2) {
            addCriterion("project_id not between", value1, value2, "projectId");
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

        public Criteria andApproveDateIsNull() {
            addCriterion("approve_date is null");
            return (Criteria) this;
        }

        public Criteria andApproveDateIsNotNull() {
            addCriterion("approve_date is not null");
            return (Criteria) this;
        }

        public Criteria andApproveDateEqualTo(Date value) {
            addCriterion("approve_date =", value, "approveDate");
            return (Criteria) this;
        }

        public Criteria andApproveDateNotEqualTo(Date value) {
            addCriterion("approve_date <>", value, "approveDate");
            return (Criteria) this;
        }

        public Criteria andApproveDateGreaterThan(Date value) {
            addCriterion("approve_date >", value, "approveDate");
            return (Criteria) this;
        }

        public Criteria andApproveDateGreaterThanOrEqualTo(Date value) {
            addCriterion("approve_date >=", value, "approveDate");
            return (Criteria) this;
        }

        public Criteria andApproveDateLessThan(Date value) {
            addCriterion("approve_date <", value, "approveDate");
            return (Criteria) this;
        }

        public Criteria andApproveDateLessThanOrEqualTo(Date value) {
            addCriterion("approve_date <=", value, "approveDate");
            return (Criteria) this;
        }

        public Criteria andApproveDateIn(List<Date> values) {
            addCriterion("approve_date in", values, "approveDate");
            return (Criteria) this;
        }

        public Criteria andApproveDateNotIn(List<Date> values) {
            addCriterion("approve_date not in", values, "approveDate");
            return (Criteria) this;
        }

        public Criteria andApproveDateBetween(Date value1, Date value2) {
            addCriterion("approve_date between", value1, value2, "approveDate");
            return (Criteria) this;
        }

        public Criteria andApproveDateNotBetween(Date value1, Date value2) {
            addCriterion("approve_date not between", value1, value2, "approveDate");
            return (Criteria) this;
        }

        public Criteria andResearchTypeIdIsNull() {
            addCriterion("research_type_id is null");
            return (Criteria) this;
        }

        public Criteria andResearchTypeIdIsNotNull() {
            addCriterion("research_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andResearchTypeIdEqualTo(Integer value) {
            addCriterion("research_type_id =", value, "researchTypeId");
            return (Criteria) this;
        }

        public Criteria andResearchTypeIdNotEqualTo(Integer value) {
            addCriterion("research_type_id <>", value, "researchTypeId");
            return (Criteria) this;
        }

        public Criteria andResearchTypeIdGreaterThan(Integer value) {
            addCriterion("research_type_id >", value, "researchTypeId");
            return (Criteria) this;
        }

        public Criteria andResearchTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("research_type_id >=", value, "researchTypeId");
            return (Criteria) this;
        }

        public Criteria andResearchTypeIdLessThan(Integer value) {
            addCriterion("research_type_id <", value, "researchTypeId");
            return (Criteria) this;
        }

        public Criteria andResearchTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("research_type_id <=", value, "researchTypeId");
            return (Criteria) this;
        }

        public Criteria andResearchTypeIdIn(List<Integer> values) {
            addCriterion("research_type_id in", values, "researchTypeId");
            return (Criteria) this;
        }

        public Criteria andResearchTypeIdNotIn(List<Integer> values) {
            addCriterion("research_type_id not in", values, "researchTypeId");
            return (Criteria) this;
        }

        public Criteria andResearchTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("research_type_id between", value1, value2, "researchTypeId");
            return (Criteria) this;
        }

        public Criteria andResearchTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("research_type_id not between", value1, value2, "researchTypeId");
            return (Criteria) this;
        }

        public Criteria andCooperationTypeIdIsNull() {
            addCriterion("cooperation_type_id is null");
            return (Criteria) this;
        }

        public Criteria andCooperationTypeIdIsNotNull() {
            addCriterion("cooperation_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andCooperationTypeIdEqualTo(Integer value) {
            addCriterion("cooperation_type_id =", value, "cooperationTypeId");
            return (Criteria) this;
        }

        public Criteria andCooperationTypeIdNotEqualTo(Integer value) {
            addCriterion("cooperation_type_id <>", value, "cooperationTypeId");
            return (Criteria) this;
        }

        public Criteria andCooperationTypeIdGreaterThan(Integer value) {
            addCriterion("cooperation_type_id >", value, "cooperationTypeId");
            return (Criteria) this;
        }

        public Criteria andCooperationTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("cooperation_type_id >=", value, "cooperationTypeId");
            return (Criteria) this;
        }

        public Criteria andCooperationTypeIdLessThan(Integer value) {
            addCriterion("cooperation_type_id <", value, "cooperationTypeId");
            return (Criteria) this;
        }

        public Criteria andCooperationTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("cooperation_type_id <=", value, "cooperationTypeId");
            return (Criteria) this;
        }

        public Criteria andCooperationTypeIdIn(List<Integer> values) {
            addCriterion("cooperation_type_id in", values, "cooperationTypeId");
            return (Criteria) this;
        }

        public Criteria andCooperationTypeIdNotIn(List<Integer> values) {
            addCriterion("cooperation_type_id not in", values, "cooperationTypeId");
            return (Criteria) this;
        }

        public Criteria andCooperationTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("cooperation_type_id between", value1, value2, "cooperationTypeId");
            return (Criteria) this;
        }

        public Criteria andCooperationTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("cooperation_type_id not between", value1, value2, "cooperationTypeId");
            return (Criteria) this;
        }

        public Criteria andEconomicsTargetIdIsNull() {
            addCriterion("economics_target_id is null");
            return (Criteria) this;
        }

        public Criteria andEconomicsTargetIdIsNotNull() {
            addCriterion("economics_target_id is not null");
            return (Criteria) this;
        }

        public Criteria andEconomicsTargetIdEqualTo(Integer value) {
            addCriterion("economics_target_id =", value, "economicsTargetId");
            return (Criteria) this;
        }

        public Criteria andEconomicsTargetIdNotEqualTo(Integer value) {
            addCriterion("economics_target_id <>", value, "economicsTargetId");
            return (Criteria) this;
        }

        public Criteria andEconomicsTargetIdGreaterThan(Integer value) {
            addCriterion("economics_target_id >", value, "economicsTargetId");
            return (Criteria) this;
        }

        public Criteria andEconomicsTargetIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("economics_target_id >=", value, "economicsTargetId");
            return (Criteria) this;
        }

        public Criteria andEconomicsTargetIdLessThan(Integer value) {
            addCriterion("economics_target_id <", value, "economicsTargetId");
            return (Criteria) this;
        }

        public Criteria andEconomicsTargetIdLessThanOrEqualTo(Integer value) {
            addCriterion("economics_target_id <=", value, "economicsTargetId");
            return (Criteria) this;
        }

        public Criteria andEconomicsTargetIdIn(List<Integer> values) {
            addCriterion("economics_target_id in", values, "economicsTargetId");
            return (Criteria) this;
        }

        public Criteria andEconomicsTargetIdNotIn(List<Integer> values) {
            addCriterion("economics_target_id not in", values, "economicsTargetId");
            return (Criteria) this;
        }

        public Criteria andEconomicsTargetIdBetween(Integer value1, Integer value2) {
            addCriterion("economics_target_id between", value1, value2, "economicsTargetId");
            return (Criteria) this;
        }

        public Criteria andEconomicsTargetIdNotBetween(Integer value1, Integer value2) {
            addCriterion("economics_target_id not between", value1, value2, "economicsTargetId");
            return (Criteria) this;
        }

        public Criteria andOrganizationFormIdIsNull() {
            addCriterion("organization_form_id is null");
            return (Criteria) this;
        }

        public Criteria andOrganizationFormIdIsNotNull() {
            addCriterion("organization_form_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrganizationFormIdEqualTo(Integer value) {
            addCriterion("organization_form_id =", value, "organizationFormId");
            return (Criteria) this;
        }

        public Criteria andOrganizationFormIdNotEqualTo(Integer value) {
            addCriterion("organization_form_id <>", value, "organizationFormId");
            return (Criteria) this;
        }

        public Criteria andOrganizationFormIdGreaterThan(Integer value) {
            addCriterion("organization_form_id >", value, "organizationFormId");
            return (Criteria) this;
        }

        public Criteria andOrganizationFormIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("organization_form_id >=", value, "organizationFormId");
            return (Criteria) this;
        }

        public Criteria andOrganizationFormIdLessThan(Integer value) {
            addCriterion("organization_form_id <", value, "organizationFormId");
            return (Criteria) this;
        }

        public Criteria andOrganizationFormIdLessThanOrEqualTo(Integer value) {
            addCriterion("organization_form_id <=", value, "organizationFormId");
            return (Criteria) this;
        }

        public Criteria andOrganizationFormIdIn(List<Integer> values) {
            addCriterion("organization_form_id in", values, "organizationFormId");
            return (Criteria) this;
        }

        public Criteria andOrganizationFormIdNotIn(List<Integer> values) {
            addCriterion("organization_form_id not in", values, "organizationFormId");
            return (Criteria) this;
        }

        public Criteria andOrganizationFormIdBetween(Integer value1, Integer value2) {
            addCriterion("organization_form_id between", value1, value2, "organizationFormId");
            return (Criteria) this;
        }

        public Criteria andOrganizationFormIdNotBetween(Integer value1, Integer value2) {
            addCriterion("organization_form_id not between", value1, value2, "organizationFormId");
            return (Criteria) this;
        }

        public Criteria andCooperationUnitIsNull() {
            addCriterion("cooperation_unit is null");
            return (Criteria) this;
        }

        public Criteria andCooperationUnitIsNotNull() {
            addCriterion("cooperation_unit is not null");
            return (Criteria) this;
        }

        public Criteria andCooperationUnitEqualTo(String value) {
            addCriterion("cooperation_unit =", value, "cooperationUnit");
            return (Criteria) this;
        }

        public Criteria andCooperationUnitNotEqualTo(String value) {
            addCriterion("cooperation_unit <>", value, "cooperationUnit");
            return (Criteria) this;
        }

        public Criteria andCooperationUnitGreaterThan(String value) {
            addCriterion("cooperation_unit >", value, "cooperationUnit");
            return (Criteria) this;
        }

        public Criteria andCooperationUnitGreaterThanOrEqualTo(String value) {
            addCriterion("cooperation_unit >=", value, "cooperationUnit");
            return (Criteria) this;
        }

        public Criteria andCooperationUnitLessThan(String value) {
            addCriterion("cooperation_unit <", value, "cooperationUnit");
            return (Criteria) this;
        }

        public Criteria andCooperationUnitLessThanOrEqualTo(String value) {
            addCriterion("cooperation_unit <=", value, "cooperationUnit");
            return (Criteria) this;
        }

        public Criteria andCooperationUnitLike(String value) {
            addCriterion("cooperation_unit like", value, "cooperationUnit");
            return (Criteria) this;
        }

        public Criteria andCooperationUnitNotLike(String value) {
            addCriterion("cooperation_unit not like", value, "cooperationUnit");
            return (Criteria) this;
        }

        public Criteria andCooperationUnitIn(List<String> values) {
            addCriterion("cooperation_unit in", values, "cooperationUnit");
            return (Criteria) this;
        }

        public Criteria andCooperationUnitNotIn(List<String> values) {
            addCriterion("cooperation_unit not in", values, "cooperationUnit");
            return (Criteria) this;
        }

        public Criteria andCooperationUnitBetween(String value1, String value2) {
            addCriterion("cooperation_unit between", value1, value2, "cooperationUnit");
            return (Criteria) this;
        }

        public Criteria andCooperationUnitNotBetween(String value1, String value2) {
            addCriterion("cooperation_unit not between", value1, value2, "cooperationUnit");
            return (Criteria) this;
        }

        public Criteria andEconomicsIndustry1IdIsNull() {
            addCriterion("economics_industry1_id is null");
            return (Criteria) this;
        }

        public Criteria andEconomicsIndustry1IdIsNotNull() {
            addCriterion("economics_industry1_id is not null");
            return (Criteria) this;
        }

        public Criteria andEconomicsIndustry1IdEqualTo(String value) {
            addCriterion("economics_industry1_id =", value, "economicsIndustry1Id");
            return (Criteria) this;
        }

        public Criteria andEconomicsIndustry1IdNotEqualTo(String value) {
            addCriterion("economics_industry1_id <>", value, "economicsIndustry1Id");
            return (Criteria) this;
        }

        public Criteria andEconomicsIndustry1IdGreaterThan(String value) {
            addCriterion("economics_industry1_id >", value, "economicsIndustry1Id");
            return (Criteria) this;
        }

        public Criteria andEconomicsIndustry1IdGreaterThanOrEqualTo(String value) {
            addCriterion("economics_industry1_id >=", value, "economicsIndustry1Id");
            return (Criteria) this;
        }

        public Criteria andEconomicsIndustry1IdLessThan(String value) {
            addCriterion("economics_industry1_id <", value, "economicsIndustry1Id");
            return (Criteria) this;
        }

        public Criteria andEconomicsIndustry1IdLessThanOrEqualTo(String value) {
            addCriterion("economics_industry1_id <=", value, "economicsIndustry1Id");
            return (Criteria) this;
        }

        public Criteria andEconomicsIndustry1IdLike(String value) {
            addCriterion("economics_industry1_id like", value, "economicsIndustry1Id");
            return (Criteria) this;
        }

        public Criteria andEconomicsIndustry1IdNotLike(String value) {
            addCriterion("economics_industry1_id not like", value, "economicsIndustry1Id");
            return (Criteria) this;
        }

        public Criteria andEconomicsIndustry1IdIn(List<String> values) {
            addCriterion("economics_industry1_id in", values, "economicsIndustry1Id");
            return (Criteria) this;
        }

        public Criteria andEconomicsIndustry1IdNotIn(List<String> values) {
            addCriterion("economics_industry1_id not in", values, "economicsIndustry1Id");
            return (Criteria) this;
        }

        public Criteria andEconomicsIndustry1IdBetween(String value1, String value2) {
            addCriterion("economics_industry1_id between", value1, value2, "economicsIndustry1Id");
            return (Criteria) this;
        }

        public Criteria andEconomicsIndustry1IdNotBetween(String value1, String value2) {
            addCriterion("economics_industry1_id not between", value1, value2, "economicsIndustry1Id");
            return (Criteria) this;
        }

        public Criteria andEconomicsIndustry2IdIsNull() {
            addCriterion("economics_industry2_id is null");
            return (Criteria) this;
        }

        public Criteria andEconomicsIndustry2IdIsNotNull() {
            addCriterion("economics_industry2_id is not null");
            return (Criteria) this;
        }

        public Criteria andEconomicsIndustry2IdEqualTo(String value) {
            addCriterion("economics_industry2_id =", value, "economicsIndustry2Id");
            return (Criteria) this;
        }

        public Criteria andEconomicsIndustry2IdNotEqualTo(String value) {
            addCriterion("economics_industry2_id <>", value, "economicsIndustry2Id");
            return (Criteria) this;
        }

        public Criteria andEconomicsIndustry2IdGreaterThan(String value) {
            addCriterion("economics_industry2_id >", value, "economicsIndustry2Id");
            return (Criteria) this;
        }

        public Criteria andEconomicsIndustry2IdGreaterThanOrEqualTo(String value) {
            addCriterion("economics_industry2_id >=", value, "economicsIndustry2Id");
            return (Criteria) this;
        }

        public Criteria andEconomicsIndustry2IdLessThan(String value) {
            addCriterion("economics_industry2_id <", value, "economicsIndustry2Id");
            return (Criteria) this;
        }

        public Criteria andEconomicsIndustry2IdLessThanOrEqualTo(String value) {
            addCriterion("economics_industry2_id <=", value, "economicsIndustry2Id");
            return (Criteria) this;
        }

        public Criteria andEconomicsIndustry2IdLike(String value) {
            addCriterion("economics_industry2_id like", value, "economicsIndustry2Id");
            return (Criteria) this;
        }

        public Criteria andEconomicsIndustry2IdNotLike(String value) {
            addCriterion("economics_industry2_id not like", value, "economicsIndustry2Id");
            return (Criteria) this;
        }

        public Criteria andEconomicsIndustry2IdIn(List<String> values) {
            addCriterion("economics_industry2_id in", values, "economicsIndustry2Id");
            return (Criteria) this;
        }

        public Criteria andEconomicsIndustry2IdNotIn(List<String> values) {
            addCriterion("economics_industry2_id not in", values, "economicsIndustry2Id");
            return (Criteria) this;
        }

        public Criteria andEconomicsIndustry2IdBetween(String value1, String value2) {
            addCriterion("economics_industry2_id between", value1, value2, "economicsIndustry2Id");
            return (Criteria) this;
        }

        public Criteria andEconomicsIndustry2IdNotBetween(String value1, String value2) {
            addCriterion("economics_industry2_id not between", value1, value2, "economicsIndustry2Id");
            return (Criteria) this;
        }

        public Criteria andEconomicsIndustry3IdIsNull() {
            addCriterion("economics_industry3_id is null");
            return (Criteria) this;
        }

        public Criteria andEconomicsIndustry3IdIsNotNull() {
            addCriterion("economics_industry3_id is not null");
            return (Criteria) this;
        }

        public Criteria andEconomicsIndustry3IdEqualTo(String value) {
            addCriterion("economics_industry3_id =", value, "economicsIndustry3Id");
            return (Criteria) this;
        }

        public Criteria andEconomicsIndustry3IdNotEqualTo(String value) {
            addCriterion("economics_industry3_id <>", value, "economicsIndustry3Id");
            return (Criteria) this;
        }

        public Criteria andEconomicsIndustry3IdGreaterThan(String value) {
            addCriterion("economics_industry3_id >", value, "economicsIndustry3Id");
            return (Criteria) this;
        }

        public Criteria andEconomicsIndustry3IdGreaterThanOrEqualTo(String value) {
            addCriterion("economics_industry3_id >=", value, "economicsIndustry3Id");
            return (Criteria) this;
        }

        public Criteria andEconomicsIndustry3IdLessThan(String value) {
            addCriterion("economics_industry3_id <", value, "economicsIndustry3Id");
            return (Criteria) this;
        }

        public Criteria andEconomicsIndustry3IdLessThanOrEqualTo(String value) {
            addCriterion("economics_industry3_id <=", value, "economicsIndustry3Id");
            return (Criteria) this;
        }

        public Criteria andEconomicsIndustry3IdLike(String value) {
            addCriterion("economics_industry3_id like", value, "economicsIndustry3Id");
            return (Criteria) this;
        }

        public Criteria andEconomicsIndustry3IdNotLike(String value) {
            addCriterion("economics_industry3_id not like", value, "economicsIndustry3Id");
            return (Criteria) this;
        }

        public Criteria andEconomicsIndustry3IdIn(List<String> values) {
            addCriterion("economics_industry3_id in", values, "economicsIndustry3Id");
            return (Criteria) this;
        }

        public Criteria andEconomicsIndustry3IdNotIn(List<String> values) {
            addCriterion("economics_industry3_id not in", values, "economicsIndustry3Id");
            return (Criteria) this;
        }

        public Criteria andEconomicsIndustry3IdBetween(String value1, String value2) {
            addCriterion("economics_industry3_id between", value1, value2, "economicsIndustry3Id");
            return (Criteria) this;
        }

        public Criteria andEconomicsIndustry3IdNotBetween(String value1, String value2) {
            addCriterion("economics_industry3_id not between", value1, value2, "economicsIndustry3Id");
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

        public Criteria andApproveMoneyIsNull() {
            addCriterion("approve_money is null");
            return (Criteria) this;
        }

        public Criteria andApproveMoneyIsNotNull() {
            addCriterion("approve_money is not null");
            return (Criteria) this;
        }

        public Criteria andApproveMoneyEqualTo(Double value) {
            addCriterion("approve_money =", value, "approveMoney");
            return (Criteria) this;
        }

        public Criteria andApproveMoneyNotEqualTo(Double value) {
            addCriterion("approve_money <>", value, "approveMoney");
            return (Criteria) this;
        }

        public Criteria andApproveMoneyGreaterThan(Double value) {
            addCriterion("approve_money >", value, "approveMoney");
            return (Criteria) this;
        }

        public Criteria andApproveMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("approve_money >=", value, "approveMoney");
            return (Criteria) this;
        }

        public Criteria andApproveMoneyLessThan(Double value) {
            addCriterion("approve_money <", value, "approveMoney");
            return (Criteria) this;
        }

        public Criteria andApproveMoneyLessThanOrEqualTo(Double value) {
            addCriterion("approve_money <=", value, "approveMoney");
            return (Criteria) this;
        }

        public Criteria andApproveMoneyIn(List<Double> values) {
            addCriterion("approve_money in", values, "approveMoney");
            return (Criteria) this;
        }

        public Criteria andApproveMoneyNotIn(List<Double> values) {
            addCriterion("approve_money not in", values, "approveMoney");
            return (Criteria) this;
        }

        public Criteria andApproveMoneyBetween(Double value1, Double value2) {
            addCriterion("approve_money between", value1, value2, "approveMoney");
            return (Criteria) this;
        }

        public Criteria andApproveMoneyNotBetween(Double value1, Double value2) {
            addCriterion("approve_money not between", value1, value2, "approveMoney");
            return (Criteria) this;
        }

        public Criteria andInspectIsNull() {
            addCriterion("inspect is null");
            return (Criteria) this;
        }

        public Criteria andInspectIsNotNull() {
            addCriterion("inspect is not null");
            return (Criteria) this;
        }

        public Criteria andInspectEqualTo(Integer value) {
            addCriterion("inspect =", value, "inspect");
            return (Criteria) this;
        }

        public Criteria andInspectNotEqualTo(Integer value) {
            addCriterion("inspect <>", value, "inspect");
            return (Criteria) this;
        }

        public Criteria andInspectGreaterThan(Integer value) {
            addCriterion("inspect >", value, "inspect");
            return (Criteria) this;
        }

        public Criteria andInspectGreaterThanOrEqualTo(Integer value) {
            addCriterion("inspect >=", value, "inspect");
            return (Criteria) this;
        }

        public Criteria andInspectLessThan(Integer value) {
            addCriterion("inspect <", value, "inspect");
            return (Criteria) this;
        }

        public Criteria andInspectLessThanOrEqualTo(Integer value) {
            addCriterion("inspect <=", value, "inspect");
            return (Criteria) this;
        }

        public Criteria andInspectIn(List<Integer> values) {
            addCriterion("inspect in", values, "inspect");
            return (Criteria) this;
        }

        public Criteria andInspectNotIn(List<Integer> values) {
            addCriterion("inspect not in", values, "inspect");
            return (Criteria) this;
        }

        public Criteria andInspectBetween(Integer value1, Integer value2) {
            addCriterion("inspect between", value1, value2, "inspect");
            return (Criteria) this;
        }

        public Criteria andInspectNotBetween(Integer value1, Integer value2) {
            addCriterion("inspect not between", value1, value2, "inspect");
            return (Criteria) this;
        }

        public Criteria andProjectDomainIdIsNull() {
            addCriterion("project_domain_id is null");
            return (Criteria) this;
        }

        public Criteria andProjectDomainIdIsNotNull() {
            addCriterion("project_domain_id is not null");
            return (Criteria) this;
        }

        public Criteria andProjectDomainIdEqualTo(Integer value) {
            addCriterion("project_domain_id =", value, "projectDomainId");
            return (Criteria) this;
        }

        public Criteria andProjectDomainIdNotEqualTo(Integer value) {
            addCriterion("project_domain_id <>", value, "projectDomainId");
            return (Criteria) this;
        }

        public Criteria andProjectDomainIdGreaterThan(Integer value) {
            addCriterion("project_domain_id >", value, "projectDomainId");
            return (Criteria) this;
        }

        public Criteria andProjectDomainIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("project_domain_id >=", value, "projectDomainId");
            return (Criteria) this;
        }

        public Criteria andProjectDomainIdLessThan(Integer value) {
            addCriterion("project_domain_id <", value, "projectDomainId");
            return (Criteria) this;
        }

        public Criteria andProjectDomainIdLessThanOrEqualTo(Integer value) {
            addCriterion("project_domain_id <=", value, "projectDomainId");
            return (Criteria) this;
        }

        public Criteria andProjectDomainIdIn(List<Integer> values) {
            addCriterion("project_domain_id in", values, "projectDomainId");
            return (Criteria) this;
        }

        public Criteria andProjectDomainIdNotIn(List<Integer> values) {
            addCriterion("project_domain_id not in", values, "projectDomainId");
            return (Criteria) this;
        }

        public Criteria andProjectDomainIdBetween(Integer value1, Integer value2) {
            addCriterion("project_domain_id between", value1, value2, "projectDomainId");
            return (Criteria) this;
        }

        public Criteria andProjectDomainIdNotBetween(Integer value1, Integer value2) {
            addCriterion("project_domain_id not between", value1, value2, "projectDomainId");
            return (Criteria) this;
        }

        public Criteria andImportantIsNull() {
            addCriterion("important is null");
            return (Criteria) this;
        }

        public Criteria andImportantIsNotNull() {
            addCriterion("important is not null");
            return (Criteria) this;
        }

        public Criteria andImportantEqualTo(Integer value) {
            addCriterion("important =", value, "important");
            return (Criteria) this;
        }

        public Criteria andImportantNotEqualTo(Integer value) {
            addCriterion("important <>", value, "important");
            return (Criteria) this;
        }

        public Criteria andImportantGreaterThan(Integer value) {
            addCriterion("important >", value, "important");
            return (Criteria) this;
        }

        public Criteria andImportantGreaterThanOrEqualTo(Integer value) {
            addCriterion("important >=", value, "important");
            return (Criteria) this;
        }

        public Criteria andImportantLessThan(Integer value) {
            addCriterion("important <", value, "important");
            return (Criteria) this;
        }

        public Criteria andImportantLessThanOrEqualTo(Integer value) {
            addCriterion("important <=", value, "important");
            return (Criteria) this;
        }

        public Criteria andImportantIn(List<Integer> values) {
            addCriterion("important in", values, "important");
            return (Criteria) this;
        }

        public Criteria andImportantNotIn(List<Integer> values) {
            addCriterion("important not in", values, "important");
            return (Criteria) this;
        }

        public Criteria andImportantBetween(Integer value1, Integer value2) {
            addCriterion("important between", value1, value2, "important");
            return (Criteria) this;
        }

        public Criteria andImportantNotBetween(Integer value1, Integer value2) {
            addCriterion("important not between", value1, value2, "important");
            return (Criteria) this;
        }

        public Criteria andProjectGradeIdIsNull() {
            addCriterion("project_grade_id is null");
            return (Criteria) this;
        }

        public Criteria andProjectGradeIdIsNotNull() {
            addCriterion("project_grade_id is not null");
            return (Criteria) this;
        }

        public Criteria andProjectGradeIdEqualTo(Integer value) {
            addCriterion("project_grade_id =", value, "projectGradeId");
            return (Criteria) this;
        }

        public Criteria andProjectGradeIdNotEqualTo(Integer value) {
            addCriterion("project_grade_id <>", value, "projectGradeId");
            return (Criteria) this;
        }

        public Criteria andProjectGradeIdGreaterThan(Integer value) {
            addCriterion("project_grade_id >", value, "projectGradeId");
            return (Criteria) this;
        }

        public Criteria andProjectGradeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("project_grade_id >=", value, "projectGradeId");
            return (Criteria) this;
        }

        public Criteria andProjectGradeIdLessThan(Integer value) {
            addCriterion("project_grade_id <", value, "projectGradeId");
            return (Criteria) this;
        }

        public Criteria andProjectGradeIdLessThanOrEqualTo(Integer value) {
            addCriterion("project_grade_id <=", value, "projectGradeId");
            return (Criteria) this;
        }

        public Criteria andProjectGradeIdIn(List<Integer> values) {
            addCriterion("project_grade_id in", values, "projectGradeId");
            return (Criteria) this;
        }

        public Criteria andProjectGradeIdNotIn(List<Integer> values) {
            addCriterion("project_grade_id not in", values, "projectGradeId");
            return (Criteria) this;
        }

        public Criteria andProjectGradeIdBetween(Integer value1, Integer value2) {
            addCriterion("project_grade_id between", value1, value2, "projectGradeId");
            return (Criteria) this;
        }

        public Criteria andProjectGradeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("project_grade_id not between", value1, value2, "projectGradeId");
            return (Criteria) this;
        }

        public Criteria andEndStatusIdIsNull() {
            addCriterion("end_status_id is null");
            return (Criteria) this;
        }

        public Criteria andEndStatusIdIsNotNull() {
            addCriterion("end_status_id is not null");
            return (Criteria) this;
        }

        public Criteria andEndStatusIdEqualTo(Integer value) {
            addCriterion("end_status_id =", value, "endStatusId");
            return (Criteria) this;
        }

        public Criteria andEndStatusIdNotEqualTo(Integer value) {
            addCriterion("end_status_id <>", value, "endStatusId");
            return (Criteria) this;
        }

        public Criteria andEndStatusIdGreaterThan(Integer value) {
            addCriterion("end_status_id >", value, "endStatusId");
            return (Criteria) this;
        }

        public Criteria andEndStatusIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("end_status_id >=", value, "endStatusId");
            return (Criteria) this;
        }

        public Criteria andEndStatusIdLessThan(Integer value) {
            addCriterion("end_status_id <", value, "endStatusId");
            return (Criteria) this;
        }

        public Criteria andEndStatusIdLessThanOrEqualTo(Integer value) {
            addCriterion("end_status_id <=", value, "endStatusId");
            return (Criteria) this;
        }

        public Criteria andEndStatusIdIn(List<Integer> values) {
            addCriterion("end_status_id in", values, "endStatusId");
            return (Criteria) this;
        }

        public Criteria andEndStatusIdNotIn(List<Integer> values) {
            addCriterion("end_status_id not in", values, "endStatusId");
            return (Criteria) this;
        }

        public Criteria andEndStatusIdBetween(Integer value1, Integer value2) {
            addCriterion("end_status_id between", value1, value2, "endStatusId");
            return (Criteria) this;
        }

        public Criteria andEndStatusIdNotBetween(Integer value1, Integer value2) {
            addCriterion("end_status_id not between", value1, value2, "endStatusId");
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