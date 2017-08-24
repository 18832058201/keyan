package com.hebeu.keyan.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RPersonProjectResultExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RPersonProjectResultExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
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

        public Criteria andCollegeIdIsNull() {
            addCriterion("college_id is null");
            return (Criteria) this;
        }

        public Criteria andCollegeIdIsNotNull() {
            addCriterion("college_id is not null");
            return (Criteria) this;
        }

        public Criteria andCollegeIdEqualTo(Integer value) {
            addCriterion("college_id =", value, "collegeId");
            return (Criteria) this;
        }

        public Criteria andCollegeIdNotEqualTo(Integer value) {
            addCriterion("college_id <>", value, "collegeId");
            return (Criteria) this;
        }

        public Criteria andCollegeIdGreaterThan(Integer value) {
            addCriterion("college_id >", value, "collegeId");
            return (Criteria) this;
        }

        public Criteria andCollegeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("college_id >=", value, "collegeId");
            return (Criteria) this;
        }

        public Criteria andCollegeIdLessThan(Integer value) {
            addCriterion("college_id <", value, "collegeId");
            return (Criteria) this;
        }

        public Criteria andCollegeIdLessThanOrEqualTo(Integer value) {
            addCriterion("college_id <=", value, "collegeId");
            return (Criteria) this;
        }

        public Criteria andCollegeIdIn(List<Integer> values) {
            addCriterion("college_id in", values, "collegeId");
            return (Criteria) this;
        }

        public Criteria andCollegeIdNotIn(List<Integer> values) {
            addCriterion("college_id not in", values, "collegeId");
            return (Criteria) this;
        }

        public Criteria andCollegeIdBetween(Integer value1, Integer value2) {
            addCriterion("college_id between", value1, value2, "collegeId");
            return (Criteria) this;
        }

        public Criteria andCollegeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("college_id not between", value1, value2, "collegeId");
            return (Criteria) this;
        }

        public Criteria andCollegeNameIsNull() {
            addCriterion("college_name is null");
            return (Criteria) this;
        }

        public Criteria andCollegeNameIsNotNull() {
            addCriterion("college_name is not null");
            return (Criteria) this;
        }

        public Criteria andCollegeNameEqualTo(String value) {
            addCriterion("college_name =", value, "collegeName");
            return (Criteria) this;
        }

        public Criteria andCollegeNameNotEqualTo(String value) {
            addCriterion("college_name <>", value, "collegeName");
            return (Criteria) this;
        }

        public Criteria andCollegeNameGreaterThan(String value) {
            addCriterion("college_name >", value, "collegeName");
            return (Criteria) this;
        }

        public Criteria andCollegeNameGreaterThanOrEqualTo(String value) {
            addCriterion("college_name >=", value, "collegeName");
            return (Criteria) this;
        }

        public Criteria andCollegeNameLessThan(String value) {
            addCriterion("college_name <", value, "collegeName");
            return (Criteria) this;
        }

        public Criteria andCollegeNameLessThanOrEqualTo(String value) {
            addCriterion("college_name <=", value, "collegeName");
            return (Criteria) this;
        }

        public Criteria andCollegeNameLike(String value) {
            addCriterion("college_name like", value, "collegeName");
            return (Criteria) this;
        }

        public Criteria andCollegeNameNotLike(String value) {
            addCriterion("college_name not like", value, "collegeName");
            return (Criteria) this;
        }

        public Criteria andCollegeNameIn(List<String> values) {
            addCriterion("college_name in", values, "collegeName");
            return (Criteria) this;
        }

        public Criteria andCollegeNameNotIn(List<String> values) {
            addCriterion("college_name not in", values, "collegeName");
            return (Criteria) this;
        }

        public Criteria andCollegeNameBetween(String value1, String value2) {
            addCriterion("college_name between", value1, value2, "collegeName");
            return (Criteria) this;
        }

        public Criteria andCollegeNameNotBetween(String value1, String value2) {
            addCriterion("college_name not between", value1, value2, "collegeName");
            return (Criteria) this;
        }

        public Criteria andPersonTypeIsNull() {
            addCriterion("person_type is null");
            return (Criteria) this;
        }

        public Criteria andPersonTypeIsNotNull() {
            addCriterion("person_type is not null");
            return (Criteria) this;
        }

        public Criteria andPersonTypeEqualTo(Integer value) {
            addCriterion("person_type =", value, "personType");
            return (Criteria) this;
        }

        public Criteria andPersonTypeNotEqualTo(Integer value) {
            addCriterion("person_type <>", value, "personType");
            return (Criteria) this;
        }

        public Criteria andPersonTypeGreaterThan(Integer value) {
            addCriterion("person_type >", value, "personType");
            return (Criteria) this;
        }

        public Criteria andPersonTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("person_type >=", value, "personType");
            return (Criteria) this;
        }

        public Criteria andPersonTypeLessThan(Integer value) {
            addCriterion("person_type <", value, "personType");
            return (Criteria) this;
        }

        public Criteria andPersonTypeLessThanOrEqualTo(Integer value) {
            addCriterion("person_type <=", value, "personType");
            return (Criteria) this;
        }

        public Criteria andPersonTypeIn(List<Integer> values) {
            addCriterion("person_type in", values, "personType");
            return (Criteria) this;
        }

        public Criteria andPersonTypeNotIn(List<Integer> values) {
            addCriterion("person_type not in", values, "personType");
            return (Criteria) this;
        }

        public Criteria andPersonTypeBetween(Integer value1, Integer value2) {
            addCriterion("person_type between", value1, value2, "personType");
            return (Criteria) this;
        }

        public Criteria andPersonTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("person_type not between", value1, value2, "personType");
            return (Criteria) this;
        }

        public Criteria andIsLeaderIsNull() {
            addCriterion("is_leader is null");
            return (Criteria) this;
        }

        public Criteria andIsLeaderIsNotNull() {
            addCriterion("is_leader is not null");
            return (Criteria) this;
        }

        public Criteria andIsLeaderEqualTo(Integer value) {
            addCriterion("is_leader =", value, "isLeader");
            return (Criteria) this;
        }

        public Criteria andIsLeaderNotEqualTo(Integer value) {
            addCriterion("is_leader <>", value, "isLeader");
            return (Criteria) this;
        }

        public Criteria andIsLeaderGreaterThan(Integer value) {
            addCriterion("is_leader >", value, "isLeader");
            return (Criteria) this;
        }

        public Criteria andIsLeaderGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_leader >=", value, "isLeader");
            return (Criteria) this;
        }

        public Criteria andIsLeaderLessThan(Integer value) {
            addCriterion("is_leader <", value, "isLeader");
            return (Criteria) this;
        }

        public Criteria andIsLeaderLessThanOrEqualTo(Integer value) {
            addCriterion("is_leader <=", value, "isLeader");
            return (Criteria) this;
        }

        public Criteria andIsLeaderIn(List<Integer> values) {
            addCriterion("is_leader in", values, "isLeader");
            return (Criteria) this;
        }

        public Criteria andIsLeaderNotIn(List<Integer> values) {
            addCriterion("is_leader not in", values, "isLeader");
            return (Criteria) this;
        }

        public Criteria andIsLeaderBetween(Integer value1, Integer value2) {
            addCriterion("is_leader between", value1, value2, "isLeader");
            return (Criteria) this;
        }

        public Criteria andIsLeaderNotBetween(Integer value1, Integer value2) {
            addCriterion("is_leader not between", value1, value2, "isLeader");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Integer value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Integer value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Integer value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Integer value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Integer value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Integer> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Integer> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Integer value1, Integer value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andKeyDateIsNull() {
            addCriterion("key_date is null");
            return (Criteria) this;
        }

        public Criteria andKeyDateIsNotNull() {
            addCriterion("key_date is not null");
            return (Criteria) this;
        }

        public Criteria andKeyDateEqualTo(Date value) {
            addCriterion("key_date =", value, "keyDate");
            return (Criteria) this;
        }

        public Criteria andKeyDateNotEqualTo(Date value) {
            addCriterion("key_date <>", value, "keyDate");
            return (Criteria) this;
        }

        public Criteria andKeyDateGreaterThan(Date value) {
            addCriterion("key_date >", value, "keyDate");
            return (Criteria) this;
        }

        public Criteria andKeyDateGreaterThanOrEqualTo(Date value) {
            addCriterion("key_date >=", value, "keyDate");
            return (Criteria) this;
        }

        public Criteria andKeyDateLessThan(Date value) {
            addCriterion("key_date <", value, "keyDate");
            return (Criteria) this;
        }

        public Criteria andKeyDateLessThanOrEqualTo(Date value) {
            addCriterion("key_date <=", value, "keyDate");
            return (Criteria) this;
        }

        public Criteria andKeyDateIn(List<Date> values) {
            addCriterion("key_date in", values, "keyDate");
            return (Criteria) this;
        }

        public Criteria andKeyDateNotIn(List<Date> values) {
            addCriterion("key_date not in", values, "keyDate");
            return (Criteria) this;
        }

        public Criteria andKeyDateBetween(Date value1, Date value2) {
            addCriterion("key_date between", value1, value2, "keyDate");
            return (Criteria) this;
        }

        public Criteria andKeyDateNotBetween(Date value1, Date value2) {
            addCriterion("key_date not between", value1, value2, "keyDate");
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