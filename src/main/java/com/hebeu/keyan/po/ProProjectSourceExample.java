package com.hebeu.keyan.po;

import java.util.ArrayList;
import java.util.List;

public class ProProjectSourceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProProjectSourceExample() {
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

        public Criteria andProjectSourceIdIsNull() {
            addCriterion("project_source_id is null");
            return (Criteria) this;
        }

        public Criteria andProjectSourceIdIsNotNull() {
            addCriterion("project_source_id is not null");
            return (Criteria) this;
        }

        public Criteria andProjectSourceIdEqualTo(Integer value) {
            addCriterion("project_source_id =", value, "projectSourceId");
            return (Criteria) this;
        }

        public Criteria andProjectSourceIdNotEqualTo(Integer value) {
            addCriterion("project_source_id <>", value, "projectSourceId");
            return (Criteria) this;
        }

        public Criteria andProjectSourceIdGreaterThan(Integer value) {
            addCriterion("project_source_id >", value, "projectSourceId");
            return (Criteria) this;
        }

        public Criteria andProjectSourceIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("project_source_id >=", value, "projectSourceId");
            return (Criteria) this;
        }

        public Criteria andProjectSourceIdLessThan(Integer value) {
            addCriterion("project_source_id <", value, "projectSourceId");
            return (Criteria) this;
        }

        public Criteria andProjectSourceIdLessThanOrEqualTo(Integer value) {
            addCriterion("project_source_id <=", value, "projectSourceId");
            return (Criteria) this;
        }

        public Criteria andProjectSourceIdIn(List<Integer> values) {
            addCriterion("project_source_id in", values, "projectSourceId");
            return (Criteria) this;
        }

        public Criteria andProjectSourceIdNotIn(List<Integer> values) {
            addCriterion("project_source_id not in", values, "projectSourceId");
            return (Criteria) this;
        }

        public Criteria andProjectSourceIdBetween(Integer value1, Integer value2) {
            addCriterion("project_source_id between", value1, value2, "projectSourceId");
            return (Criteria) this;
        }

        public Criteria andProjectSourceIdNotBetween(Integer value1, Integer value2) {
            addCriterion("project_source_id not between", value1, value2, "projectSourceId");
            return (Criteria) this;
        }

        public Criteria andProjectSourceNameIsNull() {
            addCriterion("project_source_name is null");
            return (Criteria) this;
        }

        public Criteria andProjectSourceNameIsNotNull() {
            addCriterion("project_source_name is not null");
            return (Criteria) this;
        }

        public Criteria andProjectSourceNameEqualTo(String value) {
            addCriterion("project_source_name =", value, "projectSourceName");
            return (Criteria) this;
        }

        public Criteria andProjectSourceNameNotEqualTo(String value) {
            addCriterion("project_source_name <>", value, "projectSourceName");
            return (Criteria) this;
        }

        public Criteria andProjectSourceNameGreaterThan(String value) {
            addCriterion("project_source_name >", value, "projectSourceName");
            return (Criteria) this;
        }

        public Criteria andProjectSourceNameGreaterThanOrEqualTo(String value) {
            addCriterion("project_source_name >=", value, "projectSourceName");
            return (Criteria) this;
        }

        public Criteria andProjectSourceNameLessThan(String value) {
            addCriterion("project_source_name <", value, "projectSourceName");
            return (Criteria) this;
        }

        public Criteria andProjectSourceNameLessThanOrEqualTo(String value) {
            addCriterion("project_source_name <=", value, "projectSourceName");
            return (Criteria) this;
        }

        public Criteria andProjectSourceNameLike(String value) {
            addCriterion("project_source_name like", value, "projectSourceName");
            return (Criteria) this;
        }

        public Criteria andProjectSourceNameNotLike(String value) {
            addCriterion("project_source_name not like", value, "projectSourceName");
            return (Criteria) this;
        }

        public Criteria andProjectSourceNameIn(List<String> values) {
            addCriterion("project_source_name in", values, "projectSourceName");
            return (Criteria) this;
        }

        public Criteria andProjectSourceNameNotIn(List<String> values) {
            addCriterion("project_source_name not in", values, "projectSourceName");
            return (Criteria) this;
        }

        public Criteria andProjectSourceNameBetween(String value1, String value2) {
            addCriterion("project_source_name between", value1, value2, "projectSourceName");
            return (Criteria) this;
        }

        public Criteria andProjectSourceNameNotBetween(String value1, String value2) {
            addCriterion("project_source_name not between", value1, value2, "projectSourceName");
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