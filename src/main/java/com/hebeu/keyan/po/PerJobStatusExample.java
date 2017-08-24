package com.hebeu.keyan.po;

import java.util.ArrayList;
import java.util.List;

public class PerJobStatusExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PerJobStatusExample() {
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

        public Criteria andJobStatusIdIsNull() {
            addCriterion("job_status_id is null");
            return (Criteria) this;
        }

        public Criteria andJobStatusIdIsNotNull() {
            addCriterion("job_status_id is not null");
            return (Criteria) this;
        }

        public Criteria andJobStatusIdEqualTo(Integer value) {
            addCriterion("job_status_id =", value, "jobStatusId");
            return (Criteria) this;
        }

        public Criteria andJobStatusIdNotEqualTo(Integer value) {
            addCriterion("job_status_id <>", value, "jobStatusId");
            return (Criteria) this;
        }

        public Criteria andJobStatusIdGreaterThan(Integer value) {
            addCriterion("job_status_id >", value, "jobStatusId");
            return (Criteria) this;
        }

        public Criteria andJobStatusIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("job_status_id >=", value, "jobStatusId");
            return (Criteria) this;
        }

        public Criteria andJobStatusIdLessThan(Integer value) {
            addCriterion("job_status_id <", value, "jobStatusId");
            return (Criteria) this;
        }

        public Criteria andJobStatusIdLessThanOrEqualTo(Integer value) {
            addCriterion("job_status_id <=", value, "jobStatusId");
            return (Criteria) this;
        }

        public Criteria andJobStatusIdIn(List<Integer> values) {
            addCriterion("job_status_id in", values, "jobStatusId");
            return (Criteria) this;
        }

        public Criteria andJobStatusIdNotIn(List<Integer> values) {
            addCriterion("job_status_id not in", values, "jobStatusId");
            return (Criteria) this;
        }

        public Criteria andJobStatusIdBetween(Integer value1, Integer value2) {
            addCriterion("job_status_id between", value1, value2, "jobStatusId");
            return (Criteria) this;
        }

        public Criteria andJobStatusIdNotBetween(Integer value1, Integer value2) {
            addCriterion("job_status_id not between", value1, value2, "jobStatusId");
            return (Criteria) this;
        }

        public Criteria andJobStatusNameIsNull() {
            addCriterion("job_status_name is null");
            return (Criteria) this;
        }

        public Criteria andJobStatusNameIsNotNull() {
            addCriterion("job_status_name is not null");
            return (Criteria) this;
        }

        public Criteria andJobStatusNameEqualTo(String value) {
            addCriterion("job_status_name =", value, "jobStatusName");
            return (Criteria) this;
        }

        public Criteria andJobStatusNameNotEqualTo(String value) {
            addCriterion("job_status_name <>", value, "jobStatusName");
            return (Criteria) this;
        }

        public Criteria andJobStatusNameGreaterThan(String value) {
            addCriterion("job_status_name >", value, "jobStatusName");
            return (Criteria) this;
        }

        public Criteria andJobStatusNameGreaterThanOrEqualTo(String value) {
            addCriterion("job_status_name >=", value, "jobStatusName");
            return (Criteria) this;
        }

        public Criteria andJobStatusNameLessThan(String value) {
            addCriterion("job_status_name <", value, "jobStatusName");
            return (Criteria) this;
        }

        public Criteria andJobStatusNameLessThanOrEqualTo(String value) {
            addCriterion("job_status_name <=", value, "jobStatusName");
            return (Criteria) this;
        }

        public Criteria andJobStatusNameLike(String value) {
            addCriterion("job_status_name like", value, "jobStatusName");
            return (Criteria) this;
        }

        public Criteria andJobStatusNameNotLike(String value) {
            addCriterion("job_status_name not like", value, "jobStatusName");
            return (Criteria) this;
        }

        public Criteria andJobStatusNameIn(List<String> values) {
            addCriterion("job_status_name in", values, "jobStatusName");
            return (Criteria) this;
        }

        public Criteria andJobStatusNameNotIn(List<String> values) {
            addCriterion("job_status_name not in", values, "jobStatusName");
            return (Criteria) this;
        }

        public Criteria andJobStatusNameBetween(String value1, String value2) {
            addCriterion("job_status_name between", value1, value2, "jobStatusName");
            return (Criteria) this;
        }

        public Criteria andJobStatusNameNotBetween(String value1, String value2) {
            addCriterion("job_status_name not between", value1, value2, "jobStatusName");
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