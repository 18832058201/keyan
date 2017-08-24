package com.hebeu.keyan.po;

import java.util.ArrayList;
import java.util.List;

public class PerSubjectSecondExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PerSubjectSecondExample() {
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

        public Criteria andSubjectSecondIdIsNull() {
            addCriterion("subject_second_id is null");
            return (Criteria) this;
        }

        public Criteria andSubjectSecondIdIsNotNull() {
            addCriterion("subject_second_id is not null");
            return (Criteria) this;
        }

        public Criteria andSubjectSecondIdEqualTo(Integer value) {
            addCriterion("subject_second_id =", value, "subjectSecondId");
            return (Criteria) this;
        }

        public Criteria andSubjectSecondIdNotEqualTo(Integer value) {
            addCriterion("subject_second_id <>", value, "subjectSecondId");
            return (Criteria) this;
        }

        public Criteria andSubjectSecondIdGreaterThan(Integer value) {
            addCriterion("subject_second_id >", value, "subjectSecondId");
            return (Criteria) this;
        }

        public Criteria andSubjectSecondIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("subject_second_id >=", value, "subjectSecondId");
            return (Criteria) this;
        }

        public Criteria andSubjectSecondIdLessThan(Integer value) {
            addCriterion("subject_second_id <", value, "subjectSecondId");
            return (Criteria) this;
        }

        public Criteria andSubjectSecondIdLessThanOrEqualTo(Integer value) {
            addCriterion("subject_second_id <=", value, "subjectSecondId");
            return (Criteria) this;
        }

        public Criteria andSubjectSecondIdIn(List<Integer> values) {
            addCriterion("subject_second_id in", values, "subjectSecondId");
            return (Criteria) this;
        }

        public Criteria andSubjectSecondIdNotIn(List<Integer> values) {
            addCriterion("subject_second_id not in", values, "subjectSecondId");
            return (Criteria) this;
        }

        public Criteria andSubjectSecondIdBetween(Integer value1, Integer value2) {
            addCriterion("subject_second_id between", value1, value2, "subjectSecondId");
            return (Criteria) this;
        }

        public Criteria andSubjectSecondIdNotBetween(Integer value1, Integer value2) {
            addCriterion("subject_second_id not between", value1, value2, "subjectSecondId");
            return (Criteria) this;
        }

        public Criteria andSubjectSecondNameIsNull() {
            addCriterion("subject_second_name is null");
            return (Criteria) this;
        }

        public Criteria andSubjectSecondNameIsNotNull() {
            addCriterion("subject_second_name is not null");
            return (Criteria) this;
        }

        public Criteria andSubjectSecondNameEqualTo(String value) {
            addCriterion("subject_second_name =", value, "subjectSecondName");
            return (Criteria) this;
        }

        public Criteria andSubjectSecondNameNotEqualTo(String value) {
            addCriterion("subject_second_name <>", value, "subjectSecondName");
            return (Criteria) this;
        }

        public Criteria andSubjectSecondNameGreaterThan(String value) {
            addCriterion("subject_second_name >", value, "subjectSecondName");
            return (Criteria) this;
        }

        public Criteria andSubjectSecondNameGreaterThanOrEqualTo(String value) {
            addCriterion("subject_second_name >=", value, "subjectSecondName");
            return (Criteria) this;
        }

        public Criteria andSubjectSecondNameLessThan(String value) {
            addCriterion("subject_second_name <", value, "subjectSecondName");
            return (Criteria) this;
        }

        public Criteria andSubjectSecondNameLessThanOrEqualTo(String value) {
            addCriterion("subject_second_name <=", value, "subjectSecondName");
            return (Criteria) this;
        }

        public Criteria andSubjectSecondNameLike(String value) {
            addCriterion("subject_second_name like", value, "subjectSecondName");
            return (Criteria) this;
        }

        public Criteria andSubjectSecondNameNotLike(String value) {
            addCriterion("subject_second_name not like", value, "subjectSecondName");
            return (Criteria) this;
        }

        public Criteria andSubjectSecondNameIn(List<String> values) {
            addCriterion("subject_second_name in", values, "subjectSecondName");
            return (Criteria) this;
        }

        public Criteria andSubjectSecondNameNotIn(List<String> values) {
            addCriterion("subject_second_name not in", values, "subjectSecondName");
            return (Criteria) this;
        }

        public Criteria andSubjectSecondNameBetween(String value1, String value2) {
            addCriterion("subject_second_name between", value1, value2, "subjectSecondName");
            return (Criteria) this;
        }

        public Criteria andSubjectSecondNameNotBetween(String value1, String value2) {
            addCriterion("subject_second_name not between", value1, value2, "subjectSecondName");
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