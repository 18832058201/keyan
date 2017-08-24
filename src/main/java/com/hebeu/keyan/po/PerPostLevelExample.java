package com.hebeu.keyan.po;

import java.util.ArrayList;
import java.util.List;

public class PerPostLevelExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PerPostLevelExample() {
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

        public Criteria andPostLevelNameIsNull() {
            addCriterion("post_level_name is null");
            return (Criteria) this;
        }

        public Criteria andPostLevelNameIsNotNull() {
            addCriterion("post_level_name is not null");
            return (Criteria) this;
        }

        public Criteria andPostLevelNameEqualTo(String value) {
            addCriterion("post_level_name =", value, "postLevelName");
            return (Criteria) this;
        }

        public Criteria andPostLevelNameNotEqualTo(String value) {
            addCriterion("post_level_name <>", value, "postLevelName");
            return (Criteria) this;
        }

        public Criteria andPostLevelNameGreaterThan(String value) {
            addCriterion("post_level_name >", value, "postLevelName");
            return (Criteria) this;
        }

        public Criteria andPostLevelNameGreaterThanOrEqualTo(String value) {
            addCriterion("post_level_name >=", value, "postLevelName");
            return (Criteria) this;
        }

        public Criteria andPostLevelNameLessThan(String value) {
            addCriterion("post_level_name <", value, "postLevelName");
            return (Criteria) this;
        }

        public Criteria andPostLevelNameLessThanOrEqualTo(String value) {
            addCriterion("post_level_name <=", value, "postLevelName");
            return (Criteria) this;
        }

        public Criteria andPostLevelNameLike(String value) {
            addCriterion("post_level_name like", value, "postLevelName");
            return (Criteria) this;
        }

        public Criteria andPostLevelNameNotLike(String value) {
            addCriterion("post_level_name not like", value, "postLevelName");
            return (Criteria) this;
        }

        public Criteria andPostLevelNameIn(List<String> values) {
            addCriterion("post_level_name in", values, "postLevelName");
            return (Criteria) this;
        }

        public Criteria andPostLevelNameNotIn(List<String> values) {
            addCriterion("post_level_name not in", values, "postLevelName");
            return (Criteria) this;
        }

        public Criteria andPostLevelNameBetween(String value1, String value2) {
            addCriterion("post_level_name between", value1, value2, "postLevelName");
            return (Criteria) this;
        }

        public Criteria andPostLevelNameNotBetween(String value1, String value2) {
            addCriterion("post_level_name not between", value1, value2, "postLevelName");
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

        public Criteria andRateIsNull() {
            addCriterion("rate is null");
            return (Criteria) this;
        }

        public Criteria andRateIsNotNull() {
            addCriterion("rate is not null");
            return (Criteria) this;
        }

        public Criteria andRateEqualTo(Double value) {
            addCriterion("rate =", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateNotEqualTo(Double value) {
            addCriterion("rate <>", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateGreaterThan(Double value) {
            addCriterion("rate >", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateGreaterThanOrEqualTo(Double value) {
            addCriterion("rate >=", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateLessThan(Double value) {
            addCriterion("rate <", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateLessThanOrEqualTo(Double value) {
            addCriterion("rate <=", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateIn(List<Double> values) {
            addCriterion("rate in", values, "rate");
            return (Criteria) this;
        }

        public Criteria andRateNotIn(List<Double> values) {
            addCriterion("rate not in", values, "rate");
            return (Criteria) this;
        }

        public Criteria andRateBetween(Double value1, Double value2) {
            addCriterion("rate between", value1, value2, "rate");
            return (Criteria) this;
        }

        public Criteria andRateNotBetween(Double value1, Double value2) {
            addCriterion("rate not between", value1, value2, "rate");
            return (Criteria) this;
        }

        public Criteria andIsEffectiveIsNull() {
            addCriterion("is_effective is null");
            return (Criteria) this;
        }

        public Criteria andIsEffectiveIsNotNull() {
            addCriterion("is_effective is not null");
            return (Criteria) this;
        }

        public Criteria andIsEffectiveEqualTo(Integer value) {
            addCriterion("is_effective =", value, "isEffective");
            return (Criteria) this;
        }

        public Criteria andIsEffectiveNotEqualTo(Integer value) {
            addCriterion("is_effective <>", value, "isEffective");
            return (Criteria) this;
        }

        public Criteria andIsEffectiveGreaterThan(Integer value) {
            addCriterion("is_effective >", value, "isEffective");
            return (Criteria) this;
        }

        public Criteria andIsEffectiveGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_effective >=", value, "isEffective");
            return (Criteria) this;
        }

        public Criteria andIsEffectiveLessThan(Integer value) {
            addCriterion("is_effective <", value, "isEffective");
            return (Criteria) this;
        }

        public Criteria andIsEffectiveLessThanOrEqualTo(Integer value) {
            addCriterion("is_effective <=", value, "isEffective");
            return (Criteria) this;
        }

        public Criteria andIsEffectiveIn(List<Integer> values) {
            addCriterion("is_effective in", values, "isEffective");
            return (Criteria) this;
        }

        public Criteria andIsEffectiveNotIn(List<Integer> values) {
            addCriterion("is_effective not in", values, "isEffective");
            return (Criteria) this;
        }

        public Criteria andIsEffectiveBetween(Integer value1, Integer value2) {
            addCriterion("is_effective between", value1, value2, "isEffective");
            return (Criteria) this;
        }

        public Criteria andIsEffectiveNotBetween(Integer value1, Integer value2) {
            addCriterion("is_effective not between", value1, value2, "isEffective");
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