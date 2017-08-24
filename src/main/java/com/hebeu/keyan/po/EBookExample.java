package com.hebeu.keyan.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EBookExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EBookExample() {
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

        public Criteria andBookIdIsNull() {
            addCriterion("book_id is null");
            return (Criteria) this;
        }

        public Criteria andBookIdIsNotNull() {
            addCriterion("book_id is not null");
            return (Criteria) this;
        }

        public Criteria andBookIdEqualTo(String value) {
            addCriterion("book_id =", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdNotEqualTo(String value) {
            addCriterion("book_id <>", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdGreaterThan(String value) {
            addCriterion("book_id >", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdGreaterThanOrEqualTo(String value) {
            addCriterion("book_id >=", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdLessThan(String value) {
            addCriterion("book_id <", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdLessThanOrEqualTo(String value) {
            addCriterion("book_id <=", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdLike(String value) {
            addCriterion("book_id like", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdNotLike(String value) {
            addCriterion("book_id not like", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdIn(List<String> values) {
            addCriterion("book_id in", values, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdNotIn(List<String> values) {
            addCriterion("book_id not in", values, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdBetween(String value1, String value2) {
            addCriterion("book_id between", value1, value2, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdNotBetween(String value1, String value2) {
            addCriterion("book_id not between", value1, value2, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookNameIsNull() {
            addCriterion("book_name is null");
            return (Criteria) this;
        }

        public Criteria andBookNameIsNotNull() {
            addCriterion("book_name is not null");
            return (Criteria) this;
        }

        public Criteria andBookNameEqualTo(String value) {
            addCriterion("book_name =", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameNotEqualTo(String value) {
            addCriterion("book_name <>", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameGreaterThan(String value) {
            addCriterion("book_name >", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameGreaterThanOrEqualTo(String value) {
            addCriterion("book_name >=", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameLessThan(String value) {
            addCriterion("book_name <", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameLessThanOrEqualTo(String value) {
            addCriterion("book_name <=", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameLike(String value) {
            addCriterion("book_name like", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameNotLike(String value) {
            addCriterion("book_name not like", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameIn(List<String> values) {
            addCriterion("book_name in", values, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameNotIn(List<String> values) {
            addCriterion("book_name not in", values, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameBetween(String value1, String value2) {
            addCriterion("book_name between", value1, value2, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameNotBetween(String value1, String value2) {
            addCriterion("book_name not between", value1, value2, "bookName");
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

        public Criteria andBookTypeIdIsNull() {
            addCriterion("book_type_id is null");
            return (Criteria) this;
        }

        public Criteria andBookTypeIdIsNotNull() {
            addCriterion("book_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andBookTypeIdEqualTo(Integer value) {
            addCriterion("book_type_id =", value, "bookTypeId");
            return (Criteria) this;
        }

        public Criteria andBookTypeIdNotEqualTo(Integer value) {
            addCriterion("book_type_id <>", value, "bookTypeId");
            return (Criteria) this;
        }

        public Criteria andBookTypeIdGreaterThan(Integer value) {
            addCriterion("book_type_id >", value, "bookTypeId");
            return (Criteria) this;
        }

        public Criteria andBookTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("book_type_id >=", value, "bookTypeId");
            return (Criteria) this;
        }

        public Criteria andBookTypeIdLessThan(Integer value) {
            addCriterion("book_type_id <", value, "bookTypeId");
            return (Criteria) this;
        }

        public Criteria andBookTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("book_type_id <=", value, "bookTypeId");
            return (Criteria) this;
        }

        public Criteria andBookTypeIdIn(List<Integer> values) {
            addCriterion("book_type_id in", values, "bookTypeId");
            return (Criteria) this;
        }

        public Criteria andBookTypeIdNotIn(List<Integer> values) {
            addCriterion("book_type_id not in", values, "bookTypeId");
            return (Criteria) this;
        }

        public Criteria andBookTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("book_type_id between", value1, value2, "bookTypeId");
            return (Criteria) this;
        }

        public Criteria andBookTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("book_type_id not between", value1, value2, "bookTypeId");
            return (Criteria) this;
        }

        public Criteria andIsbnIsNull() {
            addCriterion("isbn is null");
            return (Criteria) this;
        }

        public Criteria andIsbnIsNotNull() {
            addCriterion("isbn is not null");
            return (Criteria) this;
        }

        public Criteria andIsbnEqualTo(String value) {
            addCriterion("isbn =", value, "isbn");
            return (Criteria) this;
        }

        public Criteria andIsbnNotEqualTo(String value) {
            addCriterion("isbn <>", value, "isbn");
            return (Criteria) this;
        }

        public Criteria andIsbnGreaterThan(String value) {
            addCriterion("isbn >", value, "isbn");
            return (Criteria) this;
        }

        public Criteria andIsbnGreaterThanOrEqualTo(String value) {
            addCriterion("isbn >=", value, "isbn");
            return (Criteria) this;
        }

        public Criteria andIsbnLessThan(String value) {
            addCriterion("isbn <", value, "isbn");
            return (Criteria) this;
        }

        public Criteria andIsbnLessThanOrEqualTo(String value) {
            addCriterion("isbn <=", value, "isbn");
            return (Criteria) this;
        }

        public Criteria andIsbnLike(String value) {
            addCriterion("isbn like", value, "isbn");
            return (Criteria) this;
        }

        public Criteria andIsbnNotLike(String value) {
            addCriterion("isbn not like", value, "isbn");
            return (Criteria) this;
        }

        public Criteria andIsbnIn(List<String> values) {
            addCriterion("isbn in", values, "isbn");
            return (Criteria) this;
        }

        public Criteria andIsbnNotIn(List<String> values) {
            addCriterion("isbn not in", values, "isbn");
            return (Criteria) this;
        }

        public Criteria andIsbnBetween(String value1, String value2) {
            addCriterion("isbn between", value1, value2, "isbn");
            return (Criteria) this;
        }

        public Criteria andIsbnNotBetween(String value1, String value2) {
            addCriterion("isbn not between", value1, value2, "isbn");
            return (Criteria) this;
        }

        public Criteria andTotalNumIsNull() {
            addCriterion("total_num is null");
            return (Criteria) this;
        }

        public Criteria andTotalNumIsNotNull() {
            addCriterion("total_num is not null");
            return (Criteria) this;
        }

        public Criteria andTotalNumEqualTo(String value) {
            addCriterion("total_num =", value, "totalNum");
            return (Criteria) this;
        }

        public Criteria andTotalNumNotEqualTo(String value) {
            addCriterion("total_num <>", value, "totalNum");
            return (Criteria) this;
        }

        public Criteria andTotalNumGreaterThan(String value) {
            addCriterion("total_num >", value, "totalNum");
            return (Criteria) this;
        }

        public Criteria andTotalNumGreaterThanOrEqualTo(String value) {
            addCriterion("total_num >=", value, "totalNum");
            return (Criteria) this;
        }

        public Criteria andTotalNumLessThan(String value) {
            addCriterion("total_num <", value, "totalNum");
            return (Criteria) this;
        }

        public Criteria andTotalNumLessThanOrEqualTo(String value) {
            addCriterion("total_num <=", value, "totalNum");
            return (Criteria) this;
        }

        public Criteria andTotalNumLike(String value) {
            addCriterion("total_num like", value, "totalNum");
            return (Criteria) this;
        }

        public Criteria andTotalNumNotLike(String value) {
            addCriterion("total_num not like", value, "totalNum");
            return (Criteria) this;
        }

        public Criteria andTotalNumIn(List<String> values) {
            addCriterion("total_num in", values, "totalNum");
            return (Criteria) this;
        }

        public Criteria andTotalNumNotIn(List<String> values) {
            addCriterion("total_num not in", values, "totalNum");
            return (Criteria) this;
        }

        public Criteria andTotalNumBetween(String value1, String value2) {
            addCriterion("total_num between", value1, value2, "totalNum");
            return (Criteria) this;
        }

        public Criteria andTotalNumNotBetween(String value1, String value2) {
            addCriterion("total_num not between", value1, value2, "totalNum");
            return (Criteria) this;
        }

        public Criteria andWriteNumIsNull() {
            addCriterion("write_num is null");
            return (Criteria) this;
        }

        public Criteria andWriteNumIsNotNull() {
            addCriterion("write_num is not null");
            return (Criteria) this;
        }

        public Criteria andWriteNumEqualTo(String value) {
            addCriterion("write_num =", value, "writeNum");
            return (Criteria) this;
        }

        public Criteria andWriteNumNotEqualTo(String value) {
            addCriterion("write_num <>", value, "writeNum");
            return (Criteria) this;
        }

        public Criteria andWriteNumGreaterThan(String value) {
            addCriterion("write_num >", value, "writeNum");
            return (Criteria) this;
        }

        public Criteria andWriteNumGreaterThanOrEqualTo(String value) {
            addCriterion("write_num >=", value, "writeNum");
            return (Criteria) this;
        }

        public Criteria andWriteNumLessThan(String value) {
            addCriterion("write_num <", value, "writeNum");
            return (Criteria) this;
        }

        public Criteria andWriteNumLessThanOrEqualTo(String value) {
            addCriterion("write_num <=", value, "writeNum");
            return (Criteria) this;
        }

        public Criteria andWriteNumLike(String value) {
            addCriterion("write_num like", value, "writeNum");
            return (Criteria) this;
        }

        public Criteria andWriteNumNotLike(String value) {
            addCriterion("write_num not like", value, "writeNum");
            return (Criteria) this;
        }

        public Criteria andWriteNumIn(List<String> values) {
            addCriterion("write_num in", values, "writeNum");
            return (Criteria) this;
        }

        public Criteria andWriteNumNotIn(List<String> values) {
            addCriterion("write_num not in", values, "writeNum");
            return (Criteria) this;
        }

        public Criteria andWriteNumBetween(String value1, String value2) {
            addCriterion("write_num between", value1, value2, "writeNum");
            return (Criteria) this;
        }

        public Criteria andWriteNumNotBetween(String value1, String value2) {
            addCriterion("write_num not between", value1, value2, "writeNum");
            return (Criteria) this;
        }

        public Criteria andPublishUnitIsNull() {
            addCriterion("publish_unit is null");
            return (Criteria) this;
        }

        public Criteria andPublishUnitIsNotNull() {
            addCriterion("publish_unit is not null");
            return (Criteria) this;
        }

        public Criteria andPublishUnitEqualTo(String value) {
            addCriterion("publish_unit =", value, "publishUnit");
            return (Criteria) this;
        }

        public Criteria andPublishUnitNotEqualTo(String value) {
            addCriterion("publish_unit <>", value, "publishUnit");
            return (Criteria) this;
        }

        public Criteria andPublishUnitGreaterThan(String value) {
            addCriterion("publish_unit >", value, "publishUnit");
            return (Criteria) this;
        }

        public Criteria andPublishUnitGreaterThanOrEqualTo(String value) {
            addCriterion("publish_unit >=", value, "publishUnit");
            return (Criteria) this;
        }

        public Criteria andPublishUnitLessThan(String value) {
            addCriterion("publish_unit <", value, "publishUnit");
            return (Criteria) this;
        }

        public Criteria andPublishUnitLessThanOrEqualTo(String value) {
            addCriterion("publish_unit <=", value, "publishUnit");
            return (Criteria) this;
        }

        public Criteria andPublishUnitLike(String value) {
            addCriterion("publish_unit like", value, "publishUnit");
            return (Criteria) this;
        }

        public Criteria andPublishUnitNotLike(String value) {
            addCriterion("publish_unit not like", value, "publishUnit");
            return (Criteria) this;
        }

        public Criteria andPublishUnitIn(List<String> values) {
            addCriterion("publish_unit in", values, "publishUnit");
            return (Criteria) this;
        }

        public Criteria andPublishUnitNotIn(List<String> values) {
            addCriterion("publish_unit not in", values, "publishUnit");
            return (Criteria) this;
        }

        public Criteria andPublishUnitBetween(String value1, String value2) {
            addCriterion("publish_unit between", value1, value2, "publishUnit");
            return (Criteria) this;
        }

        public Criteria andPublishUnitNotBetween(String value1, String value2) {
            addCriterion("publish_unit not between", value1, value2, "publishUnit");
            return (Criteria) this;
        }

        public Criteria andPublishPlaceIsNull() {
            addCriterion("publish_place is null");
            return (Criteria) this;
        }

        public Criteria andPublishPlaceIsNotNull() {
            addCriterion("publish_place is not null");
            return (Criteria) this;
        }

        public Criteria andPublishPlaceEqualTo(String value) {
            addCriterion("publish_place =", value, "publishPlace");
            return (Criteria) this;
        }

        public Criteria andPublishPlaceNotEqualTo(String value) {
            addCriterion("publish_place <>", value, "publishPlace");
            return (Criteria) this;
        }

        public Criteria andPublishPlaceGreaterThan(String value) {
            addCriterion("publish_place >", value, "publishPlace");
            return (Criteria) this;
        }

        public Criteria andPublishPlaceGreaterThanOrEqualTo(String value) {
            addCriterion("publish_place >=", value, "publishPlace");
            return (Criteria) this;
        }

        public Criteria andPublishPlaceLessThan(String value) {
            addCriterion("publish_place <", value, "publishPlace");
            return (Criteria) this;
        }

        public Criteria andPublishPlaceLessThanOrEqualTo(String value) {
            addCriterion("publish_place <=", value, "publishPlace");
            return (Criteria) this;
        }

        public Criteria andPublishPlaceLike(String value) {
            addCriterion("publish_place like", value, "publishPlace");
            return (Criteria) this;
        }

        public Criteria andPublishPlaceNotLike(String value) {
            addCriterion("publish_place not like", value, "publishPlace");
            return (Criteria) this;
        }

        public Criteria andPublishPlaceIn(List<String> values) {
            addCriterion("publish_place in", values, "publishPlace");
            return (Criteria) this;
        }

        public Criteria andPublishPlaceNotIn(List<String> values) {
            addCriterion("publish_place not in", values, "publishPlace");
            return (Criteria) this;
        }

        public Criteria andPublishPlaceBetween(String value1, String value2) {
            addCriterion("publish_place between", value1, value2, "publishPlace");
            return (Criteria) this;
        }

        public Criteria andPublishPlaceNotBetween(String value1, String value2) {
            addCriterion("publish_place not between", value1, value2, "publishPlace");
            return (Criteria) this;
        }

        public Criteria andPublishDateIsNull() {
            addCriterion("publish_date is null");
            return (Criteria) this;
        }

        public Criteria andPublishDateIsNotNull() {
            addCriterion("publish_date is not null");
            return (Criteria) this;
        }

        public Criteria andPublishDateEqualTo(Date value) {
            addCriterion("publish_date =", value, "publishDate");
            return (Criteria) this;
        }

        public Criteria andPublishDateNotEqualTo(Date value) {
            addCriterion("publish_date <>", value, "publishDate");
            return (Criteria) this;
        }

        public Criteria andPublishDateGreaterThan(Date value) {
            addCriterion("publish_date >", value, "publishDate");
            return (Criteria) this;
        }

        public Criteria andPublishDateGreaterThanOrEqualTo(Date value) {
            addCriterion("publish_date >=", value, "publishDate");
            return (Criteria) this;
        }

        public Criteria andPublishDateLessThan(Date value) {
            addCriterion("publish_date <", value, "publishDate");
            return (Criteria) this;
        }

        public Criteria andPublishDateLessThanOrEqualTo(Date value) {
            addCriterion("publish_date <=", value, "publishDate");
            return (Criteria) this;
        }

        public Criteria andPublishDateIn(List<Date> values) {
            addCriterion("publish_date in", values, "publishDate");
            return (Criteria) this;
        }

        public Criteria andPublishDateNotIn(List<Date> values) {
            addCriterion("publish_date not in", values, "publishDate");
            return (Criteria) this;
        }

        public Criteria andPublishDateBetween(Date value1, Date value2) {
            addCriterion("publish_date between", value1, value2, "publishDate");
            return (Criteria) this;
        }

        public Criteria andPublishDateNotBetween(Date value1, Date value2) {
            addCriterion("publish_date not between", value1, value2, "publishDate");
            return (Criteria) this;
        }

        public Criteria andPressTypeIdIsNull() {
            addCriterion("press_type_id is null");
            return (Criteria) this;
        }

        public Criteria andPressTypeIdIsNotNull() {
            addCriterion("press_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andPressTypeIdEqualTo(Integer value) {
            addCriterion("press_type_id =", value, "pressTypeId");
            return (Criteria) this;
        }

        public Criteria andPressTypeIdNotEqualTo(Integer value) {
            addCriterion("press_type_id <>", value, "pressTypeId");
            return (Criteria) this;
        }

        public Criteria andPressTypeIdGreaterThan(Integer value) {
            addCriterion("press_type_id >", value, "pressTypeId");
            return (Criteria) this;
        }

        public Criteria andPressTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("press_type_id >=", value, "pressTypeId");
            return (Criteria) this;
        }

        public Criteria andPressTypeIdLessThan(Integer value) {
            addCriterion("press_type_id <", value, "pressTypeId");
            return (Criteria) this;
        }

        public Criteria andPressTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("press_type_id <=", value, "pressTypeId");
            return (Criteria) this;
        }

        public Criteria andPressTypeIdIn(List<Integer> values) {
            addCriterion("press_type_id in", values, "pressTypeId");
            return (Criteria) this;
        }

        public Criteria andPressTypeIdNotIn(List<Integer> values) {
            addCriterion("press_type_id not in", values, "pressTypeId");
            return (Criteria) this;
        }

        public Criteria andPressTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("press_type_id between", value1, value2, "pressTypeId");
            return (Criteria) this;
        }

        public Criteria andPressTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("press_type_id not between", value1, value2, "pressTypeId");
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