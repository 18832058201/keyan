package com.hebeu.keyan.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EStandardExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EStandardExample() {
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

        public Criteria andStandardIdIsNull() {
            addCriterion("standard_id is null");
            return (Criteria) this;
        }

        public Criteria andStandardIdIsNotNull() {
            addCriterion("standard_id is not null");
            return (Criteria) this;
        }

        public Criteria andStandardIdEqualTo(String value) {
            addCriterion("standard_id =", value, "standardId");
            return (Criteria) this;
        }

        public Criteria andStandardIdNotEqualTo(String value) {
            addCriterion("standard_id <>", value, "standardId");
            return (Criteria) this;
        }

        public Criteria andStandardIdGreaterThan(String value) {
            addCriterion("standard_id >", value, "standardId");
            return (Criteria) this;
        }

        public Criteria andStandardIdGreaterThanOrEqualTo(String value) {
            addCriterion("standard_id >=", value, "standardId");
            return (Criteria) this;
        }

        public Criteria andStandardIdLessThan(String value) {
            addCriterion("standard_id <", value, "standardId");
            return (Criteria) this;
        }

        public Criteria andStandardIdLessThanOrEqualTo(String value) {
            addCriterion("standard_id <=", value, "standardId");
            return (Criteria) this;
        }

        public Criteria andStandardIdLike(String value) {
            addCriterion("standard_id like", value, "standardId");
            return (Criteria) this;
        }

        public Criteria andStandardIdNotLike(String value) {
            addCriterion("standard_id not like", value, "standardId");
            return (Criteria) this;
        }

        public Criteria andStandardIdIn(List<String> values) {
            addCriterion("standard_id in", values, "standardId");
            return (Criteria) this;
        }

        public Criteria andStandardIdNotIn(List<String> values) {
            addCriterion("standard_id not in", values, "standardId");
            return (Criteria) this;
        }

        public Criteria andStandardIdBetween(String value1, String value2) {
            addCriterion("standard_id between", value1, value2, "standardId");
            return (Criteria) this;
        }

        public Criteria andStandardIdNotBetween(String value1, String value2) {
            addCriterion("standard_id not between", value1, value2, "standardId");
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

        public Criteria andStandNumberIsNull() {
            addCriterion("stand_number is null");
            return (Criteria) this;
        }

        public Criteria andStandNumberIsNotNull() {
            addCriterion("stand_number is not null");
            return (Criteria) this;
        }

        public Criteria andStandNumberEqualTo(String value) {
            addCriterion("stand_number =", value, "standNumber");
            return (Criteria) this;
        }

        public Criteria andStandNumberNotEqualTo(String value) {
            addCriterion("stand_number <>", value, "standNumber");
            return (Criteria) this;
        }

        public Criteria andStandNumberGreaterThan(String value) {
            addCriterion("stand_number >", value, "standNumber");
            return (Criteria) this;
        }

        public Criteria andStandNumberGreaterThanOrEqualTo(String value) {
            addCriterion("stand_number >=", value, "standNumber");
            return (Criteria) this;
        }

        public Criteria andStandNumberLessThan(String value) {
            addCriterion("stand_number <", value, "standNumber");
            return (Criteria) this;
        }

        public Criteria andStandNumberLessThanOrEqualTo(String value) {
            addCriterion("stand_number <=", value, "standNumber");
            return (Criteria) this;
        }

        public Criteria andStandNumberLike(String value) {
            addCriterion("stand_number like", value, "standNumber");
            return (Criteria) this;
        }

        public Criteria andStandNumberNotLike(String value) {
            addCriterion("stand_number not like", value, "standNumber");
            return (Criteria) this;
        }

        public Criteria andStandNumberIn(List<String> values) {
            addCriterion("stand_number in", values, "standNumber");
            return (Criteria) this;
        }

        public Criteria andStandNumberNotIn(List<String> values) {
            addCriterion("stand_number not in", values, "standNumber");
            return (Criteria) this;
        }

        public Criteria andStandNumberBetween(String value1, String value2) {
            addCriterion("stand_number between", value1, value2, "standNumber");
            return (Criteria) this;
        }

        public Criteria andStandNumberNotBetween(String value1, String value2) {
            addCriterion("stand_number not between", value1, value2, "standNumber");
            return (Criteria) this;
        }

        public Criteria andStandStateIdIsNull() {
            addCriterion("stand_state_id is null");
            return (Criteria) this;
        }

        public Criteria andStandStateIdIsNotNull() {
            addCriterion("stand_state_id is not null");
            return (Criteria) this;
        }

        public Criteria andStandStateIdEqualTo(Integer value) {
            addCriterion("stand_state_id =", value, "standStateId");
            return (Criteria) this;
        }

        public Criteria andStandStateIdNotEqualTo(Integer value) {
            addCriterion("stand_state_id <>", value, "standStateId");
            return (Criteria) this;
        }

        public Criteria andStandStateIdGreaterThan(Integer value) {
            addCriterion("stand_state_id >", value, "standStateId");
            return (Criteria) this;
        }

        public Criteria andStandStateIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("stand_state_id >=", value, "standStateId");
            return (Criteria) this;
        }

        public Criteria andStandStateIdLessThan(Integer value) {
            addCriterion("stand_state_id <", value, "standStateId");
            return (Criteria) this;
        }

        public Criteria andStandStateIdLessThanOrEqualTo(Integer value) {
            addCriterion("stand_state_id <=", value, "standStateId");
            return (Criteria) this;
        }

        public Criteria andStandStateIdIn(List<Integer> values) {
            addCriterion("stand_state_id in", values, "standStateId");
            return (Criteria) this;
        }

        public Criteria andStandStateIdNotIn(List<Integer> values) {
            addCriterion("stand_state_id not in", values, "standStateId");
            return (Criteria) this;
        }

        public Criteria andStandStateIdBetween(Integer value1, Integer value2) {
            addCriterion("stand_state_id between", value1, value2, "standStateId");
            return (Criteria) this;
        }

        public Criteria andStandStateIdNotBetween(Integer value1, Integer value2) {
            addCriterion("stand_state_id not between", value1, value2, "standStateId");
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

        public Criteria andStandObjectIdIsNull() {
            addCriterion("stand_object_id is null");
            return (Criteria) this;
        }

        public Criteria andStandObjectIdIsNotNull() {
            addCriterion("stand_object_id is not null");
            return (Criteria) this;
        }

        public Criteria andStandObjectIdEqualTo(Integer value) {
            addCriterion("stand_object_id =", value, "standObjectId");
            return (Criteria) this;
        }

        public Criteria andStandObjectIdNotEqualTo(Integer value) {
            addCriterion("stand_object_id <>", value, "standObjectId");
            return (Criteria) this;
        }

        public Criteria andStandObjectIdGreaterThan(Integer value) {
            addCriterion("stand_object_id >", value, "standObjectId");
            return (Criteria) this;
        }

        public Criteria andStandObjectIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("stand_object_id >=", value, "standObjectId");
            return (Criteria) this;
        }

        public Criteria andStandObjectIdLessThan(Integer value) {
            addCriterion("stand_object_id <", value, "standObjectId");
            return (Criteria) this;
        }

        public Criteria andStandObjectIdLessThanOrEqualTo(Integer value) {
            addCriterion("stand_object_id <=", value, "standObjectId");
            return (Criteria) this;
        }

        public Criteria andStandObjectIdIn(List<Integer> values) {
            addCriterion("stand_object_id in", values, "standObjectId");
            return (Criteria) this;
        }

        public Criteria andStandObjectIdNotIn(List<Integer> values) {
            addCriterion("stand_object_id not in", values, "standObjectId");
            return (Criteria) this;
        }

        public Criteria andStandObjectIdBetween(Integer value1, Integer value2) {
            addCriterion("stand_object_id between", value1, value2, "standObjectId");
            return (Criteria) this;
        }

        public Criteria andStandObjectIdNotBetween(Integer value1, Integer value2) {
            addCriterion("stand_object_id not between", value1, value2, "standObjectId");
            return (Criteria) this;
        }

        public Criteria andStandBusinessIdIsNull() {
            addCriterion("stand_business_id is null");
            return (Criteria) this;
        }

        public Criteria andStandBusinessIdIsNotNull() {
            addCriterion("stand_business_id is not null");
            return (Criteria) this;
        }

        public Criteria andStandBusinessIdEqualTo(Integer value) {
            addCriterion("stand_business_id =", value, "standBusinessId");
            return (Criteria) this;
        }

        public Criteria andStandBusinessIdNotEqualTo(Integer value) {
            addCriterion("stand_business_id <>", value, "standBusinessId");
            return (Criteria) this;
        }

        public Criteria andStandBusinessIdGreaterThan(Integer value) {
            addCriterion("stand_business_id >", value, "standBusinessId");
            return (Criteria) this;
        }

        public Criteria andStandBusinessIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("stand_business_id >=", value, "standBusinessId");
            return (Criteria) this;
        }

        public Criteria andStandBusinessIdLessThan(Integer value) {
            addCriterion("stand_business_id <", value, "standBusinessId");
            return (Criteria) this;
        }

        public Criteria andStandBusinessIdLessThanOrEqualTo(Integer value) {
            addCriterion("stand_business_id <=", value, "standBusinessId");
            return (Criteria) this;
        }

        public Criteria andStandBusinessIdIn(List<Integer> values) {
            addCriterion("stand_business_id in", values, "standBusinessId");
            return (Criteria) this;
        }

        public Criteria andStandBusinessIdNotIn(List<Integer> values) {
            addCriterion("stand_business_id not in", values, "standBusinessId");
            return (Criteria) this;
        }

        public Criteria andStandBusinessIdBetween(Integer value1, Integer value2) {
            addCriterion("stand_business_id between", value1, value2, "standBusinessId");
            return (Criteria) this;
        }

        public Criteria andStandBusinessIdNotBetween(Integer value1, Integer value2) {
            addCriterion("stand_business_id not between", value1, value2, "standBusinessId");
            return (Criteria) this;
        }

        public Criteria andPutUnderUnitIsNull() {
            addCriterion("put_under_unit is null");
            return (Criteria) this;
        }

        public Criteria andPutUnderUnitIsNotNull() {
            addCriterion("put_under_unit is not null");
            return (Criteria) this;
        }

        public Criteria andPutUnderUnitEqualTo(String value) {
            addCriterion("put_under_unit =", value, "putUnderUnit");
            return (Criteria) this;
        }

        public Criteria andPutUnderUnitNotEqualTo(String value) {
            addCriterion("put_under_unit <>", value, "putUnderUnit");
            return (Criteria) this;
        }

        public Criteria andPutUnderUnitGreaterThan(String value) {
            addCriterion("put_under_unit >", value, "putUnderUnit");
            return (Criteria) this;
        }

        public Criteria andPutUnderUnitGreaterThanOrEqualTo(String value) {
            addCriterion("put_under_unit >=", value, "putUnderUnit");
            return (Criteria) this;
        }

        public Criteria andPutUnderUnitLessThan(String value) {
            addCriterion("put_under_unit <", value, "putUnderUnit");
            return (Criteria) this;
        }

        public Criteria andPutUnderUnitLessThanOrEqualTo(String value) {
            addCriterion("put_under_unit <=", value, "putUnderUnit");
            return (Criteria) this;
        }

        public Criteria andPutUnderUnitLike(String value) {
            addCriterion("put_under_unit like", value, "putUnderUnit");
            return (Criteria) this;
        }

        public Criteria andPutUnderUnitNotLike(String value) {
            addCriterion("put_under_unit not like", value, "putUnderUnit");
            return (Criteria) this;
        }

        public Criteria andPutUnderUnitIn(List<String> values) {
            addCriterion("put_under_unit in", values, "putUnderUnit");
            return (Criteria) this;
        }

        public Criteria andPutUnderUnitNotIn(List<String> values) {
            addCriterion("put_under_unit not in", values, "putUnderUnit");
            return (Criteria) this;
        }

        public Criteria andPutUnderUnitBetween(String value1, String value2) {
            addCriterion("put_under_unit between", value1, value2, "putUnderUnit");
            return (Criteria) this;
        }

        public Criteria andPutUnderUnitNotBetween(String value1, String value2) {
            addCriterion("put_under_unit not between", value1, value2, "putUnderUnit");
            return (Criteria) this;
        }

        public Criteria andProposeUnitIsNull() {
            addCriterion("propose_unit is null");
            return (Criteria) this;
        }

        public Criteria andProposeUnitIsNotNull() {
            addCriterion("propose_unit is not null");
            return (Criteria) this;
        }

        public Criteria andProposeUnitEqualTo(String value) {
            addCriterion("propose_unit =", value, "proposeUnit");
            return (Criteria) this;
        }

        public Criteria andProposeUnitNotEqualTo(String value) {
            addCriterion("propose_unit <>", value, "proposeUnit");
            return (Criteria) this;
        }

        public Criteria andProposeUnitGreaterThan(String value) {
            addCriterion("propose_unit >", value, "proposeUnit");
            return (Criteria) this;
        }

        public Criteria andProposeUnitGreaterThanOrEqualTo(String value) {
            addCriterion("propose_unit >=", value, "proposeUnit");
            return (Criteria) this;
        }

        public Criteria andProposeUnitLessThan(String value) {
            addCriterion("propose_unit <", value, "proposeUnit");
            return (Criteria) this;
        }

        public Criteria andProposeUnitLessThanOrEqualTo(String value) {
            addCriterion("propose_unit <=", value, "proposeUnit");
            return (Criteria) this;
        }

        public Criteria andProposeUnitLike(String value) {
            addCriterion("propose_unit like", value, "proposeUnit");
            return (Criteria) this;
        }

        public Criteria andProposeUnitNotLike(String value) {
            addCriterion("propose_unit not like", value, "proposeUnit");
            return (Criteria) this;
        }

        public Criteria andProposeUnitIn(List<String> values) {
            addCriterion("propose_unit in", values, "proposeUnit");
            return (Criteria) this;
        }

        public Criteria andProposeUnitNotIn(List<String> values) {
            addCriterion("propose_unit not in", values, "proposeUnit");
            return (Criteria) this;
        }

        public Criteria andProposeUnitBetween(String value1, String value2) {
            addCriterion("propose_unit between", value1, value2, "proposeUnit");
            return (Criteria) this;
        }

        public Criteria andProposeUnitNotBetween(String value1, String value2) {
            addCriterion("propose_unit not between", value1, value2, "proposeUnit");
            return (Criteria) this;
        }

        public Criteria andDraftUnitIsNull() {
            addCriterion("draft_unit is null");
            return (Criteria) this;
        }

        public Criteria andDraftUnitIsNotNull() {
            addCriterion("draft_unit is not null");
            return (Criteria) this;
        }

        public Criteria andDraftUnitEqualTo(String value) {
            addCriterion("draft_unit =", value, "draftUnit");
            return (Criteria) this;
        }

        public Criteria andDraftUnitNotEqualTo(String value) {
            addCriterion("draft_unit <>", value, "draftUnit");
            return (Criteria) this;
        }

        public Criteria andDraftUnitGreaterThan(String value) {
            addCriterion("draft_unit >", value, "draftUnit");
            return (Criteria) this;
        }

        public Criteria andDraftUnitGreaterThanOrEqualTo(String value) {
            addCriterion("draft_unit >=", value, "draftUnit");
            return (Criteria) this;
        }

        public Criteria andDraftUnitLessThan(String value) {
            addCriterion("draft_unit <", value, "draftUnit");
            return (Criteria) this;
        }

        public Criteria andDraftUnitLessThanOrEqualTo(String value) {
            addCriterion("draft_unit <=", value, "draftUnit");
            return (Criteria) this;
        }

        public Criteria andDraftUnitLike(String value) {
            addCriterion("draft_unit like", value, "draftUnit");
            return (Criteria) this;
        }

        public Criteria andDraftUnitNotLike(String value) {
            addCriterion("draft_unit not like", value, "draftUnit");
            return (Criteria) this;
        }

        public Criteria andDraftUnitIn(List<String> values) {
            addCriterion("draft_unit in", values, "draftUnit");
            return (Criteria) this;
        }

        public Criteria andDraftUnitNotIn(List<String> values) {
            addCriterion("draft_unit not in", values, "draftUnit");
            return (Criteria) this;
        }

        public Criteria andDraftUnitBetween(String value1, String value2) {
            addCriterion("draft_unit between", value1, value2, "draftUnit");
            return (Criteria) this;
        }

        public Criteria andDraftUnitNotBetween(String value1, String value2) {
            addCriterion("draft_unit not between", value1, value2, "draftUnit");
            return (Criteria) this;
        }

        public Criteria andImplementDateIsNull() {
            addCriterion("implement_date is null");
            return (Criteria) this;
        }

        public Criteria andImplementDateIsNotNull() {
            addCriterion("implement_date is not null");
            return (Criteria) this;
        }

        public Criteria andImplementDateEqualTo(Date value) {
            addCriterion("implement_date =", value, "implementDate");
            return (Criteria) this;
        }

        public Criteria andImplementDateNotEqualTo(Date value) {
            addCriterion("implement_date <>", value, "implementDate");
            return (Criteria) this;
        }

        public Criteria andImplementDateGreaterThan(Date value) {
            addCriterion("implement_date >", value, "implementDate");
            return (Criteria) this;
        }

        public Criteria andImplementDateGreaterThanOrEqualTo(Date value) {
            addCriterion("implement_date >=", value, "implementDate");
            return (Criteria) this;
        }

        public Criteria andImplementDateLessThan(Date value) {
            addCriterion("implement_date <", value, "implementDate");
            return (Criteria) this;
        }

        public Criteria andImplementDateLessThanOrEqualTo(Date value) {
            addCriterion("implement_date <=", value, "implementDate");
            return (Criteria) this;
        }

        public Criteria andImplementDateIn(List<Date> values) {
            addCriterion("implement_date in", values, "implementDate");
            return (Criteria) this;
        }

        public Criteria andImplementDateNotIn(List<Date> values) {
            addCriterion("implement_date not in", values, "implementDate");
            return (Criteria) this;
        }

        public Criteria andImplementDateBetween(Date value1, Date value2) {
            addCriterion("implement_date between", value1, value2, "implementDate");
            return (Criteria) this;
        }

        public Criteria andImplementDateNotBetween(Date value1, Date value2) {
            addCriterion("implement_date not between", value1, value2, "implementDate");
            return (Criteria) this;
        }

        public Criteria andReplaceStatusIsNull() {
            addCriterion("replace_status is null");
            return (Criteria) this;
        }

        public Criteria andReplaceStatusIsNotNull() {
            addCriterion("replace_status is not null");
            return (Criteria) this;
        }

        public Criteria andReplaceStatusEqualTo(String value) {
            addCriterion("replace_status =", value, "replaceStatus");
            return (Criteria) this;
        }

        public Criteria andReplaceStatusNotEqualTo(String value) {
            addCriterion("replace_status <>", value, "replaceStatus");
            return (Criteria) this;
        }

        public Criteria andReplaceStatusGreaterThan(String value) {
            addCriterion("replace_status >", value, "replaceStatus");
            return (Criteria) this;
        }

        public Criteria andReplaceStatusGreaterThanOrEqualTo(String value) {
            addCriterion("replace_status >=", value, "replaceStatus");
            return (Criteria) this;
        }

        public Criteria andReplaceStatusLessThan(String value) {
            addCriterion("replace_status <", value, "replaceStatus");
            return (Criteria) this;
        }

        public Criteria andReplaceStatusLessThanOrEqualTo(String value) {
            addCriterion("replace_status <=", value, "replaceStatus");
            return (Criteria) this;
        }

        public Criteria andReplaceStatusLike(String value) {
            addCriterion("replace_status like", value, "replaceStatus");
            return (Criteria) this;
        }

        public Criteria andReplaceStatusNotLike(String value) {
            addCriterion("replace_status not like", value, "replaceStatus");
            return (Criteria) this;
        }

        public Criteria andReplaceStatusIn(List<String> values) {
            addCriterion("replace_status in", values, "replaceStatus");
            return (Criteria) this;
        }

        public Criteria andReplaceStatusNotIn(List<String> values) {
            addCriterion("replace_status not in", values, "replaceStatus");
            return (Criteria) this;
        }

        public Criteria andReplaceStatusBetween(String value1, String value2) {
            addCriterion("replace_status between", value1, value2, "replaceStatus");
            return (Criteria) this;
        }

        public Criteria andReplaceStatusNotBetween(String value1, String value2) {
            addCriterion("replace_status not between", value1, value2, "replaceStatus");
            return (Criteria) this;
        }

        public Criteria andStandTypeIdIsNull() {
            addCriterion("stand_type_id is null");
            return (Criteria) this;
        }

        public Criteria andStandTypeIdIsNotNull() {
            addCriterion("stand_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andStandTypeIdEqualTo(Integer value) {
            addCriterion("stand_type_id =", value, "standTypeId");
            return (Criteria) this;
        }

        public Criteria andStandTypeIdNotEqualTo(Integer value) {
            addCriterion("stand_type_id <>", value, "standTypeId");
            return (Criteria) this;
        }

        public Criteria andStandTypeIdGreaterThan(Integer value) {
            addCriterion("stand_type_id >", value, "standTypeId");
            return (Criteria) this;
        }

        public Criteria andStandTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("stand_type_id >=", value, "standTypeId");
            return (Criteria) this;
        }

        public Criteria andStandTypeIdLessThan(Integer value) {
            addCriterion("stand_type_id <", value, "standTypeId");
            return (Criteria) this;
        }

        public Criteria andStandTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("stand_type_id <=", value, "standTypeId");
            return (Criteria) this;
        }

        public Criteria andStandTypeIdIn(List<Integer> values) {
            addCriterion("stand_type_id in", values, "standTypeId");
            return (Criteria) this;
        }

        public Criteria andStandTypeIdNotIn(List<Integer> values) {
            addCriterion("stand_type_id not in", values, "standTypeId");
            return (Criteria) this;
        }

        public Criteria andStandTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("stand_type_id between", value1, value2, "standTypeId");
            return (Criteria) this;
        }

        public Criteria andStandTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("stand_type_id not between", value1, value2, "standTypeId");
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