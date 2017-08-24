package com.hebeu.keyan.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EPaperExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EPaperExample() {
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

        public Criteria andPaperIdIsNull() {
            addCriterion("paper_id is null");
            return (Criteria) this;
        }

        public Criteria andPaperIdIsNotNull() {
            addCriterion("paper_id is not null");
            return (Criteria) this;
        }

        public Criteria andPaperIdEqualTo(String value) {
            addCriterion("paper_id =", value, "paperId");
            return (Criteria) this;
        }

        public Criteria andPaperIdNotEqualTo(String value) {
            addCriterion("paper_id <>", value, "paperId");
            return (Criteria) this;
        }

        public Criteria andPaperIdGreaterThan(String value) {
            addCriterion("paper_id >", value, "paperId");
            return (Criteria) this;
        }

        public Criteria andPaperIdGreaterThanOrEqualTo(String value) {
            addCriterion("paper_id >=", value, "paperId");
            return (Criteria) this;
        }

        public Criteria andPaperIdLessThan(String value) {
            addCriterion("paper_id <", value, "paperId");
            return (Criteria) this;
        }

        public Criteria andPaperIdLessThanOrEqualTo(String value) {
            addCriterion("paper_id <=", value, "paperId");
            return (Criteria) this;
        }

        public Criteria andPaperIdLike(String value) {
            addCriterion("paper_id like", value, "paperId");
            return (Criteria) this;
        }

        public Criteria andPaperIdNotLike(String value) {
            addCriterion("paper_id not like", value, "paperId");
            return (Criteria) this;
        }

        public Criteria andPaperIdIn(List<String> values) {
            addCriterion("paper_id in", values, "paperId");
            return (Criteria) this;
        }

        public Criteria andPaperIdNotIn(List<String> values) {
            addCriterion("paper_id not in", values, "paperId");
            return (Criteria) this;
        }

        public Criteria andPaperIdBetween(String value1, String value2) {
            addCriterion("paper_id between", value1, value2, "paperId");
            return (Criteria) this;
        }

        public Criteria andPaperIdNotBetween(String value1, String value2) {
            addCriterion("paper_id not between", value1, value2, "paperId");
            return (Criteria) this;
        }

        public Criteria andPaperNameIsNull() {
            addCriterion("paper_name is null");
            return (Criteria) this;
        }

        public Criteria andPaperNameIsNotNull() {
            addCriterion("paper_name is not null");
            return (Criteria) this;
        }

        public Criteria andPaperNameEqualTo(String value) {
            addCriterion("paper_name =", value, "paperName");
            return (Criteria) this;
        }

        public Criteria andPaperNameNotEqualTo(String value) {
            addCriterion("paper_name <>", value, "paperName");
            return (Criteria) this;
        }

        public Criteria andPaperNameGreaterThan(String value) {
            addCriterion("paper_name >", value, "paperName");
            return (Criteria) this;
        }

        public Criteria andPaperNameGreaterThanOrEqualTo(String value) {
            addCriterion("paper_name >=", value, "paperName");
            return (Criteria) this;
        }

        public Criteria andPaperNameLessThan(String value) {
            addCriterion("paper_name <", value, "paperName");
            return (Criteria) this;
        }

        public Criteria andPaperNameLessThanOrEqualTo(String value) {
            addCriterion("paper_name <=", value, "paperName");
            return (Criteria) this;
        }

        public Criteria andPaperNameLike(String value) {
            addCriterion("paper_name like", value, "paperName");
            return (Criteria) this;
        }

        public Criteria andPaperNameNotLike(String value) {
            addCriterion("paper_name not like", value, "paperName");
            return (Criteria) this;
        }

        public Criteria andPaperNameIn(List<String> values) {
            addCriterion("paper_name in", values, "paperName");
            return (Criteria) this;
        }

        public Criteria andPaperNameNotIn(List<String> values) {
            addCriterion("paper_name not in", values, "paperName");
            return (Criteria) this;
        }

        public Criteria andPaperNameBetween(String value1, String value2) {
            addCriterion("paper_name between", value1, value2, "paperName");
            return (Criteria) this;
        }

        public Criteria andPaperNameNotBetween(String value1, String value2) {
            addCriterion("paper_name not between", value1, value2, "paperName");
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

        public Criteria andPublishNameIsNull() {
            addCriterion("publish_name is null");
            return (Criteria) this;
        }

        public Criteria andPublishNameIsNotNull() {
            addCriterion("publish_name is not null");
            return (Criteria) this;
        }

        public Criteria andPublishNameEqualTo(String value) {
            addCriterion("publish_name =", value, "publishName");
            return (Criteria) this;
        }

        public Criteria andPublishNameNotEqualTo(String value) {
            addCriterion("publish_name <>", value, "publishName");
            return (Criteria) this;
        }

        public Criteria andPublishNameGreaterThan(String value) {
            addCriterion("publish_name >", value, "publishName");
            return (Criteria) this;
        }

        public Criteria andPublishNameGreaterThanOrEqualTo(String value) {
            addCriterion("publish_name >=", value, "publishName");
            return (Criteria) this;
        }

        public Criteria andPublishNameLessThan(String value) {
            addCriterion("publish_name <", value, "publishName");
            return (Criteria) this;
        }

        public Criteria andPublishNameLessThanOrEqualTo(String value) {
            addCriterion("publish_name <=", value, "publishName");
            return (Criteria) this;
        }

        public Criteria andPublishNameLike(String value) {
            addCriterion("publish_name like", value, "publishName");
            return (Criteria) this;
        }

        public Criteria andPublishNameNotLike(String value) {
            addCriterion("publish_name not like", value, "publishName");
            return (Criteria) this;
        }

        public Criteria andPublishNameIn(List<String> values) {
            addCriterion("publish_name in", values, "publishName");
            return (Criteria) this;
        }

        public Criteria andPublishNameNotIn(List<String> values) {
            addCriterion("publish_name not in", values, "publishName");
            return (Criteria) this;
        }

        public Criteria andPublishNameBetween(String value1, String value2) {
            addCriterion("publish_name between", value1, value2, "publishName");
            return (Criteria) this;
        }

        public Criteria andPublishNameNotBetween(String value1, String value2) {
            addCriterion("publish_name not between", value1, value2, "publishName");
            return (Criteria) this;
        }

        public Criteria andPublishTypeIdIsNull() {
            addCriterion("publish_type_id is null");
            return (Criteria) this;
        }

        public Criteria andPublishTypeIdIsNotNull() {
            addCriterion("publish_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andPublishTypeIdEqualTo(Integer value) {
            addCriterion("publish_type_id =", value, "publishTypeId");
            return (Criteria) this;
        }

        public Criteria andPublishTypeIdNotEqualTo(Integer value) {
            addCriterion("publish_type_id <>", value, "publishTypeId");
            return (Criteria) this;
        }

        public Criteria andPublishTypeIdGreaterThan(Integer value) {
            addCriterion("publish_type_id >", value, "publishTypeId");
            return (Criteria) this;
        }

        public Criteria andPublishTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("publish_type_id >=", value, "publishTypeId");
            return (Criteria) this;
        }

        public Criteria andPublishTypeIdLessThan(Integer value) {
            addCriterion("publish_type_id <", value, "publishTypeId");
            return (Criteria) this;
        }

        public Criteria andPublishTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("publish_type_id <=", value, "publishTypeId");
            return (Criteria) this;
        }

        public Criteria andPublishTypeIdIn(List<Integer> values) {
            addCriterion("publish_type_id in", values, "publishTypeId");
            return (Criteria) this;
        }

        public Criteria andPublishTypeIdNotIn(List<Integer> values) {
            addCriterion("publish_type_id not in", values, "publishTypeId");
            return (Criteria) this;
        }

        public Criteria andPublishTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("publish_type_id between", value1, value2, "publishTypeId");
            return (Criteria) this;
        }

        public Criteria andPublishTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("publish_type_id not between", value1, value2, "publishTypeId");
            return (Criteria) this;
        }

        public Criteria andPublishRangeIdIsNull() {
            addCriterion("publish_range_id is null");
            return (Criteria) this;
        }

        public Criteria andPublishRangeIdIsNotNull() {
            addCriterion("publish_range_id is not null");
            return (Criteria) this;
        }

        public Criteria andPublishRangeIdEqualTo(Integer value) {
            addCriterion("publish_range_id =", value, "publishRangeId");
            return (Criteria) this;
        }

        public Criteria andPublishRangeIdNotEqualTo(Integer value) {
            addCriterion("publish_range_id <>", value, "publishRangeId");
            return (Criteria) this;
        }

        public Criteria andPublishRangeIdGreaterThan(Integer value) {
            addCriterion("publish_range_id >", value, "publishRangeId");
            return (Criteria) this;
        }

        public Criteria andPublishRangeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("publish_range_id >=", value, "publishRangeId");
            return (Criteria) this;
        }

        public Criteria andPublishRangeIdLessThan(Integer value) {
            addCriterion("publish_range_id <", value, "publishRangeId");
            return (Criteria) this;
        }

        public Criteria andPublishRangeIdLessThanOrEqualTo(Integer value) {
            addCriterion("publish_range_id <=", value, "publishRangeId");
            return (Criteria) this;
        }

        public Criteria andPublishRangeIdIn(List<Integer> values) {
            addCriterion("publish_range_id in", values, "publishRangeId");
            return (Criteria) this;
        }

        public Criteria andPublishRangeIdNotIn(List<Integer> values) {
            addCriterion("publish_range_id not in", values, "publishRangeId");
            return (Criteria) this;
        }

        public Criteria andPublishRangeIdBetween(Integer value1, Integer value2) {
            addCriterion("publish_range_id between", value1, value2, "publishRangeId");
            return (Criteria) this;
        }

        public Criteria andPublishRangeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("publish_range_id not between", value1, value2, "publishRangeId");
            return (Criteria) this;
        }

        public Criteria andPublishLevelIdIsNull() {
            addCriterion("publish_level_id is null");
            return (Criteria) this;
        }

        public Criteria andPublishLevelIdIsNotNull() {
            addCriterion("publish_level_id is not null");
            return (Criteria) this;
        }

        public Criteria andPublishLevelIdEqualTo(Integer value) {
            addCriterion("publish_level_id =", value, "publishLevelId");
            return (Criteria) this;
        }

        public Criteria andPublishLevelIdNotEqualTo(Integer value) {
            addCriterion("publish_level_id <>", value, "publishLevelId");
            return (Criteria) this;
        }

        public Criteria andPublishLevelIdGreaterThan(Integer value) {
            addCriterion("publish_level_id >", value, "publishLevelId");
            return (Criteria) this;
        }

        public Criteria andPublishLevelIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("publish_level_id >=", value, "publishLevelId");
            return (Criteria) this;
        }

        public Criteria andPublishLevelIdLessThan(Integer value) {
            addCriterion("publish_level_id <", value, "publishLevelId");
            return (Criteria) this;
        }

        public Criteria andPublishLevelIdLessThanOrEqualTo(Integer value) {
            addCriterion("publish_level_id <=", value, "publishLevelId");
            return (Criteria) this;
        }

        public Criteria andPublishLevelIdIn(List<Integer> values) {
            addCriterion("publish_level_id in", values, "publishLevelId");
            return (Criteria) this;
        }

        public Criteria andPublishLevelIdNotIn(List<Integer> values) {
            addCriterion("publish_level_id not in", values, "publishLevelId");
            return (Criteria) this;
        }

        public Criteria andPublishLevelIdBetween(Integer value1, Integer value2) {
            addCriterion("publish_level_id between", value1, value2, "publishLevelId");
            return (Criteria) this;
        }

        public Criteria andPublishLevelIdNotBetween(Integer value1, Integer value2) {
            addCriterion("publish_level_id not between", value1, value2, "publishLevelId");
            return (Criteria) this;
        }

        public Criteria andReelNumberIsNull() {
            addCriterion("reel_number is null");
            return (Criteria) this;
        }

        public Criteria andReelNumberIsNotNull() {
            addCriterion("reel_number is not null");
            return (Criteria) this;
        }

        public Criteria andReelNumberEqualTo(String value) {
            addCriterion("reel_number =", value, "reelNumber");
            return (Criteria) this;
        }

        public Criteria andReelNumberNotEqualTo(String value) {
            addCriterion("reel_number <>", value, "reelNumber");
            return (Criteria) this;
        }

        public Criteria andReelNumberGreaterThan(String value) {
            addCriterion("reel_number >", value, "reelNumber");
            return (Criteria) this;
        }

        public Criteria andReelNumberGreaterThanOrEqualTo(String value) {
            addCriterion("reel_number >=", value, "reelNumber");
            return (Criteria) this;
        }

        public Criteria andReelNumberLessThan(String value) {
            addCriterion("reel_number <", value, "reelNumber");
            return (Criteria) this;
        }

        public Criteria andReelNumberLessThanOrEqualTo(String value) {
            addCriterion("reel_number <=", value, "reelNumber");
            return (Criteria) this;
        }

        public Criteria andReelNumberLike(String value) {
            addCriterion("reel_number like", value, "reelNumber");
            return (Criteria) this;
        }

        public Criteria andReelNumberNotLike(String value) {
            addCriterion("reel_number not like", value, "reelNumber");
            return (Criteria) this;
        }

        public Criteria andReelNumberIn(List<String> values) {
            addCriterion("reel_number in", values, "reelNumber");
            return (Criteria) this;
        }

        public Criteria andReelNumberNotIn(List<String> values) {
            addCriterion("reel_number not in", values, "reelNumber");
            return (Criteria) this;
        }

        public Criteria andReelNumberBetween(String value1, String value2) {
            addCriterion("reel_number between", value1, value2, "reelNumber");
            return (Criteria) this;
        }

        public Criteria andReelNumberNotBetween(String value1, String value2) {
            addCriterion("reel_number not between", value1, value2, "reelNumber");
            return (Criteria) this;
        }

        public Criteria andIssueIsNull() {
            addCriterion("issue is null");
            return (Criteria) this;
        }

        public Criteria andIssueIsNotNull() {
            addCriterion("issue is not null");
            return (Criteria) this;
        }

        public Criteria andIssueEqualTo(String value) {
            addCriterion("issue =", value, "issue");
            return (Criteria) this;
        }

        public Criteria andIssueNotEqualTo(String value) {
            addCriterion("issue <>", value, "issue");
            return (Criteria) this;
        }

        public Criteria andIssueGreaterThan(String value) {
            addCriterion("issue >", value, "issue");
            return (Criteria) this;
        }

        public Criteria andIssueGreaterThanOrEqualTo(String value) {
            addCriterion("issue >=", value, "issue");
            return (Criteria) this;
        }

        public Criteria andIssueLessThan(String value) {
            addCriterion("issue <", value, "issue");
            return (Criteria) this;
        }

        public Criteria andIssueLessThanOrEqualTo(String value) {
            addCriterion("issue <=", value, "issue");
            return (Criteria) this;
        }

        public Criteria andIssueLike(String value) {
            addCriterion("issue like", value, "issue");
            return (Criteria) this;
        }

        public Criteria andIssueNotLike(String value) {
            addCriterion("issue not like", value, "issue");
            return (Criteria) this;
        }

        public Criteria andIssueIn(List<String> values) {
            addCriterion("issue in", values, "issue");
            return (Criteria) this;
        }

        public Criteria andIssueNotIn(List<String> values) {
            addCriterion("issue not in", values, "issue");
            return (Criteria) this;
        }

        public Criteria andIssueBetween(String value1, String value2) {
            addCriterion("issue between", value1, value2, "issue");
            return (Criteria) this;
        }

        public Criteria andIssueNotBetween(String value1, String value2) {
            addCriterion("issue not between", value1, value2, "issue");
            return (Criteria) this;
        }

        public Criteria andPageNumberIsNull() {
            addCriterion("page_number is null");
            return (Criteria) this;
        }

        public Criteria andPageNumberIsNotNull() {
            addCriterion("page_number is not null");
            return (Criteria) this;
        }

        public Criteria andPageNumberEqualTo(String value) {
            addCriterion("page_number =", value, "pageNumber");
            return (Criteria) this;
        }

        public Criteria andPageNumberNotEqualTo(String value) {
            addCriterion("page_number <>", value, "pageNumber");
            return (Criteria) this;
        }

        public Criteria andPageNumberGreaterThan(String value) {
            addCriterion("page_number >", value, "pageNumber");
            return (Criteria) this;
        }

        public Criteria andPageNumberGreaterThanOrEqualTo(String value) {
            addCriterion("page_number >=", value, "pageNumber");
            return (Criteria) this;
        }

        public Criteria andPageNumberLessThan(String value) {
            addCriterion("page_number <", value, "pageNumber");
            return (Criteria) this;
        }

        public Criteria andPageNumberLessThanOrEqualTo(String value) {
            addCriterion("page_number <=", value, "pageNumber");
            return (Criteria) this;
        }

        public Criteria andPageNumberLike(String value) {
            addCriterion("page_number like", value, "pageNumber");
            return (Criteria) this;
        }

        public Criteria andPageNumberNotLike(String value) {
            addCriterion("page_number not like", value, "pageNumber");
            return (Criteria) this;
        }

        public Criteria andPageNumberIn(List<String> values) {
            addCriterion("page_number in", values, "pageNumber");
            return (Criteria) this;
        }

        public Criteria andPageNumberNotIn(List<String> values) {
            addCriterion("page_number not in", values, "pageNumber");
            return (Criteria) this;
        }

        public Criteria andPageNumberBetween(String value1, String value2) {
            addCriterion("page_number between", value1, value2, "pageNumber");
            return (Criteria) this;
        }

        public Criteria andPageNumberNotBetween(String value1, String value2) {
            addCriterion("page_number not between", value1, value2, "pageNumber");
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

        public Criteria andContactAuthorIsNull() {
            addCriterion("contact_author is null");
            return (Criteria) this;
        }

        public Criteria andContactAuthorIsNotNull() {
            addCriterion("contact_author is not null");
            return (Criteria) this;
        }

        public Criteria andContactAuthorEqualTo(String value) {
            addCriterion("contact_author =", value, "contactAuthor");
            return (Criteria) this;
        }

        public Criteria andContactAuthorNotEqualTo(String value) {
            addCriterion("contact_author <>", value, "contactAuthor");
            return (Criteria) this;
        }

        public Criteria andContactAuthorGreaterThan(String value) {
            addCriterion("contact_author >", value, "contactAuthor");
            return (Criteria) this;
        }

        public Criteria andContactAuthorGreaterThanOrEqualTo(String value) {
            addCriterion("contact_author >=", value, "contactAuthor");
            return (Criteria) this;
        }

        public Criteria andContactAuthorLessThan(String value) {
            addCriterion("contact_author <", value, "contactAuthor");
            return (Criteria) this;
        }

        public Criteria andContactAuthorLessThanOrEqualTo(String value) {
            addCriterion("contact_author <=", value, "contactAuthor");
            return (Criteria) this;
        }

        public Criteria andContactAuthorLike(String value) {
            addCriterion("contact_author like", value, "contactAuthor");
            return (Criteria) this;
        }

        public Criteria andContactAuthorNotLike(String value) {
            addCriterion("contact_author not like", value, "contactAuthor");
            return (Criteria) this;
        }

        public Criteria andContactAuthorIn(List<String> values) {
            addCriterion("contact_author in", values, "contactAuthor");
            return (Criteria) this;
        }

        public Criteria andContactAuthorNotIn(List<String> values) {
            addCriterion("contact_author not in", values, "contactAuthor");
            return (Criteria) this;
        }

        public Criteria andContactAuthorBetween(String value1, String value2) {
            addCriterion("contact_author between", value1, value2, "contactAuthor");
            return (Criteria) this;
        }

        public Criteria andContactAuthorNotBetween(String value1, String value2) {
            addCriterion("contact_author not between", value1, value2, "contactAuthor");
            return (Criteria) this;
        }

        public Criteria andIssnIsNull() {
            addCriterion("ISSN is null");
            return (Criteria) this;
        }

        public Criteria andIssnIsNotNull() {
            addCriterion("ISSN is not null");
            return (Criteria) this;
        }

        public Criteria andIssnEqualTo(String value) {
            addCriterion("ISSN =", value, "issn");
            return (Criteria) this;
        }

        public Criteria andIssnNotEqualTo(String value) {
            addCriterion("ISSN <>", value, "issn");
            return (Criteria) this;
        }

        public Criteria andIssnGreaterThan(String value) {
            addCriterion("ISSN >", value, "issn");
            return (Criteria) this;
        }

        public Criteria andIssnGreaterThanOrEqualTo(String value) {
            addCriterion("ISSN >=", value, "issn");
            return (Criteria) this;
        }

        public Criteria andIssnLessThan(String value) {
            addCriterion("ISSN <", value, "issn");
            return (Criteria) this;
        }

        public Criteria andIssnLessThanOrEqualTo(String value) {
            addCriterion("ISSN <=", value, "issn");
            return (Criteria) this;
        }

        public Criteria andIssnLike(String value) {
            addCriterion("ISSN like", value, "issn");
            return (Criteria) this;
        }

        public Criteria andIssnNotLike(String value) {
            addCriterion("ISSN not like", value, "issn");
            return (Criteria) this;
        }

        public Criteria andIssnIn(List<String> values) {
            addCriterion("ISSN in", values, "issn");
            return (Criteria) this;
        }

        public Criteria andIssnNotIn(List<String> values) {
            addCriterion("ISSN not in", values, "issn");
            return (Criteria) this;
        }

        public Criteria andIssnBetween(String value1, String value2) {
            addCriterion("ISSN between", value1, value2, "issn");
            return (Criteria) this;
        }

        public Criteria andIssnNotBetween(String value1, String value2) {
            addCriterion("ISSN not between", value1, value2, "issn");
            return (Criteria) this;
        }

        public Criteria andCnIsNull() {
            addCriterion("CN is null");
            return (Criteria) this;
        }

        public Criteria andCnIsNotNull() {
            addCriterion("CN is not null");
            return (Criteria) this;
        }

        public Criteria andCnEqualTo(String value) {
            addCriterion("CN =", value, "cn");
            return (Criteria) this;
        }

        public Criteria andCnNotEqualTo(String value) {
            addCriterion("CN <>", value, "cn");
            return (Criteria) this;
        }

        public Criteria andCnGreaterThan(String value) {
            addCriterion("CN >", value, "cn");
            return (Criteria) this;
        }

        public Criteria andCnGreaterThanOrEqualTo(String value) {
            addCriterion("CN >=", value, "cn");
            return (Criteria) this;
        }

        public Criteria andCnLessThan(String value) {
            addCriterion("CN <", value, "cn");
            return (Criteria) this;
        }

        public Criteria andCnLessThanOrEqualTo(String value) {
            addCriterion("CN <=", value, "cn");
            return (Criteria) this;
        }

        public Criteria andCnLike(String value) {
            addCriterion("CN like", value, "cn");
            return (Criteria) this;
        }

        public Criteria andCnNotLike(String value) {
            addCriterion("CN not like", value, "cn");
            return (Criteria) this;
        }

        public Criteria andCnIn(List<String> values) {
            addCriterion("CN in", values, "cn");
            return (Criteria) this;
        }

        public Criteria andCnNotIn(List<String> values) {
            addCriterion("CN not in", values, "cn");
            return (Criteria) this;
        }

        public Criteria andCnBetween(String value1, String value2) {
            addCriterion("CN between", value1, value2, "cn");
            return (Criteria) this;
        }

        public Criteria andCnNotBetween(String value1, String value2) {
            addCriterion("CN not between", value1, value2, "cn");
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