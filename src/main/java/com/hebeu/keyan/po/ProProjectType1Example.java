package com.hebeu.keyan.po;

import java.util.ArrayList;
import java.util.List;

public class ProProjectType1Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProProjectType1Example() {
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

        public Criteria andProjectType1IdIsNull() {
            addCriterion("project_type1_id is null");
            return (Criteria) this;
        }

        public Criteria andProjectType1IdIsNotNull() {
            addCriterion("project_type1_id is not null");
            return (Criteria) this;
        }

        public Criteria andProjectType1IdEqualTo(Integer value) {
            addCriterion("project_type1_id =", value, "projectType1Id");
            return (Criteria) this;
        }

        public Criteria andProjectType1IdNotEqualTo(Integer value) {
            addCriterion("project_type1_id <>", value, "projectType1Id");
            return (Criteria) this;
        }

        public Criteria andProjectType1IdGreaterThan(Integer value) {
            addCriterion("project_type1_id >", value, "projectType1Id");
            return (Criteria) this;
        }

        public Criteria andProjectType1IdGreaterThanOrEqualTo(Integer value) {
            addCriterion("project_type1_id >=", value, "projectType1Id");
            return (Criteria) this;
        }

        public Criteria andProjectType1IdLessThan(Integer value) {
            addCriterion("project_type1_id <", value, "projectType1Id");
            return (Criteria) this;
        }

        public Criteria andProjectType1IdLessThanOrEqualTo(Integer value) {
            addCriterion("project_type1_id <=", value, "projectType1Id");
            return (Criteria) this;
        }

        public Criteria andProjectType1IdIn(List<Integer> values) {
            addCriterion("project_type1_id in", values, "projectType1Id");
            return (Criteria) this;
        }

        public Criteria andProjectType1IdNotIn(List<Integer> values) {
            addCriterion("project_type1_id not in", values, "projectType1Id");
            return (Criteria) this;
        }

        public Criteria andProjectType1IdBetween(Integer value1, Integer value2) {
            addCriterion("project_type1_id between", value1, value2, "projectType1Id");
            return (Criteria) this;
        }

        public Criteria andProjectType1IdNotBetween(Integer value1, Integer value2) {
            addCriterion("project_type1_id not between", value1, value2, "projectType1Id");
            return (Criteria) this;
        }

        public Criteria andProjectType1NameIsNull() {
            addCriterion("project_type1_name is null");
            return (Criteria) this;
        }

        public Criteria andProjectType1NameIsNotNull() {
            addCriterion("project_type1_name is not null");
            return (Criteria) this;
        }

        public Criteria andProjectType1NameEqualTo(String value) {
            addCriterion("project_type1_name =", value, "projectType1Name");
            return (Criteria) this;
        }

        public Criteria andProjectType1NameNotEqualTo(String value) {
            addCriterion("project_type1_name <>", value, "projectType1Name");
            return (Criteria) this;
        }

        public Criteria andProjectType1NameGreaterThan(String value) {
            addCriterion("project_type1_name >", value, "projectType1Name");
            return (Criteria) this;
        }

        public Criteria andProjectType1NameGreaterThanOrEqualTo(String value) {
            addCriterion("project_type1_name >=", value, "projectType1Name");
            return (Criteria) this;
        }

        public Criteria andProjectType1NameLessThan(String value) {
            addCriterion("project_type1_name <", value, "projectType1Name");
            return (Criteria) this;
        }

        public Criteria andProjectType1NameLessThanOrEqualTo(String value) {
            addCriterion("project_type1_name <=", value, "projectType1Name");
            return (Criteria) this;
        }

        public Criteria andProjectType1NameLike(String value) {
            addCriterion("project_type1_name like", value, "projectType1Name");
            return (Criteria) this;
        }

        public Criteria andProjectType1NameNotLike(String value) {
            addCriterion("project_type1_name not like", value, "projectType1Name");
            return (Criteria) this;
        }

        public Criteria andProjectType1NameIn(List<String> values) {
            addCriterion("project_type1_name in", values, "projectType1Name");
            return (Criteria) this;
        }

        public Criteria andProjectType1NameNotIn(List<String> values) {
            addCriterion("project_type1_name not in", values, "projectType1Name");
            return (Criteria) this;
        }

        public Criteria andProjectType1NameBetween(String value1, String value2) {
            addCriterion("project_type1_name between", value1, value2, "projectType1Name");
            return (Criteria) this;
        }

        public Criteria andProjectType1NameNotBetween(String value1, String value2) {
            addCriterion("project_type1_name not between", value1, value2, "projectType1Name");
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