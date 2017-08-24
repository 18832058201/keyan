package com.hebeu.keyan.po;

import java.util.ArrayList;
import java.util.List;

public class StandObjectExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StandObjectExample() {
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

        public Criteria andStandObjectNameIsNull() {
            addCriterion("stand_object_name is null");
            return (Criteria) this;
        }

        public Criteria andStandObjectNameIsNotNull() {
            addCriterion("stand_object_name is not null");
            return (Criteria) this;
        }

        public Criteria andStandObjectNameEqualTo(String value) {
            addCriterion("stand_object_name =", value, "standObjectName");
            return (Criteria) this;
        }

        public Criteria andStandObjectNameNotEqualTo(String value) {
            addCriterion("stand_object_name <>", value, "standObjectName");
            return (Criteria) this;
        }

        public Criteria andStandObjectNameGreaterThan(String value) {
            addCriterion("stand_object_name >", value, "standObjectName");
            return (Criteria) this;
        }

        public Criteria andStandObjectNameGreaterThanOrEqualTo(String value) {
            addCriterion("stand_object_name >=", value, "standObjectName");
            return (Criteria) this;
        }

        public Criteria andStandObjectNameLessThan(String value) {
            addCriterion("stand_object_name <", value, "standObjectName");
            return (Criteria) this;
        }

        public Criteria andStandObjectNameLessThanOrEqualTo(String value) {
            addCriterion("stand_object_name <=", value, "standObjectName");
            return (Criteria) this;
        }

        public Criteria andStandObjectNameLike(String value) {
            addCriterion("stand_object_name like", value, "standObjectName");
            return (Criteria) this;
        }

        public Criteria andStandObjectNameNotLike(String value) {
            addCriterion("stand_object_name not like", value, "standObjectName");
            return (Criteria) this;
        }

        public Criteria andStandObjectNameIn(List<String> values) {
            addCriterion("stand_object_name in", values, "standObjectName");
            return (Criteria) this;
        }

        public Criteria andStandObjectNameNotIn(List<String> values) {
            addCriterion("stand_object_name not in", values, "standObjectName");
            return (Criteria) this;
        }

        public Criteria andStandObjectNameBetween(String value1, String value2) {
            addCriterion("stand_object_name between", value1, value2, "standObjectName");
            return (Criteria) this;
        }

        public Criteria andStandObjectNameNotBetween(String value1, String value2) {
            addCriterion("stand_object_name not between", value1, value2, "standObjectName");
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