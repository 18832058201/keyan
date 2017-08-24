package com.hebeu.keyan.po;

import java.util.ArrayList;
import java.util.List;

public class ManageMoneyTotalExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ManageMoneyTotalExample() {
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

        public Criteria andCollegeIdIsNull() {
            addCriterion("college_id is null");
            return (Criteria) this;
        }

        public Criteria andCollegeIdIsNotNull() {
            addCriterion("college_id is not null");
            return (Criteria) this;
        }

        public Criteria andCollegeIdEqualTo(Integer value) {
            addCriterion("college_id =", value, "collegeId");
            return (Criteria) this;
        }

        public Criteria andCollegeIdNotEqualTo(Integer value) {
            addCriterion("college_id <>", value, "collegeId");
            return (Criteria) this;
        }

        public Criteria andCollegeIdGreaterThan(Integer value) {
            addCriterion("college_id >", value, "collegeId");
            return (Criteria) this;
        }

        public Criteria andCollegeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("college_id >=", value, "collegeId");
            return (Criteria) this;
        }

        public Criteria andCollegeIdLessThan(Integer value) {
            addCriterion("college_id <", value, "collegeId");
            return (Criteria) this;
        }

        public Criteria andCollegeIdLessThanOrEqualTo(Integer value) {
            addCriterion("college_id <=", value, "collegeId");
            return (Criteria) this;
        }

        public Criteria andCollegeIdIn(List<Integer> values) {
            addCriterion("college_id in", values, "collegeId");
            return (Criteria) this;
        }

        public Criteria andCollegeIdNotIn(List<Integer> values) {
            addCriterion("college_id not in", values, "collegeId");
            return (Criteria) this;
        }

        public Criteria andCollegeIdBetween(Integer value1, Integer value2) {
            addCriterion("college_id between", value1, value2, "collegeId");
            return (Criteria) this;
        }

        public Criteria andCollegeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("college_id not between", value1, value2, "collegeId");
            return (Criteria) this;
        }

        public Criteria andYearIsNull() {
            addCriterion("year is null");
            return (Criteria) this;
        }

        public Criteria andYearIsNotNull() {
            addCriterion("year is not null");
            return (Criteria) this;
        }

        public Criteria andYearEqualTo(Integer value) {
            addCriterion("year =", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotEqualTo(Integer value) {
            addCriterion("year <>", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearGreaterThan(Integer value) {
            addCriterion("year >", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearGreaterThanOrEqualTo(Integer value) {
            addCriterion("year >=", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearLessThan(Integer value) {
            addCriterion("year <", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearLessThanOrEqualTo(Integer value) {
            addCriterion("year <=", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearIn(List<Integer> values) {
            addCriterion("year in", values, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotIn(List<Integer> values) {
            addCriterion("year not in", values, "year");
            return (Criteria) this;
        }

        public Criteria andYearBetween(Integer value1, Integer value2) {
            addCriterion("year between", value1, value2, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotBetween(Integer value1, Integer value2) {
            addCriterion("year not between", value1, value2, "year");
            return (Criteria) this;
        }

        public Criteria andTotalMoneyIsNull() {
            addCriterion("total_money is null");
            return (Criteria) this;
        }

        public Criteria andTotalMoneyIsNotNull() {
            addCriterion("total_money is not null");
            return (Criteria) this;
        }

        public Criteria andTotalMoneyEqualTo(Double value) {
            addCriterion("total_money =", value, "totalMoney");
            return (Criteria) this;
        }

        public Criteria andTotalMoneyNotEqualTo(Double value) {
            addCriterion("total_money <>", value, "totalMoney");
            return (Criteria) this;
        }

        public Criteria andTotalMoneyGreaterThan(Double value) {
            addCriterion("total_money >", value, "totalMoney");
            return (Criteria) this;
        }

        public Criteria andTotalMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("total_money >=", value, "totalMoney");
            return (Criteria) this;
        }

        public Criteria andTotalMoneyLessThan(Double value) {
            addCriterion("total_money <", value, "totalMoney");
            return (Criteria) this;
        }

        public Criteria andTotalMoneyLessThanOrEqualTo(Double value) {
            addCriterion("total_money <=", value, "totalMoney");
            return (Criteria) this;
        }

        public Criteria andTotalMoneyIn(List<Double> values) {
            addCriterion("total_money in", values, "totalMoney");
            return (Criteria) this;
        }

        public Criteria andTotalMoneyNotIn(List<Double> values) {
            addCriterion("total_money not in", values, "totalMoney");
            return (Criteria) this;
        }

        public Criteria andTotalMoneyBetween(Double value1, Double value2) {
            addCriterion("total_money between", value1, value2, "totalMoney");
            return (Criteria) this;
        }

        public Criteria andTotalMoneyNotBetween(Double value1, Double value2) {
            addCriterion("total_money not between", value1, value2, "totalMoney");
            return (Criteria) this;
        }

        public Criteria andAvailMoneyIsNull() {
            addCriterion("avail_money is null");
            return (Criteria) this;
        }

        public Criteria andAvailMoneyIsNotNull() {
            addCriterion("avail_money is not null");
            return (Criteria) this;
        }

        public Criteria andAvailMoneyEqualTo(Double value) {
            addCriterion("avail_money =", value, "availMoney");
            return (Criteria) this;
        }

        public Criteria andAvailMoneyNotEqualTo(Double value) {
            addCriterion("avail_money <>", value, "availMoney");
            return (Criteria) this;
        }

        public Criteria andAvailMoneyGreaterThan(Double value) {
            addCriterion("avail_money >", value, "availMoney");
            return (Criteria) this;
        }

        public Criteria andAvailMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("avail_money >=", value, "availMoney");
            return (Criteria) this;
        }

        public Criteria andAvailMoneyLessThan(Double value) {
            addCriterion("avail_money <", value, "availMoney");
            return (Criteria) this;
        }

        public Criteria andAvailMoneyLessThanOrEqualTo(Double value) {
            addCriterion("avail_money <=", value, "availMoney");
            return (Criteria) this;
        }

        public Criteria andAvailMoneyIn(List<Double> values) {
            addCriterion("avail_money in", values, "availMoney");
            return (Criteria) this;
        }

        public Criteria andAvailMoneyNotIn(List<Double> values) {
            addCriterion("avail_money not in", values, "availMoney");
            return (Criteria) this;
        }

        public Criteria andAvailMoneyBetween(Double value1, Double value2) {
            addCriterion("avail_money between", value1, value2, "availMoney");
            return (Criteria) this;
        }

        public Criteria andAvailMoneyNotBetween(Double value1, Double value2) {
            addCriterion("avail_money not between", value1, value2, "availMoney");
            return (Criteria) this;
        }

        public Criteria andApplyMoneyIsNull() {
            addCriterion("apply_money is null");
            return (Criteria) this;
        }

        public Criteria andApplyMoneyIsNotNull() {
            addCriterion("apply_money is not null");
            return (Criteria) this;
        }

        public Criteria andApplyMoneyEqualTo(Double value) {
            addCriterion("apply_money =", value, "applyMoney");
            return (Criteria) this;
        }

        public Criteria andApplyMoneyNotEqualTo(Double value) {
            addCriterion("apply_money <>", value, "applyMoney");
            return (Criteria) this;
        }

        public Criteria andApplyMoneyGreaterThan(Double value) {
            addCriterion("apply_money >", value, "applyMoney");
            return (Criteria) this;
        }

        public Criteria andApplyMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("apply_money >=", value, "applyMoney");
            return (Criteria) this;
        }

        public Criteria andApplyMoneyLessThan(Double value) {
            addCriterion("apply_money <", value, "applyMoney");
            return (Criteria) this;
        }

        public Criteria andApplyMoneyLessThanOrEqualTo(Double value) {
            addCriterion("apply_money <=", value, "applyMoney");
            return (Criteria) this;
        }

        public Criteria andApplyMoneyIn(List<Double> values) {
            addCriterion("apply_money in", values, "applyMoney");
            return (Criteria) this;
        }

        public Criteria andApplyMoneyNotIn(List<Double> values) {
            addCriterion("apply_money not in", values, "applyMoney");
            return (Criteria) this;
        }

        public Criteria andApplyMoneyBetween(Double value1, Double value2) {
            addCriterion("apply_money between", value1, value2, "applyMoney");
            return (Criteria) this;
        }

        public Criteria andApplyMoneyNotBetween(Double value1, Double value2) {
            addCriterion("apply_money not between", value1, value2, "applyMoney");
            return (Criteria) this;
        }

        public Criteria andPaymentMoneyIsNull() {
            addCriterion("payment_money is null");
            return (Criteria) this;
        }

        public Criteria andPaymentMoneyIsNotNull() {
            addCriterion("payment_money is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentMoneyEqualTo(Double value) {
            addCriterion("payment_money =", value, "paymentMoney");
            return (Criteria) this;
        }

        public Criteria andPaymentMoneyNotEqualTo(Double value) {
            addCriterion("payment_money <>", value, "paymentMoney");
            return (Criteria) this;
        }

        public Criteria andPaymentMoneyGreaterThan(Double value) {
            addCriterion("payment_money >", value, "paymentMoney");
            return (Criteria) this;
        }

        public Criteria andPaymentMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("payment_money >=", value, "paymentMoney");
            return (Criteria) this;
        }

        public Criteria andPaymentMoneyLessThan(Double value) {
            addCriterion("payment_money <", value, "paymentMoney");
            return (Criteria) this;
        }

        public Criteria andPaymentMoneyLessThanOrEqualTo(Double value) {
            addCriterion("payment_money <=", value, "paymentMoney");
            return (Criteria) this;
        }

        public Criteria andPaymentMoneyIn(List<Double> values) {
            addCriterion("payment_money in", values, "paymentMoney");
            return (Criteria) this;
        }

        public Criteria andPaymentMoneyNotIn(List<Double> values) {
            addCriterion("payment_money not in", values, "paymentMoney");
            return (Criteria) this;
        }

        public Criteria andPaymentMoneyBetween(Double value1, Double value2) {
            addCriterion("payment_money between", value1, value2, "paymentMoney");
            return (Criteria) this;
        }

        public Criteria andPaymentMoneyNotBetween(Double value1, Double value2) {
            addCriterion("payment_money not between", value1, value2, "paymentMoney");
            return (Criteria) this;
        }

        public Criteria andAvailApplyIsNull() {
            addCriterion("avail_apply is null");
            return (Criteria) this;
        }

        public Criteria andAvailApplyIsNotNull() {
            addCriterion("avail_apply is not null");
            return (Criteria) this;
        }

        public Criteria andAvailApplyEqualTo(Double value) {
            addCriterion("avail_apply =", value, "availApply");
            return (Criteria) this;
        }

        public Criteria andAvailApplyNotEqualTo(Double value) {
            addCriterion("avail_apply <>", value, "availApply");
            return (Criteria) this;
        }

        public Criteria andAvailApplyGreaterThan(Double value) {
            addCriterion("avail_apply >", value, "availApply");
            return (Criteria) this;
        }

        public Criteria andAvailApplyGreaterThanOrEqualTo(Double value) {
            addCriterion("avail_apply >=", value, "availApply");
            return (Criteria) this;
        }

        public Criteria andAvailApplyLessThan(Double value) {
            addCriterion("avail_apply <", value, "availApply");
            return (Criteria) this;
        }

        public Criteria andAvailApplyLessThanOrEqualTo(Double value) {
            addCriterion("avail_apply <=", value, "availApply");
            return (Criteria) this;
        }

        public Criteria andAvailApplyIn(List<Double> values) {
            addCriterion("avail_apply in", values, "availApply");
            return (Criteria) this;
        }

        public Criteria andAvailApplyNotIn(List<Double> values) {
            addCriterion("avail_apply not in", values, "availApply");
            return (Criteria) this;
        }

        public Criteria andAvailApplyBetween(Double value1, Double value2) {
            addCriterion("avail_apply between", value1, value2, "availApply");
            return (Criteria) this;
        }

        public Criteria andAvailApplyNotBetween(Double value1, Double value2) {
            addCriterion("avail_apply not between", value1, value2, "availApply");
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