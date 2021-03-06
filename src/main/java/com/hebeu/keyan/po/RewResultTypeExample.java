package com.hebeu.keyan.po;

import java.util.ArrayList;
import java.util.List;

public class RewResultTypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RewResultTypeExample() {
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

        public Criteria andResultTypeIdIsNull() {
            addCriterion("result_type_id is null");
            return (Criteria) this;
        }

        public Criteria andResultTypeIdIsNotNull() {
            addCriterion("result_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andResultTypeIdEqualTo(Integer value) {
            addCriterion("result_type_id =", value, "resultTypeId");
            return (Criteria) this;
        }

        public Criteria andResultTypeIdNotEqualTo(Integer value) {
            addCriterion("result_type_id <>", value, "resultTypeId");
            return (Criteria) this;
        }

        public Criteria andResultTypeIdGreaterThan(Integer value) {
            addCriterion("result_type_id >", value, "resultTypeId");
            return (Criteria) this;
        }

        public Criteria andResultTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("result_type_id >=", value, "resultTypeId");
            return (Criteria) this;
        }

        public Criteria andResultTypeIdLessThan(Integer value) {
            addCriterion("result_type_id <", value, "resultTypeId");
            return (Criteria) this;
        }

        public Criteria andResultTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("result_type_id <=", value, "resultTypeId");
            return (Criteria) this;
        }

        public Criteria andResultTypeIdIn(List<Integer> values) {
            addCriterion("result_type_id in", values, "resultTypeId");
            return (Criteria) this;
        }

        public Criteria andResultTypeIdNotIn(List<Integer> values) {
            addCriterion("result_type_id not in", values, "resultTypeId");
            return (Criteria) this;
        }

        public Criteria andResultTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("result_type_id between", value1, value2, "resultTypeId");
            return (Criteria) this;
        }

        public Criteria andResultTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("result_type_id not between", value1, value2, "resultTypeId");
            return (Criteria) this;
        }

        public Criteria andResultTypeNameIsNull() {
            addCriterion("result_type_name is null");
            return (Criteria) this;
        }

        public Criteria andResultTypeNameIsNotNull() {
            addCriterion("result_type_name is not null");
            return (Criteria) this;
        }

        public Criteria andResultTypeNameEqualTo(String value) {
            addCriterion("result_type_name =", value, "resultTypeName");
            return (Criteria) this;
        }

        public Criteria andResultTypeNameNotEqualTo(String value) {
            addCriterion("result_type_name <>", value, "resultTypeName");
            return (Criteria) this;
        }

        public Criteria andResultTypeNameGreaterThan(String value) {
            addCriterion("result_type_name >", value, "resultTypeName");
            return (Criteria) this;
        }

        public Criteria andResultTypeNameGreaterThanOrEqualTo(String value) {
            addCriterion("result_type_name >=", value, "resultTypeName");
            return (Criteria) this;
        }

        public Criteria andResultTypeNameLessThan(String value) {
            addCriterion("result_type_name <", value, "resultTypeName");
            return (Criteria) this;
        }

        public Criteria andResultTypeNameLessThanOrEqualTo(String value) {
            addCriterion("result_type_name <=", value, "resultTypeName");
            return (Criteria) this;
        }

        public Criteria andResultTypeNameLike(String value) {
            addCriterion("result_type_name like", value, "resultTypeName");
            return (Criteria) this;
        }

        public Criteria andResultTypeNameNotLike(String value) {
            addCriterion("result_type_name not like", value, "resultTypeName");
            return (Criteria) this;
        }

        public Criteria andResultTypeNameIn(List<String> values) {
            addCriterion("result_type_name in", values, "resultTypeName");
            return (Criteria) this;
        }

        public Criteria andResultTypeNameNotIn(List<String> values) {
            addCriterion("result_type_name not in", values, "resultTypeName");
            return (Criteria) this;
        }

        public Criteria andResultTypeNameBetween(String value1, String value2) {
            addCriterion("result_type_name between", value1, value2, "resultTypeName");
            return (Criteria) this;
        }

        public Criteria andResultTypeNameNotBetween(String value1, String value2) {
            addCriterion("result_type_name not between", value1, value2, "resultTypeName");
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