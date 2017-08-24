package com.hebeu.keyan.po;

import java.util.ArrayList;
import java.util.List;

public class PaperPublishRangeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PaperPublishRangeExample() {
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

        public Criteria andPublishRangeNameIsNull() {
            addCriterion("publish_range_name is null");
            return (Criteria) this;
        }

        public Criteria andPublishRangeNameIsNotNull() {
            addCriterion("publish_range_name is not null");
            return (Criteria) this;
        }

        public Criteria andPublishRangeNameEqualTo(String value) {
            addCriterion("publish_range_name =", value, "publishRangeName");
            return (Criteria) this;
        }

        public Criteria andPublishRangeNameNotEqualTo(String value) {
            addCriterion("publish_range_name <>", value, "publishRangeName");
            return (Criteria) this;
        }

        public Criteria andPublishRangeNameGreaterThan(String value) {
            addCriterion("publish_range_name >", value, "publishRangeName");
            return (Criteria) this;
        }

        public Criteria andPublishRangeNameGreaterThanOrEqualTo(String value) {
            addCriterion("publish_range_name >=", value, "publishRangeName");
            return (Criteria) this;
        }

        public Criteria andPublishRangeNameLessThan(String value) {
            addCriterion("publish_range_name <", value, "publishRangeName");
            return (Criteria) this;
        }

        public Criteria andPublishRangeNameLessThanOrEqualTo(String value) {
            addCriterion("publish_range_name <=", value, "publishRangeName");
            return (Criteria) this;
        }

        public Criteria andPublishRangeNameLike(String value) {
            addCriterion("publish_range_name like", value, "publishRangeName");
            return (Criteria) this;
        }

        public Criteria andPublishRangeNameNotLike(String value) {
            addCriterion("publish_range_name not like", value, "publishRangeName");
            return (Criteria) this;
        }

        public Criteria andPublishRangeNameIn(List<String> values) {
            addCriterion("publish_range_name in", values, "publishRangeName");
            return (Criteria) this;
        }

        public Criteria andPublishRangeNameNotIn(List<String> values) {
            addCriterion("publish_range_name not in", values, "publishRangeName");
            return (Criteria) this;
        }

        public Criteria andPublishRangeNameBetween(String value1, String value2) {
            addCriterion("publish_range_name between", value1, value2, "publishRangeName");
            return (Criteria) this;
        }

        public Criteria andPublishRangeNameNotBetween(String value1, String value2) {
            addCriterion("publish_range_name not between", value1, value2, "publishRangeName");
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