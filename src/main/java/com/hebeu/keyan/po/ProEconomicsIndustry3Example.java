package com.hebeu.keyan.po;

import java.util.ArrayList;
import java.util.List;

public class ProEconomicsIndustry3Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProEconomicsIndustry3Example() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andEconomicsIndustry3IdIsNull() {
            addCriterion("economics_industry3_id is null");
            return (Criteria) this;
        }

        public Criteria andEconomicsIndustry3IdIsNotNull() {
            addCriterion("economics_industry3_id is not null");
            return (Criteria) this;
        }

        public Criteria andEconomicsIndustry3IdEqualTo(String value) {
            addCriterion("economics_industry3_id =", value, "economicsIndustry3Id");
            return (Criteria) this;
        }

        public Criteria andEconomicsIndustry3IdNotEqualTo(String value) {
            addCriterion("economics_industry3_id <>", value, "economicsIndustry3Id");
            return (Criteria) this;
        }

        public Criteria andEconomicsIndustry3IdGreaterThan(String value) {
            addCriterion("economics_industry3_id >", value, "economicsIndustry3Id");
            return (Criteria) this;
        }

        public Criteria andEconomicsIndustry3IdGreaterThanOrEqualTo(String value) {
            addCriterion("economics_industry3_id >=", value, "economicsIndustry3Id");
            return (Criteria) this;
        }

        public Criteria andEconomicsIndustry3IdLessThan(String value) {
            addCriterion("economics_industry3_id <", value, "economicsIndustry3Id");
            return (Criteria) this;
        }

        public Criteria andEconomicsIndustry3IdLessThanOrEqualTo(String value) {
            addCriterion("economics_industry3_id <=", value, "economicsIndustry3Id");
            return (Criteria) this;
        }

        public Criteria andEconomicsIndustry3IdLike(String value) {
            addCriterion("economics_industry3_id like", value, "economicsIndustry3Id");
            return (Criteria) this;
        }

        public Criteria andEconomicsIndustry3IdNotLike(String value) {
            addCriterion("economics_industry3_id not like", value, "economicsIndustry3Id");
            return (Criteria) this;
        }

        public Criteria andEconomicsIndustry3IdIn(List<String> values) {
            addCriterion("economics_industry3_id in", values, "economicsIndustry3Id");
            return (Criteria) this;
        }

        public Criteria andEconomicsIndustry3IdNotIn(List<String> values) {
            addCriterion("economics_industry3_id not in", values, "economicsIndustry3Id");
            return (Criteria) this;
        }

        public Criteria andEconomicsIndustry3IdBetween(String value1, String value2) {
            addCriterion("economics_industry3_id between", value1, value2, "economicsIndustry3Id");
            return (Criteria) this;
        }

        public Criteria andEconomicsIndustry3IdNotBetween(String value1, String value2) {
            addCriterion("economics_industry3_id not between", value1, value2, "economicsIndustry3Id");
            return (Criteria) this;
        }

        public Criteria andEconomicsIndustry3NameIsNull() {
            addCriterion("economics_industry3_name is null");
            return (Criteria) this;
        }

        public Criteria andEconomicsIndustry3NameIsNotNull() {
            addCriterion("economics_industry3_name is not null");
            return (Criteria) this;
        }

        public Criteria andEconomicsIndustry3NameEqualTo(String value) {
            addCriterion("economics_industry3_name =", value, "economicsIndustry3Name");
            return (Criteria) this;
        }

        public Criteria andEconomicsIndustry3NameNotEqualTo(String value) {
            addCriterion("economics_industry3_name <>", value, "economicsIndustry3Name");
            return (Criteria) this;
        }

        public Criteria andEconomicsIndustry3NameGreaterThan(String value) {
            addCriterion("economics_industry3_name >", value, "economicsIndustry3Name");
            return (Criteria) this;
        }

        public Criteria andEconomicsIndustry3NameGreaterThanOrEqualTo(String value) {
            addCriterion("economics_industry3_name >=", value, "economicsIndustry3Name");
            return (Criteria) this;
        }

        public Criteria andEconomicsIndustry3NameLessThan(String value) {
            addCriterion("economics_industry3_name <", value, "economicsIndustry3Name");
            return (Criteria) this;
        }

        public Criteria andEconomicsIndustry3NameLessThanOrEqualTo(String value) {
            addCriterion("economics_industry3_name <=", value, "economicsIndustry3Name");
            return (Criteria) this;
        }

        public Criteria andEconomicsIndustry3NameLike(String value) {
            addCriterion("economics_industry3_name like", value, "economicsIndustry3Name");
            return (Criteria) this;
        }

        public Criteria andEconomicsIndustry3NameNotLike(String value) {
            addCriterion("economics_industry3_name not like", value, "economicsIndustry3Name");
            return (Criteria) this;
        }

        public Criteria andEconomicsIndustry3NameIn(List<String> values) {
            addCriterion("economics_industry3_name in", values, "economicsIndustry3Name");
            return (Criteria) this;
        }

        public Criteria andEconomicsIndustry3NameNotIn(List<String> values) {
            addCriterion("economics_industry3_name not in", values, "economicsIndustry3Name");
            return (Criteria) this;
        }

        public Criteria andEconomicsIndustry3NameBetween(String value1, String value2) {
            addCriterion("economics_industry3_name between", value1, value2, "economicsIndustry3Name");
            return (Criteria) this;
        }

        public Criteria andEconomicsIndustry3NameNotBetween(String value1, String value2) {
            addCriterion("economics_industry3_name not between", value1, value2, "economicsIndustry3Name");
            return (Criteria) this;
        }

        public Criteria andEconomicsIndustry2IdIsNull() {
            addCriterion("economics_industry2_id is null");
            return (Criteria) this;
        }

        public Criteria andEconomicsIndustry2IdIsNotNull() {
            addCriterion("economics_industry2_id is not null");
            return (Criteria) this;
        }

        public Criteria andEconomicsIndustry2IdEqualTo(String value) {
            addCriterion("economics_industry2_id =", value, "economicsIndustry2Id");
            return (Criteria) this;
        }

        public Criteria andEconomicsIndustry2IdNotEqualTo(String value) {
            addCriterion("economics_industry2_id <>", value, "economicsIndustry2Id");
            return (Criteria) this;
        }

        public Criteria andEconomicsIndustry2IdGreaterThan(String value) {
            addCriterion("economics_industry2_id >", value, "economicsIndustry2Id");
            return (Criteria) this;
        }

        public Criteria andEconomicsIndustry2IdGreaterThanOrEqualTo(String value) {
            addCriterion("economics_industry2_id >=", value, "economicsIndustry2Id");
            return (Criteria) this;
        }

        public Criteria andEconomicsIndustry2IdLessThan(String value) {
            addCriterion("economics_industry2_id <", value, "economicsIndustry2Id");
            return (Criteria) this;
        }

        public Criteria andEconomicsIndustry2IdLessThanOrEqualTo(String value) {
            addCriterion("economics_industry2_id <=", value, "economicsIndustry2Id");
            return (Criteria) this;
        }

        public Criteria andEconomicsIndustry2IdLike(String value) {
            addCriterion("economics_industry2_id like", value, "economicsIndustry2Id");
            return (Criteria) this;
        }

        public Criteria andEconomicsIndustry2IdNotLike(String value) {
            addCriterion("economics_industry2_id not like", value, "economicsIndustry2Id");
            return (Criteria) this;
        }

        public Criteria andEconomicsIndustry2IdIn(List<String> values) {
            addCriterion("economics_industry2_id in", values, "economicsIndustry2Id");
            return (Criteria) this;
        }

        public Criteria andEconomicsIndustry2IdNotIn(List<String> values) {
            addCriterion("economics_industry2_id not in", values, "economicsIndustry2Id");
            return (Criteria) this;
        }

        public Criteria andEconomicsIndustry2IdBetween(String value1, String value2) {
            addCriterion("economics_industry2_id between", value1, value2, "economicsIndustry2Id");
            return (Criteria) this;
        }

        public Criteria andEconomicsIndustry2IdNotBetween(String value1, String value2) {
            addCriterion("economics_industry2_id not between", value1, value2, "economicsIndustry2Id");
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