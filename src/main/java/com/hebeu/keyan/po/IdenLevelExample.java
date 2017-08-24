package com.hebeu.keyan.po;

import java.util.ArrayList;
import java.util.List;

public class IdenLevelExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public IdenLevelExample() {
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

        public Criteria andIdenLevelIdIsNull() {
            addCriterion("iden_level_id is null");
            return (Criteria) this;
        }

        public Criteria andIdenLevelIdIsNotNull() {
            addCriterion("iden_level_id is not null");
            return (Criteria) this;
        }

        public Criteria andIdenLevelIdEqualTo(Integer value) {
            addCriterion("iden_level_id =", value, "idenLevelId");
            return (Criteria) this;
        }

        public Criteria andIdenLevelIdNotEqualTo(Integer value) {
            addCriterion("iden_level_id <>", value, "idenLevelId");
            return (Criteria) this;
        }

        public Criteria andIdenLevelIdGreaterThan(Integer value) {
            addCriterion("iden_level_id >", value, "idenLevelId");
            return (Criteria) this;
        }

        public Criteria andIdenLevelIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("iden_level_id >=", value, "idenLevelId");
            return (Criteria) this;
        }

        public Criteria andIdenLevelIdLessThan(Integer value) {
            addCriterion("iden_level_id <", value, "idenLevelId");
            return (Criteria) this;
        }

        public Criteria andIdenLevelIdLessThanOrEqualTo(Integer value) {
            addCriterion("iden_level_id <=", value, "idenLevelId");
            return (Criteria) this;
        }

        public Criteria andIdenLevelIdIn(List<Integer> values) {
            addCriterion("iden_level_id in", values, "idenLevelId");
            return (Criteria) this;
        }

        public Criteria andIdenLevelIdNotIn(List<Integer> values) {
            addCriterion("iden_level_id not in", values, "idenLevelId");
            return (Criteria) this;
        }

        public Criteria andIdenLevelIdBetween(Integer value1, Integer value2) {
            addCriterion("iden_level_id between", value1, value2, "idenLevelId");
            return (Criteria) this;
        }

        public Criteria andIdenLevelIdNotBetween(Integer value1, Integer value2) {
            addCriterion("iden_level_id not between", value1, value2, "idenLevelId");
            return (Criteria) this;
        }

        public Criteria andIdenLevelNameIsNull() {
            addCriterion("iden_level_name is null");
            return (Criteria) this;
        }

        public Criteria andIdenLevelNameIsNotNull() {
            addCriterion("iden_level_name is not null");
            return (Criteria) this;
        }

        public Criteria andIdenLevelNameEqualTo(String value) {
            addCriterion("iden_level_name =", value, "idenLevelName");
            return (Criteria) this;
        }

        public Criteria andIdenLevelNameNotEqualTo(String value) {
            addCriterion("iden_level_name <>", value, "idenLevelName");
            return (Criteria) this;
        }

        public Criteria andIdenLevelNameGreaterThan(String value) {
            addCriterion("iden_level_name >", value, "idenLevelName");
            return (Criteria) this;
        }

        public Criteria andIdenLevelNameGreaterThanOrEqualTo(String value) {
            addCriterion("iden_level_name >=", value, "idenLevelName");
            return (Criteria) this;
        }

        public Criteria andIdenLevelNameLessThan(String value) {
            addCriterion("iden_level_name <", value, "idenLevelName");
            return (Criteria) this;
        }

        public Criteria andIdenLevelNameLessThanOrEqualTo(String value) {
            addCriterion("iden_level_name <=", value, "idenLevelName");
            return (Criteria) this;
        }

        public Criteria andIdenLevelNameLike(String value) {
            addCriterion("iden_level_name like", value, "idenLevelName");
            return (Criteria) this;
        }

        public Criteria andIdenLevelNameNotLike(String value) {
            addCriterion("iden_level_name not like", value, "idenLevelName");
            return (Criteria) this;
        }

        public Criteria andIdenLevelNameIn(List<String> values) {
            addCriterion("iden_level_name in", values, "idenLevelName");
            return (Criteria) this;
        }

        public Criteria andIdenLevelNameNotIn(List<String> values) {
            addCriterion("iden_level_name not in", values, "idenLevelName");
            return (Criteria) this;
        }

        public Criteria andIdenLevelNameBetween(String value1, String value2) {
            addCriterion("iden_level_name between", value1, value2, "idenLevelName");
            return (Criteria) this;
        }

        public Criteria andIdenLevelNameNotBetween(String value1, String value2) {
            addCriterion("iden_level_name not between", value1, value2, "idenLevelName");
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