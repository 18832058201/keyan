package com.hebeu.keyan.po;

import java.util.ArrayList;
import java.util.List;

public class BudgetMoneyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BudgetMoneyExample() {
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

        public Criteria andBudgetIdIsNull() {
            addCriterion("budget_id is null");
            return (Criteria) this;
        }

        public Criteria andBudgetIdIsNotNull() {
            addCriterion("budget_id is not null");
            return (Criteria) this;
        }

        public Criteria andBudgetIdEqualTo(Integer value) {
            addCriterion("budget_id =", value, "budgetId");
            return (Criteria) this;
        }

        public Criteria andBudgetIdNotEqualTo(Integer value) {
            addCriterion("budget_id <>", value, "budgetId");
            return (Criteria) this;
        }

        public Criteria andBudgetIdGreaterThan(Integer value) {
            addCriterion("budget_id >", value, "budgetId");
            return (Criteria) this;
        }

        public Criteria andBudgetIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("budget_id >=", value, "budgetId");
            return (Criteria) this;
        }

        public Criteria andBudgetIdLessThan(Integer value) {
            addCriterion("budget_id <", value, "budgetId");
            return (Criteria) this;
        }

        public Criteria andBudgetIdLessThanOrEqualTo(Integer value) {
            addCriterion("budget_id <=", value, "budgetId");
            return (Criteria) this;
        }

        public Criteria andBudgetIdIn(List<Integer> values) {
            addCriterion("budget_id in", values, "budgetId");
            return (Criteria) this;
        }

        public Criteria andBudgetIdNotIn(List<Integer> values) {
            addCriterion("budget_id not in", values, "budgetId");
            return (Criteria) this;
        }

        public Criteria andBudgetIdBetween(Integer value1, Integer value2) {
            addCriterion("budget_id between", value1, value2, "budgetId");
            return (Criteria) this;
        }

        public Criteria andBudgetIdNotBetween(Integer value1, Integer value2) {
            addCriterion("budget_id not between", value1, value2, "budgetId");
            return (Criteria) this;
        }

        public Criteria andProjectIdIsNull() {
            addCriterion("project_id is null");
            return (Criteria) this;
        }

        public Criteria andProjectIdIsNotNull() {
            addCriterion("project_id is not null");
            return (Criteria) this;
        }

        public Criteria andProjectIdEqualTo(String value) {
            addCriterion("project_id =", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotEqualTo(String value) {
            addCriterion("project_id <>", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdGreaterThan(String value) {
            addCriterion("project_id >", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdGreaterThanOrEqualTo(String value) {
            addCriterion("project_id >=", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdLessThan(String value) {
            addCriterion("project_id <", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdLessThanOrEqualTo(String value) {
            addCriterion("project_id <=", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdLike(String value) {
            addCriterion("project_id like", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotLike(String value) {
            addCriterion("project_id not like", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdIn(List<String> values) {
            addCriterion("project_id in", values, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotIn(List<String> values) {
            addCriterion("project_id not in", values, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdBetween(String value1, String value2) {
            addCriterion("project_id between", value1, value2, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotBetween(String value1, String value2) {
            addCriterion("project_id not between", value1, value2, "projectId");
            return (Criteria) this;
        }

        public Criteria andPublishTotalIsNull() {
            addCriterion("publish_total is null");
            return (Criteria) this;
        }

        public Criteria andPublishTotalIsNotNull() {
            addCriterion("publish_total is not null");
            return (Criteria) this;
        }

        public Criteria andPublishTotalEqualTo(Double value) {
            addCriterion("publish_total =", value, "publishTotal");
            return (Criteria) this;
        }

        public Criteria andPublishTotalNotEqualTo(Double value) {
            addCriterion("publish_total <>", value, "publishTotal");
            return (Criteria) this;
        }

        public Criteria andPublishTotalGreaterThan(Double value) {
            addCriterion("publish_total >", value, "publishTotal");
            return (Criteria) this;
        }

        public Criteria andPublishTotalGreaterThanOrEqualTo(Double value) {
            addCriterion("publish_total >=", value, "publishTotal");
            return (Criteria) this;
        }

        public Criteria andPublishTotalLessThan(Double value) {
            addCriterion("publish_total <", value, "publishTotal");
            return (Criteria) this;
        }

        public Criteria andPublishTotalLessThanOrEqualTo(Double value) {
            addCriterion("publish_total <=", value, "publishTotal");
            return (Criteria) this;
        }

        public Criteria andPublishTotalIn(List<Double> values) {
            addCriterion("publish_total in", values, "publishTotal");
            return (Criteria) this;
        }

        public Criteria andPublishTotalNotIn(List<Double> values) {
            addCriterion("publish_total not in", values, "publishTotal");
            return (Criteria) this;
        }

        public Criteria andPublishTotalBetween(Double value1, Double value2) {
            addCriterion("publish_total between", value1, value2, "publishTotal");
            return (Criteria) this;
        }

        public Criteria andPublishTotalNotBetween(Double value1, Double value2) {
            addCriterion("publish_total not between", value1, value2, "publishTotal");
            return (Criteria) this;
        }

        public Criteria andPublishPaymentIsNull() {
            addCriterion("publish_payment is null");
            return (Criteria) this;
        }

        public Criteria andPublishPaymentIsNotNull() {
            addCriterion("publish_payment is not null");
            return (Criteria) this;
        }

        public Criteria andPublishPaymentEqualTo(Double value) {
            addCriterion("publish_payment =", value, "publishPayment");
            return (Criteria) this;
        }

        public Criteria andPublishPaymentNotEqualTo(Double value) {
            addCriterion("publish_payment <>", value, "publishPayment");
            return (Criteria) this;
        }

        public Criteria andPublishPaymentGreaterThan(Double value) {
            addCriterion("publish_payment >", value, "publishPayment");
            return (Criteria) this;
        }

        public Criteria andPublishPaymentGreaterThanOrEqualTo(Double value) {
            addCriterion("publish_payment >=", value, "publishPayment");
            return (Criteria) this;
        }

        public Criteria andPublishPaymentLessThan(Double value) {
            addCriterion("publish_payment <", value, "publishPayment");
            return (Criteria) this;
        }

        public Criteria andPublishPaymentLessThanOrEqualTo(Double value) {
            addCriterion("publish_payment <=", value, "publishPayment");
            return (Criteria) this;
        }

        public Criteria andPublishPaymentIn(List<Double> values) {
            addCriterion("publish_payment in", values, "publishPayment");
            return (Criteria) this;
        }

        public Criteria andPublishPaymentNotIn(List<Double> values) {
            addCriterion("publish_payment not in", values, "publishPayment");
            return (Criteria) this;
        }

        public Criteria andPublishPaymentBetween(Double value1, Double value2) {
            addCriterion("publish_payment between", value1, value2, "publishPayment");
            return (Criteria) this;
        }

        public Criteria andPublishPaymentNotBetween(Double value1, Double value2) {
            addCriterion("publish_payment not between", value1, value2, "publishPayment");
            return (Criteria) this;
        }

        public Criteria andPublishApplyIsNull() {
            addCriterion("publish_apply is null");
            return (Criteria) this;
        }

        public Criteria andPublishApplyIsNotNull() {
            addCriterion("publish_apply is not null");
            return (Criteria) this;
        }

        public Criteria andPublishApplyEqualTo(Double value) {
            addCriterion("publish_apply =", value, "publishApply");
            return (Criteria) this;
        }

        public Criteria andPublishApplyNotEqualTo(Double value) {
            addCriterion("publish_apply <>", value, "publishApply");
            return (Criteria) this;
        }

        public Criteria andPublishApplyGreaterThan(Double value) {
            addCriterion("publish_apply >", value, "publishApply");
            return (Criteria) this;
        }

        public Criteria andPublishApplyGreaterThanOrEqualTo(Double value) {
            addCriterion("publish_apply >=", value, "publishApply");
            return (Criteria) this;
        }

        public Criteria andPublishApplyLessThan(Double value) {
            addCriterion("publish_apply <", value, "publishApply");
            return (Criteria) this;
        }

        public Criteria andPublishApplyLessThanOrEqualTo(Double value) {
            addCriterion("publish_apply <=", value, "publishApply");
            return (Criteria) this;
        }

        public Criteria andPublishApplyIn(List<Double> values) {
            addCriterion("publish_apply in", values, "publishApply");
            return (Criteria) this;
        }

        public Criteria andPublishApplyNotIn(List<Double> values) {
            addCriterion("publish_apply not in", values, "publishApply");
            return (Criteria) this;
        }

        public Criteria andPublishApplyBetween(Double value1, Double value2) {
            addCriterion("publish_apply between", value1, value2, "publishApply");
            return (Criteria) this;
        }

        public Criteria andPublishApplyNotBetween(Double value1, Double value2) {
            addCriterion("publish_apply not between", value1, value2, "publishApply");
            return (Criteria) this;
        }

        public Criteria andMaterialsTotalIsNull() {
            addCriterion("materials_total is null");
            return (Criteria) this;
        }

        public Criteria andMaterialsTotalIsNotNull() {
            addCriterion("materials_total is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialsTotalEqualTo(Double value) {
            addCriterion("materials_total =", value, "materialsTotal");
            return (Criteria) this;
        }

        public Criteria andMaterialsTotalNotEqualTo(Double value) {
            addCriterion("materials_total <>", value, "materialsTotal");
            return (Criteria) this;
        }

        public Criteria andMaterialsTotalGreaterThan(Double value) {
            addCriterion("materials_total >", value, "materialsTotal");
            return (Criteria) this;
        }

        public Criteria andMaterialsTotalGreaterThanOrEqualTo(Double value) {
            addCriterion("materials_total >=", value, "materialsTotal");
            return (Criteria) this;
        }

        public Criteria andMaterialsTotalLessThan(Double value) {
            addCriterion("materials_total <", value, "materialsTotal");
            return (Criteria) this;
        }

        public Criteria andMaterialsTotalLessThanOrEqualTo(Double value) {
            addCriterion("materials_total <=", value, "materialsTotal");
            return (Criteria) this;
        }

        public Criteria andMaterialsTotalIn(List<Double> values) {
            addCriterion("materials_total in", values, "materialsTotal");
            return (Criteria) this;
        }

        public Criteria andMaterialsTotalNotIn(List<Double> values) {
            addCriterion("materials_total not in", values, "materialsTotal");
            return (Criteria) this;
        }

        public Criteria andMaterialsTotalBetween(Double value1, Double value2) {
            addCriterion("materials_total between", value1, value2, "materialsTotal");
            return (Criteria) this;
        }

        public Criteria andMaterialsTotalNotBetween(Double value1, Double value2) {
            addCriterion("materials_total not between", value1, value2, "materialsTotal");
            return (Criteria) this;
        }

        public Criteria andMaterialsPaymentIsNull() {
            addCriterion("materials_payment is null");
            return (Criteria) this;
        }

        public Criteria andMaterialsPaymentIsNotNull() {
            addCriterion("materials_payment is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialsPaymentEqualTo(Double value) {
            addCriterion("materials_payment =", value, "materialsPayment");
            return (Criteria) this;
        }

        public Criteria andMaterialsPaymentNotEqualTo(Double value) {
            addCriterion("materials_payment <>", value, "materialsPayment");
            return (Criteria) this;
        }

        public Criteria andMaterialsPaymentGreaterThan(Double value) {
            addCriterion("materials_payment >", value, "materialsPayment");
            return (Criteria) this;
        }

        public Criteria andMaterialsPaymentGreaterThanOrEqualTo(Double value) {
            addCriterion("materials_payment >=", value, "materialsPayment");
            return (Criteria) this;
        }

        public Criteria andMaterialsPaymentLessThan(Double value) {
            addCriterion("materials_payment <", value, "materialsPayment");
            return (Criteria) this;
        }

        public Criteria andMaterialsPaymentLessThanOrEqualTo(Double value) {
            addCriterion("materials_payment <=", value, "materialsPayment");
            return (Criteria) this;
        }

        public Criteria andMaterialsPaymentIn(List<Double> values) {
            addCriterion("materials_payment in", values, "materialsPayment");
            return (Criteria) this;
        }

        public Criteria andMaterialsPaymentNotIn(List<Double> values) {
            addCriterion("materials_payment not in", values, "materialsPayment");
            return (Criteria) this;
        }

        public Criteria andMaterialsPaymentBetween(Double value1, Double value2) {
            addCriterion("materials_payment between", value1, value2, "materialsPayment");
            return (Criteria) this;
        }

        public Criteria andMaterialsPaymentNotBetween(Double value1, Double value2) {
            addCriterion("materials_payment not between", value1, value2, "materialsPayment");
            return (Criteria) this;
        }

        public Criteria andMaterialsApplyIsNull() {
            addCriterion("materials_apply is null");
            return (Criteria) this;
        }

        public Criteria andMaterialsApplyIsNotNull() {
            addCriterion("materials_apply is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialsApplyEqualTo(Double value) {
            addCriterion("materials_apply =", value, "materialsApply");
            return (Criteria) this;
        }

        public Criteria andMaterialsApplyNotEqualTo(Double value) {
            addCriterion("materials_apply <>", value, "materialsApply");
            return (Criteria) this;
        }

        public Criteria andMaterialsApplyGreaterThan(Double value) {
            addCriterion("materials_apply >", value, "materialsApply");
            return (Criteria) this;
        }

        public Criteria andMaterialsApplyGreaterThanOrEqualTo(Double value) {
            addCriterion("materials_apply >=", value, "materialsApply");
            return (Criteria) this;
        }

        public Criteria andMaterialsApplyLessThan(Double value) {
            addCriterion("materials_apply <", value, "materialsApply");
            return (Criteria) this;
        }

        public Criteria andMaterialsApplyLessThanOrEqualTo(Double value) {
            addCriterion("materials_apply <=", value, "materialsApply");
            return (Criteria) this;
        }

        public Criteria andMaterialsApplyIn(List<Double> values) {
            addCriterion("materials_apply in", values, "materialsApply");
            return (Criteria) this;
        }

        public Criteria andMaterialsApplyNotIn(List<Double> values) {
            addCriterion("materials_apply not in", values, "materialsApply");
            return (Criteria) this;
        }

        public Criteria andMaterialsApplyBetween(Double value1, Double value2) {
            addCriterion("materials_apply between", value1, value2, "materialsApply");
            return (Criteria) this;
        }

        public Criteria andMaterialsApplyNotBetween(Double value1, Double value2) {
            addCriterion("materials_apply not between", value1, value2, "materialsApply");
            return (Criteria) this;
        }

        public Criteria andTestTotalIsNull() {
            addCriterion("test_total is null");
            return (Criteria) this;
        }

        public Criteria andTestTotalIsNotNull() {
            addCriterion("test_total is not null");
            return (Criteria) this;
        }

        public Criteria andTestTotalEqualTo(Double value) {
            addCriterion("test_total =", value, "testTotal");
            return (Criteria) this;
        }

        public Criteria andTestTotalNotEqualTo(Double value) {
            addCriterion("test_total <>", value, "testTotal");
            return (Criteria) this;
        }

        public Criteria andTestTotalGreaterThan(Double value) {
            addCriterion("test_total >", value, "testTotal");
            return (Criteria) this;
        }

        public Criteria andTestTotalGreaterThanOrEqualTo(Double value) {
            addCriterion("test_total >=", value, "testTotal");
            return (Criteria) this;
        }

        public Criteria andTestTotalLessThan(Double value) {
            addCriterion("test_total <", value, "testTotal");
            return (Criteria) this;
        }

        public Criteria andTestTotalLessThanOrEqualTo(Double value) {
            addCriterion("test_total <=", value, "testTotal");
            return (Criteria) this;
        }

        public Criteria andTestTotalIn(List<Double> values) {
            addCriterion("test_total in", values, "testTotal");
            return (Criteria) this;
        }

        public Criteria andTestTotalNotIn(List<Double> values) {
            addCriterion("test_total not in", values, "testTotal");
            return (Criteria) this;
        }

        public Criteria andTestTotalBetween(Double value1, Double value2) {
            addCriterion("test_total between", value1, value2, "testTotal");
            return (Criteria) this;
        }

        public Criteria andTestTotalNotBetween(Double value1, Double value2) {
            addCriterion("test_total not between", value1, value2, "testTotal");
            return (Criteria) this;
        }

        public Criteria andTestPaymentIsNull() {
            addCriterion("test_payment is null");
            return (Criteria) this;
        }

        public Criteria andTestPaymentIsNotNull() {
            addCriterion("test_payment is not null");
            return (Criteria) this;
        }

        public Criteria andTestPaymentEqualTo(Double value) {
            addCriterion("test_payment =", value, "testPayment");
            return (Criteria) this;
        }

        public Criteria andTestPaymentNotEqualTo(Double value) {
            addCriterion("test_payment <>", value, "testPayment");
            return (Criteria) this;
        }

        public Criteria andTestPaymentGreaterThan(Double value) {
            addCriterion("test_payment >", value, "testPayment");
            return (Criteria) this;
        }

        public Criteria andTestPaymentGreaterThanOrEqualTo(Double value) {
            addCriterion("test_payment >=", value, "testPayment");
            return (Criteria) this;
        }

        public Criteria andTestPaymentLessThan(Double value) {
            addCriterion("test_payment <", value, "testPayment");
            return (Criteria) this;
        }

        public Criteria andTestPaymentLessThanOrEqualTo(Double value) {
            addCriterion("test_payment <=", value, "testPayment");
            return (Criteria) this;
        }

        public Criteria andTestPaymentIn(List<Double> values) {
            addCriterion("test_payment in", values, "testPayment");
            return (Criteria) this;
        }

        public Criteria andTestPaymentNotIn(List<Double> values) {
            addCriterion("test_payment not in", values, "testPayment");
            return (Criteria) this;
        }

        public Criteria andTestPaymentBetween(Double value1, Double value2) {
            addCriterion("test_payment between", value1, value2, "testPayment");
            return (Criteria) this;
        }

        public Criteria andTestPaymentNotBetween(Double value1, Double value2) {
            addCriterion("test_payment not between", value1, value2, "testPayment");
            return (Criteria) this;
        }

        public Criteria andTestApplyIsNull() {
            addCriterion("test_apply is null");
            return (Criteria) this;
        }

        public Criteria andTestApplyIsNotNull() {
            addCriterion("test_apply is not null");
            return (Criteria) this;
        }

        public Criteria andTestApplyEqualTo(Double value) {
            addCriterion("test_apply =", value, "testApply");
            return (Criteria) this;
        }

        public Criteria andTestApplyNotEqualTo(Double value) {
            addCriterion("test_apply <>", value, "testApply");
            return (Criteria) this;
        }

        public Criteria andTestApplyGreaterThan(Double value) {
            addCriterion("test_apply >", value, "testApply");
            return (Criteria) this;
        }

        public Criteria andTestApplyGreaterThanOrEqualTo(Double value) {
            addCriterion("test_apply >=", value, "testApply");
            return (Criteria) this;
        }

        public Criteria andTestApplyLessThan(Double value) {
            addCriterion("test_apply <", value, "testApply");
            return (Criteria) this;
        }

        public Criteria andTestApplyLessThanOrEqualTo(Double value) {
            addCriterion("test_apply <=", value, "testApply");
            return (Criteria) this;
        }

        public Criteria andTestApplyIn(List<Double> values) {
            addCriterion("test_apply in", values, "testApply");
            return (Criteria) this;
        }

        public Criteria andTestApplyNotIn(List<Double> values) {
            addCriterion("test_apply not in", values, "testApply");
            return (Criteria) this;
        }

        public Criteria andTestApplyBetween(Double value1, Double value2) {
            addCriterion("test_apply between", value1, value2, "testApply");
            return (Criteria) this;
        }

        public Criteria andTestApplyNotBetween(Double value1, Double value2) {
            addCriterion("test_apply not between", value1, value2, "testApply");
            return (Criteria) this;
        }

        public Criteria andFuelTotalIsNull() {
            addCriterion("fuel_total is null");
            return (Criteria) this;
        }

        public Criteria andFuelTotalIsNotNull() {
            addCriterion("fuel_total is not null");
            return (Criteria) this;
        }

        public Criteria andFuelTotalEqualTo(Double value) {
            addCriterion("fuel_total =", value, "fuelTotal");
            return (Criteria) this;
        }

        public Criteria andFuelTotalNotEqualTo(Double value) {
            addCriterion("fuel_total <>", value, "fuelTotal");
            return (Criteria) this;
        }

        public Criteria andFuelTotalGreaterThan(Double value) {
            addCriterion("fuel_total >", value, "fuelTotal");
            return (Criteria) this;
        }

        public Criteria andFuelTotalGreaterThanOrEqualTo(Double value) {
            addCriterion("fuel_total >=", value, "fuelTotal");
            return (Criteria) this;
        }

        public Criteria andFuelTotalLessThan(Double value) {
            addCriterion("fuel_total <", value, "fuelTotal");
            return (Criteria) this;
        }

        public Criteria andFuelTotalLessThanOrEqualTo(Double value) {
            addCriterion("fuel_total <=", value, "fuelTotal");
            return (Criteria) this;
        }

        public Criteria andFuelTotalIn(List<Double> values) {
            addCriterion("fuel_total in", values, "fuelTotal");
            return (Criteria) this;
        }

        public Criteria andFuelTotalNotIn(List<Double> values) {
            addCriterion("fuel_total not in", values, "fuelTotal");
            return (Criteria) this;
        }

        public Criteria andFuelTotalBetween(Double value1, Double value2) {
            addCriterion("fuel_total between", value1, value2, "fuelTotal");
            return (Criteria) this;
        }

        public Criteria andFuelTotalNotBetween(Double value1, Double value2) {
            addCriterion("fuel_total not between", value1, value2, "fuelTotal");
            return (Criteria) this;
        }

        public Criteria andFuelPaymentIsNull() {
            addCriterion("fuel_payment is null");
            return (Criteria) this;
        }

        public Criteria andFuelPaymentIsNotNull() {
            addCriterion("fuel_payment is not null");
            return (Criteria) this;
        }

        public Criteria andFuelPaymentEqualTo(Double value) {
            addCriterion("fuel_payment =", value, "fuelPayment");
            return (Criteria) this;
        }

        public Criteria andFuelPaymentNotEqualTo(Double value) {
            addCriterion("fuel_payment <>", value, "fuelPayment");
            return (Criteria) this;
        }

        public Criteria andFuelPaymentGreaterThan(Double value) {
            addCriterion("fuel_payment >", value, "fuelPayment");
            return (Criteria) this;
        }

        public Criteria andFuelPaymentGreaterThanOrEqualTo(Double value) {
            addCriterion("fuel_payment >=", value, "fuelPayment");
            return (Criteria) this;
        }

        public Criteria andFuelPaymentLessThan(Double value) {
            addCriterion("fuel_payment <", value, "fuelPayment");
            return (Criteria) this;
        }

        public Criteria andFuelPaymentLessThanOrEqualTo(Double value) {
            addCriterion("fuel_payment <=", value, "fuelPayment");
            return (Criteria) this;
        }

        public Criteria andFuelPaymentIn(List<Double> values) {
            addCriterion("fuel_payment in", values, "fuelPayment");
            return (Criteria) this;
        }

        public Criteria andFuelPaymentNotIn(List<Double> values) {
            addCriterion("fuel_payment not in", values, "fuelPayment");
            return (Criteria) this;
        }

        public Criteria andFuelPaymentBetween(Double value1, Double value2) {
            addCriterion("fuel_payment between", value1, value2, "fuelPayment");
            return (Criteria) this;
        }

        public Criteria andFuelPaymentNotBetween(Double value1, Double value2) {
            addCriterion("fuel_payment not between", value1, value2, "fuelPayment");
            return (Criteria) this;
        }

        public Criteria andFuelApplyIsNull() {
            addCriterion("fuel_apply is null");
            return (Criteria) this;
        }

        public Criteria andFuelApplyIsNotNull() {
            addCriterion("fuel_apply is not null");
            return (Criteria) this;
        }

        public Criteria andFuelApplyEqualTo(Double value) {
            addCriterion("fuel_apply =", value, "fuelApply");
            return (Criteria) this;
        }

        public Criteria andFuelApplyNotEqualTo(Double value) {
            addCriterion("fuel_apply <>", value, "fuelApply");
            return (Criteria) this;
        }

        public Criteria andFuelApplyGreaterThan(Double value) {
            addCriterion("fuel_apply >", value, "fuelApply");
            return (Criteria) this;
        }

        public Criteria andFuelApplyGreaterThanOrEqualTo(Double value) {
            addCriterion("fuel_apply >=", value, "fuelApply");
            return (Criteria) this;
        }

        public Criteria andFuelApplyLessThan(Double value) {
            addCriterion("fuel_apply <", value, "fuelApply");
            return (Criteria) this;
        }

        public Criteria andFuelApplyLessThanOrEqualTo(Double value) {
            addCriterion("fuel_apply <=", value, "fuelApply");
            return (Criteria) this;
        }

        public Criteria andFuelApplyIn(List<Double> values) {
            addCriterion("fuel_apply in", values, "fuelApply");
            return (Criteria) this;
        }

        public Criteria andFuelApplyNotIn(List<Double> values) {
            addCriterion("fuel_apply not in", values, "fuelApply");
            return (Criteria) this;
        }

        public Criteria andFuelApplyBetween(Double value1, Double value2) {
            addCriterion("fuel_apply between", value1, value2, "fuelApply");
            return (Criteria) this;
        }

        public Criteria andFuelApplyNotBetween(Double value1, Double value2) {
            addCriterion("fuel_apply not between", value1, value2, "fuelApply");
            return (Criteria) this;
        }

        public Criteria andTravelTotalIsNull() {
            addCriterion("travel_total is null");
            return (Criteria) this;
        }

        public Criteria andTravelTotalIsNotNull() {
            addCriterion("travel_total is not null");
            return (Criteria) this;
        }

        public Criteria andTravelTotalEqualTo(Double value) {
            addCriterion("travel_total =", value, "travelTotal");
            return (Criteria) this;
        }

        public Criteria andTravelTotalNotEqualTo(Double value) {
            addCriterion("travel_total <>", value, "travelTotal");
            return (Criteria) this;
        }

        public Criteria andTravelTotalGreaterThan(Double value) {
            addCriterion("travel_total >", value, "travelTotal");
            return (Criteria) this;
        }

        public Criteria andTravelTotalGreaterThanOrEqualTo(Double value) {
            addCriterion("travel_total >=", value, "travelTotal");
            return (Criteria) this;
        }

        public Criteria andTravelTotalLessThan(Double value) {
            addCriterion("travel_total <", value, "travelTotal");
            return (Criteria) this;
        }

        public Criteria andTravelTotalLessThanOrEqualTo(Double value) {
            addCriterion("travel_total <=", value, "travelTotal");
            return (Criteria) this;
        }

        public Criteria andTravelTotalIn(List<Double> values) {
            addCriterion("travel_total in", values, "travelTotal");
            return (Criteria) this;
        }

        public Criteria andTravelTotalNotIn(List<Double> values) {
            addCriterion("travel_total not in", values, "travelTotal");
            return (Criteria) this;
        }

        public Criteria andTravelTotalBetween(Double value1, Double value2) {
            addCriterion("travel_total between", value1, value2, "travelTotal");
            return (Criteria) this;
        }

        public Criteria andTravelTotalNotBetween(Double value1, Double value2) {
            addCriterion("travel_total not between", value1, value2, "travelTotal");
            return (Criteria) this;
        }

        public Criteria andTravelPaymentIsNull() {
            addCriterion("travel_payment is null");
            return (Criteria) this;
        }

        public Criteria andTravelPaymentIsNotNull() {
            addCriterion("travel_payment is not null");
            return (Criteria) this;
        }

        public Criteria andTravelPaymentEqualTo(Double value) {
            addCriterion("travel_payment =", value, "travelPayment");
            return (Criteria) this;
        }

        public Criteria andTravelPaymentNotEqualTo(Double value) {
            addCriterion("travel_payment <>", value, "travelPayment");
            return (Criteria) this;
        }

        public Criteria andTravelPaymentGreaterThan(Double value) {
            addCriterion("travel_payment >", value, "travelPayment");
            return (Criteria) this;
        }

        public Criteria andTravelPaymentGreaterThanOrEqualTo(Double value) {
            addCriterion("travel_payment >=", value, "travelPayment");
            return (Criteria) this;
        }

        public Criteria andTravelPaymentLessThan(Double value) {
            addCriterion("travel_payment <", value, "travelPayment");
            return (Criteria) this;
        }

        public Criteria andTravelPaymentLessThanOrEqualTo(Double value) {
            addCriterion("travel_payment <=", value, "travelPayment");
            return (Criteria) this;
        }

        public Criteria andTravelPaymentIn(List<Double> values) {
            addCriterion("travel_payment in", values, "travelPayment");
            return (Criteria) this;
        }

        public Criteria andTravelPaymentNotIn(List<Double> values) {
            addCriterion("travel_payment not in", values, "travelPayment");
            return (Criteria) this;
        }

        public Criteria andTravelPaymentBetween(Double value1, Double value2) {
            addCriterion("travel_payment between", value1, value2, "travelPayment");
            return (Criteria) this;
        }

        public Criteria andTravelPaymentNotBetween(Double value1, Double value2) {
            addCriterion("travel_payment not between", value1, value2, "travelPayment");
            return (Criteria) this;
        }

        public Criteria andTravelApplyIsNull() {
            addCriterion("travel_apply is null");
            return (Criteria) this;
        }

        public Criteria andTravelApplyIsNotNull() {
            addCriterion("travel_apply is not null");
            return (Criteria) this;
        }

        public Criteria andTravelApplyEqualTo(Double value) {
            addCriterion("travel_apply =", value, "travelApply");
            return (Criteria) this;
        }

        public Criteria andTravelApplyNotEqualTo(Double value) {
            addCriterion("travel_apply <>", value, "travelApply");
            return (Criteria) this;
        }

        public Criteria andTravelApplyGreaterThan(Double value) {
            addCriterion("travel_apply >", value, "travelApply");
            return (Criteria) this;
        }

        public Criteria andTravelApplyGreaterThanOrEqualTo(Double value) {
            addCriterion("travel_apply >=", value, "travelApply");
            return (Criteria) this;
        }

        public Criteria andTravelApplyLessThan(Double value) {
            addCriterion("travel_apply <", value, "travelApply");
            return (Criteria) this;
        }

        public Criteria andTravelApplyLessThanOrEqualTo(Double value) {
            addCriterion("travel_apply <=", value, "travelApply");
            return (Criteria) this;
        }

        public Criteria andTravelApplyIn(List<Double> values) {
            addCriterion("travel_apply in", values, "travelApply");
            return (Criteria) this;
        }

        public Criteria andTravelApplyNotIn(List<Double> values) {
            addCriterion("travel_apply not in", values, "travelApply");
            return (Criteria) this;
        }

        public Criteria andTravelApplyBetween(Double value1, Double value2) {
            addCriterion("travel_apply between", value1, value2, "travelApply");
            return (Criteria) this;
        }

        public Criteria andTravelApplyNotBetween(Double value1, Double value2) {
            addCriterion("travel_apply not between", value1, value2, "travelApply");
            return (Criteria) this;
        }

        public Criteria andMeetTotalIsNull() {
            addCriterion("meet_total is null");
            return (Criteria) this;
        }

        public Criteria andMeetTotalIsNotNull() {
            addCriterion("meet_total is not null");
            return (Criteria) this;
        }

        public Criteria andMeetTotalEqualTo(Double value) {
            addCriterion("meet_total =", value, "meetTotal");
            return (Criteria) this;
        }

        public Criteria andMeetTotalNotEqualTo(Double value) {
            addCriterion("meet_total <>", value, "meetTotal");
            return (Criteria) this;
        }

        public Criteria andMeetTotalGreaterThan(Double value) {
            addCriterion("meet_total >", value, "meetTotal");
            return (Criteria) this;
        }

        public Criteria andMeetTotalGreaterThanOrEqualTo(Double value) {
            addCriterion("meet_total >=", value, "meetTotal");
            return (Criteria) this;
        }

        public Criteria andMeetTotalLessThan(Double value) {
            addCriterion("meet_total <", value, "meetTotal");
            return (Criteria) this;
        }

        public Criteria andMeetTotalLessThanOrEqualTo(Double value) {
            addCriterion("meet_total <=", value, "meetTotal");
            return (Criteria) this;
        }

        public Criteria andMeetTotalIn(List<Double> values) {
            addCriterion("meet_total in", values, "meetTotal");
            return (Criteria) this;
        }

        public Criteria andMeetTotalNotIn(List<Double> values) {
            addCriterion("meet_total not in", values, "meetTotal");
            return (Criteria) this;
        }

        public Criteria andMeetTotalBetween(Double value1, Double value2) {
            addCriterion("meet_total between", value1, value2, "meetTotal");
            return (Criteria) this;
        }

        public Criteria andMeetTotalNotBetween(Double value1, Double value2) {
            addCriterion("meet_total not between", value1, value2, "meetTotal");
            return (Criteria) this;
        }

        public Criteria andMeetPaymentIsNull() {
            addCriterion("meet_payment is null");
            return (Criteria) this;
        }

        public Criteria andMeetPaymentIsNotNull() {
            addCriterion("meet_payment is not null");
            return (Criteria) this;
        }

        public Criteria andMeetPaymentEqualTo(Double value) {
            addCriterion("meet_payment =", value, "meetPayment");
            return (Criteria) this;
        }

        public Criteria andMeetPaymentNotEqualTo(Double value) {
            addCriterion("meet_payment <>", value, "meetPayment");
            return (Criteria) this;
        }

        public Criteria andMeetPaymentGreaterThan(Double value) {
            addCriterion("meet_payment >", value, "meetPayment");
            return (Criteria) this;
        }

        public Criteria andMeetPaymentGreaterThanOrEqualTo(Double value) {
            addCriterion("meet_payment >=", value, "meetPayment");
            return (Criteria) this;
        }

        public Criteria andMeetPaymentLessThan(Double value) {
            addCriterion("meet_payment <", value, "meetPayment");
            return (Criteria) this;
        }

        public Criteria andMeetPaymentLessThanOrEqualTo(Double value) {
            addCriterion("meet_payment <=", value, "meetPayment");
            return (Criteria) this;
        }

        public Criteria andMeetPaymentIn(List<Double> values) {
            addCriterion("meet_payment in", values, "meetPayment");
            return (Criteria) this;
        }

        public Criteria andMeetPaymentNotIn(List<Double> values) {
            addCriterion("meet_payment not in", values, "meetPayment");
            return (Criteria) this;
        }

        public Criteria andMeetPaymentBetween(Double value1, Double value2) {
            addCriterion("meet_payment between", value1, value2, "meetPayment");
            return (Criteria) this;
        }

        public Criteria andMeetPaymentNotBetween(Double value1, Double value2) {
            addCriterion("meet_payment not between", value1, value2, "meetPayment");
            return (Criteria) this;
        }

        public Criteria andMeetApplyIsNull() {
            addCriterion("meet_apply is null");
            return (Criteria) this;
        }

        public Criteria andMeetApplyIsNotNull() {
            addCriterion("meet_apply is not null");
            return (Criteria) this;
        }

        public Criteria andMeetApplyEqualTo(Double value) {
            addCriterion("meet_apply =", value, "meetApply");
            return (Criteria) this;
        }

        public Criteria andMeetApplyNotEqualTo(Double value) {
            addCriterion("meet_apply <>", value, "meetApply");
            return (Criteria) this;
        }

        public Criteria andMeetApplyGreaterThan(Double value) {
            addCriterion("meet_apply >", value, "meetApply");
            return (Criteria) this;
        }

        public Criteria andMeetApplyGreaterThanOrEqualTo(Double value) {
            addCriterion("meet_apply >=", value, "meetApply");
            return (Criteria) this;
        }

        public Criteria andMeetApplyLessThan(Double value) {
            addCriterion("meet_apply <", value, "meetApply");
            return (Criteria) this;
        }

        public Criteria andMeetApplyLessThanOrEqualTo(Double value) {
            addCriterion("meet_apply <=", value, "meetApply");
            return (Criteria) this;
        }

        public Criteria andMeetApplyIn(List<Double> values) {
            addCriterion("meet_apply in", values, "meetApply");
            return (Criteria) this;
        }

        public Criteria andMeetApplyNotIn(List<Double> values) {
            addCriterion("meet_apply not in", values, "meetApply");
            return (Criteria) this;
        }

        public Criteria andMeetApplyBetween(Double value1, Double value2) {
            addCriterion("meet_apply between", value1, value2, "meetApply");
            return (Criteria) this;
        }

        public Criteria andMeetApplyNotBetween(Double value1, Double value2) {
            addCriterion("meet_apply not between", value1, value2, "meetApply");
            return (Criteria) this;
        }

        public Criteria andInternationalTotalIsNull() {
            addCriterion("international_total is null");
            return (Criteria) this;
        }

        public Criteria andInternationalTotalIsNotNull() {
            addCriterion("international_total is not null");
            return (Criteria) this;
        }

        public Criteria andInternationalTotalEqualTo(Double value) {
            addCriterion("international_total =", value, "internationalTotal");
            return (Criteria) this;
        }

        public Criteria andInternationalTotalNotEqualTo(Double value) {
            addCriterion("international_total <>", value, "internationalTotal");
            return (Criteria) this;
        }

        public Criteria andInternationalTotalGreaterThan(Double value) {
            addCriterion("international_total >", value, "internationalTotal");
            return (Criteria) this;
        }

        public Criteria andInternationalTotalGreaterThanOrEqualTo(Double value) {
            addCriterion("international_total >=", value, "internationalTotal");
            return (Criteria) this;
        }

        public Criteria andInternationalTotalLessThan(Double value) {
            addCriterion("international_total <", value, "internationalTotal");
            return (Criteria) this;
        }

        public Criteria andInternationalTotalLessThanOrEqualTo(Double value) {
            addCriterion("international_total <=", value, "internationalTotal");
            return (Criteria) this;
        }

        public Criteria andInternationalTotalIn(List<Double> values) {
            addCriterion("international_total in", values, "internationalTotal");
            return (Criteria) this;
        }

        public Criteria andInternationalTotalNotIn(List<Double> values) {
            addCriterion("international_total not in", values, "internationalTotal");
            return (Criteria) this;
        }

        public Criteria andInternationalTotalBetween(Double value1, Double value2) {
            addCriterion("international_total between", value1, value2, "internationalTotal");
            return (Criteria) this;
        }

        public Criteria andInternationalTotalNotBetween(Double value1, Double value2) {
            addCriterion("international_total not between", value1, value2, "internationalTotal");
            return (Criteria) this;
        }

        public Criteria andInternationalPaymentIsNull() {
            addCriterion("international_payment is null");
            return (Criteria) this;
        }

        public Criteria andInternationalPaymentIsNotNull() {
            addCriterion("international_payment is not null");
            return (Criteria) this;
        }

        public Criteria andInternationalPaymentEqualTo(Double value) {
            addCriterion("international_payment =", value, "internationalPayment");
            return (Criteria) this;
        }

        public Criteria andInternationalPaymentNotEqualTo(Double value) {
            addCriterion("international_payment <>", value, "internationalPayment");
            return (Criteria) this;
        }

        public Criteria andInternationalPaymentGreaterThan(Double value) {
            addCriterion("international_payment >", value, "internationalPayment");
            return (Criteria) this;
        }

        public Criteria andInternationalPaymentGreaterThanOrEqualTo(Double value) {
            addCriterion("international_payment >=", value, "internationalPayment");
            return (Criteria) this;
        }

        public Criteria andInternationalPaymentLessThan(Double value) {
            addCriterion("international_payment <", value, "internationalPayment");
            return (Criteria) this;
        }

        public Criteria andInternationalPaymentLessThanOrEqualTo(Double value) {
            addCriterion("international_payment <=", value, "internationalPayment");
            return (Criteria) this;
        }

        public Criteria andInternationalPaymentIn(List<Double> values) {
            addCriterion("international_payment in", values, "internationalPayment");
            return (Criteria) this;
        }

        public Criteria andInternationalPaymentNotIn(List<Double> values) {
            addCriterion("international_payment not in", values, "internationalPayment");
            return (Criteria) this;
        }

        public Criteria andInternationalPaymentBetween(Double value1, Double value2) {
            addCriterion("international_payment between", value1, value2, "internationalPayment");
            return (Criteria) this;
        }

        public Criteria andInternationalPaymentNotBetween(Double value1, Double value2) {
            addCriterion("international_payment not between", value1, value2, "internationalPayment");
            return (Criteria) this;
        }

        public Criteria andInternationalApplyIsNull() {
            addCriterion("international_apply is null");
            return (Criteria) this;
        }

        public Criteria andInternationalApplyIsNotNull() {
            addCriterion("international_apply is not null");
            return (Criteria) this;
        }

        public Criteria andInternationalApplyEqualTo(Double value) {
            addCriterion("international_apply =", value, "internationalApply");
            return (Criteria) this;
        }

        public Criteria andInternationalApplyNotEqualTo(Double value) {
            addCriterion("international_apply <>", value, "internationalApply");
            return (Criteria) this;
        }

        public Criteria andInternationalApplyGreaterThan(Double value) {
            addCriterion("international_apply >", value, "internationalApply");
            return (Criteria) this;
        }

        public Criteria andInternationalApplyGreaterThanOrEqualTo(Double value) {
            addCriterion("international_apply >=", value, "internationalApply");
            return (Criteria) this;
        }

        public Criteria andInternationalApplyLessThan(Double value) {
            addCriterion("international_apply <", value, "internationalApply");
            return (Criteria) this;
        }

        public Criteria andInternationalApplyLessThanOrEqualTo(Double value) {
            addCriterion("international_apply <=", value, "internationalApply");
            return (Criteria) this;
        }

        public Criteria andInternationalApplyIn(List<Double> values) {
            addCriterion("international_apply in", values, "internationalApply");
            return (Criteria) this;
        }

        public Criteria andInternationalApplyNotIn(List<Double> values) {
            addCriterion("international_apply not in", values, "internationalApply");
            return (Criteria) this;
        }

        public Criteria andInternationalApplyBetween(Double value1, Double value2) {
            addCriterion("international_apply between", value1, value2, "internationalApply");
            return (Criteria) this;
        }

        public Criteria andInternationalApplyNotBetween(Double value1, Double value2) {
            addCriterion("international_apply not between", value1, value2, "internationalApply");
            return (Criteria) this;
        }

        public Criteria andFacilityTotalIsNull() {
            addCriterion("facility_total is null");
            return (Criteria) this;
        }

        public Criteria andFacilityTotalIsNotNull() {
            addCriterion("facility_total is not null");
            return (Criteria) this;
        }

        public Criteria andFacilityTotalEqualTo(Double value) {
            addCriterion("facility_total =", value, "facilityTotal");
            return (Criteria) this;
        }

        public Criteria andFacilityTotalNotEqualTo(Double value) {
            addCriterion("facility_total <>", value, "facilityTotal");
            return (Criteria) this;
        }

        public Criteria andFacilityTotalGreaterThan(Double value) {
            addCriterion("facility_total >", value, "facilityTotal");
            return (Criteria) this;
        }

        public Criteria andFacilityTotalGreaterThanOrEqualTo(Double value) {
            addCriterion("facility_total >=", value, "facilityTotal");
            return (Criteria) this;
        }

        public Criteria andFacilityTotalLessThan(Double value) {
            addCriterion("facility_total <", value, "facilityTotal");
            return (Criteria) this;
        }

        public Criteria andFacilityTotalLessThanOrEqualTo(Double value) {
            addCriterion("facility_total <=", value, "facilityTotal");
            return (Criteria) this;
        }

        public Criteria andFacilityTotalIn(List<Double> values) {
            addCriterion("facility_total in", values, "facilityTotal");
            return (Criteria) this;
        }

        public Criteria andFacilityTotalNotIn(List<Double> values) {
            addCriterion("facility_total not in", values, "facilityTotal");
            return (Criteria) this;
        }

        public Criteria andFacilityTotalBetween(Double value1, Double value2) {
            addCriterion("facility_total between", value1, value2, "facilityTotal");
            return (Criteria) this;
        }

        public Criteria andFacilityTotalNotBetween(Double value1, Double value2) {
            addCriterion("facility_total not between", value1, value2, "facilityTotal");
            return (Criteria) this;
        }

        public Criteria andFacilityPaymentIsNull() {
            addCriterion("facility_payment is null");
            return (Criteria) this;
        }

        public Criteria andFacilityPaymentIsNotNull() {
            addCriterion("facility_payment is not null");
            return (Criteria) this;
        }

        public Criteria andFacilityPaymentEqualTo(Double value) {
            addCriterion("facility_payment =", value, "facilityPayment");
            return (Criteria) this;
        }

        public Criteria andFacilityPaymentNotEqualTo(Double value) {
            addCriterion("facility_payment <>", value, "facilityPayment");
            return (Criteria) this;
        }

        public Criteria andFacilityPaymentGreaterThan(Double value) {
            addCriterion("facility_payment >", value, "facilityPayment");
            return (Criteria) this;
        }

        public Criteria andFacilityPaymentGreaterThanOrEqualTo(Double value) {
            addCriterion("facility_payment >=", value, "facilityPayment");
            return (Criteria) this;
        }

        public Criteria andFacilityPaymentLessThan(Double value) {
            addCriterion("facility_payment <", value, "facilityPayment");
            return (Criteria) this;
        }

        public Criteria andFacilityPaymentLessThanOrEqualTo(Double value) {
            addCriterion("facility_payment <=", value, "facilityPayment");
            return (Criteria) this;
        }

        public Criteria andFacilityPaymentIn(List<Double> values) {
            addCriterion("facility_payment in", values, "facilityPayment");
            return (Criteria) this;
        }

        public Criteria andFacilityPaymentNotIn(List<Double> values) {
            addCriterion("facility_payment not in", values, "facilityPayment");
            return (Criteria) this;
        }

        public Criteria andFacilityPaymentBetween(Double value1, Double value2) {
            addCriterion("facility_payment between", value1, value2, "facilityPayment");
            return (Criteria) this;
        }

        public Criteria andFacilityPaymentNotBetween(Double value1, Double value2) {
            addCriterion("facility_payment not between", value1, value2, "facilityPayment");
            return (Criteria) this;
        }

        public Criteria andFacilityApplyIsNull() {
            addCriterion("facility_apply is null");
            return (Criteria) this;
        }

        public Criteria andFacilityApplyIsNotNull() {
            addCriterion("facility_apply is not null");
            return (Criteria) this;
        }

        public Criteria andFacilityApplyEqualTo(Double value) {
            addCriterion("facility_apply =", value, "facilityApply");
            return (Criteria) this;
        }

        public Criteria andFacilityApplyNotEqualTo(Double value) {
            addCriterion("facility_apply <>", value, "facilityApply");
            return (Criteria) this;
        }

        public Criteria andFacilityApplyGreaterThan(Double value) {
            addCriterion("facility_apply >", value, "facilityApply");
            return (Criteria) this;
        }

        public Criteria andFacilityApplyGreaterThanOrEqualTo(Double value) {
            addCriterion("facility_apply >=", value, "facilityApply");
            return (Criteria) this;
        }

        public Criteria andFacilityApplyLessThan(Double value) {
            addCriterion("facility_apply <", value, "facilityApply");
            return (Criteria) this;
        }

        public Criteria andFacilityApplyLessThanOrEqualTo(Double value) {
            addCriterion("facility_apply <=", value, "facilityApply");
            return (Criteria) this;
        }

        public Criteria andFacilityApplyIn(List<Double> values) {
            addCriterion("facility_apply in", values, "facilityApply");
            return (Criteria) this;
        }

        public Criteria andFacilityApplyNotIn(List<Double> values) {
            addCriterion("facility_apply not in", values, "facilityApply");
            return (Criteria) this;
        }

        public Criteria andFacilityApplyBetween(Double value1, Double value2) {
            addCriterion("facility_apply between", value1, value2, "facilityApply");
            return (Criteria) this;
        }

        public Criteria andFacilityApplyNotBetween(Double value1, Double value2) {
            addCriterion("facility_apply not between", value1, value2, "facilityApply");
            return (Criteria) this;
        }

        public Criteria andLabourTotalIsNull() {
            addCriterion("labour_total is null");
            return (Criteria) this;
        }

        public Criteria andLabourTotalIsNotNull() {
            addCriterion("labour_total is not null");
            return (Criteria) this;
        }

        public Criteria andLabourTotalEqualTo(Double value) {
            addCriterion("labour_total =", value, "labourTotal");
            return (Criteria) this;
        }

        public Criteria andLabourTotalNotEqualTo(Double value) {
            addCriterion("labour_total <>", value, "labourTotal");
            return (Criteria) this;
        }

        public Criteria andLabourTotalGreaterThan(Double value) {
            addCriterion("labour_total >", value, "labourTotal");
            return (Criteria) this;
        }

        public Criteria andLabourTotalGreaterThanOrEqualTo(Double value) {
            addCriterion("labour_total >=", value, "labourTotal");
            return (Criteria) this;
        }

        public Criteria andLabourTotalLessThan(Double value) {
            addCriterion("labour_total <", value, "labourTotal");
            return (Criteria) this;
        }

        public Criteria andLabourTotalLessThanOrEqualTo(Double value) {
            addCriterion("labour_total <=", value, "labourTotal");
            return (Criteria) this;
        }

        public Criteria andLabourTotalIn(List<Double> values) {
            addCriterion("labour_total in", values, "labourTotal");
            return (Criteria) this;
        }

        public Criteria andLabourTotalNotIn(List<Double> values) {
            addCriterion("labour_total not in", values, "labourTotal");
            return (Criteria) this;
        }

        public Criteria andLabourTotalBetween(Double value1, Double value2) {
            addCriterion("labour_total between", value1, value2, "labourTotal");
            return (Criteria) this;
        }

        public Criteria andLabourTotalNotBetween(Double value1, Double value2) {
            addCriterion("labour_total not between", value1, value2, "labourTotal");
            return (Criteria) this;
        }

        public Criteria andLabourPaymentIsNull() {
            addCriterion("labour_payment is null");
            return (Criteria) this;
        }

        public Criteria andLabourPaymentIsNotNull() {
            addCriterion("labour_payment is not null");
            return (Criteria) this;
        }

        public Criteria andLabourPaymentEqualTo(Double value) {
            addCriterion("labour_payment =", value, "labourPayment");
            return (Criteria) this;
        }

        public Criteria andLabourPaymentNotEqualTo(Double value) {
            addCriterion("labour_payment <>", value, "labourPayment");
            return (Criteria) this;
        }

        public Criteria andLabourPaymentGreaterThan(Double value) {
            addCriterion("labour_payment >", value, "labourPayment");
            return (Criteria) this;
        }

        public Criteria andLabourPaymentGreaterThanOrEqualTo(Double value) {
            addCriterion("labour_payment >=", value, "labourPayment");
            return (Criteria) this;
        }

        public Criteria andLabourPaymentLessThan(Double value) {
            addCriterion("labour_payment <", value, "labourPayment");
            return (Criteria) this;
        }

        public Criteria andLabourPaymentLessThanOrEqualTo(Double value) {
            addCriterion("labour_payment <=", value, "labourPayment");
            return (Criteria) this;
        }

        public Criteria andLabourPaymentIn(List<Double> values) {
            addCriterion("labour_payment in", values, "labourPayment");
            return (Criteria) this;
        }

        public Criteria andLabourPaymentNotIn(List<Double> values) {
            addCriterion("labour_payment not in", values, "labourPayment");
            return (Criteria) this;
        }

        public Criteria andLabourPaymentBetween(Double value1, Double value2) {
            addCriterion("labour_payment between", value1, value2, "labourPayment");
            return (Criteria) this;
        }

        public Criteria andLabourPaymentNotBetween(Double value1, Double value2) {
            addCriterion("labour_payment not between", value1, value2, "labourPayment");
            return (Criteria) this;
        }

        public Criteria andLabourApplyIsNull() {
            addCriterion("labour_apply is null");
            return (Criteria) this;
        }

        public Criteria andLabourApplyIsNotNull() {
            addCriterion("labour_apply is not null");
            return (Criteria) this;
        }

        public Criteria andLabourApplyEqualTo(Double value) {
            addCriterion("labour_apply =", value, "labourApply");
            return (Criteria) this;
        }

        public Criteria andLabourApplyNotEqualTo(Double value) {
            addCriterion("labour_apply <>", value, "labourApply");
            return (Criteria) this;
        }

        public Criteria andLabourApplyGreaterThan(Double value) {
            addCriterion("labour_apply >", value, "labourApply");
            return (Criteria) this;
        }

        public Criteria andLabourApplyGreaterThanOrEqualTo(Double value) {
            addCriterion("labour_apply >=", value, "labourApply");
            return (Criteria) this;
        }

        public Criteria andLabourApplyLessThan(Double value) {
            addCriterion("labour_apply <", value, "labourApply");
            return (Criteria) this;
        }

        public Criteria andLabourApplyLessThanOrEqualTo(Double value) {
            addCriterion("labour_apply <=", value, "labourApply");
            return (Criteria) this;
        }

        public Criteria andLabourApplyIn(List<Double> values) {
            addCriterion("labour_apply in", values, "labourApply");
            return (Criteria) this;
        }

        public Criteria andLabourApplyNotIn(List<Double> values) {
            addCriterion("labour_apply not in", values, "labourApply");
            return (Criteria) this;
        }

        public Criteria andLabourApplyBetween(Double value1, Double value2) {
            addCriterion("labour_apply between", value1, value2, "labourApply");
            return (Criteria) this;
        }

        public Criteria andLabourApplyNotBetween(Double value1, Double value2) {
            addCriterion("labour_apply not between", value1, value2, "labourApply");
            return (Criteria) this;
        }

        public Criteria andExpertTotalIsNull() {
            addCriterion("expert_total is null");
            return (Criteria) this;
        }

        public Criteria andExpertTotalIsNotNull() {
            addCriterion("expert_total is not null");
            return (Criteria) this;
        }

        public Criteria andExpertTotalEqualTo(Double value) {
            addCriterion("expert_total =", value, "expertTotal");
            return (Criteria) this;
        }

        public Criteria andExpertTotalNotEqualTo(Double value) {
            addCriterion("expert_total <>", value, "expertTotal");
            return (Criteria) this;
        }

        public Criteria andExpertTotalGreaterThan(Double value) {
            addCriterion("expert_total >", value, "expertTotal");
            return (Criteria) this;
        }

        public Criteria andExpertTotalGreaterThanOrEqualTo(Double value) {
            addCriterion("expert_total >=", value, "expertTotal");
            return (Criteria) this;
        }

        public Criteria andExpertTotalLessThan(Double value) {
            addCriterion("expert_total <", value, "expertTotal");
            return (Criteria) this;
        }

        public Criteria andExpertTotalLessThanOrEqualTo(Double value) {
            addCriterion("expert_total <=", value, "expertTotal");
            return (Criteria) this;
        }

        public Criteria andExpertTotalIn(List<Double> values) {
            addCriterion("expert_total in", values, "expertTotal");
            return (Criteria) this;
        }

        public Criteria andExpertTotalNotIn(List<Double> values) {
            addCriterion("expert_total not in", values, "expertTotal");
            return (Criteria) this;
        }

        public Criteria andExpertTotalBetween(Double value1, Double value2) {
            addCriterion("expert_total between", value1, value2, "expertTotal");
            return (Criteria) this;
        }

        public Criteria andExpertTotalNotBetween(Double value1, Double value2) {
            addCriterion("expert_total not between", value1, value2, "expertTotal");
            return (Criteria) this;
        }

        public Criteria andExpertPaymentIsNull() {
            addCriterion("expert_payment is null");
            return (Criteria) this;
        }

        public Criteria andExpertPaymentIsNotNull() {
            addCriterion("expert_payment is not null");
            return (Criteria) this;
        }

        public Criteria andExpertPaymentEqualTo(Double value) {
            addCriterion("expert_payment =", value, "expertPayment");
            return (Criteria) this;
        }

        public Criteria andExpertPaymentNotEqualTo(Double value) {
            addCriterion("expert_payment <>", value, "expertPayment");
            return (Criteria) this;
        }

        public Criteria andExpertPaymentGreaterThan(Double value) {
            addCriterion("expert_payment >", value, "expertPayment");
            return (Criteria) this;
        }

        public Criteria andExpertPaymentGreaterThanOrEqualTo(Double value) {
            addCriterion("expert_payment >=", value, "expertPayment");
            return (Criteria) this;
        }

        public Criteria andExpertPaymentLessThan(Double value) {
            addCriterion("expert_payment <", value, "expertPayment");
            return (Criteria) this;
        }

        public Criteria andExpertPaymentLessThanOrEqualTo(Double value) {
            addCriterion("expert_payment <=", value, "expertPayment");
            return (Criteria) this;
        }

        public Criteria andExpertPaymentIn(List<Double> values) {
            addCriterion("expert_payment in", values, "expertPayment");
            return (Criteria) this;
        }

        public Criteria andExpertPaymentNotIn(List<Double> values) {
            addCriterion("expert_payment not in", values, "expertPayment");
            return (Criteria) this;
        }

        public Criteria andExpertPaymentBetween(Double value1, Double value2) {
            addCriterion("expert_payment between", value1, value2, "expertPayment");
            return (Criteria) this;
        }

        public Criteria andExpertPaymentNotBetween(Double value1, Double value2) {
            addCriterion("expert_payment not between", value1, value2, "expertPayment");
            return (Criteria) this;
        }

        public Criteria andExpertApplyIsNull() {
            addCriterion("expert_apply is null");
            return (Criteria) this;
        }

        public Criteria andExpertApplyIsNotNull() {
            addCriterion("expert_apply is not null");
            return (Criteria) this;
        }

        public Criteria andExpertApplyEqualTo(Double value) {
            addCriterion("expert_apply =", value, "expertApply");
            return (Criteria) this;
        }

        public Criteria andExpertApplyNotEqualTo(Double value) {
            addCriterion("expert_apply <>", value, "expertApply");
            return (Criteria) this;
        }

        public Criteria andExpertApplyGreaterThan(Double value) {
            addCriterion("expert_apply >", value, "expertApply");
            return (Criteria) this;
        }

        public Criteria andExpertApplyGreaterThanOrEqualTo(Double value) {
            addCriterion("expert_apply >=", value, "expertApply");
            return (Criteria) this;
        }

        public Criteria andExpertApplyLessThan(Double value) {
            addCriterion("expert_apply <", value, "expertApply");
            return (Criteria) this;
        }

        public Criteria andExpertApplyLessThanOrEqualTo(Double value) {
            addCriterion("expert_apply <=", value, "expertApply");
            return (Criteria) this;
        }

        public Criteria andExpertApplyIn(List<Double> values) {
            addCriterion("expert_apply in", values, "expertApply");
            return (Criteria) this;
        }

        public Criteria andExpertApplyNotIn(List<Double> values) {
            addCriterion("expert_apply not in", values, "expertApply");
            return (Criteria) this;
        }

        public Criteria andExpertApplyBetween(Double value1, Double value2) {
            addCriterion("expert_apply between", value1, value2, "expertApply");
            return (Criteria) this;
        }

        public Criteria andExpertApplyNotBetween(Double value1, Double value2) {
            addCriterion("expert_apply not between", value1, value2, "expertApply");
            return (Criteria) this;
        }

        public Criteria andDatumTotalIsNull() {
            addCriterion("datum_total is null");
            return (Criteria) this;
        }

        public Criteria andDatumTotalIsNotNull() {
            addCriterion("datum_total is not null");
            return (Criteria) this;
        }

        public Criteria andDatumTotalEqualTo(Double value) {
            addCriterion("datum_total =", value, "datumTotal");
            return (Criteria) this;
        }

        public Criteria andDatumTotalNotEqualTo(Double value) {
            addCriterion("datum_total <>", value, "datumTotal");
            return (Criteria) this;
        }

        public Criteria andDatumTotalGreaterThan(Double value) {
            addCriterion("datum_total >", value, "datumTotal");
            return (Criteria) this;
        }

        public Criteria andDatumTotalGreaterThanOrEqualTo(Double value) {
            addCriterion("datum_total >=", value, "datumTotal");
            return (Criteria) this;
        }

        public Criteria andDatumTotalLessThan(Double value) {
            addCriterion("datum_total <", value, "datumTotal");
            return (Criteria) this;
        }

        public Criteria andDatumTotalLessThanOrEqualTo(Double value) {
            addCriterion("datum_total <=", value, "datumTotal");
            return (Criteria) this;
        }

        public Criteria andDatumTotalIn(List<Double> values) {
            addCriterion("datum_total in", values, "datumTotal");
            return (Criteria) this;
        }

        public Criteria andDatumTotalNotIn(List<Double> values) {
            addCriterion("datum_total not in", values, "datumTotal");
            return (Criteria) this;
        }

        public Criteria andDatumTotalBetween(Double value1, Double value2) {
            addCriterion("datum_total between", value1, value2, "datumTotal");
            return (Criteria) this;
        }

        public Criteria andDatumTotalNotBetween(Double value1, Double value2) {
            addCriterion("datum_total not between", value1, value2, "datumTotal");
            return (Criteria) this;
        }

        public Criteria andDatumPaymentIsNull() {
            addCriterion("datum_payment is null");
            return (Criteria) this;
        }

        public Criteria andDatumPaymentIsNotNull() {
            addCriterion("datum_payment is not null");
            return (Criteria) this;
        }

        public Criteria andDatumPaymentEqualTo(Double value) {
            addCriterion("datum_payment =", value, "datumPayment");
            return (Criteria) this;
        }

        public Criteria andDatumPaymentNotEqualTo(Double value) {
            addCriterion("datum_payment <>", value, "datumPayment");
            return (Criteria) this;
        }

        public Criteria andDatumPaymentGreaterThan(Double value) {
            addCriterion("datum_payment >", value, "datumPayment");
            return (Criteria) this;
        }

        public Criteria andDatumPaymentGreaterThanOrEqualTo(Double value) {
            addCriterion("datum_payment >=", value, "datumPayment");
            return (Criteria) this;
        }

        public Criteria andDatumPaymentLessThan(Double value) {
            addCriterion("datum_payment <", value, "datumPayment");
            return (Criteria) this;
        }

        public Criteria andDatumPaymentLessThanOrEqualTo(Double value) {
            addCriterion("datum_payment <=", value, "datumPayment");
            return (Criteria) this;
        }

        public Criteria andDatumPaymentIn(List<Double> values) {
            addCriterion("datum_payment in", values, "datumPayment");
            return (Criteria) this;
        }

        public Criteria andDatumPaymentNotIn(List<Double> values) {
            addCriterion("datum_payment not in", values, "datumPayment");
            return (Criteria) this;
        }

        public Criteria andDatumPaymentBetween(Double value1, Double value2) {
            addCriterion("datum_payment between", value1, value2, "datumPayment");
            return (Criteria) this;
        }

        public Criteria andDatumPaymentNotBetween(Double value1, Double value2) {
            addCriterion("datum_payment not between", value1, value2, "datumPayment");
            return (Criteria) this;
        }

        public Criteria andDatumApplyIsNull() {
            addCriterion("datum_apply is null");
            return (Criteria) this;
        }

        public Criteria andDatumApplyIsNotNull() {
            addCriterion("datum_apply is not null");
            return (Criteria) this;
        }

        public Criteria andDatumApplyEqualTo(Double value) {
            addCriterion("datum_apply =", value, "datumApply");
            return (Criteria) this;
        }

        public Criteria andDatumApplyNotEqualTo(Double value) {
            addCriterion("datum_apply <>", value, "datumApply");
            return (Criteria) this;
        }

        public Criteria andDatumApplyGreaterThan(Double value) {
            addCriterion("datum_apply >", value, "datumApply");
            return (Criteria) this;
        }

        public Criteria andDatumApplyGreaterThanOrEqualTo(Double value) {
            addCriterion("datum_apply >=", value, "datumApply");
            return (Criteria) this;
        }

        public Criteria andDatumApplyLessThan(Double value) {
            addCriterion("datum_apply <", value, "datumApply");
            return (Criteria) this;
        }

        public Criteria andDatumApplyLessThanOrEqualTo(Double value) {
            addCriterion("datum_apply <=", value, "datumApply");
            return (Criteria) this;
        }

        public Criteria andDatumApplyIn(List<Double> values) {
            addCriterion("datum_apply in", values, "datumApply");
            return (Criteria) this;
        }

        public Criteria andDatumApplyNotIn(List<Double> values) {
            addCriterion("datum_apply not in", values, "datumApply");
            return (Criteria) this;
        }

        public Criteria andDatumApplyBetween(Double value1, Double value2) {
            addCriterion("datum_apply between", value1, value2, "datumApply");
            return (Criteria) this;
        }

        public Criteria andDatumApplyNotBetween(Double value1, Double value2) {
            addCriterion("datum_apply not between", value1, value2, "datumApply");
            return (Criteria) this;
        }

        public Criteria andDataTotalIsNull() {
            addCriterion("data_total is null");
            return (Criteria) this;
        }

        public Criteria andDataTotalIsNotNull() {
            addCriterion("data_total is not null");
            return (Criteria) this;
        }

        public Criteria andDataTotalEqualTo(Double value) {
            addCriterion("data_total =", value, "dataTotal");
            return (Criteria) this;
        }

        public Criteria andDataTotalNotEqualTo(Double value) {
            addCriterion("data_total <>", value, "dataTotal");
            return (Criteria) this;
        }

        public Criteria andDataTotalGreaterThan(Double value) {
            addCriterion("data_total >", value, "dataTotal");
            return (Criteria) this;
        }

        public Criteria andDataTotalGreaterThanOrEqualTo(Double value) {
            addCriterion("data_total >=", value, "dataTotal");
            return (Criteria) this;
        }

        public Criteria andDataTotalLessThan(Double value) {
            addCriterion("data_total <", value, "dataTotal");
            return (Criteria) this;
        }

        public Criteria andDataTotalLessThanOrEqualTo(Double value) {
            addCriterion("data_total <=", value, "dataTotal");
            return (Criteria) this;
        }

        public Criteria andDataTotalIn(List<Double> values) {
            addCriterion("data_total in", values, "dataTotal");
            return (Criteria) this;
        }

        public Criteria andDataTotalNotIn(List<Double> values) {
            addCriterion("data_total not in", values, "dataTotal");
            return (Criteria) this;
        }

        public Criteria andDataTotalBetween(Double value1, Double value2) {
            addCriterion("data_total between", value1, value2, "dataTotal");
            return (Criteria) this;
        }

        public Criteria andDataTotalNotBetween(Double value1, Double value2) {
            addCriterion("data_total not between", value1, value2, "dataTotal");
            return (Criteria) this;
        }

        public Criteria andDataPaymentIsNull() {
            addCriterion("data_payment is null");
            return (Criteria) this;
        }

        public Criteria andDataPaymentIsNotNull() {
            addCriterion("data_payment is not null");
            return (Criteria) this;
        }

        public Criteria andDataPaymentEqualTo(Double value) {
            addCriterion("data_payment =", value, "dataPayment");
            return (Criteria) this;
        }

        public Criteria andDataPaymentNotEqualTo(Double value) {
            addCriterion("data_payment <>", value, "dataPayment");
            return (Criteria) this;
        }

        public Criteria andDataPaymentGreaterThan(Double value) {
            addCriterion("data_payment >", value, "dataPayment");
            return (Criteria) this;
        }

        public Criteria andDataPaymentGreaterThanOrEqualTo(Double value) {
            addCriterion("data_payment >=", value, "dataPayment");
            return (Criteria) this;
        }

        public Criteria andDataPaymentLessThan(Double value) {
            addCriterion("data_payment <", value, "dataPayment");
            return (Criteria) this;
        }

        public Criteria andDataPaymentLessThanOrEqualTo(Double value) {
            addCriterion("data_payment <=", value, "dataPayment");
            return (Criteria) this;
        }

        public Criteria andDataPaymentIn(List<Double> values) {
            addCriterion("data_payment in", values, "dataPayment");
            return (Criteria) this;
        }

        public Criteria andDataPaymentNotIn(List<Double> values) {
            addCriterion("data_payment not in", values, "dataPayment");
            return (Criteria) this;
        }

        public Criteria andDataPaymentBetween(Double value1, Double value2) {
            addCriterion("data_payment between", value1, value2, "dataPayment");
            return (Criteria) this;
        }

        public Criteria andDataPaymentNotBetween(Double value1, Double value2) {
            addCriterion("data_payment not between", value1, value2, "dataPayment");
            return (Criteria) this;
        }

        public Criteria andDataApplyIsNull() {
            addCriterion("data_apply is null");
            return (Criteria) this;
        }

        public Criteria andDataApplyIsNotNull() {
            addCriterion("data_apply is not null");
            return (Criteria) this;
        }

        public Criteria andDataApplyEqualTo(Double value) {
            addCriterion("data_apply =", value, "dataApply");
            return (Criteria) this;
        }

        public Criteria andDataApplyNotEqualTo(Double value) {
            addCriterion("data_apply <>", value, "dataApply");
            return (Criteria) this;
        }

        public Criteria andDataApplyGreaterThan(Double value) {
            addCriterion("data_apply >", value, "dataApply");
            return (Criteria) this;
        }

        public Criteria andDataApplyGreaterThanOrEqualTo(Double value) {
            addCriterion("data_apply >=", value, "dataApply");
            return (Criteria) this;
        }

        public Criteria andDataApplyLessThan(Double value) {
            addCriterion("data_apply <", value, "dataApply");
            return (Criteria) this;
        }

        public Criteria andDataApplyLessThanOrEqualTo(Double value) {
            addCriterion("data_apply <=", value, "dataApply");
            return (Criteria) this;
        }

        public Criteria andDataApplyIn(List<Double> values) {
            addCriterion("data_apply in", values, "dataApply");
            return (Criteria) this;
        }

        public Criteria andDataApplyNotIn(List<Double> values) {
            addCriterion("data_apply not in", values, "dataApply");
            return (Criteria) this;
        }

        public Criteria andDataApplyBetween(Double value1, Double value2) {
            addCriterion("data_apply between", value1, value2, "dataApply");
            return (Criteria) this;
        }

        public Criteria andDataApplyNotBetween(Double value1, Double value2) {
            addCriterion("data_apply not between", value1, value2, "dataApply");
            return (Criteria) this;
        }

        public Criteria andPrintTotalIsNull() {
            addCriterion("print_total is null");
            return (Criteria) this;
        }

        public Criteria andPrintTotalIsNotNull() {
            addCriterion("print_total is not null");
            return (Criteria) this;
        }

        public Criteria andPrintTotalEqualTo(Double value) {
            addCriterion("print_total =", value, "printTotal");
            return (Criteria) this;
        }

        public Criteria andPrintTotalNotEqualTo(Double value) {
            addCriterion("print_total <>", value, "printTotal");
            return (Criteria) this;
        }

        public Criteria andPrintTotalGreaterThan(Double value) {
            addCriterion("print_total >", value, "printTotal");
            return (Criteria) this;
        }

        public Criteria andPrintTotalGreaterThanOrEqualTo(Double value) {
            addCriterion("print_total >=", value, "printTotal");
            return (Criteria) this;
        }

        public Criteria andPrintTotalLessThan(Double value) {
            addCriterion("print_total <", value, "printTotal");
            return (Criteria) this;
        }

        public Criteria andPrintTotalLessThanOrEqualTo(Double value) {
            addCriterion("print_total <=", value, "printTotal");
            return (Criteria) this;
        }

        public Criteria andPrintTotalIn(List<Double> values) {
            addCriterion("print_total in", values, "printTotal");
            return (Criteria) this;
        }

        public Criteria andPrintTotalNotIn(List<Double> values) {
            addCriterion("print_total not in", values, "printTotal");
            return (Criteria) this;
        }

        public Criteria andPrintTotalBetween(Double value1, Double value2) {
            addCriterion("print_total between", value1, value2, "printTotal");
            return (Criteria) this;
        }

        public Criteria andPrintTotalNotBetween(Double value1, Double value2) {
            addCriterion("print_total not between", value1, value2, "printTotal");
            return (Criteria) this;
        }

        public Criteria andPrintPaymentIsNull() {
            addCriterion("print_payment is null");
            return (Criteria) this;
        }

        public Criteria andPrintPaymentIsNotNull() {
            addCriterion("print_payment is not null");
            return (Criteria) this;
        }

        public Criteria andPrintPaymentEqualTo(Double value) {
            addCriterion("print_payment =", value, "printPayment");
            return (Criteria) this;
        }

        public Criteria andPrintPaymentNotEqualTo(Double value) {
            addCriterion("print_payment <>", value, "printPayment");
            return (Criteria) this;
        }

        public Criteria andPrintPaymentGreaterThan(Double value) {
            addCriterion("print_payment >", value, "printPayment");
            return (Criteria) this;
        }

        public Criteria andPrintPaymentGreaterThanOrEqualTo(Double value) {
            addCriterion("print_payment >=", value, "printPayment");
            return (Criteria) this;
        }

        public Criteria andPrintPaymentLessThan(Double value) {
            addCriterion("print_payment <", value, "printPayment");
            return (Criteria) this;
        }

        public Criteria andPrintPaymentLessThanOrEqualTo(Double value) {
            addCriterion("print_payment <=", value, "printPayment");
            return (Criteria) this;
        }

        public Criteria andPrintPaymentIn(List<Double> values) {
            addCriterion("print_payment in", values, "printPayment");
            return (Criteria) this;
        }

        public Criteria andPrintPaymentNotIn(List<Double> values) {
            addCriterion("print_payment not in", values, "printPayment");
            return (Criteria) this;
        }

        public Criteria andPrintPaymentBetween(Double value1, Double value2) {
            addCriterion("print_payment between", value1, value2, "printPayment");
            return (Criteria) this;
        }

        public Criteria andPrintPaymentNotBetween(Double value1, Double value2) {
            addCriterion("print_payment not between", value1, value2, "printPayment");
            return (Criteria) this;
        }

        public Criteria andPrintApplyIsNull() {
            addCriterion("print_apply is null");
            return (Criteria) this;
        }

        public Criteria andPrintApplyIsNotNull() {
            addCriterion("print_apply is not null");
            return (Criteria) this;
        }

        public Criteria andPrintApplyEqualTo(Double value) {
            addCriterion("print_apply =", value, "printApply");
            return (Criteria) this;
        }

        public Criteria andPrintApplyNotEqualTo(Double value) {
            addCriterion("print_apply <>", value, "printApply");
            return (Criteria) this;
        }

        public Criteria andPrintApplyGreaterThan(Double value) {
            addCriterion("print_apply >", value, "printApply");
            return (Criteria) this;
        }

        public Criteria andPrintApplyGreaterThanOrEqualTo(Double value) {
            addCriterion("print_apply >=", value, "printApply");
            return (Criteria) this;
        }

        public Criteria andPrintApplyLessThan(Double value) {
            addCriterion("print_apply <", value, "printApply");
            return (Criteria) this;
        }

        public Criteria andPrintApplyLessThanOrEqualTo(Double value) {
            addCriterion("print_apply <=", value, "printApply");
            return (Criteria) this;
        }

        public Criteria andPrintApplyIn(List<Double> values) {
            addCriterion("print_apply in", values, "printApply");
            return (Criteria) this;
        }

        public Criteria andPrintApplyNotIn(List<Double> values) {
            addCriterion("print_apply not in", values, "printApply");
            return (Criteria) this;
        }

        public Criteria andPrintApplyBetween(Double value1, Double value2) {
            addCriterion("print_apply between", value1, value2, "printApply");
            return (Criteria) this;
        }

        public Criteria andPrintApplyNotBetween(Double value1, Double value2) {
            addCriterion("print_apply not between", value1, value2, "printApply");
            return (Criteria) this;
        }

        public Criteria andOtherTotalIsNull() {
            addCriterion("other_total is null");
            return (Criteria) this;
        }

        public Criteria andOtherTotalIsNotNull() {
            addCriterion("other_total is not null");
            return (Criteria) this;
        }

        public Criteria andOtherTotalEqualTo(Double value) {
            addCriterion("other_total =", value, "otherTotal");
            return (Criteria) this;
        }

        public Criteria andOtherTotalNotEqualTo(Double value) {
            addCriterion("other_total <>", value, "otherTotal");
            return (Criteria) this;
        }

        public Criteria andOtherTotalGreaterThan(Double value) {
            addCriterion("other_total >", value, "otherTotal");
            return (Criteria) this;
        }

        public Criteria andOtherTotalGreaterThanOrEqualTo(Double value) {
            addCriterion("other_total >=", value, "otherTotal");
            return (Criteria) this;
        }

        public Criteria andOtherTotalLessThan(Double value) {
            addCriterion("other_total <", value, "otherTotal");
            return (Criteria) this;
        }

        public Criteria andOtherTotalLessThanOrEqualTo(Double value) {
            addCriterion("other_total <=", value, "otherTotal");
            return (Criteria) this;
        }

        public Criteria andOtherTotalIn(List<Double> values) {
            addCriterion("other_total in", values, "otherTotal");
            return (Criteria) this;
        }

        public Criteria andOtherTotalNotIn(List<Double> values) {
            addCriterion("other_total not in", values, "otherTotal");
            return (Criteria) this;
        }

        public Criteria andOtherTotalBetween(Double value1, Double value2) {
            addCriterion("other_total between", value1, value2, "otherTotal");
            return (Criteria) this;
        }

        public Criteria andOtherTotalNotBetween(Double value1, Double value2) {
            addCriterion("other_total not between", value1, value2, "otherTotal");
            return (Criteria) this;
        }

        public Criteria andOtherPaymentIsNull() {
            addCriterion("other_payment is null");
            return (Criteria) this;
        }

        public Criteria andOtherPaymentIsNotNull() {
            addCriterion("other_payment is not null");
            return (Criteria) this;
        }

        public Criteria andOtherPaymentEqualTo(Double value) {
            addCriterion("other_payment =", value, "otherPayment");
            return (Criteria) this;
        }

        public Criteria andOtherPaymentNotEqualTo(Double value) {
            addCriterion("other_payment <>", value, "otherPayment");
            return (Criteria) this;
        }

        public Criteria andOtherPaymentGreaterThan(Double value) {
            addCriterion("other_payment >", value, "otherPayment");
            return (Criteria) this;
        }

        public Criteria andOtherPaymentGreaterThanOrEqualTo(Double value) {
            addCriterion("other_payment >=", value, "otherPayment");
            return (Criteria) this;
        }

        public Criteria andOtherPaymentLessThan(Double value) {
            addCriterion("other_payment <", value, "otherPayment");
            return (Criteria) this;
        }

        public Criteria andOtherPaymentLessThanOrEqualTo(Double value) {
            addCriterion("other_payment <=", value, "otherPayment");
            return (Criteria) this;
        }

        public Criteria andOtherPaymentIn(List<Double> values) {
            addCriterion("other_payment in", values, "otherPayment");
            return (Criteria) this;
        }

        public Criteria andOtherPaymentNotIn(List<Double> values) {
            addCriterion("other_payment not in", values, "otherPayment");
            return (Criteria) this;
        }

        public Criteria andOtherPaymentBetween(Double value1, Double value2) {
            addCriterion("other_payment between", value1, value2, "otherPayment");
            return (Criteria) this;
        }

        public Criteria andOtherPaymentNotBetween(Double value1, Double value2) {
            addCriterion("other_payment not between", value1, value2, "otherPayment");
            return (Criteria) this;
        }

        public Criteria andOtherApplyIsNull() {
            addCriterion("other_apply is null");
            return (Criteria) this;
        }

        public Criteria andOtherApplyIsNotNull() {
            addCriterion("other_apply is not null");
            return (Criteria) this;
        }

        public Criteria andOtherApplyEqualTo(Double value) {
            addCriterion("other_apply =", value, "otherApply");
            return (Criteria) this;
        }

        public Criteria andOtherApplyNotEqualTo(Double value) {
            addCriterion("other_apply <>", value, "otherApply");
            return (Criteria) this;
        }

        public Criteria andOtherApplyGreaterThan(Double value) {
            addCriterion("other_apply >", value, "otherApply");
            return (Criteria) this;
        }

        public Criteria andOtherApplyGreaterThanOrEqualTo(Double value) {
            addCriterion("other_apply >=", value, "otherApply");
            return (Criteria) this;
        }

        public Criteria andOtherApplyLessThan(Double value) {
            addCriterion("other_apply <", value, "otherApply");
            return (Criteria) this;
        }

        public Criteria andOtherApplyLessThanOrEqualTo(Double value) {
            addCriterion("other_apply <=", value, "otherApply");
            return (Criteria) this;
        }

        public Criteria andOtherApplyIn(List<Double> values) {
            addCriterion("other_apply in", values, "otherApply");
            return (Criteria) this;
        }

        public Criteria andOtherApplyNotIn(List<Double> values) {
            addCriterion("other_apply not in", values, "otherApply");
            return (Criteria) this;
        }

        public Criteria andOtherApplyBetween(Double value1, Double value2) {
            addCriterion("other_apply between", value1, value2, "otherApply");
            return (Criteria) this;
        }

        public Criteria andOtherApplyNotBetween(Double value1, Double value2) {
            addCriterion("other_apply not between", value1, value2, "otherApply");
            return (Criteria) this;
        }

        public Criteria andManageTotalIsNull() {
            addCriterion("manage_total is null");
            return (Criteria) this;
        }

        public Criteria andManageTotalIsNotNull() {
            addCriterion("manage_total is not null");
            return (Criteria) this;
        }

        public Criteria andManageTotalEqualTo(Double value) {
            addCriterion("manage_total =", value, "manageTotal");
            return (Criteria) this;
        }

        public Criteria andManageTotalNotEqualTo(Double value) {
            addCriterion("manage_total <>", value, "manageTotal");
            return (Criteria) this;
        }

        public Criteria andManageTotalGreaterThan(Double value) {
            addCriterion("manage_total >", value, "manageTotal");
            return (Criteria) this;
        }

        public Criteria andManageTotalGreaterThanOrEqualTo(Double value) {
            addCriterion("manage_total >=", value, "manageTotal");
            return (Criteria) this;
        }

        public Criteria andManageTotalLessThan(Double value) {
            addCriterion("manage_total <", value, "manageTotal");
            return (Criteria) this;
        }

        public Criteria andManageTotalLessThanOrEqualTo(Double value) {
            addCriterion("manage_total <=", value, "manageTotal");
            return (Criteria) this;
        }

        public Criteria andManageTotalIn(List<Double> values) {
            addCriterion("manage_total in", values, "manageTotal");
            return (Criteria) this;
        }

        public Criteria andManageTotalNotIn(List<Double> values) {
            addCriterion("manage_total not in", values, "manageTotal");
            return (Criteria) this;
        }

        public Criteria andManageTotalBetween(Double value1, Double value2) {
            addCriterion("manage_total between", value1, value2, "manageTotal");
            return (Criteria) this;
        }

        public Criteria andManageTotalNotBetween(Double value1, Double value2) {
            addCriterion("manage_total not between", value1, value2, "manageTotal");
            return (Criteria) this;
        }

        public Criteria andPostTotalIsNull() {
            addCriterion("post_total is null");
            return (Criteria) this;
        }

        public Criteria andPostTotalIsNotNull() {
            addCriterion("post_total is not null");
            return (Criteria) this;
        }

        public Criteria andPostTotalEqualTo(Double value) {
            addCriterion("post_total =", value, "postTotal");
            return (Criteria) this;
        }

        public Criteria andPostTotalNotEqualTo(Double value) {
            addCriterion("post_total <>", value, "postTotal");
            return (Criteria) this;
        }

        public Criteria andPostTotalGreaterThan(Double value) {
            addCriterion("post_total >", value, "postTotal");
            return (Criteria) this;
        }

        public Criteria andPostTotalGreaterThanOrEqualTo(Double value) {
            addCriterion("post_total >=", value, "postTotal");
            return (Criteria) this;
        }

        public Criteria andPostTotalLessThan(Double value) {
            addCriterion("post_total <", value, "postTotal");
            return (Criteria) this;
        }

        public Criteria andPostTotalLessThanOrEqualTo(Double value) {
            addCriterion("post_total <=", value, "postTotal");
            return (Criteria) this;
        }

        public Criteria andPostTotalIn(List<Double> values) {
            addCriterion("post_total in", values, "postTotal");
            return (Criteria) this;
        }

        public Criteria andPostTotalNotIn(List<Double> values) {
            addCriterion("post_total not in", values, "postTotal");
            return (Criteria) this;
        }

        public Criteria andPostTotalBetween(Double value1, Double value2) {
            addCriterion("post_total between", value1, value2, "postTotal");
            return (Criteria) this;
        }

        public Criteria andPostTotalNotBetween(Double value1, Double value2) {
            addCriterion("post_total not between", value1, value2, "postTotal");
            return (Criteria) this;
        }

        public Criteria andPostPaymentIsNull() {
            addCriterion("post_payment is null");
            return (Criteria) this;
        }

        public Criteria andPostPaymentIsNotNull() {
            addCriterion("post_payment is not null");
            return (Criteria) this;
        }

        public Criteria andPostPaymentEqualTo(Double value) {
            addCriterion("post_payment =", value, "postPayment");
            return (Criteria) this;
        }

        public Criteria andPostPaymentNotEqualTo(Double value) {
            addCriterion("post_payment <>", value, "postPayment");
            return (Criteria) this;
        }

        public Criteria andPostPaymentGreaterThan(Double value) {
            addCriterion("post_payment >", value, "postPayment");
            return (Criteria) this;
        }

        public Criteria andPostPaymentGreaterThanOrEqualTo(Double value) {
            addCriterion("post_payment >=", value, "postPayment");
            return (Criteria) this;
        }

        public Criteria andPostPaymentLessThan(Double value) {
            addCriterion("post_payment <", value, "postPayment");
            return (Criteria) this;
        }

        public Criteria andPostPaymentLessThanOrEqualTo(Double value) {
            addCriterion("post_payment <=", value, "postPayment");
            return (Criteria) this;
        }

        public Criteria andPostPaymentIn(List<Double> values) {
            addCriterion("post_payment in", values, "postPayment");
            return (Criteria) this;
        }

        public Criteria andPostPaymentNotIn(List<Double> values) {
            addCriterion("post_payment not in", values, "postPayment");
            return (Criteria) this;
        }

        public Criteria andPostPaymentBetween(Double value1, Double value2) {
            addCriterion("post_payment between", value1, value2, "postPayment");
            return (Criteria) this;
        }

        public Criteria andPostPaymentNotBetween(Double value1, Double value2) {
            addCriterion("post_payment not between", value1, value2, "postPayment");
            return (Criteria) this;
        }

        public Criteria andPostApplyIsNull() {
            addCriterion("post_apply is null");
            return (Criteria) this;
        }

        public Criteria andPostApplyIsNotNull() {
            addCriterion("post_apply is not null");
            return (Criteria) this;
        }

        public Criteria andPostApplyEqualTo(Double value) {
            addCriterion("post_apply =", value, "postApply");
            return (Criteria) this;
        }

        public Criteria andPostApplyNotEqualTo(Double value) {
            addCriterion("post_apply <>", value, "postApply");
            return (Criteria) this;
        }

        public Criteria andPostApplyGreaterThan(Double value) {
            addCriterion("post_apply >", value, "postApply");
            return (Criteria) this;
        }

        public Criteria andPostApplyGreaterThanOrEqualTo(Double value) {
            addCriterion("post_apply >=", value, "postApply");
            return (Criteria) this;
        }

        public Criteria andPostApplyLessThan(Double value) {
            addCriterion("post_apply <", value, "postApply");
            return (Criteria) this;
        }

        public Criteria andPostApplyLessThanOrEqualTo(Double value) {
            addCriterion("post_apply <=", value, "postApply");
            return (Criteria) this;
        }

        public Criteria andPostApplyIn(List<Double> values) {
            addCriterion("post_apply in", values, "postApply");
            return (Criteria) this;
        }

        public Criteria andPostApplyNotIn(List<Double> values) {
            addCriterion("post_apply not in", values, "postApply");
            return (Criteria) this;
        }

        public Criteria andPostApplyBetween(Double value1, Double value2) {
            addCriterion("post_apply between", value1, value2, "postApply");
            return (Criteria) this;
        }

        public Criteria andPostApplyNotBetween(Double value1, Double value2) {
            addCriterion("post_apply not between", value1, value2, "postApply");
            return (Criteria) this;
        }

        public Criteria andPostNumIsNull() {
            addCriterion("post_num is null");
            return (Criteria) this;
        }

        public Criteria andPostNumIsNotNull() {
            addCriterion("post_num is not null");
            return (Criteria) this;
        }

        public Criteria andPostNumEqualTo(Integer value) {
            addCriterion("post_num =", value, "postNum");
            return (Criteria) this;
        }

        public Criteria andPostNumNotEqualTo(Integer value) {
            addCriterion("post_num <>", value, "postNum");
            return (Criteria) this;
        }

        public Criteria andPostNumGreaterThan(Integer value) {
            addCriterion("post_num >", value, "postNum");
            return (Criteria) this;
        }

        public Criteria andPostNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("post_num >=", value, "postNum");
            return (Criteria) this;
        }

        public Criteria andPostNumLessThan(Integer value) {
            addCriterion("post_num <", value, "postNum");
            return (Criteria) this;
        }

        public Criteria andPostNumLessThanOrEqualTo(Integer value) {
            addCriterion("post_num <=", value, "postNum");
            return (Criteria) this;
        }

        public Criteria andPostNumIn(List<Integer> values) {
            addCriterion("post_num in", values, "postNum");
            return (Criteria) this;
        }

        public Criteria andPostNumNotIn(List<Integer> values) {
            addCriterion("post_num not in", values, "postNum");
            return (Criteria) this;
        }

        public Criteria andPostNumBetween(Integer value1, Integer value2) {
            addCriterion("post_num between", value1, value2, "postNum");
            return (Criteria) this;
        }

        public Criteria andPostNumNotBetween(Integer value1, Integer value2) {
            addCriterion("post_num not between", value1, value2, "postNum");
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