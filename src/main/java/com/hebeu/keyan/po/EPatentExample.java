package com.hebeu.keyan.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EPatentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EPatentExample() {
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

        public Criteria andPatentIdIsNull() {
            addCriterion("patent_id is null");
            return (Criteria) this;
        }

        public Criteria andPatentIdIsNotNull() {
            addCriterion("patent_id is not null");
            return (Criteria) this;
        }

        public Criteria andPatentIdEqualTo(String value) {
            addCriterion("patent_id =", value, "patentId");
            return (Criteria) this;
        }

        public Criteria andPatentIdNotEqualTo(String value) {
            addCriterion("patent_id <>", value, "patentId");
            return (Criteria) this;
        }

        public Criteria andPatentIdGreaterThan(String value) {
            addCriterion("patent_id >", value, "patentId");
            return (Criteria) this;
        }

        public Criteria andPatentIdGreaterThanOrEqualTo(String value) {
            addCriterion("patent_id >=", value, "patentId");
            return (Criteria) this;
        }

        public Criteria andPatentIdLessThan(String value) {
            addCriterion("patent_id <", value, "patentId");
            return (Criteria) this;
        }

        public Criteria andPatentIdLessThanOrEqualTo(String value) {
            addCriterion("patent_id <=", value, "patentId");
            return (Criteria) this;
        }

        public Criteria andPatentIdLike(String value) {
            addCriterion("patent_id like", value, "patentId");
            return (Criteria) this;
        }

        public Criteria andPatentIdNotLike(String value) {
            addCriterion("patent_id not like", value, "patentId");
            return (Criteria) this;
        }

        public Criteria andPatentIdIn(List<String> values) {
            addCriterion("patent_id in", values, "patentId");
            return (Criteria) this;
        }

        public Criteria andPatentIdNotIn(List<String> values) {
            addCriterion("patent_id not in", values, "patentId");
            return (Criteria) this;
        }

        public Criteria andPatentIdBetween(String value1, String value2) {
            addCriterion("patent_id between", value1, value2, "patentId");
            return (Criteria) this;
        }

        public Criteria andPatentIdNotBetween(String value1, String value2) {
            addCriterion("patent_id not between", value1, value2, "patentId");
            return (Criteria) this;
        }

        public Criteria andPatentNameIsNull() {
            addCriterion("patent_name is null");
            return (Criteria) this;
        }

        public Criteria andPatentNameIsNotNull() {
            addCriterion("patent_name is not null");
            return (Criteria) this;
        }

        public Criteria andPatentNameEqualTo(String value) {
            addCriterion("patent_name =", value, "patentName");
            return (Criteria) this;
        }

        public Criteria andPatentNameNotEqualTo(String value) {
            addCriterion("patent_name <>", value, "patentName");
            return (Criteria) this;
        }

        public Criteria andPatentNameGreaterThan(String value) {
            addCriterion("patent_name >", value, "patentName");
            return (Criteria) this;
        }

        public Criteria andPatentNameGreaterThanOrEqualTo(String value) {
            addCriterion("patent_name >=", value, "patentName");
            return (Criteria) this;
        }

        public Criteria andPatentNameLessThan(String value) {
            addCriterion("patent_name <", value, "patentName");
            return (Criteria) this;
        }

        public Criteria andPatentNameLessThanOrEqualTo(String value) {
            addCriterion("patent_name <=", value, "patentName");
            return (Criteria) this;
        }

        public Criteria andPatentNameLike(String value) {
            addCriterion("patent_name like", value, "patentName");
            return (Criteria) this;
        }

        public Criteria andPatentNameNotLike(String value) {
            addCriterion("patent_name not like", value, "patentName");
            return (Criteria) this;
        }

        public Criteria andPatentNameIn(List<String> values) {
            addCriterion("patent_name in", values, "patentName");
            return (Criteria) this;
        }

        public Criteria andPatentNameNotIn(List<String> values) {
            addCriterion("patent_name not in", values, "patentName");
            return (Criteria) this;
        }

        public Criteria andPatentNameBetween(String value1, String value2) {
            addCriterion("patent_name between", value1, value2, "patentName");
            return (Criteria) this;
        }

        public Criteria andPatentNameNotBetween(String value1, String value2) {
            addCriterion("patent_name not between", value1, value2, "patentName");
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

        public Criteria andPatTypeIdIsNull() {
            addCriterion("pat_type_id is null");
            return (Criteria) this;
        }

        public Criteria andPatTypeIdIsNotNull() {
            addCriterion("pat_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andPatTypeIdEqualTo(Integer value) {
            addCriterion("pat_type_id =", value, "patTypeId");
            return (Criteria) this;
        }

        public Criteria andPatTypeIdNotEqualTo(Integer value) {
            addCriterion("pat_type_id <>", value, "patTypeId");
            return (Criteria) this;
        }

        public Criteria andPatTypeIdGreaterThan(Integer value) {
            addCriterion("pat_type_id >", value, "patTypeId");
            return (Criteria) this;
        }

        public Criteria andPatTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("pat_type_id >=", value, "patTypeId");
            return (Criteria) this;
        }

        public Criteria andPatTypeIdLessThan(Integer value) {
            addCriterion("pat_type_id <", value, "patTypeId");
            return (Criteria) this;
        }

        public Criteria andPatTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("pat_type_id <=", value, "patTypeId");
            return (Criteria) this;
        }

        public Criteria andPatTypeIdIn(List<Integer> values) {
            addCriterion("pat_type_id in", values, "patTypeId");
            return (Criteria) this;
        }

        public Criteria andPatTypeIdNotIn(List<Integer> values) {
            addCriterion("pat_type_id not in", values, "patTypeId");
            return (Criteria) this;
        }

        public Criteria andPatTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("pat_type_id between", value1, value2, "patTypeId");
            return (Criteria) this;
        }

        public Criteria andPatTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("pat_type_id not between", value1, value2, "patTypeId");
            return (Criteria) this;
        }

        public Criteria andPatenteeIsNull() {
            addCriterion("patentee is null");
            return (Criteria) this;
        }

        public Criteria andPatenteeIsNotNull() {
            addCriterion("patentee is not null");
            return (Criteria) this;
        }

        public Criteria andPatenteeEqualTo(String value) {
            addCriterion("patentee =", value, "patentee");
            return (Criteria) this;
        }

        public Criteria andPatenteeNotEqualTo(String value) {
            addCriterion("patentee <>", value, "patentee");
            return (Criteria) this;
        }

        public Criteria andPatenteeGreaterThan(String value) {
            addCriterion("patentee >", value, "patentee");
            return (Criteria) this;
        }

        public Criteria andPatenteeGreaterThanOrEqualTo(String value) {
            addCriterion("patentee >=", value, "patentee");
            return (Criteria) this;
        }

        public Criteria andPatenteeLessThan(String value) {
            addCriterion("patentee <", value, "patentee");
            return (Criteria) this;
        }

        public Criteria andPatenteeLessThanOrEqualTo(String value) {
            addCriterion("patentee <=", value, "patentee");
            return (Criteria) this;
        }

        public Criteria andPatenteeLike(String value) {
            addCriterion("patentee like", value, "patentee");
            return (Criteria) this;
        }

        public Criteria andPatenteeNotLike(String value) {
            addCriterion("patentee not like", value, "patentee");
            return (Criteria) this;
        }

        public Criteria andPatenteeIn(List<String> values) {
            addCriterion("patentee in", values, "patentee");
            return (Criteria) this;
        }

        public Criteria andPatenteeNotIn(List<String> values) {
            addCriterion("patentee not in", values, "patentee");
            return (Criteria) this;
        }

        public Criteria andPatenteeBetween(String value1, String value2) {
            addCriterion("patentee between", value1, value2, "patentee");
            return (Criteria) this;
        }

        public Criteria andPatenteeNotBetween(String value1, String value2) {
            addCriterion("patentee not between", value1, value2, "patentee");
            return (Criteria) this;
        }

        public Criteria andApplyNumberIsNull() {
            addCriterion("apply_number is null");
            return (Criteria) this;
        }

        public Criteria andApplyNumberIsNotNull() {
            addCriterion("apply_number is not null");
            return (Criteria) this;
        }

        public Criteria andApplyNumberEqualTo(String value) {
            addCriterion("apply_number =", value, "applyNumber");
            return (Criteria) this;
        }

        public Criteria andApplyNumberNotEqualTo(String value) {
            addCriterion("apply_number <>", value, "applyNumber");
            return (Criteria) this;
        }

        public Criteria andApplyNumberGreaterThan(String value) {
            addCriterion("apply_number >", value, "applyNumber");
            return (Criteria) this;
        }

        public Criteria andApplyNumberGreaterThanOrEqualTo(String value) {
            addCriterion("apply_number >=", value, "applyNumber");
            return (Criteria) this;
        }

        public Criteria andApplyNumberLessThan(String value) {
            addCriterion("apply_number <", value, "applyNumber");
            return (Criteria) this;
        }

        public Criteria andApplyNumberLessThanOrEqualTo(String value) {
            addCriterion("apply_number <=", value, "applyNumber");
            return (Criteria) this;
        }

        public Criteria andApplyNumberLike(String value) {
            addCriterion("apply_number like", value, "applyNumber");
            return (Criteria) this;
        }

        public Criteria andApplyNumberNotLike(String value) {
            addCriterion("apply_number not like", value, "applyNumber");
            return (Criteria) this;
        }

        public Criteria andApplyNumberIn(List<String> values) {
            addCriterion("apply_number in", values, "applyNumber");
            return (Criteria) this;
        }

        public Criteria andApplyNumberNotIn(List<String> values) {
            addCriterion("apply_number not in", values, "applyNumber");
            return (Criteria) this;
        }

        public Criteria andApplyNumberBetween(String value1, String value2) {
            addCriterion("apply_number between", value1, value2, "applyNumber");
            return (Criteria) this;
        }

        public Criteria andApplyNumberNotBetween(String value1, String value2) {
            addCriterion("apply_number not between", value1, value2, "applyNumber");
            return (Criteria) this;
        }

        public Criteria andPatentNumberIsNull() {
            addCriterion("patent_number is null");
            return (Criteria) this;
        }

        public Criteria andPatentNumberIsNotNull() {
            addCriterion("patent_number is not null");
            return (Criteria) this;
        }

        public Criteria andPatentNumberEqualTo(String value) {
            addCriterion("patent_number =", value, "patentNumber");
            return (Criteria) this;
        }

        public Criteria andPatentNumberNotEqualTo(String value) {
            addCriterion("patent_number <>", value, "patentNumber");
            return (Criteria) this;
        }

        public Criteria andPatentNumberGreaterThan(String value) {
            addCriterion("patent_number >", value, "patentNumber");
            return (Criteria) this;
        }

        public Criteria andPatentNumberGreaterThanOrEqualTo(String value) {
            addCriterion("patent_number >=", value, "patentNumber");
            return (Criteria) this;
        }

        public Criteria andPatentNumberLessThan(String value) {
            addCriterion("patent_number <", value, "patentNumber");
            return (Criteria) this;
        }

        public Criteria andPatentNumberLessThanOrEqualTo(String value) {
            addCriterion("patent_number <=", value, "patentNumber");
            return (Criteria) this;
        }

        public Criteria andPatentNumberLike(String value) {
            addCriterion("patent_number like", value, "patentNumber");
            return (Criteria) this;
        }

        public Criteria andPatentNumberNotLike(String value) {
            addCriterion("patent_number not like", value, "patentNumber");
            return (Criteria) this;
        }

        public Criteria andPatentNumberIn(List<String> values) {
            addCriterion("patent_number in", values, "patentNumber");
            return (Criteria) this;
        }

        public Criteria andPatentNumberNotIn(List<String> values) {
            addCriterion("patent_number not in", values, "patentNumber");
            return (Criteria) this;
        }

        public Criteria andPatentNumberBetween(String value1, String value2) {
            addCriterion("patent_number between", value1, value2, "patentNumber");
            return (Criteria) this;
        }

        public Criteria andPatentNumberNotBetween(String value1, String value2) {
            addCriterion("patent_number not between", value1, value2, "patentNumber");
            return (Criteria) this;
        }

        public Criteria andPatCertificateNumIsNull() {
            addCriterion("pat_certificate_num is null");
            return (Criteria) this;
        }

        public Criteria andPatCertificateNumIsNotNull() {
            addCriterion("pat_certificate_num is not null");
            return (Criteria) this;
        }

        public Criteria andPatCertificateNumEqualTo(String value) {
            addCriterion("pat_certificate_num =", value, "patCertificateNum");
            return (Criteria) this;
        }

        public Criteria andPatCertificateNumNotEqualTo(String value) {
            addCriterion("pat_certificate_num <>", value, "patCertificateNum");
            return (Criteria) this;
        }

        public Criteria andPatCertificateNumGreaterThan(String value) {
            addCriterion("pat_certificate_num >", value, "patCertificateNum");
            return (Criteria) this;
        }

        public Criteria andPatCertificateNumGreaterThanOrEqualTo(String value) {
            addCriterion("pat_certificate_num >=", value, "patCertificateNum");
            return (Criteria) this;
        }

        public Criteria andPatCertificateNumLessThan(String value) {
            addCriterion("pat_certificate_num <", value, "patCertificateNum");
            return (Criteria) this;
        }

        public Criteria andPatCertificateNumLessThanOrEqualTo(String value) {
            addCriterion("pat_certificate_num <=", value, "patCertificateNum");
            return (Criteria) this;
        }

        public Criteria andPatCertificateNumLike(String value) {
            addCriterion("pat_certificate_num like", value, "patCertificateNum");
            return (Criteria) this;
        }

        public Criteria andPatCertificateNumNotLike(String value) {
            addCriterion("pat_certificate_num not like", value, "patCertificateNum");
            return (Criteria) this;
        }

        public Criteria andPatCertificateNumIn(List<String> values) {
            addCriterion("pat_certificate_num in", values, "patCertificateNum");
            return (Criteria) this;
        }

        public Criteria andPatCertificateNumNotIn(List<String> values) {
            addCriterion("pat_certificate_num not in", values, "patCertificateNum");
            return (Criteria) this;
        }

        public Criteria andPatCertificateNumBetween(String value1, String value2) {
            addCriterion("pat_certificate_num between", value1, value2, "patCertificateNum");
            return (Criteria) this;
        }

        public Criteria andPatCertificateNumNotBetween(String value1, String value2) {
            addCriterion("pat_certificate_num not between", value1, value2, "patCertificateNum");
            return (Criteria) this;
        }

        public Criteria andCertificateDateIsNull() {
            addCriterion("certificate_date is null");
            return (Criteria) this;
        }

        public Criteria andCertificateDateIsNotNull() {
            addCriterion("certificate_date is not null");
            return (Criteria) this;
        }

        public Criteria andCertificateDateEqualTo(Date value) {
            addCriterion("certificate_date =", value, "certificateDate");
            return (Criteria) this;
        }

        public Criteria andCertificateDateNotEqualTo(Date value) {
            addCriterion("certificate_date <>", value, "certificateDate");
            return (Criteria) this;
        }

        public Criteria andCertificateDateGreaterThan(Date value) {
            addCriterion("certificate_date >", value, "certificateDate");
            return (Criteria) this;
        }

        public Criteria andCertificateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("certificate_date >=", value, "certificateDate");
            return (Criteria) this;
        }

        public Criteria andCertificateDateLessThan(Date value) {
            addCriterion("certificate_date <", value, "certificateDate");
            return (Criteria) this;
        }

        public Criteria andCertificateDateLessThanOrEqualTo(Date value) {
            addCriterion("certificate_date <=", value, "certificateDate");
            return (Criteria) this;
        }

        public Criteria andCertificateDateIn(List<Date> values) {
            addCriterion("certificate_date in", values, "certificateDate");
            return (Criteria) this;
        }

        public Criteria andCertificateDateNotIn(List<Date> values) {
            addCriterion("certificate_date not in", values, "certificateDate");
            return (Criteria) this;
        }

        public Criteria andCertificateDateBetween(Date value1, Date value2) {
            addCriterion("certificate_date between", value1, value2, "certificateDate");
            return (Criteria) this;
        }

        public Criteria andCertificateDateNotBetween(Date value1, Date value2) {
            addCriterion("certificate_date not between", value1, value2, "certificateDate");
            return (Criteria) this;
        }

        public Criteria andPatApplyDateIsNull() {
            addCriterion("pat_apply_date is null");
            return (Criteria) this;
        }

        public Criteria andPatApplyDateIsNotNull() {
            addCriterion("pat_apply_date is not null");
            return (Criteria) this;
        }

        public Criteria andPatApplyDateEqualTo(Date value) {
            addCriterion("pat_apply_date =", value, "patApplyDate");
            return (Criteria) this;
        }

        public Criteria andPatApplyDateNotEqualTo(Date value) {
            addCriterion("pat_apply_date <>", value, "patApplyDate");
            return (Criteria) this;
        }

        public Criteria andPatApplyDateGreaterThan(Date value) {
            addCriterion("pat_apply_date >", value, "patApplyDate");
            return (Criteria) this;
        }

        public Criteria andPatApplyDateGreaterThanOrEqualTo(Date value) {
            addCriterion("pat_apply_date >=", value, "patApplyDate");
            return (Criteria) this;
        }

        public Criteria andPatApplyDateLessThan(Date value) {
            addCriterion("pat_apply_date <", value, "patApplyDate");
            return (Criteria) this;
        }

        public Criteria andPatApplyDateLessThanOrEqualTo(Date value) {
            addCriterion("pat_apply_date <=", value, "patApplyDate");
            return (Criteria) this;
        }

        public Criteria andPatApplyDateIn(List<Date> values) {
            addCriterion("pat_apply_date in", values, "patApplyDate");
            return (Criteria) this;
        }

        public Criteria andPatApplyDateNotIn(List<Date> values) {
            addCriterion("pat_apply_date not in", values, "patApplyDate");
            return (Criteria) this;
        }

        public Criteria andPatApplyDateBetween(Date value1, Date value2) {
            addCriterion("pat_apply_date between", value1, value2, "patApplyDate");
            return (Criteria) this;
        }

        public Criteria andPatApplyDateNotBetween(Date value1, Date value2) {
            addCriterion("pat_apply_date not between", value1, value2, "patApplyDate");
            return (Criteria) this;
        }

        public Criteria andEmpowerDateIsNull() {
            addCriterion("empower_date is null");
            return (Criteria) this;
        }

        public Criteria andEmpowerDateIsNotNull() {
            addCriterion("empower_date is not null");
            return (Criteria) this;
        }

        public Criteria andEmpowerDateEqualTo(Date value) {
            addCriterion("empower_date =", value, "empowerDate");
            return (Criteria) this;
        }

        public Criteria andEmpowerDateNotEqualTo(Date value) {
            addCriterion("empower_date <>", value, "empowerDate");
            return (Criteria) this;
        }

        public Criteria andEmpowerDateGreaterThan(Date value) {
            addCriterion("empower_date >", value, "empowerDate");
            return (Criteria) this;
        }

        public Criteria andEmpowerDateGreaterThanOrEqualTo(Date value) {
            addCriterion("empower_date >=", value, "empowerDate");
            return (Criteria) this;
        }

        public Criteria andEmpowerDateLessThan(Date value) {
            addCriterion("empower_date <", value, "empowerDate");
            return (Criteria) this;
        }

        public Criteria andEmpowerDateLessThanOrEqualTo(Date value) {
            addCriterion("empower_date <=", value, "empowerDate");
            return (Criteria) this;
        }

        public Criteria andEmpowerDateIn(List<Date> values) {
            addCriterion("empower_date in", values, "empowerDate");
            return (Criteria) this;
        }

        public Criteria andEmpowerDateNotIn(List<Date> values) {
            addCriterion("empower_date not in", values, "empowerDate");
            return (Criteria) this;
        }

        public Criteria andEmpowerDateBetween(Date value1, Date value2) {
            addCriterion("empower_date between", value1, value2, "empowerDate");
            return (Criteria) this;
        }

        public Criteria andEmpowerDateNotBetween(Date value1, Date value2) {
            addCriterion("empower_date not between", value1, value2, "empowerDate");
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