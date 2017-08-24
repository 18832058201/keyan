package com.hebeu.keyan.po;

import java.util.ArrayList;
import java.util.List;

public class StandStateExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StandStateExample() {
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

        public Criteria andStandStateNameIsNull() {
            addCriterion("stand_state_name is null");
            return (Criteria) this;
        }

        public Criteria andStandStateNameIsNotNull() {
            addCriterion("stand_state_name is not null");
            return (Criteria) this;
        }

        public Criteria andStandStateNameEqualTo(String value) {
            addCriterion("stand_state_name =", value, "standStateName");
            return (Criteria) this;
        }

        public Criteria andStandStateNameNotEqualTo(String value) {
            addCriterion("stand_state_name <>", value, "standStateName");
            return (Criteria) this;
        }

        public Criteria andStandStateNameGreaterThan(String value) {
            addCriterion("stand_state_name >", value, "standStateName");
            return (Criteria) this;
        }

        public Criteria andStandStateNameGreaterThanOrEqualTo(String value) {
            addCriterion("stand_state_name >=", value, "standStateName");
            return (Criteria) this;
        }

        public Criteria andStandStateNameLessThan(String value) {
            addCriterion("stand_state_name <", value, "standStateName");
            return (Criteria) this;
        }

        public Criteria andStandStateNameLessThanOrEqualTo(String value) {
            addCriterion("stand_state_name <=", value, "standStateName");
            return (Criteria) this;
        }

        public Criteria andStandStateNameLike(String value) {
            addCriterion("stand_state_name like", value, "standStateName");
            return (Criteria) this;
        }

        public Criteria andStandStateNameNotLike(String value) {
            addCriterion("stand_state_name not like", value, "standStateName");
            return (Criteria) this;
        }

        public Criteria andStandStateNameIn(List<String> values) {
            addCriterion("stand_state_name in", values, "standStateName");
            return (Criteria) this;
        }

        public Criteria andStandStateNameNotIn(List<String> values) {
            addCriterion("stand_state_name not in", values, "standStateName");
            return (Criteria) this;
        }

        public Criteria andStandStateNameBetween(String value1, String value2) {
            addCriterion("stand_state_name between", value1, value2, "standStateName");
            return (Criteria) this;
        }

        public Criteria andStandStateNameNotBetween(String value1, String value2) {
            addCriterion("stand_state_name not between", value1, value2, "standStateName");
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